<%-- 
    Document   : shipInformation
    Created on : Jul 18, 2023, 8:23:13 PM
    Author     : Aver
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order</title>
        <%@include file="setupCss.jsp" %>
        <style>
            .form-control:focus {
                box-shadow: none;
                border-color:  #003d99
            }

            .profile-button {
                background: rgb(0, 102, 255);
                box-shadow: none;
                border: none
            }

            .profile-button:hover {
                background: #003d99;
                padding: 8px 12px;
            }

            .profile-button:focus {
                background:  #003d99;
                box-shadow: none
            }

            .profile-button:active {
                background:  #003d99;
                box-shadow: none
            }

            .back:hover {
                color: #003d99;
                cursor: pointer
            }

            .labels {
                font-size: 18px
            }

            .form-control{
                margin-bottom: 10px;
                margin-top: -5px;
            }

            .add-experience:hover {
                background:  #003d99;
                color: #fff;
                cursor: pointer;
                border: solid 1px  #003d99
            }
        </style>
    </head>
    <body>
        <!--Header-->
        <%@include file="header.jsp" %>
        <!--Header-->

        <!-- Section: Design Block -->
        <div class="container rounded bg-white mt-5 mb-5 ">
            <div class="row d-flex justify-content-center">
                <div class="col-md-6 border">
                    <div class="p-3 py-5">
                        <div class="d-flex justify-content-between align-items-center mb-3">
                            <h4 class="text-right">Shipping information</h4>
                        </div>
                        <form action="infoController" method="get">
                            <c:set var="o" value="${requestScope.cart}"/>
                            <c:set var="tt" value="0"/>
                            <c:forEach items="${o.items}" var="f">
                                <input type="hidden" name="productId" value="${f.product.productId}"/>
                                <input type="hidden" name="totalPrice" value="${o.totalMoney}"/>                               
                            </c:forEach> 
                            <div class="row mt-3">
                                <div class="col-md-12"><label class="labels">Full Name</label>
                                    <input type="text" class="form-control" placeholder="fullname" value="${requestScope.user.fullname}" 
                                           name="name">
                                </div>
                                <div class="col-md-12"><label class="labels">Phone</label>
                                    <input type="text" class="form-control" placeholder="phone" value="${requestScope.user.phone}" 
                                           maxlength="11"
                                           minlength="10" name="phone">
                                </div>
                                <div class="col-md-12"><label class="labels">Address</label>
                                    <input type="text" class="form-control" placeholder="address" value="${requestScope.user.address}" 
                                           name="address"></div>
                            </div>
                            <div class="mt-5 text-center"><button class="btn btn-primary profile-button" type="submit">Submit</button>
                            </div>
                        </form>
                    </div>
                </div>

            </div>
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
