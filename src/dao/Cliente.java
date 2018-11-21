/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author XL
 */
public class Cliente {
    
    public ArrayList<String> listaCnpj = new ArrayList<String>();
    public ArrayList<String> listaRazaoSocial = new ArrayList<String>();
    public ArrayList<String> listaNome = new ArrayList<String>();
    public ArrayList<String> listaEndereço = new ArrayList<String>();
    public ArrayList<String> listaComplemento = new ArrayList<String>();
    public ArrayList<String> listaMunicipio = new ArrayList<String>();
    public ArrayList<String> listaEstado = new ArrayList<String>();
    public ArrayList<String> listaEmail = new ArrayList<String>();
    public ArrayList<String> listaTelefone = new ArrayList<String>();
    public ArrayList<String> listaNum = new ArrayList<String>();
    
    private Cliente buscaCliente;
    private String cnpj, razaoSocial, nome, endereço, complemento, municipio, estado, email, dataCadastro, cnpjEditar;
    
    private int num, telefone, celular;

    public Cliente(String cnpj, String razaoSocial, String nome, String endereço, String complemento, String municipio, String estado, String email, String num, String telefone, String celular) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nome = nome;
        this.endereço = endereço;
        this.complemento = complemento;
        this.municipio = municipio;
        this.estado = estado;
        this.email = email;
        this.num = Integer.parseInt(num);
        this.telefone = Integer.parseInt(telefone);
        this.celular = Integer.parseInt(celular);
    }
    
    public String getCnpjEditar() {
        return cnpjEditar;
    }

    public void setCnpjEditar(String cnpjEditar) {
        this.cnpjEditar = cnpjEditar;
    }
    
    public void insereCliente(){
       ClienteDAO novoCliente = new ClienteDAO();
       novoCliente.inserirCliente(this);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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
     public String getBuscaCnpj(){
        ClienteDAO buscando = new ClienteDAO();
        String id_cnpj = buscando.consultaCnpjCliente(this);
        return id_cnpj;
    }
    public Cliente getCliente(String cnpj){
        ClienteDAO pegaCliente = new ClienteDAO();
        this.buscaCliente = pegaCliente.consultaCliente(cnpj);
        return this.buscaCliente;
    }
    public boolean attCliente(){  
        try{
            ClienteDAO atualizaCli = new ClienteDAO();
            return atualizaCli.atualizarCliente(this);
        } catch(Exception e){
            return false;
        }
    }
    
    public Cliente listarOsClientes(Cliente cliente, int num){
        /*
            public Cliente todosOsClientes(Cliente cliente, int todosOuUm){
            int todosOuUm = 1, ele busca por cnpj se = a 2 ele busca por razão e 3 ele busca por nome
        */
        ClienteDAO listarCliente = new ClienteDAO();
        return listarCliente.todosOsClientes(cliente, num);
    }
}
   