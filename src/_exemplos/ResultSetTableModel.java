package _exemplos;

import javax.swing.table.AbstractTableModel;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResultSetTableModel extends AbstractTableModel {

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    ResultSetMetaData metaData = null;

    int numberOfRows = 0;

    public ResultSetTableModel(String url, String user, String pass, String query) throws SQLException {

        connection = DriverManager.getConnection(url, user, pass);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        setQuery(query);

    }

    public void setQuery(String query) throws SQLException {

        resultSet = statement.executeQuery(query);
        metaData = resultSet.getMetaData();

        resultSet.last();
        numberOfRows = resultSet.getRow();

        //notifica a JTable de que o modelo foi alterado
        fireTableStructureChanged();
    }

    @Override
    public int getRowCount() {
        return numberOfRows;
    }

    @Override
    public int getColumnCount() {

        try {
            return metaData.getColumnCount();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return 0;
    }

    @Override
    public Object getValueAt(int row, int column) {
        try {
            resultSet.absolute(row + 1);
            return resultSet.getObject(column + 1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return "";
    }

    @Override
    public String getColumnName(int column) {
        try {
            return metaData.getColumnName(column + 1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return "";
    }
    
    public void disconnectFromDataBase(){
        try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
