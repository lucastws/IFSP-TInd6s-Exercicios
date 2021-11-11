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
public class Veiculo {
    protected String placa;
    protected Double valorDoConserto;
    
    public void setPlaca(String v_placa) { 
        placa = v_placa; }
    public void setValorDoConserto(Double v_valorDoConserto) { 
        valorDoConserto = v_valorDoConserto; }
    
    public String getPlaca() { return placa; }
    public Double getValorDoConserto() { return valorDoConserto; }
    
    public void exibirValorDoConserto()
    {
        System.out.println(valorDoConserto);
    }
}
