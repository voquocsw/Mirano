package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin_header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Admin Dashboard</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"https://use.fontawesome.com/releases/v6.1.0/js/all.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- CSS only -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"sb-nav-fixed\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!DOCTYPE html>\n");
      out.write("    <html lang=\"en\">\n");
      out.write("\n");
      out.write("        <head>\n");
      out.write("            <meta charset=\"utf-8\" />\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("            <meta name=\"description\" content=\"\" />\n");
      out.write("            <meta name=\"author\" content=\"\" />\n");
      out.write("            <title>Dashboard - SB Admin</title>\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\n");
      out.write("            <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("            <script src=\"https://use.fontawesome.com/releases/v6.1.0/js/all.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <!-- CSS only -->\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("                  integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body class=\"sb-nav-fixed\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark  bg-dark\" style=\"font-size: 22px;\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"adminDashboardController\" style=\"margin-left: 300px;\">Admin</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\"\n");
      out.write("                        aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\" style=\"margin-left: 220px;\">\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link ms-5\" href=\"adminDashboardController\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link ms-4\" href=\"manageProductControll?productName=&category=&page=1\">Product</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link ms-4\" href=\"manageBookingController?title=&date=&order=showId&dimesion=asc&page=1\">Booking</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"margin-right: 300px;\">\n");
      out.write("                    <a href=\"logoutController\"><i class=\"fa fa-solid fa-right-from-bracket\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </body>\n");
      out.write("\n");
      out.write("    </html>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"layoutSidenav\">\n");
      out.write("            <div id=\"layoutSidenav_content\">\n");
      out.write("                <main style=\"margin-left: 200px; height: 540px;\">\n");
      out.write("                    <div class=\"container-fluid px-4\">\n");
      out.write("                        <h1 class=\"mt-4 ms-5\">Dashboard</h1>\n");
      out.write("                        <ol class=\"breadcrumb mb-4 ms-5\">\n");
      out.write("                            <li class=\"breadcrumb-item active\">Dashboard</li>\n");
      out.write("                        </ol>\n");
      out.write("                        <div class=\"row d-flex justify-content-around\" style=\"width: 90%;\">\n");
      out.write("                            <div class=\"col-md-5\">\n");
      out.write("                                <div class=\"card bg-success text-white mb-4\" >\n");
      out.write("                                    <div class=\"card-body\">Total Product: </div>\n");
      out.write("                                    <h3 class=\"card-body text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Products</h3>\n");
      out.write("                                    <div class=\"card-footer d-flex align-items-center justify-content-between\">\n");
      out.write("                                        <a class=\"small text-white stretched-link\" href=\"manageProductControll?productName=&category=&page=1\">View Details</a>\n");
      out.write("                                        <div class=\"small text-white\"><i class=\"fas fa-angle-right\"></i></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-5\">\n");
      out.write("                                <div class=\"card bg-success text-white mb-4\" >\n");
      out.write("                                    <div class=\"card-body\">Total Booking: </div>\n");
      out.write("                                    <h3 class=\"card-body text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalBooking}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Booking</h3>\n");
      out.write("                                    <div class=\"card-footer d-flex align-items-center justify-content-between\">\n");
      out.write("                                        <a class=\"small text-white stretched-link\" href=\"manageBookingController?title=&date=&order=showId&dimesion=asc&page=1\">View Details</a>\n");
      out.write("                                        <div class=\"small text-white\"><i class=\"fas fa-angle-right\"></i></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-5\">\n");
      out.write("                                <div class=\"card bg-success text-white mb-4\">\n");
      out.write("                                    <div class=\"card-body\">Total Users: </div>\n");
      out.write("                                    <h3 class=\"card-body text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Users</h3>\n");
      out.write("                                    <div class=\"card-footer d-flex align-items-center justify-content-between\">\n");
      out.write("                                        <a class=\"small text-white stretched-link\" href=\"managerUserControll\">View Details</a>\n");
      out.write("                                        <div class=\"small text-white\"><i class=\"fas fa-angle-right\"></i></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-5\">\n");
      out.write("                                <div class=\"card bg-success text-white mb-4\">\n");
      out.write("                                    <div class=\"card-body\">Total revenue: </div>\n");
      out.write("                                    <h3 class=\"card-body text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalBooking}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$</h3>\n");
      out.write("                                    <div class=\"card-footer d-flex align-items-center justify-content-between\">\n");
      out.write("                                        <a class=\"small text-white stretched-link\" href=\"#\">View Details</a>\n");
      out.write("                                        <div class=\"small text-white\"><i class=\"fas fa-angle-right\"></i></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("                <footer class=\"py-4 bg-light mt-auto \">\n");
      out.write("                    <div class=\"container-fluid px-4\">\n");
      out.write("                        <div class=\"d-flex align-items-center justify-content-between small\">\n");
      out.write("                            <div class=\"text-muted\">Copyright &copy; Your Website 2022</div>\n");
      out.write("                            <div>\n");
      out.write("                                <a href=\"#\">Privacy Policy</a>\n");
      out.write("                                &middot;\n");
      out.write("                                <a href=\"#\">Terms &amp; Conditions</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
