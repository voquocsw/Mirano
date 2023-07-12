<%-- 
    Document   : tableOrder
    Created on : Jul 1, 2023, 10:55:16 AM
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
        <title>Table Order</title>

        <!-- bootstrap core css -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    <body>
        <%@include file="Staff_header.jsp" %>
        <!-- Section: Design Block -->
        <section class="py-1">
            <!-- style="background-color: white"-->
            <div class="container d-flex " style="min-height: 800px;">
                <div class="col-md-12">
                    <h3 class="mt-5">Ship</h3>
                    <form action="tableOrderController" method ="post">
                        <div>
                            <label class="labels">Table</label>
                            <select name="table" class="form-control" style="width: 100px" var="t">
                                <c:forEach items="${requestScope.table}" var="g">
                                    <option value="${g.tableId}"
                                            <c:if test="${tableId == g.tableId}">selected</c:if>>
                                        ${g.tableName}
                                    </option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="col-3 d-flex justify-content-center">
                            <button type="submit" class="btn btn-primary" style="height: 35px; margin-top: 20px">Submit</button>
                        </div>
                    </form>
                    <table class="table col-3 table-bordered" style="height: 100px">
                        <thead>
                            <tr>
                                <th scope="col">Product Name</th>
                                <th scope="col">Price</th>
                                <th scope="col">Quantity</th>
                                <th scope="col">Total Price</th>
                                <th scope="col">Delete</th>                              
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${item}" var="f">
                                <tr style="height: 60px">
                                    <th scope="row">${f.product.productName}</th>
                                    <th scope="row">${f.price}</th>
                                    <th scope="row"> <input type="text" value="${f.quantity}"></th>
                                    <th scope="row">${(f.price*f.quantity)}</th>
                                    <th scope="row">
                                        <!--                                            <a style="margin-left: 10px" href="shipDetailController?id="><i class="fa fa-solid fa-trash mb-1"></i></a>-->
                                    </th>
                                </tr>
                            </c:forEach>                      
                        </tbody>
                    </table>
                    <div style="margin-left: 75%">
                        <h5>Total Price: ${totalPrice} đ</h5>
                    </div>
                </div>
                <form action="checkoutController">
                    <div>
                        <input hidden type="search" value="${totalPrice}" name="ttpr" hidden>
                        <input hidden type="search" value="${tableId}" name="tbId" hidden>
                        <button type="submit" class="btn btn-primary">Payment</button>
                    </div>
                </form>
            </div>
        </section>
        <%@include file="admin_footer.jsp" %>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Section: Design Block -->
    </body>

</html>