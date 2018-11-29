/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author Giselle Rocha
 */
public class Problema {
    private String nome;
    private String descricao;
    
    public ArrayList<String> lista_id_problema = new ArrayList();
    public ArrayList<String> lista_nome_problema = new ArrayList();
    public ArrayList<String> lista_descricao_problema = new ArrayList();

    public Problema(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return nome;
    }
    
    public String setDescricao() {
        return nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean inserirProblema(){  
        try{
            ProblemaDAO insereProblema = new ProblemaDAO();
            insereProblema.inserir(this);
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public Problema listarProblemas(Problema problema){
        ProblemaDAO listarTodosOsProblemas = new ProblemaDAO();
        problema = listarTodosOsProblemas.listarTodosOsProblemas(problema);
        return problema;
    }
}
