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
public class AuthDAO {
    
    private boolean auth = false;
    private int funcional;
    private String senha;

    public AuthDAO(int funcional, String senha) {
        this.funcional = funcional;
        this.senha = senha;
    }
    
    public boolean auth(){
        String SQL = "SELECT * FROM USUARIO WHERE FUNCIONAL = " + funcional + " AND SENHA = '" +  senha + "';";
        //System.out.println(SQL);
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            Connection conn = DAO.getConexao();
            PreparedStatement stmt = conn.prepareStatement(SQL);
            ResultSet rs = stmt.executeQuery();
            this.auth = rs.next();
        } catch (SQLException e){
            System.out.println("" + e);
        }
        return this.auth;
    }
}
