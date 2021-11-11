/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author Lucas
 */
public class Funcionario {
    protected String nome;
    protected List <Jornal> qualJornal;

    public Funcionario(){}

    public Funcionario(String v_nome, List<Jornal> v_qualJornal) {
        this.nome=v_nome; 
        this.qualJornal=v_qualJornal;
    }
    
    public void setNome(String v_nome) { this.nome = v_nome; } 
    public void setQualJornal(List<Jornal> v_qualJornal) { this.qualJornal = v_qualJornal; }   
    public String getNome() { return nome; }
    public List<Jornal> getQualJornal() { return qualJornal; }
}
