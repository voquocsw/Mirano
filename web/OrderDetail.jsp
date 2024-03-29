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
                            <h6 class="mt-5" style="margin-left: 75%" > Date: ${dt}</h6>
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
                            <div>
                                <label class="labels">Status</label>
                                <select name="status" class="form-control" style="width: 100px">
                                    <c:if test = "${status == 1}">
                                        <option value = "1" 
                                                <c:if test="${status == 1}">
                                                    selected
                                                </c:if>>
                                            Not yet
                                        </option>
                                        <option value = "3"
                                                <c:if test="${status == 3}"> 
                                                    selected
                                                </c:if>>
                                            Confirm
                                        </option>
                                        <option value = "2"
                                                <c:if test="${status == 2}"> 
                                                    selected
                                                </c:if>>
                                            Cancel
                                        </option>
                                    </c:if>
                                    <c:if test="${status == 3}">
                                        <option value = "4"
                                                <c:if test="${status == 4}"> 
                                                    selected
                                                </c:if>>
                                            Coming
                                        </option> 
                                        <option value = "3"
                                                <c:if test="${status == 3}"> 
                                                    selected
                                                </c:if>>
                                            Confirm
                                        </option>
                                        <option value = "2"
                                                <c:if test="${status == 2}"> 
                                                    selected
                                                </c:if>>
                                            Cancel
                                        </option>
                                    </c:if>
                                    <c:if test="${status == 4}">
                                        <option value = "0" 
                                          <c:if test="${status == 0}">
                                            selected
                                        </c:if>>
                                        Done
                                        </option>                                                                      
                                    </c:if>
                                </select>
                            </div>
                        </div>
                        <div class="d-flex justify-content-center mr-5">
                            <button type="submit" class="btn btn-warning btn-lg ms-3 text-center" style="border-radius: 10px">Submit form</button>
                        </div>
                    </div>                                
                </div>
            </form>
        </section>
        <%@include file="admin_footer.jsp" %>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Section: Design Block -->
    </body>
</html>