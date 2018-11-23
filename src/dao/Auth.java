/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author XL
 */
public class Auth {
    protected int funcional;
    private String senha;
    protected String tipo_de_usuario;

    public int getFuncional() {
        return funcional;
    }

    public void setFuncional(int funcional) {
        this.funcional = funcional;
    }

    
    
    public String getTipo_de_usuario() {
        return tipo_de_usuario;
    }

    public void setTipo_de_usuario(String tipo_de_usuario) {
        this.tipo_de_usuario = tipo_de_usuario;
    }
    
    public Auth(int funcional, String senha) {
        this.funcional = funcional;
        this.senha = senha;
    }
    
    public boolean authSucesso(){
        AuthDAO autenticadora = new AuthDAO(this.funcional, this.senha);
        boolean auth = autenticadora.auth();
        return auth;
    }
    
}
