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
    int funcional;
    String senha;

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
