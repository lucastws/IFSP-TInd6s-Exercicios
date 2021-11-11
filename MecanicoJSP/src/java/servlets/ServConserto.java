/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.Funileiro;
import dao.Mecanico;
import dao.Veiculo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucas
 */
@WebServlet(name = "desafio02", urlPatterns = {"/desafio02"})
public class ServConserto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String nome_mecanico = request.getParameter("nome_mecanico");
            Double horas_mecanico = Double.parseDouble(request.getParameter("horas_mecanico"));
            String nome_funileiro= request.getParameter("nome_funileiro");
            Double horas_funileiro = Double.parseDouble(request.getParameter("horas_funileiro"));
            String placa_veiculo = request.getParameter("placa_veiculo");
            Double trabalho_mecanico = Double.parseDouble(request.getParameter("trabalho_mecanico"));
            Double trabalho_funileiro = Double.parseDouble(request.getParameter("trabalho_funileiro"));
            
            Veiculo veiculo = new Veiculo();
            veiculo.setPlaca(placa_veiculo);
            veiculo.setValorDoConserto(0.0);
            
            Mecanico mecanico = new Mecanico();
            mecanico.setNome(nome_mecanico);
            mecanico.setValorDaHora(horas_mecanico);
            mecanico.setVeiculo(veiculo);
            mecanico.consertar(trabalho_mecanico);
            
            Funileiro funileiro = new Funileiro();
            funileiro.setNome(nome_funileiro);
            funileiro.setValorDaHora(horas_funileiro);
            funileiro.setVeiculo(veiculo);
            funileiro.consertar(trabalho_funileiro);
            
            veiculo.exibirValorDoConserto();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Desafio 2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Desafio 2</h1>");
            
            String msg="";
            msg+="<p>Consertando veículo " + veiculo.getPlaca() + "</p>";
            msg+="<p>Valor total do conserto: " + veiculo.getValorDoConserto() + "</p>";
            out.println(msg);
            
            out.println("</body>");
            out.println("</html>");
            
            veiculo.setValorDoConserto(0.0);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
