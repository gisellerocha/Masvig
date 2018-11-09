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
public class Atendimento {
    private String assunto, descriçao, email, responsavel;
    private int telefone;

    public Atendimento(String assunto, String descriçao, String email, String responsavel, String telefone) {
        this.assunto = assunto;
        this.descriçao = descriçao;
        this.email = email;
        this.responsavel = responsavel;
        this.telefone = Integer.parseInt(telefone);
        
       AtendimentoDAO insereAtend = new AtendimentoDAO();
       insereAtend.inserirAt(this);
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
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
    
}