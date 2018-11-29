/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Giselle Rocha
 */
public class ProblemaDAO {
     private Connection conn = null;
     
    public boolean inserir(Problema problema) {
        String insertProblema = "INSERT INTO problema(tipo_problema, descricao) VALUES (?, ?)";
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(insertProblema);
            stm.setString(1, problema.getNome());
            stm.setString(2, problema.getDescricao());
            stm.executeUpdate();
            stm.close();
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar inserir o problema: " + ex);
            return false;
        }
    }
    
    public Problema listarTodosOsProblemas(Problema problema){
        String SQL = "";
        SQL = "SELECT * FROM problema";
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(SQL);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                problema.lista_id_problema.add(rs.getString("id_problema"));
                problema.lista_nome_problema.add(rs.getString("tipo_problema"));
                problema.lista_descricao_problema.add(rs.getString("descricao"));
            }
            stm.close();
            conn.close();
            return problema;
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar listar os problemas: " + ex);
            return null;
        }
    }
}
