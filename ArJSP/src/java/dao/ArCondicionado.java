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
public class ArCondicionado {
    private Boolean ligado;
    private Double temperatura;
    private int velocidade;
    private Janela objJanela; 
    private Termostato objTermostato;

    public ArCondicionado() {
        this.ligado=false;
        this.temperatura=20.0;
        this.velocidade=1;
    }
    
    public void setLigado(Boolean v_ligado){ this.ligado = v_ligado; }
    public void setTemperatura(Double v_temperatura){ 
        this.temperatura = v_temperatura; }
    public void setVelocidade(int v_velocidade){ 
        this.velocidade = v_velocidade; }
    public void setObjJanela(Janela v_objJanela){ 
        this.objJanela = v_objJanela; }
    public void setObjTermostato(Termostato v_objTermostato){ 
        this.objTermostato = v_objTermostato; }
    
    public Boolean getLigado (){ return this.ligado; }
    public Double getTemperatura (){ return this.temperatura; }
    public int getVelocidade (){ return this.velocidade; }
    public Janela getObjJanela (){ return objJanela; }
    public Termostato getObjTermostato (){ return objTermostato; }
    
    public void acionar()
    {
        if(objJanela.getAberto() == false && 
                objTermostato.getTemperaturaAtual() > 
                this.temperatura && this.ligado == false)
        {
            this.ligado = true;
        
            System.out.println("O aparelho está funcionando em " + 
                    this.temperatura + " graus na velocidade " + 
                    this.velocidade);
        }
        else
        {
            System.out.println("Impossível ligar o ar condicionado "
                    + "no momento.");
        }
    }
}