package _exemplos;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Exemplo1a {
    
    //URL do banco de dados
    static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3307/sgcm_aq3012514";
    //usuário
    static final String USER = "root";
    //senha
    static final String PASS = "root";
    
    public static void main(String[] args) throws SQLException {
        
        //gerencia a conexão
        Connection connection = null;
        
        //estabelece uma cnexão com o banco de dados
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);
        
        //meio para instrução SQL
        Statement statement = null;
        //cria Statement para executar SQL no banco de dados
        statement = connection.createStatement();
        
        //executa código SQL no banco de dados
        statement.execute("INSERT INTO especialidades VALUES (6, 'Cirurgia Cardiovascular')");
        
    }
    
}
