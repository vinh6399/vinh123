/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CityDAO;
import DAO.ImgDAO;
import DAO.TravelDAO;
import DAO.TravelDetailDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nguyen Ngoc Hieu
 */
public class TravelDetailServlet extends HttpServlet {

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
            String id = request.getParameter("travelID");
            System.out.println(id);
            request.setAttribute("detail", new TravelDetailDAO().select(id));
//            System.out.println(new TravelDetailDAO().select(id).getName());
            request.setAttribute("images", new ImgDAO().selectByTravelId(id));
            request.setAttribute("travel", new TravelDAO().selectByTravelId(id));
            request.setAttribute("city",  new CityDAO().selectByID(new TravelDAO().selectByTravelId(id).getCity_id()).getCity_name());
            request.setAttribute("imageBackground", new TravelDAO().selectByTravelId(id).getLinkImage().trim());
            System.out.println(new TravelDAO().selectByTravelId(id).getLinkImage().trim());
            request.setAttribute("vid", new TravelDetailDAO().select("1").getVideo());
            RequestDispatcher rd = request.getRequestDispatcher("/travelDetail.jsp");
            rd.forward(request, response);
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
