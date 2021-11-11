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
public class Fatura {
    private int item_numero;
    private String item_desc;
    private int item_quant;
    private double item_preco;

    public Fatura(){}

    public Fatura(int v_item_numero, String v_item_desc, int v_item_quant, double v_item_preco) {
        this.item_numero=v_item_numero; 
        
        this.item_desc=v_item_desc;
       
        if(v_item_quant < 0) this.item_quant=0;
        else this.item_quant=v_item_quant;
        
        if(v_item_preco < 0.0) this.item_preco=0.0;
        else this.item_preco=v_item_preco;
    }
    
    public void setItem_numero(int v_item_numero) { this.item_numero = v_item_numero; }
    public void setItem_desc(String v_item_desc) { this.item_desc = v_item_desc; }
    public void setItem_qnt(int v_item_quant) { this.item_quant = v_item_quant; }
    public void setItem_preco(float v_item_preco) { this.item_preco = v_item_preco; }
        
    public int getItem_numero() { return item_numero; }
    public String getItem_desc() { return item_desc; }
    public int getItem_qnt() { return item_quant; }
    public double getItem_preco() { return item_preco; }
    
    public double getValorFatura() {
        double retorno = -1;
        
        try {
            retorno = this.item_quant * this.item_preco;
            return retorno;
        } catch (Exception e) {
            e.printStackTrace();
            return retorno;
        }
    }
}