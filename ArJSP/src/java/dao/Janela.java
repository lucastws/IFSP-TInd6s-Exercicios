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
public class Janela {
    private Boolean aberto;

    public Janela() {
        this.aberto = false;
    }
    
    public void setAberto(Boolean v_aberto){ this.aberto = v_aberto; }
    public Boolean getAberto (){ return this.aberto; }
}
