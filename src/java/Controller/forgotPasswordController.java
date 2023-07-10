/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UserDao;
import Model.Email;
import Model.EmailUtils;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Aver
 */
@WebServlet(name="forgotPasswordController", urlPatterns={"/forgotPasswordController"})
public class forgotPasswordController extends HttpServlet {

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
            out.println("<title>Servlet forgotPasswordController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet forgotPasswordController at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("forgotPassword.jsp").forward(request, response);
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
         
                        RequestDispatcher dispatcher = null;
        try {
                        int otpvalue = 0;
                        
                        String fullname = request.getParameter("fullname");
                        String emailAddress = request.getParameter("email");
			HttpSession mySession = request.getSession();
			UserDao udao = new UserDao();
			User user = udao.checkUserExistByFullNameAndEmail(fullname, emailAddress);
			if(user == null) {
				request.setAttribute("error", "Email hoac username sai!");
			}
                        else {
                             
                // sending otp
                                Random rand = new Random();
                                otpvalue = rand.nextInt(1255650);
				Email email =new Email();
				email.setFrom("mirano12121212@gmail.com");
				email.setFromPassword("tszeaqvxuewzzdbv");
				email.setTo(emailAddress);
				email.setSubject("Forgot Password Function");
				StringBuilder sb = new StringBuilder();
				sb.append("Dear ").append(fullname).append("<br>");
				sb.append("You are used the forgot password. <br> ");
				sb.append("Your otp is <b>").append(otpvalue).append(" </b> <br>");
				sb.append("Regards<br>");
				sb.append("Administrator");
				email.setContent(sb.toString());
				EmailUtils.send(email);
				
				request.setAttribute("mess", "Ma otp da duoc gui den email cua ban!");
                                dispatcher = request.getRequestDispatcher("enterOtp.jsp");
                                mySession.setAttribute("otp", otpvalue);
                                mySession.setAttribute("email", emailAddress);
                                
                                dispatcher.forward(request, response);
                                
			}		
		} catch (Exception e) {
			e.printStackTrace();
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
