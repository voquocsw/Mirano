<%-- 
    Document   : managa_product
    Created on : Mar 1, 2023 9:17:24 PM
    Author     : Asus
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Manage Cart</title>

        <!-- bootstrap core css -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

        <%@include file="setupCss.jsp" %>
        <style>
            add{
                text-decoration: none;
                color: green;
                font-size: 22px;
                font-weight: normal;
            }
        </style>
    </head>
    <body>
        <c:if test="${sessionScope.role != 0}">
            <%@include file="header.jsp" %>
        </c:if>
        <c:if test="${sessionScope.role == 0}">
            <%@include file="Staff_header.jsp"%>
        </c:if>
        <!-- Section: Design Block -->
        <section class="py-1">
            <!-- style="background-color: white"-->
            <div class="container d-flex " style="min-height: 800px;">

                <div class="col-md-12">
                    <h3 class="mt-5">Cart</h3>
                    <c:if test="${sessionScope.role == 0}">
                        <div>
                            <label class="labels">Table</label>
                            <select id="table" class="form-control" style="width: 100px">
                                <c:forEach items="${requestScope.table}" var="g">
                                    <option value="${g.tableId}" >
                                        ${g.tableName}
                                    </option>
                                </c:forEach>
                            </select>
                        </div>
                    </c:if>
                    <div >

                        <table class="table col-3 table-bordered" style="height: 100px">
                            <thead>
                                <tr>
                                    <th scope="col">No</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Price</th>
                                    <th scope="col">Quantity</th>
                                    <th scope="col">Total price</th>
                                    <th scope="col">Delete</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:set var="o" value="${requestScope.cart}"/>
                                <c:set var="tt" value="0"/>
                                <c:forEach items="${o.items}" var="f">
                                    <c:set var="tt" value="${tt+1}"/>
                                    <tr style="height: 60px">
                                        <th scope="row">${tt}</th>
                                        <th scope="row">  <a href="productController?productId=${f.product.productId}">${f.product.productName}</a></th>
                                        <th scope="row">${f.price/2}</th>
                                        <th scope="row">
                                            <a href="processController?&num=-1&productId=${f.product.productId}" class="order_online" style="text-decoration: none; font-size: 22px;">-</a>
                                            <input type="text" readonly value="${f.quantity}">
                                            <a href="processController?&num=1&productId=${f.product.productId}" class="order_online" style="text-decoration: none; font-size: 22px;">+</a>
                                        <th scope="row">${(f.price*f.quantity)/2}</th>
                                        <th scope="row">
                                            <form action="processController" method="post">
                                                <input type="hidden" name="id" value="${f.product.productId}"/>
                                                <button class="btn btn-link" type="submit" class="btn btn-primary"><i
                                                        class="fa fa-solid fa-trash mb-1"></i>
                                                </button>
                                            </form>
                                        </th>

                                    </tr>

                                <div class="modal fade" id="exampleModal${f.product.productId}" tabindex="-1"
                                     aria-labelledby="exampleModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLabel"><i class="bi bi-trash-fill"></i>
                                                    Delete</h5>
                                                <button type="button" class="btn-close" data-bs-dismiss="modal"
                                                        aria-label="Close"></button>
                                            </div>
                                            <div class="modal-body">
                                                Are you sure to delete this product?
                                            </div>
                                            <div class="modal-footer">
                                                <form action="processController" method="post">
                                                    <input type="hidden" name="id" value="${f.product.productId}"/>
                                                    <button type="submit" class="btn btn-primary">Yes</button>
                                                    <button type="button" class="btn btn-secondary"
                                                            data-bs-dismiss="modal">No</button>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </c:forEach>                      
                            </tbody>
                        </table>
                    </div>
                    <div style="margin-left: 75%">
                        <h5>Total Price: ${cart.totalMoney} đ</h5>
                    </div>
                    <c:if test="${cart.totalMoney != 0}">
                        <c:if test="${sessionScope.role == 0}">
                            <div class="d-flex justify-content-between col-3 " style="align-text: right">
                                <a href="#" onclick="passValueToServlet()" class="btn btn-success">Save</a>
                            </div>
                        </c:if>
                        <c:if test="${sessionScope.role == 1}">
                            <div class="d-flex justify-content-between col-3 " style="align-text: right">
                                <a href="shipInfromationController" class="btn btn-success">Next</a>
                            </div>
                        </c:if>
                    </c:if>
                </div>
        </section>
        <%@include file="footer.jsp" %>
        <script>
            function passValueToServlet() {
                var selectElement = document.getElementById("table");
                var selectedValue = selectElement.options[selectElement.selectedIndex].value;

                var servletURL = "saveController";
                var link = servletURL + "?table=" + encodeURIComponent(selectedValue);

                window.location.href = link;
            }
            src = "https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        </script>
        <!-- Section: Design Block -->
    </body>

</html>
