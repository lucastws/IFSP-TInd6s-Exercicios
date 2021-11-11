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
public class Tipo {
    private String idt;
    private String nomet;

    public Tipo(){}

    public Tipo( String v_idt, String v_nomet) {
        this.idt=v_idt; 
        this.nomet=v_nomet;
    }
    
    public void setIDT(String v_idt){ this. idt = v_idt; }
    public void setNomeT(String v_nomet){ this.nomet = v_nomet; }
    
    public String getIDT(){ return idt; }
    public String getNomeT(){ return nomet; }
}