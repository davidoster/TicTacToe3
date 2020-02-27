/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Cell;
import services.MoveService;

/**
 *
 * @author mac
 */
public class MoveController extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MoveController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MoveController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Tic Tac Toe</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>" + "Play your move" +  "</h3>");
            out.println("<form name=\"move\" action=\"move\" method=\"POST\">\n" +
"            <input type=\"text\" name=\"cell\" value=\"0\" />\n" +
"            <input type=\"text\" name=\"symbol\" value=\"X\" />\n" +
"            <input type=\"submit\" value=\"Submit\" name=\"submit\" />\n" +
"        </form>");
            out.println("</body>");
            out.println("</html>");
        }
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
        int position = Integer.parseInt(request.getParameter("cell"));
        String symbol = request.getParameter("symbol");
        Cell cell = new Cell();
        if(position == 0) {
            cell.setX(0);
            cell.setY(0);
        }
        MoveService service = new MoveService();
        service.save(position, symbol);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Tic Tac Toe</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>" + "Play your move" +  "</h3>");
            out.println("cell position:" + request.getParameter("cell"));
            out.println("symbol:" + request.getParameter("symbol"));
            
            out.println("zdfsfdf");
            out.println("</body>");
            out.println("</html>");
            
        }
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
