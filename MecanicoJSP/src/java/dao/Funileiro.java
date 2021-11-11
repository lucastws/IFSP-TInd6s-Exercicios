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
public class Funileiro extends Mecanico {    
    @Override
    public void registrarValor(Double horasTrabalhadas)
    {
        veiculo.setValorDoConserto(veiculo.getValorDoConserto() + (horasTrabalhadas * valorDaHora) + ((horasTrabalhadas * valorDaHora) * 0.5));
    }
}
