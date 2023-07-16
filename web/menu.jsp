

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="setupCss.jsp" %>
    </head>
    <body>
        <c:if test="${sessionScope.role != 0}">
            <%@include file="header.jsp" %>
        </c:if>
        <c:if test="${sessionScope.role == 0}">
            <%@include file="Staff_header.jsp"%>
        </c:if>

        <!--Header-->

        <!-- food section -->

        <section class="food_section layout_padding">
            <div class="container">
                <div class="heading_container heading_center">
                    <h2 style="font-family: sans-serif; margin: 15px; margin-top: -50px;">
                        Menu
                    </h2>
                </div>
                <form method="get" action="menuController" class=row>
                    <input hidden type="text form-control" value="1" name="page">
                    <div class="col-3"></div>
                    <div class="col-3">
                        <label class="col-md-3">Name: </label>
                        <input type="text"  class="form-control" name="name" value="${param["name"]}">
                    </div>
                    <div class="col-3">
                        <label class="col-md-3">Category: </label>
                        <select class="col-md-8 form-select"  name="category">
                            <option value="" 
                                    <c:if test="${category == ''}">selected</c:if> >
                                        All
                                    </option>
                            <c:forEach items="${cat}" var="g">
                                <option value="${g.categoryName}" 
                                        <c:if test="${category == g.categoryName}">selected</c:if>>
                                    ${g.categoryName}
                                </option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="col-md-3">
                        <input type="submit" value="Seach" class="btn btn-primary">
                    </div>
                    <div class="col-md-2">

                    </div>
                </form>

                <div class="filters-content">
                    <div class="row grid">
                        <c:forEach items="${requestScope.pro}" var="f">
                            <div class="col-sm-6 col-lg-4 all ${f.category.categoryName}">
                                <div class="box" style="box-shadow:  0 0 5px 5px lightgray; ">
                                    <div>
                                        <div class="img-box" style="height: 400px !important; border-radius: 0px !important;">
                                            <img src="View/image/${f.image}" alt="" height="100%" style="max-height: none; border-radius: 10px" >
                                        </div>
                                        <div class="detail-box" style="background: #f1f2f3; ">
                                            <h5 style="text-transform: uppercase; text-align: center;">
                                                <a href="productController?productId=${f.productId}" class="" style="color: black; text-decoration: none">
                                                    ${f.productName}
                                                </a>
                                            </h5>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>

                </div>
                                        <div><br></div>
                <div class="d-flex justify-content-center">
                    <nav aria-label="Page navigation example">
                        <ul class="pagination">
                            <c:forEach begin="1" end="${requestScope.total}" step="1" var="i">
                                <li class="page-item <c:if test="${i == requestScope.page}"> active </c:if> " >
                                    <a class="page-link" href="menuController?page=${i}&name=${productName}&category=${category}">
                                        ${i}
                                    </a>
                                </li>
                            </c:forEach>
                        </ul>
                    </nav>
                </div>
            </div>

        </section>

        <!-- end food section -->

        <!--Footer->
        <%@include file="footer.jsp" %>
        <!--Footer-->

        <!--Script-->
        <%@include file="setupJS.jsp" %>
        <!--Script-->
    </body>
</html>
