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
@WebServlet(name = "login", urlPatterns = {"/login"})

public class login extends HttpServlet {
    protected void service(HttpServletRequest request, 
            HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // Criando o objeto Usuario com os dados enviados
        //(usuario e senha, nomes dados na página index.html)
        Usuario us = new Usuario (request.getParameter("usuario"),
        request.getParameter("senha"), "", "" );
        
        try (PrintWriter out = response.getWriter()) {
            /* Checa se há uma session e destroi */
            if(request.getSession().getAttribute("sesusu") != null) 
                request.getSession().invalidate();

            /* Cria uma lista e chama o método csusuario da classe 
            musuario.java */
            List<Usuario> ListaUsuario=musuario.cusuario(us);

            /* Se a lista não voltou vazia cria uma sessão com usuario, nome e
            categoria e redireciona para a página do sistema */
            if (!ListaUsuario.isEmpty())
            {
                Usuario u = new Usuario();
                u=ListaUsuario.get(0);
                request.getSession().setAttribute("sesusu", u.getUsuario());
                request.getSession().setAttribute("sesnom", u.getNome());
                request.getSession().setAttribute("sescat", u.getCat());
                response.sendRedirect("sistema.jsp");
            }
            
            /* Se a lista retornou vazia, apresenta um erro e abre um link
            para retornar para a página index.html */
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>login</title></head>");
            out.println("<body>");
            out.println("<h1>Usuário / Senha invalidos</h1>");
            out.println("<br><a href='index.html'>Login</a>");
            out.println("</body></html>");
        }
    }
    /* Aqui omiti o + Que são os métodos GET e POST criados e não devem ser 
    mexidos nem apagados */
}