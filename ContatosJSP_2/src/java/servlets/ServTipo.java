/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.Tipo;
import dao.mtipo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucas
 */
@WebServlet(name = "ServTipo", urlPatterns = {"/ServTipo"})
public class ServTipo extends HttpServlet {
    protected void service(HttpServletRequest request,
        HttpServletResponse response)
            
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String op = request.getParameter("op"); //Pega a Opção
        String msg=""; // Cria variável para mensagens

        try (PrintWriter out = response.getWriter()) {
            //Apresentando o formulário de inclusão
            if ("iu".equals(op)) {
                msg+="<!DOCTYPE html>";
                msg+="<form method='post' action='ServTipo?op=iiu'>";
                msg+="<p>ID tipo:<input type='text' name='idt'> ";
                msg+="Nome do tipo:<input type='text' name='nomet'> ";
                msg+="<input type='submit' value='Incluir'>";
                msg+="</p></form>";
                out.println(msg+"<p><a href='mtipo.jsp'>Voltar</a>");
            }

            if ("iiu".equals(op)) {
                Tipo ous = new Tipo(request.getParameter("idt"),
                request.getParameter("nomet"));

                if("".equals(ous.getIDT()) ||
                "".equals(ous.getNomeT())) {
                    msg+="Dado(s) em branco<br>";
                    out.println(msg+"<p><a href='ServTipo?op=iu'>Voltar</a>");
                } else { 
                    msg=mtipo.itipo(ous);
                    //Chama o método itipo que vamos implementar a seguir
                    //Retorma erro ou Inclusão ok
                    out.println(msg+"<p><a href='ServTipo?op=iu'>Voltar</a>");
                }
            }
        }
    }
}
