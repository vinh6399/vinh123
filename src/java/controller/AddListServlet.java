/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ListDAO;
import com.google.gson.Gson;
import entity.ListSave;
import entity.Users;
import java.io.IOException;
import java.io.PrintWriter;
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
public class AddListServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()){
            /* TODO output your page here. You may use following sample code. */
//            HttpSession session = request.getSession();
////             session.getAttribute("user")
//
//            if (session.getAttribute("user") == null) {
//                RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
//                rd.forward(request, response);
//            } else {
//                Users a = (Users) session.getAttribute("user");
//                ListDAO lDAO = new ListDAO();
//                List<ListSave> listFV = lDAO.select(a.getUsername());
//                String travelid = request.getParameter("travelID");
//                boolean checkExist = false;
//                for (int i = 0; i < listFV.size(); i++) {
//                    if (travelid.equals(listFV.get(i).getTravelid())) {
//                        checkExist = true;
//                    }
//                }
//                if (checkExist == false) {
//                    lDAO.insertList(a.getUsername(), travelid);
//
//                }
//                RequestDispatcher rd = request.getRequestDispatcher("/TravelServlet?id=dl");
//                rd.forward(request, response);
//            }
           

        } catch (Exception e) {
            response.getWriter().print(e);
            System.out.println(e);
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

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        super.doPut(req, resp); //To change body of generated methods, choose Tools | Templates.
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
        try (PrintWriter out = response.getWriter()){
            /* TODO output your page here. You may use following sample code. */
            Gson g = new Gson();
            System.out.println("12345 " + request.getParameter("travelid"));

            HttpSession session = request.getSession();
//             session.getAttribute("user")
           
         
            if (session.getAttribute("user") == null) {
//                System.out.println("load lai");
                response.getWriter().print("loginnow");
//                response.sendRedirect("/TravelProject/login.jsp");
                
//                RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
//                rd.forward(request, response);
            } else {
                Users a = (Users) session.getAttribute("user");
                ListDAO lDAO = new ListDAO();
                List<ListSave> listFV = lDAO.select(a.getUsername());
                String travelid = request.getParameter("travelid");
                boolean checkExist = false;
                for (int i = 0; i < listFV.size(); i++) {
                    if (travelid.equals(listFV.get(i).getTravelid())) {
                        checkExist = true;
                    }
                }
                if (checkExist == false) {
                    lDAO.insertList(a.getUsername(), travelid);

                }

//                RequestDispatcher rd = request.getRequestDispatcher("/TravelServlet?id=dl");
//                rd.forward(request, response);
            }

        } catch (Exception e) {
            response.getWriter().print(e);
            System.out.println(e);
        }

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
