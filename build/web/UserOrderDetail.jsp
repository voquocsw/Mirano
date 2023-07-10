<%-- 
    Document   : UserOrderDetail
    Created on : Jun 24, 2023, 9:10:13 AM
    Author     : Aver
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Ship</title>
        <!-- bootstrap core css -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <%@include file="setupCss.jsp" %>
    </head>
    <body>
        <c:if test="${sessionScope.role != 2}">
            <%@include file="header.jsp" %>
        </c:if>
        <c:if test="${sessionScope.role == 2}">
            <%@include file="admin_header.jsp"%>
        </c:if>
        <!-- Section: Design Block -->
        <section class="py-1">
            <form action="changeShipStatus" method="post">
                <!-- style="background-color: white"-->
                <div class="container d-flex " style="min-height: 800px;">

                    <div class="col-md-12">
                        <h3 class="mt-5">Detail</h3>
                        <div class="user_option">
                            <div class="col-md-12" style="width: 10%">
                                <label class="labels">Order ID</label>
                                <input type="text" readonly class="form-control" 
                                       placeholder="" value="${id}" name="id">
                            </div>
                            <h6 class="mt-5" > Date: ${dt}</h6>
                        </div>

                        <table class="table col-3 table-bordered" style="height: 100px">
                            <thead>
                                <tr>
                                    <th scope="col">No</th>
                                    <th scope="col">Product Name</th>
                                    <th scope="col">Price</th>
                                    <th scope="col">Quantity</th>
                                    <th scope="col">Total Price</th>                             
                                </tr>
                            </thead>
                            <tbody>
                                <c:set var="tt" value="0"/>
                                <c:forEach items="${OrDe}" var="f">
                                    <c:set var="tt" value="${tt+1}"/>
                                    <tr style="height: 60px">
                                        <th scope="row">${tt}</th>
                                        <th scope="row">${f.productName}</th>
                                        <th scope="row">${f.price}</th>
                                        <th scope="row">${f.quantity}</th>
                                        <th scope="row">${(f.price*f.quantity)}</th>
                                    </tr>

                                </c:forEach>                      
                            </tbody>
                        </table>
                        <div style="margin-left: 75%">
                            <h5>Total Price: ${pr} đ</h5>
                        </div>
                    </div>                                
                </div>
        </section>
        <%@include file="footer.jsp" %>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Section: Design Block -->
    </body>
</html>
