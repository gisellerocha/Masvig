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
    // esse metodo busca um cpf e retorna a funcional
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
          public Usuario consultaDadosUsuario(Usuario usuario) {
        String SQL = "SELECT * FROM usuario WHERE funcional = "+ usuario.getFuncional();
          //System.out.println(SQL);
            try {
                ConexaoDAO DAO =  new ConexaoDAO();

                this.conn = DAO.getConexao();
                PreparedStatement stm = conn.prepareStatement(SQL);
                ResultSet rs = stm.executeQuery();
                /*Usuario(String nome, String endereço, String complemento, String municipio, String estado, String sexo, String email, 
            String cpf, String rg, String dataNasc, String orgao, String exp, String cargo, String senha, String telefone, String celular, String num)*/
                while(rs.next()){
                    usuario.setNome((rs.getString("nome")));
                    usuario.setEndereço(rs.getString("logradouro"));
                    usuario.setComplemento(rs.getString("complemento"));
                    usuario.setMunicipio(rs.getString("municipio"));
                    usuario.setEstado((rs.getString("estado")));
                    usuario.setSexo((rs.getString("sexo")));
                    usuario.setEmail((rs.getString("email")));
                    usuario.setCpf((rs.getString("cpf")));
                    usuario.setRg((rs.getString("rg")));
                    usuario.setDataNasc((rs.getString("data_nasc")));
                    usuario.setOrgao((rs.getString("orgao")));
                    usuario.setExp((rs.getString("exp")));
                    usuario.setCargo((rs.getString("cargo")));
                    usuario.setSenha((rs.getString("senha")));
                    usuario.setNum(Integer.parseInt(rs.getString("num")));
                    usuario.setTelefone(Integer.parseInt(rs.getString("telefone")));
                    usuario.setCelular(Integer.parseInt(rs.getString("celular")));
                }
                stm.close();
                conn.close();
                return usuario;
            } catch (SQLException ex) {
                System.out.println("Erro: erro ao tentar buscar o usuario pela sua funcional! " + ex);
                usuario = null;
                return usuario;
            }
         }
       public Usuario atualizarUsuario(Usuario usuario){
        
        String atualizarSQL = "UPDATE usuario SET nome=?, "
                + "logradouro=?,complemento=?,municipio=?,estado=?,"
                + "sexo=?,email=?,cpf=?,rg=?,data_nasc=?,telefone=?,celular=?,"
                + "num=?,orgao=?,exp=?,cargo=?,senha=? "
                + "WHERE funcional = ?";
           //System.out.println(atualizarSQL);
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(atualizarSQL);
            
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
            stm.setInt(18, usuario.getFuncional());
            
            stm.executeUpdate();
            stm.close();
            conn.close();
            return usuario;

        } catch (SQLException ex) {
            System.out.println("Erro ao tentar atualizar o usuario: " + ex);
            return usuario;
        }
    }
    public Usuario todosOsUsuarios(Usuario usuario, int todosOuUm){
        String SQL = "select * from usuario";
        if(todosOuUm == 1){
            SQL = "select * from usuario where funcional = '" + usuario.getFuncional()+ "'";
        }
        if(todosOuUm == 2){
            SQL = "select * from usuario where nome like '%" + usuario.getNome() + "%'";
        }
        if(todosOuUm == 3){
            SQL = "select * from usuario where cpf = '" + usuario.getCpf()+ "'";
        }
           //System.out.println(atualizarSQL);
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            this.conn = DAO.getConexao();
            PreparedStatement stm = conn.prepareStatement(SQL);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                    usuario.listaFuncional.add(String.valueOf(rs.getInt("funcional")));
                    usuario.listaNome.add(rs.getString("nome"));
                    usuario.listaCpf.add(rs.getString("cpf"));
                    usuario.listaTelefone.add(String.valueOf(rs.getInt("telefone")));
                    usuario.listaCargo.add(rs.getString("cargo"));
                    usuario.listaSenha.add(rs.getString("senha"));
                    usuario.listaEmail.add(rs.getString("email"));
                    
            }
            stm.close();
            conn.close();
            return usuario;

        } catch (SQLException ex) {
            System.out.println("Erro ao tentar consultar todos os usuarios: " + ex);
            usuario = null;
            return usuario;
        }
    }
}