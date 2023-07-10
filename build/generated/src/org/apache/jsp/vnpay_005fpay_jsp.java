package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vnpay_005fpay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <script src=\"https://use.fontawesome.com/releases/v6.1.0/js/all.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <title>Tạo mới đơn hàng</title>\r\n");
      out.write("        <link href=\"View/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link href=\"View/bootstrap.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"View/jumbotron-narrow.css\" rel=\"stylesheet\">      \r\n");
      out.write("        <script src=\"View/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            .container-pay{\r\n");
      out.write("                margin: 80px 30% !important;\r\n");
      out.write("                margin-bottom: 0 !important;\r\n");
      out.write("            }\r\n");
      out.write("            .card{\r\n");
      out.write("\r\n");
      out.write("                transform: none !important;\r\n");
      out.write("                margin:0  !important;\r\n");
      out.write("                padding : 0  !important;\r\n");
      out.write("                box-shadow: none !important;\r\n");
      out.write("                border-radius: 0% !important;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            .card:hover{\r\n");
      out.write("                cursor: default;\r\n");
      out.write("            }\r\n");
      out.write("            .icons{\r\n");
      out.write("                padding: 0 !important;\r\n");
      out.write("            }\r\n");
      out.write("            .icons img{\r\n");
      out.write("                width: 50px !important;\r\n");
      out.write("                height: 50px !important;\r\n");
      out.write("            }\r\n");
      out.write("            .input-language ul {\r\n");
      out.write("                list-style-type: none;\r\n");
      out.write("                margin-bottom: 0 !important;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .input-language li {\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .input-language input[type=\"radio\"][id^=\"languageVN\"] {\r\n");
      out.write("                display: none;\r\n");
      out.write("            }\r\n");
      out.write("            .input-language input[type=\"radio\"][id^=\"languageUK\"] {\r\n");
      out.write("                display: none;\r\n");
      out.write("            }\r\n");
      out.write("            .input-language input[type=\"radio\"][id^=\"bankCode1\"] {\r\n");
      out.write("                display: none;\r\n");
      out.write("            }\r\n");
      out.write("            .input-language input[type=\"radio\"][id^=\"bankCode2\"] {\r\n");
      out.write("                display: none;\r\n");
      out.write("            }\r\n");
      out.write("            .input-language input[type=\"radio\"][id^=\"bankCode3\"] {\r\n");
      out.write("                display: none;\r\n");
      out.write("            }\r\n");
      out.write("            .input-language input[type=\"radio\"][id^=\"bankCode4\"] {\r\n");
      out.write("                display: none;\r\n");
      out.write("            }\r\n");
      out.write("            .input-language label {\r\n");
      out.write("                border: 1px solid #fff;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                display: block;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .input-language label:before {\r\n");
      out.write("                background-color: white;\r\n");
      out.write("                color: white;\r\n");
      out.write("                content: \" \";\r\n");
      out.write("                display: block;\r\n");
      out.write("                border-radius: 50%;\r\n");
      out.write("                border: 1px solid grey;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                top: -10px;\r\n");
      out.write("                left: -10px;\r\n");
      out.write("                width: 25px;\r\n");
      out.write("                height: 25px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                line-height: 20px;\r\n");
      out.write("                transition-duration: 0.4s;\r\n");
      out.write("                transform: scale(0);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .input-language label img {\r\n");
      out.write("                height: 100px;\r\n");
      out.write("                width: 100px;\r\n");
      out.write("                transition-duration: 0.2s;\r\n");
      out.write("                transform-origin: 50% 50%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .input-language :checked + label {\r\n");
      out.write("                border-color: #ddd;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .input-language :checked + label:before {\r\n");
      out.write("                content: \"✓\";\r\n");
      out.write("                background-color: rgb(0,255,0);\r\n");
      out.write("\r\n");
      out.write("                transform: scale(1);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .input-language :checked + label img {\r\n");
      out.write("                transform: scale(0.9);\r\n");
      out.write("                box-shadow: 0 0 5px #333;\r\n");
      out.write("                z-index: -1;\r\n");
      out.write("            }\r\n");
      out.write("            .btn-pay{\r\n");
      out.write("                margin-top: 30px;\r\n");
      out.write("                margin-bottom: 0 !important;\r\n");
      out.write("                font-size: 30px !important;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
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
      out.write("                                <a class=\"nav-link\" href=\"menuController\">Menu</a>\r\n");
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
      out.write("\r\n");
      out.write("        <div class=\"container-pay\" style=\"margin-top:100px; \">\r\n");
      out.write("            <div class=\"header clearfix\">\r\n");
      out.write("\r\n");
      out.write("                <h3 class=\"text-muted\">VNPAY DEMO</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <h3>Tạo mới đơn hàng</h3>\r\n");
      out.write("            <div class=\"table-responsive\">\r\n");
      out.write("                <form action=\"vnpayajax\" id=\"frmCreateOrder\" method=\"post\">        \r\n");
      out.write("                    <div class=\"form-group \">\r\n");
      out.write("                        <label for=\"amount\">Số tiền (VND)</label>\r\n");
      out.write("                        <input class=\"form-control\" readonly=\"\" data-val=\"true\" data-val-number=\"The field Amount must be a number.\" data-val-required=\"The Amount field is required.\" id=\"amount\"  name=\"amount\" type=\"number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <h4>Chọn phương thức thanh toán</h4>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <div class=\"card-body input-language\">\r\n");
      out.write("                                <div class=\"d-flex align-items-center justify-content-between\">\r\n");
      out.write("                                    <div class=\"\">\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <input type=\"radio\" Checked=\"True\" id=\"bankCode1\" name=\"bankCode\" value=\"\">\r\n");
      out.write("                                                <label for=\"bankCode1\">Cổng thanh toán VNPAYQR </label><br>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"icons\">\r\n");
      out.write("                                            <img style=\"width: 130px !important; height: 50px !important\" src=\"https://didongviet.vn/dchannel/wp-content/uploads/2022/06/vn-pay-thang-6-7-300k-didongviet-cover.jpg\" >\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <hr>\r\n");
      out.write("                                <div class=\"d-flex align-items-center justify-content-between\">\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <input type=\"radio\" id=\"bankCode2\" name=\"bankCode\" value=\"VNPAYQR\">\r\n");
      out.write("                                                <label for=\"bankCode2\">Thanh toán bằng ứng dụng hỗ trợ VNPAYQR</label><br>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"icons\">\r\n");
      out.write("                                        <img style=\"width: 170px !important\" src=\"data:image/png;base64,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\" >\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <hr>\r\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <input type=\"radio\" id=\"bankCode3\" name=\"bankCode\" value=\"VNBANK\">\r\n");
      out.write("                                                <label for=\"bankCode3\">Thanh toán qua thẻ ATM/Tài khoản nội địa</label><br>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"icons\">\r\n");
      out.write("                                        <img style=\"width: 170px !important\"  src=\"https://minisiteb.qltns.mediacdn.vn/minisite/63aebd76b0494113b06a8fd3318dfc5b-web/assets/image/Logo.png\" >\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <hr>\r\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <input type=\"radio\" id=\"bankCode4\" name=\"bankCode\" value=\"INTCARD\">\r\n");
      out.write("                                                <label for=\"bankCode4\">Thanh toán qua thẻ quốc tế</label><br>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"icons\">\r\n");
      out.write("                                        <img src=\"https://i.imgur.com/2ISgYja.png\" >\r\n");
      out.write("                                        <img src=\"https://i.imgur.com/W1vtnOV.png\" >\r\n");
      out.write("                                        <img src=\"https://i.imgur.com/35tC99g.png\" >\r\n");
      out.write("                                        <img src=\"https://i.imgur.com/2ISgYja.png\" >\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <h5>Chọn ngôn ngữ giao diện thanh toán:</h5>\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <div class=\"card-body row input-language d-flex justify-content-between\">\r\n");
      out.write("                                <div class=\"col-md-4 \">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <input type=\"radio\" id=\"languageVN\" Checked=\"True\" name=\"language\" value=\"vn\">\r\n");
      out.write("                                            <label for=\"languageVN\"><img class=\"w-100\" src=\"https://seeklogo.com/images/V/viet-nam-logo-3D78D597F9-seeklogo.com.png\"/></label>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <input type=\"radio\" id=\"languageUK\" name=\"language\" value=\"en\">\r\n");
      out.write("                                            <label for=\"languageUK\"><img class=\"w-100\" src=\"https://seeklogo.com/images/U/united-kingdom-flag-logo-1088704B5E-seeklogo.com.png\"/></label>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"d-flex justify-content-center\"> \r\n");
      out.write("                            <button onclick=\"submit()\" type=\"submit\" class=\"btn btn-danger btn-pay\" href>Thanh toán</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <p></p>\r\n");
      out.write("    ");
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
      out.write("\r\n");
      out.write("    <link href=\"https://pay.vnpay.vn/lib/vnpay/vnpay.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <script src=\"https://pay.vnpay.vn/lib/vnpay/vnpay.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(\"#frmCreateOrder\").submit(function () {\r\n");
      out.write("            var postData = $(\"#frmCreateOrder\").serialize();\r\n");
      out.write("            var submitUrl = $(\"#frmCreateOrder\").attr(\"action\");\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: \"POST\",\r\n");
      out.write("                url: submitUrl,\r\n");
      out.write("                data: postData,\r\n");
      out.write("                dataType: 'JSON',\r\n");
      out.write("                success: function (x) {\r\n");
      out.write("                    if (x.code === '00') {\r\n");
      out.write("                        if (window.vnpay) {\r\n");
      out.write("                            vnpay.open({width: 768, height: 600, url: x.data});\r\n");
      out.write("                        } else {\r\n");
      out.write("                            location.href = x.data;\r\n");
      out.write("                        }\r\n");
      out.write("                        return false;\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert(x.Message);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            return false;\r\n");
      out.write("        });\r\n");
      out.write("    </script>       \r\n");
      out.write("</body>\r\n");
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
