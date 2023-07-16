package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/setupCss.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<script\n");
      out.write("\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Basic -->\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <!-- Mobile Metas -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <!-- Site Metas -->\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"View/image/image.png\" type=\"\">\n");
      out.write("\n");
      out.write("        <title>Forgot Password </title>\n");
      out.write("\n");
      out.write("        <!-- bootstrap core css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"view/css/bootstrap.css\" />\n");
      out.write("\n");
      out.write("        <!--owl slider stylesheet -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("              href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\" />\n");
      out.write("        <!-- nice select  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/css/nice-select.min.css\"\n");
      out.write("              integrity=\"sha512-CruCP+TD3yXzlvvijET8wV5WxxEh5H8P4cmz0RFbKK6FlZ2sYl3AEsKlLPHbniXKSrDdFewhbmBK5skbdsASbQ==\"\n");
      out.write("              crossorigin=\"anonymous\" />\n");
      out.write("        <!-- font awesome style -->\n");
      out.write("        <link href=\"view/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"view/css/style.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- responsive style -->\n");
      out.write("        <link href=\"view/css/responsive.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Basic -->\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <!-- Mobile Metas -->\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <!-- Site Metas -->\r\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"View/image/image.png\" type=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title> Mirano </title>\r\n");
      out.write("\r\n");
      out.write("        <!-- bootstrap core css -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"view/css/bootstrap.css\" />\r\n");
      out.write("\r\n");
      out.write("        <!--owl slider stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("              href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\" />\r\n");
      out.write("        <!-- nice select  -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/css/nice-select.min.css\"\r\n");
      out.write("              integrity=\"sha512-CruCP+TD3yXzlvvijET8wV5WxxEh5H8P4cmz0RFbKK6FlZ2sYl3AEsKlLPHbniXKSrDdFewhbmBK5skbdsASbQ==\"\r\n");
      out.write("              crossorigin=\"anonymous\" />\r\n");
      out.write("        <!-- font awesome style -->\r\n");
      out.write("        <link href=\"view/css/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"View/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- responsive style -->\r\n");
      out.write("        <link href=\"View/css/responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Section: Design Block -->\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <head>\r\n");
      out.write("            <meta charset=\"utf-8\" />\r\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("            <meta name=\"description\" content=\"\" />\r\n");
      out.write("            <meta name=\"author\" content=\"\" />\r\n");
      out.write("            <title>Dashboard - Admin</title>\r\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("            <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("            <script src=\"https://use.fontawesome.com/releases/v6.1.0/js/all.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("            <!-- CSS only -->\r\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("                  integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\r\n");
      out.write("        </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- header section strats -->\r\n");
      out.write("        <header class=\"header_section\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <nav class=\"navbar navbar-expand-lg custom_nav-container \">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"home.jsp\">\r\n");
      out.write("                        <span>\r\n");
      out.write("                            Mirano restaurant\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <span class=\"\"> </span>\r\n");
      out.write("                    </button>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                        <ul class=\"navbar-nav  mx-auto \" style=\"margin-right: -40px;\">\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"homeController\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"menuController?name=&category=&page=1\">Menu</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"user_option\">\r\n");
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- end header section -->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <section class=\"vh-200\" style=\"padding-bottom: 0px\">\n");
      out.write("            <div class=\"row d-flex justify-content-center align-items-center h-200\">\n");
      out.write("                <div class=\"col col-xl-10\">\n");
      out.write("                    <div class=\"card\" style=\"border-radius: 1rem;\">\n");
      out.write("                        <div class=\"row g-0\">\n");
      out.write("                            <div class=\"col-md-3 col-lg-3 d-none d-md-block\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-lg-6 d-flex align-items-center\">\n");
      out.write("                                <div class=\"card-body p-4 p-lg-5 text-black\" id=\"logreg-forms\">                                   \n");
      out.write("                                    <form method=\"post\" action=\"forgotPasswordController\">\n");
      out.write("                                    <div class=\"forgot text-center\">\n");
      out.write("                                     <h2>Forgot your password?</h2>\n");
      out.write("                                      <p>Change your password in three easy steps. This will help you\n");
      out.write("                                          to secure your password!</p>\n");
      out.write("                                              <ol class=\"list-unstyled\">\n");
      out.write("                                                   <li><span class=\"text-primary text-medium\">1. </span>Enter\n");
      out.write("                                                    your email address and full name below.</li>\n");
      out.write("                                                    <li><span class=\"text-primary text-medium\">2. </span>Our\n");
      out.write("                                                    system will send you an OTP to your email</li>\n");
      out.write("                                                    <li><span class=\"text-primary text-medium\">3. </span>Enter the OTP on the \n");
      out.write("                                                      next page</li>\n");
      out.write("                                              </ol>\n");
      out.write("                                    </div>\n");
      out.write("                                        <h2 class=\"fw-normal mb-3 pb-3 forgot text-center\" style=\"letter-spacing: 1px; \">Forgot password</h2>\n");
      out.write("                                        <p class=\"text-success mb-4 forgot text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        <p class=\"text-danger mb-4 forgot text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        <div class=\"form-outline mb-4 \">\n");
      out.write("                                            <label class=\"form-label\" for=\"form3Example8 \">Full Name</label>\n");
      out.write("                                            <input type=\"text\" id=\"form3Example8\"\n");
      out.write("                                                   class=\"form-control form-control-lg\" required=\"true\" placeholder=\"Enter your full name\" name=\"fullname\"/>\n");
      out.write("                                        </div> \n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <label class=\"form-label\" for=\"form3Example8\">Email address</label>\n");
      out.write("                                            <input type=\"email\" id=\"form3Example8\"\n");
      out.write("                                                   class=\"form-control form-control-lg\"  required placeholder=\"Enter your email\" name=\"email\"/>\n");
      out.write("                                        </div>                                \n");
      out.write("                                        <div class=\"pt-1 mb-4\">\n");
      out.write("                                            <button class=\"btn btn-dark btn-lg btn-block\" type=\"submit\">Retrieve</button>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <p class=\"mb-5 pb-lg-2\" style=\"color: #393f81;\">Don't have an account? <a\n");
      out.write("                                                href=\"register.jsp\" style=\"color: #393f81;\">Register here</a></p>\n");
      out.write("                                        <a href=\"#!\" class=\"small text-muted\">Terms of use.</a>\n");
      out.write("                                        <a href=\"#!\" class=\"small text-muted\">Privacy policy</a>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 col-lg-3 d-none d-md-block\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("<!--           <script>\n");
      out.write("            function toggleResetPswd(e) {\n");
      out.write("                e.preventDefault();\n");
      out.write("                $('#logreg-forms .form-signin').toggle(); // display:block or none\n");
      out.write("                $('#logreg-forms .form-reset').toggle(); // display:block or none\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function toggleSignUp(e) {\n");
      out.write("                e.preventDefault();\n");
      out.write("                $('#logreg-forms .form-signin').toggle(); // display:block or none\n");
      out.write("                $('#logreg-forms .form-signup').toggle(); // display:block or none\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $(() => {\n");
      out.write("                // Login Register Form\n");
      out.write("                $('#logreg-forms #forgot_pswd').click(toggleResetPswd);\n");
      out.write("                $('#logreg-forms #cancel_reset').click(toggleResetPswd);\n");
      out.write("                $('#logreg-forms #btn-signup').click(toggleSignUp);\n");
      out.write("                $('#logreg-forms #cancel_signup').click(toggleSignUp);\n");
      out.write("            })     \n");
      out.write("        </script>-->\n");
      out.write("        </section>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- footer section -->\r\n");
      out.write("        <footer class=\"footer_section\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-4 footer-col\">\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 footer-col\">\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 footer-col\">\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-info\">\r\n");
      out.write("                    <p>\r\n");
      out.write("                        &copy; <span id=\"displayYear\"></span> All Rights Reserved By\r\n");
      out.write("                        <a href=\"#\">Mirano </a><br><br>\r\n");
      out.write("                        &copy; <span id=\"displayYear\"></span> Distributed By\r\n");
      out.write("                        <a href=\"#\" target=\"_blank\">Mirano restaurant</a>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- footer section -->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        <!-- Section: Design Block -->\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.id != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a class=\"nav-link\" href=\"BookingTable.jsp\">Booking</a>\r\n");
        out.write("                                </li> \r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a class=\"nav-link\" href=\"cartController\">Carts</a>\r\n");
        out.write("                                </li>  \r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a class=\"nav-link\" href=\"historyOrderController?page=1\">History</a>\r\n");
        out.write("                                </li> \r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.id != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <a href=\"profileController\" class=\"order_online\" style=\"text-decoration: none\">\r\n");
        out.write("                                    Profile\r\n");
        out.write("                                </a>\r\n");
        out.write("                                <a class=\"order_online\" href=\"changePassController\" style=\"text-decoration: none\">\r\n");
        out.write("                                    Change Pass\r\n");
        out.write("                                </a>\r\n");
        out.write("                                <a href=\"logoutController\" class=\"order_online\" style=\"text-decoration: none\">\r\n");
        out.write("                                    logout\r\n");
        out.write("                                </a> \r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.id == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <a href=\"loginController\" class=\"order_online\" style=\"text-decoration: none\">\r\n");
        out.write("                                    Login\r\n");
        out.write("                                </a> \r\n");
        out.write("                                <a href=\"registerController\" class=\"order_online\" style=\"text-decoration: none\">\r\n");
        out.write("                                    Register\r\n");
        out.write("                                </a>\r\n");
        out.write("                                <a href=\"forgotPasswordController\" class=\"order_online\" style=\"text-decoration: none\">\r\n");
        out.write("                                    Forgot Password\r\n");
        out.write("                                </a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
