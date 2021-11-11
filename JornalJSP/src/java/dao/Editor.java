/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Lucas
 */
public class Editor extends Funcionario {
    private String secao;

    public Editor(){}

    public Editor(String v_secao) {
        this.secao=v_secao; 
    }
    
    public void setSecao(String v_secao) { this.secao = v_secao; }   
    public String getSecao() { return secao; }
}

