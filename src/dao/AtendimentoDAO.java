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
 * @author XL
 */
public class AtendimentoDAO {
        private Connection conn = null;
        private String id_atendimento;
        private String[] buscaAtendimento;
    
    public boolean inserirAt(Atendimento atendimento){
        String InsertAtendimento = "INSERT INTO atendimento(assunto, descricao, telefone, email, responsavel, cnpj) " 
                + " VALUES (?, ?, ?, ?, ?, ?); ";
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(InsertAtendimento);
            stm.setString(1, atendimento.getAssunto());
            stm.setString(2, atendimento.getDescricao());
            stm.setInt(3, atendimento.getTelefone());
            stm.setString(4, atendimento.getEmail());
            stm.setString(5, atendimento.getResponsavel());
            stm.setString(6, atendimento.getCnpj());
            
            stm.executeUpdate();
            stm.close();
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar inserir o atendimento: " + ex);
            return false;
        }
    }
    
 public String consultaIdAtendimento(Atendimento atendimento) {
    String SQL = "SELECT id_atendimento FROM atendimento WHERE assunto = '" + atendimento.getAssunto() +"'"
            + " and descricao = '"+atendimento.getDescricao()+"' and telefone = '" + atendimento.getTelefone() + "' and "
            + "email = '" + atendimento.getEmail() + "' and responsavel = '"+atendimento.getResponsavel()+"'";
        try {
            ConexaoDAO DAO =  new ConexaoDAO();

            this.conn = DAO.getConexao();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(SQL);
            while(rs.next()){
                this.id_atendimento = rs.getString("id_atendimento");
            }
            stm.close();
            conn.close();
            return this.id_atendimento;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return "ERRO!";
        }
     }
     public Atendimento consultaAtendimento(int id_atendimento) {
        String SQL = "SELECT * FROM atendimento where id_atendimento = "+id_atendimento;
            try {
                ConexaoDAO DAO =  new ConexaoDAO();

                this.conn = DAO.getConexao();
                Statement stm = conn.createStatement();
                ResultSet rs = stm.executeQuery(SQL);
                
                Atendimento atendimentoRetornado = new Atendimento(null, null, null, null, "0", null);
                
                while(rs.next()){
                    atendimentoRetornado.setId_atendimento(Integer.parseInt(rs.getString("id_atendimento")));
                    atendimentoRetornado.setAssunto(rs.getString("assunto"));
                    atendimentoRetornado.setCnpj(rs.getString("cnpj"));
                    atendimentoRetornado.setDescricao(rs.getString("descricao"));
                    atendimentoRetornado.setEmail(rs.getString("email"));
                    atendimentoRetornado.setResponsavel(rs.getString("responsavel"));
                    atendimentoRetornado.setTelefone(Integer.parseInt(rs.getString("telefone")));
                }
                stm.close();
                conn.close();
                return atendimentoRetornado;
            } catch (SQLException ex) {
                System.out.println("Erro: " + ex);
                Atendimento atendimentoRetornado = null;
                return atendimentoRetornado;
            }
         }
    public boolean atualizarAt(Atendimento atendimento){
        
        String atualizarSQL = "UPDATE atendimento SET cnpj=?, "
                + "telefone=?,email=?,responsavel=?,assunto=?,descricao=? "
                + "WHERE id_atendimento = ?";
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(atualizarSQL);
            
            stm.setString(1, atendimento.getCnpj());
            stm.setInt(2, atendimento.getTelefone());
            stm.setString(3, atendimento.getEmail());
            stm.setString(4, atendimento.getResponsavel());
            stm.setString(5, atendimento.getAssunto());
            stm.setString(6, atendimento.getDescricao());
            stm.setInt(7, atendimento.getId_atendimento());
            
            stm.executeUpdate();
            stm.close();
            conn.close();
            return true;

        } catch (SQLException ex) {
            System.out.println("Erro ao tentar atualizar o atendimento: " + ex);
            return false;
        }
    }
    
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


        
        public void atendimentos(int id_atendimento, String cliente, Atendimento atendimento) {
            String SQL = null;
            if(id_atendimento != 0){
                SQL = "select at.id_atendimento, cli.razao_social, at.telefone, " +
                "at.email, at.responsavel, at.assunto from atendimento at " +
                "inner join cliente cli on cli.cnpj = at.cnpj " +
                "where id_atendimento = "+id_atendimento +"order by at.id_atendimento desc";
            } else if(cliente != null){
                SQL = "select at.id_atendimento, cli.razao_social, at.telefone, " +
                "at.email, at.responsavel, at.assunto from atendimento at " +
                "inner join cliente cli on cli.cnpj = at.cnpj " +
                "where at.cnpj = '"+cliente+"' order by at.id_atendimento desc";
            } else {
                SQL = "select at.id_atendimento, cli.razao_social, at.telefone, " +
                "at.email, at.responsavel, at.assunto from atendimento at " +
                "inner join cliente cli on cli.cnpj = at.cnpj order by at.id_atendimento desc";
            }
            try {
                ConexaoDAO DAO =  new ConexaoDAO();
                this.conn = DAO.getConexao();
                Statement stm = conn.createStatement();
                ResultSet rs = stm.executeQuery(SQL);
                while(rs.next()){
                    atendimento.listaId.add((String.valueOf(rs.getInt("id_atendimento"))));
                    atendimento.listaNome.add((rs.getString("razao_social")));
                    atendimento.listaTelefone.add((String.valueOf(rs.getInt("telefone"))));
                    atendimento.listaEmail.add((rs.getString("email")));
                    atendimento.listaResponsavel.add((rs.getString("responsavel")));
                    atendimento.listaAssunto.add((rs.getString("assunto")));
                }
                stm.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Erro: " + ex);
            }
         }
}
