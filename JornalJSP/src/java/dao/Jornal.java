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
public class Jornal {
    private String titulo;
    private String tipo;

    public Jornal(){}

    public Jornal(String v_titulo, String v_tipo) {
        this.titulo=v_titulo; 
        this.tipo=v_tipo;
    }
    
    public void setTitulo(String v_titulo) { this.titulo = v_titulo; } 
    public void setTipo(String v_tipo) { 
        if (!v_tipo.equals("diário") && !v_tipo.equals("semanário")) {
            throw new IllegalArgumentException();
        }
        this.tipo = v_tipo; 
    }   
    public String getTitulo() { return titulo; }
    public String getTipo() { return tipo; }
}
