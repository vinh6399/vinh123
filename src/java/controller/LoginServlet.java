/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.UserDAO;
import entity.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nguyen Ngoc Hieu
 */
public class LoginServlet extends HttpServlet {

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
        try {
            /* TODO output your page here. You may use following sample code. */
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            List<Users> users = new UserDAO().select();
            Date lastAccessed = new Date();
            //open DAO and valida username , password
            HttpSession session = request.getSession();
            boolean x = false;
            for (Users u : users) {
                if (u.getUsername().equals(username.trim()) && u.getPassword().equals(password.trim())) {
                    if (u.getRole() == 2) {
                        x = true;
                        break;
                    }
                    session.setAttribute("user", u);
                    if (u.getRole() != 1) {
                        System.out.println("admin :" + u.getRole());
                        RequestDispatcher rd = request.getRequestDispatcher("/CityServlet");
                        rd.forward(request, response);
                    } else {
                        System.out.println("123123");
                        RequestDispatcher rd = request.getRequestDispatcher("/admin");
                        rd.forward(request, response);
                    }
                }
            }
            if (session.getAttribute("user") == null) {
                request.setAttribute("loginErr", "username or pass is invalid");
                if (x) {
                    request.setAttribute("loginErr", "This account is blocked");
                }
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }

//            session.removeAttribute("loginAdminErr");
//            if (session.getAttribute("user") == null) {
//                request.setAttribute("loginErr", "username or pass is invalid");
//                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
//                rd.forward(request, response);
//            }
        } catch (Exception e) {
            response.getWriter().print(e);
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
