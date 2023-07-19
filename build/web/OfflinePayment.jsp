<%-- 
    Document   : OfflinePayment
    Created on : Jul 19, 2023, 8:28:27 AM
    Author     : Aver
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Admin Dashboard</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="css/styles.css" rel="stylesheet" />
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    </head>

    <body class="sb-nav-fixed">
        <%@include file="Staff_header.jsp" %>

        <div id="layoutSidenav">
            <div id="layoutSidenav_content">
                <main style="margin-left: 200px; height: 540px;">
                    <div class="container-fluid px-4">
                        <h1 class="mt-4 ms-5">Offline payment</h1>
                        <ol class="breadcrumb mb-4 ms-5">
                            <li class="breadcrumb-item active">Check</li>
                        </ol>
                        <form action="Staff_PaypalConfirmServlet" method="get">
                        <div class="row d-flex justify-content-around" style="width: 90%;">
                            <div class="col-md-5">
                                <div class="card bg-success text-white mb-4" >
                                    <div class="card-body">Total price </div>
                                    <h3 class="card-body text-center">${totalPrice} đ</h3>
                                    <div class="card-footer d-flex align-items-center justify-content-between">
                                        <button type="submit" class="btn btn-primary">Click here when the customer has finished paying</button>
                                        <div class="small text-white"><i class="fas fa-angle-right"></i></div>
                                    </div>
                                </div>
                            </div>                              
                        </div>
                        </form>

                    </div>
                </main>
                <footer class="py-4 bg-light mt-auto ">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Your Website 2022</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
    </body>

</html>
