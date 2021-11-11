/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Mecanico {
    protected String nome;
    protected Double valorDaHora;
    protected Veiculo veiculo;
    
    public void setNome(String v_nome) { nome = v_nome; }
    public void setValorDaHora(Double v_valorDaHora) { 
        valorDaHora = v_valorDaHora; }
    public void setVeiculo(Veiculo obj_veiculo) { veiculo = obj_veiculo; }
    
    public String getNome() { return nome; }
    public Double getValorDaHora() { return valorDaHora; }
    public Veiculo getVeiculo() { return veiculo; }
    
    public void consertar(Double horasTrabalhadas)
    {
        System.out.println("Consertando veículo " + veiculo.getPlaca());
        
        registrarValor(horasTrabalhadas);
    }
    
    protected void registrarValor(Double horasTrabalhadas)
    {
        veiculo.setValorDoConserto(veiculo.getValorDoConserto() + (horasTrabalhadas * valorDaHora));
    }
}
