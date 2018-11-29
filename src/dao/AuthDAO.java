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
public class AuthDAO {
    
    private boolean auth = false; //INICIALIZAMOS AUTH COMO FALSO PQ A CONSULTA PODE NÃO RETORNAR USUARIO NENHUM
    private int funcional;
    private String senha;

    public AuthDAO(int funcional, String senha) {
        this.funcional = funcional;
        this.senha = senha;
    }
    
    public boolean auth(){
        String SQL = "SELECT * FROM USUARIO WHERE FUNCIONAL = " + funcional + " AND SENHA = '" +  senha + "';";
        //System.out.println(SQL);
        try {
            ConexaoDAO DAO =  new ConexaoDAO();
            Connection conn = DAO.getConexao();
            PreparedStatement stmt = conn.prepareStatement(SQL);
            ResultSet rs = stmt.executeQuery();
            Auth usuarioSessao = new Auth(0, null);
            while(rs.next()){
                usuarioSessao.setFuncional(rs.getInt("funcional"));
                usuarioSessao.setTipo_de_usuario(rs.getString("cargo"));
                usuarioSessao.setNomeDeUsuario(rs.getString("nome"));
                this.auth = true; //SE HOUVER RETORNO DO BANCO AUTH É VERDADEIRO
            }
            Sessao sessao = Sessao.getInstance(); //AQUI SE INICIA A SESSÃO
            sessao.setUsuario(usuarioSessao); //AQUI PASSAMOS O QUE QUEREMOS RESGATAR DEPOIS NO CASO UM TIPO AUTH QUE JÁ RECEBEU O TIPO DE USUARIO
            stmt.close();
            rs.close();
            conn.close();
        } catch (SQLException e){
            System.out.println("" + e);
            this.auth = false;
        }
        return this.auth;
    }
}