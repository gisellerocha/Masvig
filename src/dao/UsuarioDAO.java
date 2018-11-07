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

public class UsuarioDAO {

    private Connection conn = null;
    
    public void inserir(Usuario usuario){
        String InsertUsuario = "INSERT INTO usuario(nome, logradouro, complemento, municipio, estado, sexo, email, cpf, rg, data_nasc, telefone, celular, num, orgao, exp, cargo, senha)" 
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);" ;
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(InsertUsuario);
            stm.setString(1, usuario.getNome());
            stm.setString(2, usuario.getEndereço());
            stm.setString(3, usuario.getComplemento());
            stm.setString(4, usuario.getMunicipio());
            stm.setString(5, usuario.getEstado());
            stm.setString(6, usuario.getSexo());
            stm.setString(7, usuario.getEmail());
            stm.setString(8, usuario.getCpf());
            stm.setString(9, usuario.getRg());
            stm.setString(10, usuario.getDataNasc());
            stm.setInt(11, usuario.getTelefone());
            stm.setInt(12, usuario.getCelular());
            stm.setInt(13, usuario.getNum());
            stm.setString(14, usuario.getOrgao());
            stm.setString(15, usuario.getExp());
            stm.setString(16, usuario.getCargo());
            stm.setString(17, usuario.getSenha());
            stm.executeUpdate();                      
            stm.close();
            conn.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao tentar executar a query: " + ex);
        }
    }
    
    public int consulta(String cpf) {
        String ConsultaUsuario = "SELECT * FROM `usuario` WHERE cpf = ?" ;
      //SELECT funcional FROM usuario where cpf = ?"
        try {
            ConexaoDAO DAO =  new ConexaoDAO();

            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(ConsultaUsuario);
            stm.setString(1, cpf);
            //stm.executeQuery();
            ResultSet rs = stm.executeQuery();
            rs.next();
            int funcional = rs.getInt("funcional");

            stm.close();
            conn.close();
            return funcional;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return -1;
        }
     }
}