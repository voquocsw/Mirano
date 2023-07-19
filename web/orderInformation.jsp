

<%-- 
    Document   : orderInformation
    Created on : Jun 10, 2023, 12:01:07 AM
    Author     : Aver
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://kit.fontawesome.com/84e176b008.js" crossorigin="anonymous"></script>
        <title>Order</title>
        <link rel="stylesheet" href="./View/css/bill-style.css" />
        <%@include file="setupCss.jsp" %>
        <style>

        </style>
    </head>
    <body>
        <!--Header-->
        <%@include file="header.jsp" %>
        <!--Header-->

        <!-- Section: Design Block -->
        <c:set var="o" value="${requestScope.cart}"/>


        <div class="invoice-box">
            <table>
                <tr class="top">
                    <td colspan="2">
                        <table>
                            <tr>
                                <td class="title">
                                    <img src="View/image/restaurant-logo.png" alt="Company logo" style="width: 100%; max-width: 100px" />

                                </td>

                                <td>

                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>

                <tr class="information">
                    <td colspan="2">
                        <table>
                            <tr>
                                <td>
                                    Mirano, Inc.<br />
                                    FPT University Road<br />
                                    SE
                                </td>

                                <td>
                                    <br />
                                    ${requestScope.user.fullname}<br />
                                    ${requestScope.user.email}
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>

                <tr class="heading">
                    <td>Payment Method</td>

                    <td>Paypal #</td>
                </tr>

                <tr class="details">
                    <td>Check</td>

                    <td>1000</td>
                </tr>

                <tr class="heading">
                    <td>Information</td>

                    <td>Detail</td>
                </tr>

                <tr class="item">
                    <td>Full name</td>

                    <td>${requestScope.user.fullname}</td>
                </tr>

                <tr class="item">
                    <td>Phone</td>
                    <td>${requestScope.user.phone}</td>
                </tr>

                <tr class="item last">
                    <td>Total Price</td>

                    <td>${o.totalMoney}</td>
                </tr>

                <tr class="total">
                    <td></td>

                    <td>Total: ${o.totalMoney}<i class="fa-solid fa-dong-sign"></i></td>
                </tr>
            </table>
            <form action="PaypalPaymentServlet" method="get">
                <input type="hidden" name="name1" value="${name}"/> 
                <input type="hidden" name="address1" value="${address}"/> 
                <input type="hidden" name="phone1" value="${phone}"/> 
                <div class="col-md-12">
                    <input  type="hidden" class="form-control" placeholder="fullname" value="${requestScope.user.fullname}" 
                            name="name">
                </div>
                <div class="col-md-12">
                    <input type="hidden" class="form-control" placeholder="phone" value="${requestScope.user.phone}" 
                           maxlength="11"
                           minlength="10" name="phone">
                </div>
                <div class="col-md-12">
                    <input type="hidden" class="form-control" placeholder="address" value="${requestScope.user.address}" 
                           name="address">
                </div>
                <div class="mt-5 text-center">
                    <button class="button-74" role="button">Submit</button>

                </div>
                <c:forEach items="${o.items}" var="f">
                    <input type="hidden" name="productId" value="${f.product.productId}"/>
                    <input type="hidden" name="totalPrice" value="${o.totalMoney}"/>                               
                </c:forEach> 
            </form>
        </div>




        <!-- Section: Design Block -->

        <!--Footer->
        <%@include file="footer.jsp" %>
        <!--Footer-->

        <!--Script-->
        <%@include file="setupJS.jsp" %>
        <!--Script-->

    </body>
</html>

