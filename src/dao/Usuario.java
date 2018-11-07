/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;

/**
 *
 * @author XL
 */
public class Usuario {
    private String nome, endereço, complemento, municipio, estado, sexo, email, cpf, rg,  dataNasc, orgao, exp, cargo, senha;
    private int telefone, celular, num;

    public Usuario(String nome, String endereço, String complemento, String municipio, String estado, String sexo, String email, 
            String cpf, String rg, String dataNasc, String orgao, String exp, String cargo, String senha, String telefone, String celular, String num) {
        this.nome = nome;
        this.endereço = endereço;
        this.complemento = complemento;
        this.municipio = municipio;
        this.estado = estado;
        this.sexo = sexo;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNasc = dataNasc;
        this.orgao = orgao;
        this.exp = exp;
        this.cargo = cargo;
        this.senha = senha;
        this.telefone = Integer.parseInt(telefone);
        this.celular = Integer.parseInt(celular);
        this.num = Integer.parseInt(num);
        //this.funcional = Integer.parseInt(funcional);
                
       UsuarioDAO insereNovo = new UsuarioDAO();
       insereNovo.inserir(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
        public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
}
