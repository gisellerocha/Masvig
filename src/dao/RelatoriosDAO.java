/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pandorum
 */
public class RelatoriosDAO {
    private Connection conn;
    
    public Relatorio totalProblema (Relatorio relatorio, int qual) {
        String SQL = "";
        /* qual = 1 para o total de atendimentos por tipo de problema */
        /* qual = 2 para o total de atendimento por cliente */
        switch (qual) {
            case 1:
                SQL = "SELECT count(at.id_atendimento) as 'Quantidade', prob.tipo_problema as 'Nome' FROM atendimento at\n" +
                        "inner join problema prob on prob.id_problema = at.id_problema\n" +
                        "group by prob.tipo_problema;";
                break;
            case 2:
                SQL = "SELECT COUNT(at.id_atendimento) as 'Quantidade', cli.razao_social as 'Nome' from atendimento at\n" +
                        "inner join cliente cli on cli.cnpj = at.cnpj\n" +
                        "group by cli.razao_social;";
                break;
            default:
                return null;
        }
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(SQL);
            while(rs.next()){
                relatorio.Nome.add(rs.getString("Nome"));
                relatorio.Quantidade.add(rs.getString("Quantidade"));
            }
            stm.close();
            conn.close();
            return relatorio;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return null;
        }
     }
}