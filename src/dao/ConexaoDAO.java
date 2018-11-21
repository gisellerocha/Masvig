/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
/**
 *
 * @author XL
 */

public class ConexaoDAO {

    private Connection conexao;
    private String motor = "mysql";
    private String driverName = "com." + motor + ".jdbc.Driver";
    private String  usuario = "root";
    private String senha = "";
    private String server = "127.0.0.1";
    private String database = "helpdesk";
    private int porta = 3306;
    private String url = "jdbc:" + motor + "://" + server + ":" + porta + "/" + database;
    
    public ConexaoDAO() throws SQLException {
        conexao = DriverManager.getConnection(this.url, this.usuario, this.senha);
    }
    
    public Connection getConexao(){
        return conexao;
    }
}