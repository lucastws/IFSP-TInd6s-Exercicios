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
public class Reporter extends Funcionario {
    private String registro;

    public Reporter(){}

    public Reporter(String v_registro) {
        this.registro=v_registro; 
    }
    
    public void setRegistro(String v_registro) { this.registro = v_registro; }
    public String getRegistro() { return registro; }
}
