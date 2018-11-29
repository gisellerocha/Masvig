/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author XL
 */

public class ClienteDAO {
    private Connection conn = null;
    private String cnpj;
    private String[] buscaCliente;
    
  
    public void inserirCliente (Cliente cliente) {
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
    public String consultaCnpjCliente(Cliente cliente) {
    String SQL = "SELECT cnpj FROM cliente WHERE nome = '" + cliente.getNome() +"'";
        try {
            ConexaoDAO DAO =  new ConexaoDAO();

            this.conn = DAO.getConexao();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(SQL);
            while(rs.next()){
                this.cnpj = rs.getString("cnpj");
            }
            stm.close();
            conn.close();
            return this.cnpj;
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return "ERRO!";
        }
     }
      public Cliente consultaCliente(String cnpj) {
        String SQL = "SELECT * FROM cliente where cnpj = '"+cnpj+"'";
          //System.out.println(SQL);
            try {
                ConexaoDAO DAO =  new ConexaoDAO();

                this.conn = DAO.getConexao();
                Statement stm = conn.createStatement();
                ResultSet rs = stm.executeQuery(SQL);
                
                Cliente clienteRetornado = new Cliente(cnpj, null, null, null, null, null, null, null, "0", "0", "0");
                /*Cliente(String cnpj, String razaoSocial, String nome, String endereço, 
                String complemento, String municipio, String estado, String email, String num, 
                String telefone, String celular) {*/
                while(rs.next()){
                    clienteRetornado.setCnpj((rs.getString("cnpj")));
                    clienteRetornado.setRazaoSocial(rs.getString("razao_social"));
                    clienteRetornado.setNome(rs.getString("nome"));
                    clienteRetornado.setEndereço(rs.getString("endereço"));
                    clienteRetornado.setComplemento(rs.getString("complemento"));
                    clienteRetornado.setMunicipio(rs.getString("municipio"));
                    clienteRetornado.setEstado((rs.getString("estado")));
                    clienteRetornado.setEmail((rs.getString("email")));
                    clienteRetornado.setNum(Integer.parseInt(rs.getString("num")));
                    clienteRetornado.setTelefone(Integer.parseInt(rs.getString("telefone")));
                    clienteRetornado.setCelular(Integer.parseInt(rs.getString("celular")));
                }
                stm.close();
                conn.close();
                return clienteRetornado;
            } catch (SQLException ex) {
                System.out.println("Erro: " + ex);
                Cliente clienteRetornado = null;
                return clienteRetornado;
            }
         }
       public boolean atualizarCliente(Cliente cliente){
        
        String atualizarSQL = "UPDATE cliente SET cnpj=?, "
                + "razao_social=?,nome=?,endereço=?,complemento=?,num=?, "
                + "municipio=?,estado=?,email=?,telefone=?,celular=? "
                + "WHERE cnpj = ?";
           //System.out.println(atualizarSQL);
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(atualizarSQL);
            
            stm.setString(1, cliente.getCnpj());
            stm.setString(2, cliente.getRazaoSocial());
            stm.setString(3, cliente.getNome());
            stm.setString(4, cliente.getEndereço());
            stm.setString(5, cliente.getComplemento());
            stm.setInt(6, cliente.getNum());
            stm.setString(7, cliente.getMunicipio());
            stm.setString(8, cliente.getEstado());
            stm.setString(9, cliente.getEmail());
            stm.setInt(10, cliente.getTelefone());
            stm.setInt(11, cliente.getCelular());
            stm.setString(12, cliente.getCnpjEditar());
            
            stm.executeUpdate();
            stm.close();
            conn.close();
            return true;

        } catch (SQLException ex) {
            System.out.println("Erro ao tentar atualizar o cliente: " + ex);
            return false;
        }
    }
       public Cliente todosOsClientes(Cliente cliente, int todosOuUm){
        String SQL = "select * from cliente";
        if(todosOuUm == 1){
            SQL = "select * from cliente where cnpj = '" + cliente.getCnpj() + "'";
        }
        if(todosOuUm == 2){
            SQL = "select * from cliente where razao_social like '%" + cliente.getRazaoSocial() + "%'";
        }
        if(todosOuUm == 3){
            SQL = "select * from cliente where nome like '%" + cliente.getNome() + "%'";
        }
           //System.out.println(atualizarSQL);
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(SQL);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                    cliente.listaCnpj.add(rs.getString("cnpj"));
                    cliente.listaRazaoSocial.add(rs.getString("razao_social"));
                    cliente.listaNome.add(rs.getString("nome"));
                    cliente.listaEndereço.add(rs.getString("endereço"));
                    cliente.listaComplemento.add(rs.getString("complemento"));
                    cliente.listaMunicipio.add(rs.getString("municipio"));
                    cliente.listaEstado.add(rs.getString("estado"));
                    cliente.listaEmail.add(rs.getString("email"));
                    cliente.listaTelefone.add(String.valueOf(rs.getInt("telefone")));
                    cliente.listaNum.add(String.valueOf(rs.getInt("num")));
            }
            stm.close();
            conn.close();
            return cliente;

        } catch (SQLException ex) {
            System.out.println("Erro ao tentar consultar todos os clientes: " + ex);
            cliente = null;
            return cliente;
        }
    }
}