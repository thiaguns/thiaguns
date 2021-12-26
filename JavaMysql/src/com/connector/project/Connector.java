package com.connector.project;
//Thiago--
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Connector {

    private static final String url =  "jdbc:mysql://host:porta/database";
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String user = "user";
    private static final String password = "password";
    static Connection conn;

    //Método para abrir conexão-- 
    public static Connection abrirConexao() throws ClassNotFoundException{
        Class.forName(Driver);
        try {
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não foi possível carregar o driver");
            return conn = null;
        }
    }
    //Método para fechar conexão--
    public static Connection fecharConexao() throws SQLException{
        if(conn!=null){
            conn.close();
        }return conn = null;
    }

}
