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
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nguyen Ngoc Hieu
 */
public class SignUpServlet extends HttpServlet {

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
            String accname = request.getParameter("accname");
            String username = request.getParameter("username");
            String pass = request.getParameter("password");
            String email = request.getParameter("email");
            List<Users> u = new UserDAO().select();
            boolean checkexist = false;
            System.out.println(username + "nhap vao");
            for (Users user : u) {
                System.out.println(user.getUsername());
                if (user.getUsername().equalsIgnoreCase(username)) {
                    checkexist = true;
                }
            }
            if (!username.matches("[a-zA-Z\\d\\_\\.]+")) {
                request.setAttribute("signupErr", "Invalid Username.");
            } else {
                if (checkexist) {
                    System.out.println("exist:12321321");
                    request.setAttribute("signupErr", "Username Existed!");
                } else {
                    System.out.println("not exist:12321321");
                    new UserDAO().insertNewUser(new Users(accname, pass, username, 0, email));
                    request.setAttribute("signupsucces", "Sign Up successful!");
                }
            }

            RequestDispatcher rd = request.getRequestDispatcher("SignUp.jsp");
            rd.forward(request, response);
        } catch (Exception ex) {
            response.getWriter().print(ex);

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
