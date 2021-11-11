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
public class Pessoa {
    private String nome;
    private ArCondicionado objArCondicionado;
    private Janela objJanela;

    public Pessoa() {}
    
    public void setNome(String v_nome){ this.nome = v_nome; }
    public void setObjArCondicionado(ArCondicionado v_objArCondicionado){ 
        this.objArCondicionado = v_objArCondicionado; }
    public void setObjJanela(Janela v_objJanela){ 
        this.objJanela = v_objJanela; }
    
    public String getNome (){ return nome; }
    public ArCondicionado getObjArCondicionado (){ return objArCondicionado; }
    public Janela getObjJanela (){ return objJanela; }
    
    public void configurar(Double v_temperatura, int v_velocidade)
    {
        if(v_temperatura >= 15.0 && v_temperatura <= 25.0) 
            this.objArCondicionado.setTemperatura(v_temperatura);
        if(v_velocidade >= 1 && v_velocidade <= 5) 
            this.objArCondicionado.setVelocidade(v_velocidade);
    }
    
    public void ligar()
    {
        this.objArCondicionado.acionar();
    }
    
    public void desligar()
    {
        this.objArCondicionado.setLigado(false);
    }
    
    public void abrir()
    {
        this.objJanela.setAberto(true);
    }
    
    public void fechar()
    {
        this.objJanela.setAberto(false);
    }
}