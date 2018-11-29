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
    private int id_problema;
    
    public ArrayList<String> lista_id_problema = new ArrayList();
    public ArrayList<String> lista_nome_problema = new ArrayList();
    public ArrayList<String> lista_descricao_problema = new ArrayList();

    public Problema(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_problema() {
        return id_problema;
    }

    public void setId_problema(int id_problema) {
        this.id_problema = id_problema;
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
    
    public boolean atualizarProblema(){  
        try{
            ProblemaDAO atualizarProblema = new ProblemaDAO();
            atualizarProblema.atualizar(this);
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public Problema buscarProblema(Problema problema) {
        try {
            ProblemaDAO buscarProblema = new ProblemaDAO();
            return buscarProblema.buscar(problema);
        } catch (Exception e) {
            return null;
        }
    }
    
    public Problema listarProblemas(Problema problema){
        ProblemaDAO listarTodosOsProblemas = new ProblemaDAO();
        problema = listarTodosOsProblemas.listarTodosOsProblemas(problema);
        return problema;
    }
}
