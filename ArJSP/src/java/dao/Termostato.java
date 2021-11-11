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
public class Termostato {
    private Double temperaturaAtual;

    public Termostato() {}
    
    public void setTemperaturaAtual(Double v_temperaturaAtual){ 
        this.temperaturaAtual = v_temperaturaAtual; }
    public Double getTemperaturaAtual (){ return this.temperaturaAtual; }
    
    public void informarTemepratura(Double v_temperaturaAtual)
    {
        this.temperaturaAtual = v_temperaturaAtual;
    }
}
