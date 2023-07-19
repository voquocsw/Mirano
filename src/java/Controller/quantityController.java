/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.OrderDAO;
import DAO.TableDao;
import Model.Item;
import Model.Product;
import Model.Table;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aver
 */
public class quantityController extends HttpServlet {

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
            out.println("<title>Servlet quantityController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet quantityController at " + request.getContextPath() + "</h1>");
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
        OrderDAO od = new OrderDAO();
        String num_raw = request.getParameter("num");
        String id_raw = request.getParameter("productId");
        int tableId = Integer.parseInt(request.getParameter("tableId"));
        int id, num = 0;
        try {
            id = Integer.parseInt(id_raw);
            num = Integer.parseInt(num_raw);
            if (num == -1) {
                if (od.getQuantityInCart(id, tableId) <= 1) {
                    od.deleteProductFromCart(id, tableId);
                    if(od.sumQuantity(tableId) == 0){
                    response.sendRedirect("tableOrderController");}
                    else{
                        od.subQuantity(id, tableId);
                    TableDao tb = new TableDao();
                    List<Table> tableList = tb.getTableInvalid();
                    request.setAttribute("table", tableList);
                    List<Item> it = od.getCartByTableID(tableId);
                    float totalPrice = od.totalPrice(tableId);
                    request.setAttribute("tableId", tableId);
                    request.setAttribute("item", it);
                    request.setAttribute("totalPrice", totalPrice);
                    request.getRequestDispatcher("tableOrder.jsp").forward(request, response);
                    }
                } else {
                    od.subQuantity(id, tableId);
                    TableDao tb = new TableDao();
                    List<Table> tableList = tb.getTableInvalid();
                    request.setAttribute("table", tableList);
                    List<Item> it = od.getCartByTableID(tableId);
                    float totalPrice = od.totalPrice(tableId);
                    request.setAttribute("tableId", tableId);
                    request.setAttribute("item", it);
                    request.setAttribute("totalPrice", totalPrice);
                    request.getRequestDispatcher("tableOrder.jsp").forward(request, response);
                }
            } else if (num == 1) {
                if (od.getQuantityInCart(id, tableId) >= 10) {
                    num = 0;
                    TableDao tb = new TableDao();
                    List<Table> tableList = tb.getTableInvalid();
                    request.setAttribute("table", tableList);
                    List<Item> it = od.getCartByTableID(tableId);
                    float totalPrice = od.totalPrice(tableId);
                    request.setAttribute("tableId", tableId);
                    request.setAttribute("item", it);
                    request.setAttribute("totalPrice", totalPrice);
                    request.getRequestDispatcher("tableOrder.jsp").forward(request, response);
                } else {
                    od.addQuantity(id, tableId);
                    TableDao tb = new TableDao();
                    List<Table> tableList = tb.getTableInvalid();
                    request.setAttribute("table", tableList);
                    List<Item> it = od.getCartByTableID(tableId);
                    float totalPrice = od.totalPrice(tableId);
                    request.setAttribute("tableId", tableId);
                    request.setAttribute("item", it);
                    request.setAttribute("totalPrice", totalPrice);
                    request.getRequestDispatcher("tableOrder.jsp").forward(request, response);
                }
            }
        } catch (NumberFormatException e) {

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
