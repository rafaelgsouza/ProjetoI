package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

// camada de persistência
// padrão DAO (Data Access Object)
public abstract class DataAccessObject {

    private DataBaseConnection dbConnection;

    private String table;
    private boolean novel;//verificar se um objeto é novo (true) ou carregado (false)
    private boolean changed;

    // padrão Unit of Work
    HashMap<String, Object> dirty;

    public DataAccessObject(String table) {
        dbConnection = DataBaseConnection.getInstance();
        this.table = table;
        this.novel = true;
        this.changed = false;
        dirty = new HashMap<String, Object>();
    }

    public void insert() throws SQLException {
        if (this.novel && this.changed) {
            String sql;

            sql = "INSERT INTO " + this.table;

            String fields = "";
            String values = "";
            boolean first = true;

            for (String k : dirty.keySet()) {

                if (first) {
                    first = false;
                } else {
                    fields += ",";
                    values += ",";
                }

                fields += k;

                Object v = dirty.get(k);
                if (v instanceof String) {
                    values += "'" + v + "'";
                } else {
                    values += v;
                }

            }

            sql += " (" + fields + ")";
            sql += " VALUES";
            sql += " (" + values + ")";

            dbConnection.execute(sql);
            this.novel = false;
            this.changed = false;
            dirty.clear();
        }
    }

    public void update() throws SQLException {

        if (!(this.novel) && this.changed) {
            String sql;

            sql = "UPDATE " + this.table + " SET ";

            String set = "";
            boolean first = true;

            for (String k : dirty.keySet()) {

                if (first) {
                    first = false;
                } else {
                    set += ",";
                }

                set += k + "=";
                Object v = dirty.get(k);
                if (v instanceof String) {
                    set += "'" + v + "'";
                } else {
                    set += v;
                }
            }

            sql += set;
            sql += " WHERE";
            sql += getWhereClauseForOneEntry();

            dbConnection.execute(sql);
            this.changed = false;
            dirty.clear();
        }

    }

    public void delete() throws SQLException {
        String sql;

        sql = "DELETE FROM " + this.table;
        sql += " WHERE";
        sql += getWhereClauseForOneEntry();

        dbConnection.execute(sql);
    }

    // 'pegar' a chave primária de uma entrada
    protected abstract String getWhereClauseForOneEntry();
    
    // verificar se um campo da tabela foi alterado
    protected void addChange(String key, Object value) {
        dirty.put(key, value);
        this.changed = true;
    }

    // carregar um objeto que já existe
    public void load() throws SQLException {
        String sql;

        sql = "SELECT * FROM " + this.table + " WHERE";
        sql += getWhereClauseForOneEntry();

        dbConnection.executeQuery(sql);

        boolean status = dbConnection.getResultSet().next();

        if (status) {
            ArrayList<Object> data = new ArrayList<Object>();
            
            for (int i = 1; i <= dbConnection.getMetaData().getColumnCount(); i++) {
                data.add(dbConnection.getResultSet().getObject(i));
            }
            
            fill(data);
            
            this.novel = false;
            this.changed = false;
            dirty.clear();
        }

    }
    
    // preencher o objeto e a ordem do preenchimento segue a ordem definida na criação da tabela
    public abstract void fill(ArrayList<Object> data);
    
    public void save() throws SQLException{
        if(this.novel && this.changed){
            insert();
        }
        
        if(!this.novel && this.changed){
            update();
        }
        
    }
    
    public void disconnectFromDatabase() throws SQLException{
        dbConnection.disconnect();
    }
    
}
