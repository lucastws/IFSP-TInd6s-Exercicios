/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.Usuario;
import dao.musuario;
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
@WebServlet(name = "ServUsuario", urlPatterns = {"/ServUsuario"})
public class ServUsuario extends HttpServlet {
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
                msg+="<form method='post' action='ServUsuario?op=iiu'>";
                msg+="<p>Usuário:<input type='text' name='usuario'> ";
                msg+="Nome:<input type='text' name='nome'> ";
                msg+="Categoria<select name='cat'>";
                msg+= "<option value='10'>Gerente";
                msg+= "<option value='20'>Atendente";
                msg+="<input type='submit' value='Incluir'>";
                msg+="</p></select></form>";
                out.println(msg+"<p><a href='musuario.jsp'>Voltar</a>");
            }

            if ("iiu".equals(op)) {
                /* Na inclusão de novo usuário a senha será igual ao usuário */
                Usuario ous = new Usuario(request.getParameter("usuario"),
                request.getParameter("usuario"),
                request.getParameter("nome"),
                request.getParameter("cat"));

                if("".equals(ous.getUsuario()) ||
                "".equals(ous.getNome()) ||
                "".equals(ous.getCat())) {
                    msg+="Dado(s) em branco<br>";
                    out.println(msg+"<p><a href='ServUsuario?op=iu'>Voltar</a>");
                } else { 
                    msg=musuario.iusuario(ous);
                    //Chama o método iusuario que vamos implementar a seguir
                    //Retorma erro ou Inclusão ok
                    out.println(msg+"<p><a href='ServUsuario?op=iu'>Voltar</a>");
                }
            }
        }
    }
}
