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

/**
 *
 * @author XL
 */
public class AtendimentoDAO {
        private Connection conn = null;
    
    public void inserirAt(Atendimento atendimento){
        String InsertAtendimento = "INSERT INTO atendimento(assunto, descricao, telefone, email, responsavel) " 
                + " VALUES (?, ?, ?, ?, ?); ";
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(InsertAtendimento);
            stm.setString(1, atendimento.getAssunto());
            stm.setString(2, atendimento.getDescriçao());
            stm.setInt(3, atendimento.getTelefone());
            stm.setString(4, atendimento.getEmail());
            stm.setString(5, atendimento.getResponsavel());
            
            stm.executeUpdate();
            stm.close();
            conn.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao tentar executar a query: " + ex);
        }
    }
    /*
        public String consultaRazao(String cnpj) {
        String ConsultaCNPJ = "SELECT * FROM `cliente` WHERE cnpj = ?" ;
      //SELECT funcional FROM usuario where cpf = ?"
        try {
            ConexaoDAO DAO =  new ConexaoDAO();

            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(ConsultaCNPJ);
            stm.setString(1, cnpj);
            //stm.executeQuery();
            ResultSet rs = stm.executeQuery();
            rs.next();
            String razao = rs.getString("razao_social");

            stm.close();
            conn.close();
            return razao;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            //return -1;
        }
     }*/
    
    public void fecharAtendimento(int id_atendimento) {
        
        String FecharAtendimento = "UPDATE atendimento SET situacao =(?) WHERE id_atendimento = (?) ; " ;
                
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(FecharAtendimento);
             
              stm = conn.prepareStatement("UPDATE atendimento SET situacao =(?) WHERE id_atendimento = (?);");
              stm.setString(1, "Fechado");
              stm.setInt(2, id_atendimento);
              stm.executeUpdate();
              stm.close();
              conn.close();
              } catch (SQLException ex) {
            System.out.println("Erro ao tentar executar a query: " + ex);
             }
         }
    
}
