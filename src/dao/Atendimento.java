/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author XL
 */
public class Atendimento {
    
    public ArrayList<String> listaId = new ArrayList<String>();
    public ArrayList<String> listaNome = new ArrayList<String>();
    public ArrayList<String> listaTelefone = new ArrayList<String>();
    public ArrayList<String> listaEmail = new ArrayList<String>();
    public ArrayList<String> listaResponsavel = new ArrayList<String>();
    public ArrayList<String> listaAssunto = new ArrayList<String>();
    
    
    
    private String assunto, descricao, email, responsavel, cnpj;
    private int telefone;
    private Atendimento buscaAtendimento;
    private int id_atendimento;
    private ResultSet atendimentos;
    private int tipo_de_problema;
    private int funcional;

    public Atendimento(String assunto, String descricao, String email, String responsavel, String telefone, String cnpj) {
        this.assunto = assunto;
        this.descricao = descricao;
        this.email = email;
        this.responsavel = responsavel;
        this.telefone = Integer.parseInt(telefone);
        this.cnpj = cnpj;
    }

    public int getFuncional() {
        return funcional;
    }

    public void setFuncional(int funcional) {
        this.funcional = funcional;
    }
    
    public int getTipo_de_problema() {
        return tipo_de_problema;
    }

    public void setTipo_de_problema(int tipo_de_problema) {
        this.tipo_de_problema = tipo_de_problema;
    }
    
    public int getId_atendimento() {
        return id_atendimento;
    }

    public void setId_atendimento(int id_atendimento) {
        this.id_atendimento = id_atendimento;
    }
    
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getIdAtendimento(){
        AtendimentoDAO buscaIdAtendimento = new AtendimentoDAO();
        String id_atendimento = buscaIdAtendimento.consultaIdAtendimento(this);
        return id_atendimento;
    }
    public Atendimento getAtendimento(int id_atendimento){
        AtendimentoDAO pegaAtendimento = new AtendimentoDAO();
        this.buscaAtendimento = pegaAtendimento.consultaAtendimento(id_atendimento);
        return this.buscaAtendimento;
    }
    
    public boolean inserirAtendimento(){  
        try{
            AtendimentoDAO insereAtend = new AtendimentoDAO();
            insereAtend.inserirAt(this);
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public boolean atualizarAtendimento(){  
        try{
            AtendimentoDAO atualizaAt = new AtendimentoDAO();
            return atualizaAt.atualizarAt(this);
        } catch(Exception e){
            return false;
        }
    }
    
    public void todosOsClientes(int id_atendimento, String cliente){

            AtendimentoDAO consultaAtendimentos = new AtendimentoDAO(); 
            consultaAtendimentos.atendimentos(id_atendimento,cliente, this);
    }
}