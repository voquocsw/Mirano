
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="setupCss.jsp" %>
        <style>
            .card-registration .select-input.form-control[readonly]:not([disabled]) {
                font-size: 1rem;
                line-height: 2.15;
                padding-left: .75em;
                padding-right: .75em;
            }

            .card-registration .select-arrow {
                top: 13px;
            }

            .formR{
                border-radius: 30px; 
            }

            .register{
                background-image: url("../View/image/image.jpg");
            }


        </style>
    </head>
    <body>
        <!--header-->
        <%@include file="header.jsp" %>
        <!--header-->

        <!-- Section: Design Block -->
        <section class="">
            <div class="container py-5 h-100 ">
                <div class="row d-flex justify-content-center align-items-center h-100" >
                    <div class="col-xl-3 d-none d-xl-block">

                    </div>
                    <div class="col-xl-6" style="padding: 15px;color: white !important;">
                        <form action="BookingController" method="post" >
                            <div class="card-body p-md-1 text-black">
                                <h2 class="mb-5 text-uppercase" >Booking Table</h2>
                                <div class="form-outline mb-4 mr-3">
                                    <label class="form-label" for="form3Example8">Number people</label>
                                    <input type="number" required class="form-control"
                                           name="num" value="1" min="0" max="50" >

                                </div>
                                <div class="col-md-12"><label class="labels">Date</label>
                                    <input type="date" required class="form-control"
                                           placeholder="premiere" value="" name="date">
                                </div>
                                <div class="form-outline mb-4 mr-3">
                                    <label class="form-label" for="form3Example8">Time</label>
                                    <select name="time" class="form-control">
                                        <option value = "17:00 PM">
                                            17:00 PM
                                        </option>
                                        <option value = "18:00 PM" >
                                            18:00 PM
                                        </option>
                                        <option value = "19:00 PM">
                                            19:00 PM
                                        </option>
                                        <option value = "20:00 PM">
                                            20:00 PM
                                        </option>
                                        <option value = "21:00 PM">
                                            21:00 PM
                                        </option>

                                    </select>
                                </div>
                                <div class="col-md-12">
                                    <label class="labels">Description</label>
                                    <textarea class="form-control" name="description" rows="5" wrap="hard"></textarea>
                                </div>
                                <br>

                                <div class="d-flex justify-content-center mr-5">
                                    <button type="submit" class="btn btn-warning btn-lg ms-3 text-center" style="border-radius: 10px">Submit form</button>
                                </div>

                            </div>
                        </form>
                    </div>
                    <div class="col-xl-3 d-none d-xl-block">
                    </div>
                </div>
            </div>
        </section>
        <!-- Section: Design Block -->

        <!--footer-->
        <%@include file="footer.jsp" %>
        <!--footer-->
    </body>
</html>