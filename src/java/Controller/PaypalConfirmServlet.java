/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.OrderDAO;
import DAO.ShipDao;
import DAO.UserDao;
import Model.Cart;
import Model.Product;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Aver
 */
public class PaypalConfirmServlet extends HttpServlet {

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
            out.println("<title>Servlet PaypalConfirmServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PaypalConfirmServlet at " + request.getContextPath() + "</h1>");
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
        LocalDate date = LocalDate.now();
        ShipDao s = new ShipDao();
        OrderDAO n = new OrderDAO();
        int id = (int) request.getSession().getAttribute("id");
        float tp = Float.parseFloat((String) session.getAttribute("totalPrice_raw"));
        String name1 = (String) session.getAttribute("name1");
        String phone1 = (String) session.getAttribute("phone1");
        String address1 = (String) session.getAttribute("address1");
        String name = (String) session.getAttribute("name");
        String phone = (String) session.getAttribute("phone");
        String address = (String) session.getAttribute("address");
        request.setAttribute("id", id);
        UserDao us = new UserDao();
        List<Product> list = n.getAllProduct();
        Cookie[] arr = request.getCookies();
        String txt = "";
        if (arr != null) {
            for (Cookie o : arr) {
                if (o.getName().equals("cart")) {
                    txt += o.getValue();
                }
            }
        }
        Cart cart = new Cart(txt, list);
        User a = us.getUserByID(id);
        n.addOrder(a, cart);
        int oid = n.getTopOrderId(id);
        int status = s.addInfo(id, oid, name1, phone1, address1, tp);
        Cookie c = new Cookie("cart", "");
        c.setMaxAge(0);
        response.addCookie(c);
        request.setAttribute("oid", oid);
        request.setAttribute("name1", name1);
        request.setAttribute("phone1", phone1);
        request.setAttribute("address1", address1);
        request.setAttribute("name", name);
        request.setAttribute("phone", phone);
        request.setAttribute("address", address);
        request.setAttribute("price", tp);
        request.setAttribute("date", date);
//        response.sendRedirect("Bill.jsp");
        request.getRequestDispatcher("Bill.jsp").forward(request, response);
        //request.getRequestDispatcher("shop").forward(request, response);
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
