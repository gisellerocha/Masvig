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

public class ClienteDAO {
    private Connection conn = null;
    
  
    public ClienteDAO (Cliente cliente) {
        String InsertCliente = "INSERT INTO cliente (cnpj, razao_social, nome, endereço, complemento, municipio, estado, email, "
                + "num, telefone, celular) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";
    try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(InsertCliente);
            stm.setString(1, cliente.getCnpj());
            stm.setString(2, cliente.getRazaoSocial());
            stm.setString(3, cliente.getNome());
            stm.setString(4, cliente.getEndereço());
            stm.setString(5, cliente.getComplemento());
            stm.setString(6, cliente.getMunicipio());
            stm.setString(7, cliente.getEstado());
            stm.setString(8, cliente.getEmail());
            stm.setInt(9, cliente.getNum());
            stm.setInt(10, cliente.getTelefone());
            stm.setInt(11, cliente.getCelular());
            stm.executeUpdate();
            stm.close();
            conn.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao tentar executar a query: " + ex);
        }    
    }
}
