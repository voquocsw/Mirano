/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UserDao;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Aver
 */
public class PaypalPaymentServlet extends HttpServlet {

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
            out.println("<title>Servlet PaypalPaymentServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PaypalPaymentServlet at " + request.getContextPath() + "</h1>");
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
        HttpSession session = request.getSession();
        String name1 = request.getParameter("name1");
        String phone1 = request.getParameter("phone1");
        String address1 = request.getParameter("address1");

        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String[] productId = request.getParameterValues("productId");
        String totalPrice_raw = request.getParameter("totalPrice");
        float totalPrice = (float) (Math.ceil(Float.parseFloat(totalPrice_raw) / 23650));

        session.setAttribute("name1", name1);
        session.setAttribute("phone1", phone1);
        session.setAttribute("address1", address1);
        session.setAttribute("name", name);
        session.setAttribute("phone", phone);
        session.setAttribute("address", address);
        session.setAttribute("productId", productId);
        session.setAttribute("totalPrice_raw", totalPrice_raw);
        request.setAttribute("totalPrice", totalPrice);
        request.getRequestDispatcher("paypal_pay.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        String totalPrice_raw = request.getParameter("price");
        int totalPrice = (int) (Math.ceil(Float.parseFloat(totalPrice_raw) / 23650));
        int tid = Integer.parseInt(request.getParameter("tbId"));
        int id = (int) request.getSession().getAttribute("id");
        UserDao db = new UserDao();
        User user = db.findUser(id);
        session.setAttribute("tbId", tid);
        session.setAttribute("user", user);
        session.setAttribute("totalPrice_raw", totalPrice_raw);
        session.setAttribute("totalPrice", totalPrice);
        request.getRequestDispatcher("Staff_paypal_pay.jsp").forward(request, response);
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
