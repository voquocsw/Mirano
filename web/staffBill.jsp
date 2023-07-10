<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Successfull</title>
        <%@include file="setupCss.jsp" %>
    </head>
    <body>
        <c:if test="${sessionScope.role != 0}">
            <%@include file="header.jsp" %>
        </c:if>
        <c:if test="${sessionScope.role == 0}">
            <%@include file="Staff_header.jsp"%>
        </c:if>
        <div class="card text-center mt-5 mb-5 ms-5 d-flex justify-content-center align-content-center"
             style="width: 90%; height: 500px;">
            <div class="card-body">
                <div>
                    <h5 class="card-title">Congratulations on your successful order purchase.</h5>
                    <p class="card-text">Thank you for trusting Mirano. Mirano wishes you a good meal.</p>
                    <h4 class="card-title">Bill</h4></br>
                    <ul class="list-inline">
                                    <li class="list-inline-item">
                                        <h6>ID: </h6>
                                    </li>
                                    <li class="list-inline-item">
                                        <p class="text-muted">
                                            <strong>${requestScope.oid}</strong>
                                        </p>
                                    </li>                          
                                <ul class="list-inline">
                                    <li class="list-inline-item">
                                        <h6>Total Price:</h6>
                                    </li>
                                    <li class="list-inline-item">
                                        <p class="text-muted">
                                            <strong>${requestScope.price}</strong>
                                        </p>
                                    </li>
                                </ul>

                    <p class="mt-3"><i>If you have trouble of your order, please contact 0354******* for help.</i></p>
                    <a href="staffController" class="btn btn-primary">Go home</a>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
