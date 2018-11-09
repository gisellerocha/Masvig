/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package DAO;

import conection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import model.Atendimento;
import model.Cliente;

/**
 *
 * @author Rodrigo
 */
/*
public class AtendimentoDAO {
	
	
	  public void fecharAtendimento(int id_atendimento) throws SQLException{
           Connection con = ConnectionFactory.getConnection();
             PreparedStatement stmt = null;
             
              stmt = con.prepareStatement("UPDATE atendimento SET situacao =(?) WHERE id_atendimento = (?);");
              stmt.setString(1, "Fechado");
              stmt.setInt(2, id_atendimento);
              stmt.executeUpdate();
              ConnectionFactory.CloseConnection(con,stmt);
         }
	  
	  
	
	  public void alterarPrioridade(int id_atendimento,String alteracao ) throws SQLException{
          Connection con;
         
             con = ConnectionFactory.getConnection();
             PreparedStatement stmt = null;
         
              stmt = con.prepareStatement("UPDATE atendimento SET prioridade =(?) WHERE id_atendimento = (?);");
              stmt.setString(1, alteracao);
              stmt.setInt(2, id_atendimento);
              stmt.executeUpdate();
              ConnectionFactory.CloseConnection(con,stmt);


         }
	  
	  public void alterarProblema(int id_atendimento,String alteracao ) throws SQLException{
          Connection con;
         
             con = ConnectionFactory.getConnection();
             PreparedStatement stmt = null;
         
              stmt = con.prepareStatement("UPDATE atendimento SET problema =(?) WHERE id_atendimento = (?);");
              stmt.setString(1, alteracao);
              stmt.setInt(2, id_atendimento);
              stmt.executeUpdate();
              ConnectionFactory.CloseConnection(con,stmt);

         }
	  
	  public void alterarDescricao(int id_atendimento,String alteracao ) throws SQLException{
          Connection con;
         
             con = ConnectionFactory.getConnection();
             PreparedStatement stmt = null;
         
              stmt = con.prepareStatement("UPDATE atendimento SET descricao =(?) WHERE id_atendimento = (?);");
              stmt.setString(1, alteracao);
              stmt.setInt(2, id_atendimento);
              stmt.executeUpdate();
              ConnectionFactory.CloseConnection(con,stmt);
         }
	
	
    public List <Atendimento> read() throws SQLException{
        List <Atendimento> atendimentoList = new ArrayList<>();
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
         try {
       
        stmt = con.prepareStatement(" SELECT  id_atendimento,fk_id_login,fk_id_equipamento,descricao,prioridade FROM atendimento");
        rs = stmt.executeQuery();
        
        while(rs.next()){
            
        	Atendimento atend = new Atendimento();
            
            
        	atend.setId_atendimento(rs.getInt("id_atendimento"));
        	atend.setFk_id_login(rs.getInt("fk_id_login"));
        	atend.setFk_id_equipamento(rs.getInt("fk_id_equipamento"));
        	atend.setDescricao(rs.getString("discricao"));
        	atend.setPrioridade(rs.getString("prioridade"));
            atendimentoList.add(atend);
                   
            
        }
        
         } catch (SQLException ex) {
             Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
         } finally{
             ConnectionFactory.CloseConnection(con, stmt, rs);
         }
        return  atendimentoList;
   }
} */