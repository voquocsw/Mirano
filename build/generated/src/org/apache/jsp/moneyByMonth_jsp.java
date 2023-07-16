package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class moneyByMonth_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"ISO-8859-1\">\n");
      out.write("        <title>Statistic</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <!------ Include the above in your HEAD tag ------>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.11.2/css/all.css\">\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://mdbootstrap.com/previews/ecommerce-demo/css/bootstrap.min.css\">\n");
      out.write("        <!-- Material Design Bootstrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://mdbootstrap.com/previews/ecommerce-demo/css/mdb-pro.min.css\">\n");
      out.write("        <!-- Material Design Bootstrap Ecommerce -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://mdbootstrap.com/previews/ecommerce-demo/css/mdb.ecommerce.min.css\">\n");
      out.write("        <!-- Your custom styles (optional) -->\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <!------ Include the above in your HEAD tag ------>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://use.fontawesome.com/releases/v5.11.2/css/all.css\"><link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&amp;display=swap\"><link rel=\"stylesheet\" type=\"text/css\" href=\"https://mdbootstrap.com/wp-content/themes/mdbootstrap4/css/mdb5/3.8.1/compiled.min.css\"><link rel=\"stylesheet\" type=\"text/css\" href=\"https://mdbootstrap.com/wp-content/themes/mdbootstrap4/css/mdb-plugins-gathered.min.css\"><style>body {\n");
      out.write("                background-color: #fbfbfb;\n");
      out.write("            }\n");
      out.write("            @media (min-width: 991.98px) {\n");
      out.write("                main {\n");
      out.write("                    padding-left: 0px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Sidebar */\n");
      out.write("            .sidebar {\n");
      out.write("                position: fixed;\n");
      out.write("                top: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                left: 0;\n");
      out.write("                padding: 58px 0 0; /* Height of navbar */\n");
      out.write("                box-shadow: 0 2px 5px 0 rgb(0 0 0 / 5%), 0 2px 10px 0 rgb(0 0 0 / 5%);\n");
      out.write("                width: 240px;\n");
      out.write("                z-index: 600;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (max-width: 991.98px) {\n");
      out.write("                .sidebar {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            .sidebar .active {\n");
      out.write("                border-radius: 5px;\n");
      out.write("                box-shadow: 0 2px 5px 0 rgb(0 0 0 / 16%), 0 2px 10px 0 rgb(0 0 0 / 12%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar-sticky {\n");
      out.write("                position: relative;\n");
      out.write("                top: 0;\n");
      out.write("                height: calc(100vh - 48px);\n");
      out.write("                padding-top: 0.5rem;\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                overflow-y: auto; /* Scrollable contents if viewport is shorter than content. */\n");
      out.write("            }</style>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("\n");
      out.write("        <!--Main Navigation-->\n");
      out.write("        <header>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin_header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </header>\n");
      out.write("            <!--Main Navigation-->\n");
      out.write("\n");
      out.write("            <!--Main layout-->\n");
      out.write("            <main>\n");
      out.write("                <div class=\"container pt-4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- Section: Main chart 2 -->\n");
      out.write("                    <section class=\"mb-4\" id=\"doanhThuThang\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header py-3\">\n");
      out.write("                                <h5 class=\"mb-0 text-center\"><strong>Doanh thu theo tháng</strong></h5>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <canvas id=\"horizontalBar\"></canvas>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                    <!-- Section: Main chart 2 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("            <!--Main layout-->\n");
      out.write("            <!-- SCRIPTS -->\n");
      out.write("            <!-- JQuery -->\n");
      out.write("            <script src=\"https://mdbootstrap.com/previews/ecommerce-demo/js/jquery-3.4.1.min.js\"></script>\n");
      out.write("            <!-- Bootstrap tooltips -->\n");
      out.write("            <script type=\"text/javascript\" src=\"https://mdbootstrap.com/previews/ecommerce-demo/js/popper.min.js\"></script>\n");
      out.write("            <!-- Bootstrap core JavaScript -->\n");
      out.write("            <script type=\"text/javascript\" src=\"https://mdbootstrap.com/previews/ecommerce-demo/js/bootstrap.js\"></script>\n");
      out.write("            <!-- MDB core JavaScript -->\n");
      out.write("            <script type=\"text/javascript\" src=\"https://mdbootstrap.com/previews/ecommerce-demo/js/mdb.min.js\"></script>\n");
      out.write("            <!-- MDB Ecommerce JavaScript -->\n");
      out.write("            <script type=\"text/javascript\" src=\"https://mdbootstrap.com/previews/ecommerce-demo/js/mdb.ecommerce.min.js\"></script>\n");
      out.write("            <!-- MDB -->\n");
      out.write("            <script type=\"text/javascript\" src=\"js/mdb.min.js\"></script>\n");
      out.write("            <!-- Custom scripts -->\n");
      out.write("            <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("            <script src=\"https://mdbootstrap.com/api/snippets/static/download/MDB5-Free_3.8.1/js/mdb.min.js\"></script><script src=\"https://cdn.jsdelivr.net/npm/chart.js@2.9.4/dist/Chart.min.js\"></script>\n");
      out.write("\n");
      out.write("            <script>// Graph\n");
      out.write("                //Horizontal Bar Chart\n");
      out.write("                new Chart(document.getElementById(\"horizontalBar\"), {\n");
      out.write("                    \"type\": \"horizontalBar\",\n");
      out.write("                    \"data\": {\n");
      out.write("                        \"labels\": [\"Tháng 12\", \"Tháng 11\", \"Tháng 10\", \"Tháng 9\", \"Tháng 8\", \"Tháng 7\", \"Tháng 6\", \"Tháng 5\", \"Tháng 4\", \"Tháng 3\", \"Tháng 2\", \"Tháng 1\"],\n");
      out.write("                        \"datasets\": [{\n");
      out.write("                                \"label\": \"Doanh thu $\",\n");
      out.write("                                \"data\": [");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoneyMonth12}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoneyMonth11}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoneyMonth10}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoneyMonth9}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoneyMonth8}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoneyMonth7}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoneyMonth6}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoneyMonth5}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoneyMonth4}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoneyMonth3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoneyMonth2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoneyMonth1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("],\n");
      out.write("                                \"fill\": false,\n");
      out.write("                                \"backgroundColor\": [\"rgba(255, 99, 132, 0.2)\", \"rgba(255, 159, 64, 0.2)\",\n");
      out.write("                                    \"rgba(255, 205, 86, 0.2)\", \"rgba(75, 192, 192, 0.2)\", \"rgba(54, 162, 235, 0.2)\",\n");
      out.write("                                    \"rgba(153, 102, 255, 0.2)\", \"rgba(201, 203, 207, 0.2)\", \"#99FF99\", \"#FFFF99\", \"#FFC1C1\", \"#FFB5C5\", \"#DDC488\"\n");
      out.write("                                ],\n");
      out.write("                                \"borderColor\": [\"rgb(255, 99, 132)\", \"rgb(255, 159, 64)\", \"rgb(255, 205, 86)\",\n");
      out.write("                                    \"rgb(75, 192, 192)\", \"rgb(54, 162, 235)\", \"rgb(153, 102, 255)\", \"rgb(201, 203, 207)\", \"\t#66FF99\", \"#FFFF66\", \"#EEB4B4\", \"#EEA9B8\", \"#ECAB53\"\n");
      out.write("                                ],\n");
      out.write("                                \"borderWidth\": 1\n");
      out.write("                            }]\n");
      out.write("                    },\n");
      out.write("                    \"options\": {\n");
      out.write("                        \"scales\": {\n");
      out.write("                            \"xAxes\": [{\n");
      out.write("                                    \"ticks\": {\n");
      out.write("                                        \"beginAtZero\": true\n");
      out.write("                                    }\n");
      out.write("                                }]\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://mdbootstrap.com/wp-content/themes/mdbootstrap4/js/plugins/mdb-plugins-gathered.min.js\"></script>\n");
      out.write("        <!-- MDB -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/mdb.min.js\"></script>\n");
      out.write("        <!-- Custom scripts -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
