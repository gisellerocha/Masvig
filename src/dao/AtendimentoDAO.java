/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author XL
 */
public class AtendimentoDAO {
        private Connection conn = null;
    
    public AtendimentoDAO(Atendimento atendimento){
        String InsertAtendimento = "INSERT INTO atendimento(assunto, descriçao) " 
                + " VALUES (?, ?); ";
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(InsertAtendimento);
            stm.setString(1, atendimento.getAssunto());
            stm.setString(2, atendimento.getDescriçao());
            
            stm.executeUpdate();
            stm.close();
            conn.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao tentar executar a query: " + ex);
        }
    }
    /*
    public Altera(Altera altera) {
        String InsertAltera = "INSERT INTO usuario_atendimento(id_atendimento, cnpj, funcional) " + " VALUES (?, ?, ?); ";
        
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(InsertAltera);
            stm.setString(1, altera.getId_Atendimento());
            
        }
    }*/
    
}
