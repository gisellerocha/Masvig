/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author Pandorum
 */
public class Relatorio {
    
    public ArrayList<String> Quantidade = new ArrayList();
    public ArrayList<String> Nome = new ArrayList();
    
    public void Relatorio(){
    }
    
    
    public Relatorio todos(Relatorio relatorio, int qual){
        /* qual = 1 para o total de atendimentos por tipo de problema */
        /* qual = 2 para o total de atendimento por cliente */
        RelatoriosDAO gerar = new RelatoriosDAO();
        return gerar.totalProblema(relatorio, qual);
    }
    
    
}
