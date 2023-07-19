/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.OrderDAO;
import DAO.ShipDao;
import DAO.TableDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aver
 */
public class staffController extends HttpServlet {

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
            out.println("<title>Servlet staffController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet staffController at " + request.getContextPath() + "</h1>");
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
        ShipDao sip = new ShipDao();
        int totalShip = sip.totalShip1();
        OrderDAO od = new OrderDAO();
        int id = (int) request.getSession().getAttribute("id");
        float totalMoney = od.getTotalMoneyById(id);
        TableDao td = new TableDao();
        int totalTable = td.totalTable();
//        ShowDao sDB = new ShowDao();
//        int totalShow = sDB.countShowActive();
//        productDao fDB = new productDao();
//        int totalProduct = fDB.countProductActive();
//        BookingDao bDb = new BookingDao();
//        int totalBooking = bDb.totalSeatIsBooking();
        request.setAttribute("totalTable", totalTable);
        request.setAttribute("totalMoney", totalMoney);
        request.setAttribute("totalShip", totalShip);
//        request.setAttribute("totalShow", totalShow);
//        request.setAttribute("totalProduct", totalProduct);
//        request.setAttribute("totalBooking", totalBooking);
        request.getRequestDispatcher("staff.jsp").forward(request, response);
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
