<%-- 
    Document   : updateUser
    Created on : Jun 7, 2023, 2:29:12 PM
    Author     : Aver
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>

        <!-- bootstrap core css -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>

    <body>
        <%@include file="admin_header.jsp"%>
        <!-- Section: Design Block -->
        <form action="updateUserController" method="post">
            <div class="container rounded bg-white mt-5 mb-5">           
                <div class="row d-flex justify-content-center">
                    <div class="col-md-6 border">

                        <div class="p-3 py-5">
                            <div class="d-flex justify-content-between align-items-center mb-3">
                                <h4 class="text-right">Update user</h4>
                            </div>
                            <div class="row mt-3">
                                <div class="col-md-12">
                                    <label class="labels">User ID</label>
                                    <input type="text" readonly class="form-control" 
                                           placeholder="" value="${user.id}" name="id">
                                </div>
                                <div class="col-md-12">
                                    <label class="labels">User name</label>
                                    <input type="text" readonly class="form-control" 
                                           placeholder="name" value="${user.fullname}" name="fullname">
                                </div>
                                <div class="col-md-12">
                                    <label class="labels">Gender</label>
                                    <c:if test="${user.gender == true}">
                                    <input type="text" readonly class="form-control" 
                                           placeholder="gender" value="Male" name="gender"></c:if>
                                    <c:if test="${user.gender == false}">
                                    <input type="text" readonly class="form-control" 
                                           placeholder="gender" value="Female" name="gender"></c:if>
                                </div>
                                <div class="col-md-12">
                                    <label class="labels">Phone</label>
                                    <input type="text" readonly class="form-control" 
                                           placeholder="phone" value="${user.phone}" name="phone">
                                </div>
                                <div class="col-md-12">
                                    <label class="labels">Address</label>
                                    <input type="text" readonly class="form-control" 
                                           placeholder="address" value="${user.address}" name="address">
                                </div>
                                <div class="col-md-12">
                                    <label class="labels">Role</label>
                                    <select name="role" class="form-control">                                      
                                        <option value = "1"
                                                <c:if test ="${user.role == 1}">
                                                    selected
                                                </c:if>>
                                            Customer
                                        </option>
                                        <option value = "2"
                                                <c:if test="${user.role == 2}">
                                                    selected
                                                </c:if>>
                                            Admin
                                        </option>
                                        <option value = "0"
                                                <c:if test="${user.role == 0}">
                                                    selected
                                                </c:if>>
                                            Staff
                                        </option>
                                    </select>
                                </div>
                            </div>
                            <div class="mt-5 text-center">
                                <button class="btn btn-primary profile-button" type="submit">Save Change</button>
                            </div>
                        </div>

                    </div>

                </div>
            </div>
        </form>

        <%@include file="admin_footer.jsp" %>
        <!-- Section: Design Block -->
    </body>

</html>
