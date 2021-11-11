/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class mtipo {
    /*--------Consulta Tipo -------------- */
    public static List ctipo(Tipo tp) {
        Connection conn=null;

        /* Criando uma lista para armazenar dados lidos na tabela tipo */
        List<Tipo> ListaTipo = new ArrayList<>();

        try {
            conn=ConexaoManutencao.getConexao();
            String sql="SELECT * FROM tipo";
            sql+=" WHERE idt='"+tp.getIDT()+"'";
            System.out.println(sql);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.first();

            /* Preenchendo a lista com dados lidos */
            do { 
                Tipo t = new Tipo();
                t.setIDT(rs.getString("idt"));
                t.setNomeT(rs.getString("nomet"));
                System.out.println(t.getNomeT());
                ListaTipo.add(t);
            } while(rs.next());

            /*Devolvendo a lista*/
            return ListaTipo;

        } catch (Exception e) {
            return ListaTipo;
        }
    }
    
    /* ---------Inclusão de Tipo ------*/
    /* Recebe os dados no objeto tp */
    public static String itipo(Tipo tp) {
        Connection conn=null;
        try {
            conn=ConexaoManutencao.getConexao();
            String sql="INSERT INTO tipo (idt, nomet) "
            +"values (?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, tp.getIDT());
            stmt.setString(2, tp.getNomeT());
            stmt.execute();
            stmt.close();
            ConexaoManutencao.closeAll(conn);

            return "Tipo Incluido";
        } catch (Exception e) {
            String msg= "Erro: "+e; return msg;
        }
    }
}