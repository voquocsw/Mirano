<%-- 
    Document   : Ship
    Created on : Jun 19, 2023, 12:45:48 PM
    Author     : Aver
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:useBean id ="a" class="Model.Ship" scope ="request"></jsp:useBean>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Ship</title>

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
                    <table class="table col-3 table-bordered" style="height: 100px">
                        <thead>
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">User ID</th>
                                <th scope="col">Name</th>
                                <th scope="col">Phone</th>
                                <th scope="col">Address</th>
                                <th scope="col">Total Price</th>
                                <th scope="col">Status</th>
                                <th scope="col">Edit</th>                              
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${ship}" var="f">
                                <tr style="height: 60px">
                                    <th scope="row">${f.orderID}</th>
                                    <th scope="row">${f.userId}</th>
                                    <th scope="row">${f.name}</th>
                                    <th scope="row">${f.phone}</th>
                                    <th scope="row">${f.address}</th>
                                    <th scope="row">${f.price}</th>
                                    <th scope="row">
                                        <c:if test="${f.status == 0}">Done</c:if>
                                        <c:if test="${f.status == 1}">Not Yet</c:if>
                                        <c:if test="${f.status == 2}">Cancel</c:if>
                                        </th>
                            <th scope="row">
                                <a style="margin-left: 10px" href="shipDetailController?id=${f.orderID}"><i class="fa fa-solid fa-pencil"></i></a>
                            </th>
                            </tr>

                        </c:forEach>                      
                        </tbody>
                    </table>
                    <div class="d-flex justify-content-center">
                        <nav aria-label="Page navigation example">
                            <ul class="pagination">
                                <c:forEach begin="1" end="${requestScope.total}" step="1" var="i">
                                    <li class="page-item <c:if test="${i == requestScope.page}"> active </c:if> " >
                                        <a class="page-link" href="shipController?page=${i}">
                                            ${i}
                                        </a>
                                    </li>
                                </c:forEach>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </section>
        <%@include file="admin_footer.jsp" %>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Section: Design Block -->
    </body>

</html>