<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Successfull</title>
        <script src="https://kit.fontawesome.com/84e176b008.js" crossorigin="anonymous"></script>
        <%@include file="setupCss.jsp" %>
        <style>

            .button-74 {
                background-color: #fbeee0;
                border: 2px solid #422800;
                border-radius: 30px;
                box-shadow: #422800 4px 4px 0 0;
                color: #422800;
                cursor: pointer;
                display: inline-block;
                font-weight: 600;
                font-size: 18px;
                padding: 0 18px;
                line-height: 50px;
                text-align: center;
                text-decoration: none;
                user-select: none;
                -webkit-user-select: none;
                touch-action: manipulation;
            }

            .button-74:hover {
                background-color: #fff;
            }

            .button-74:active {
                box-shadow: #422800 2px 2px 0 0;
                transform: translate(2px, 2px);
            }

            @media (min-width: 768px) {
                .button-74 {
                    min-width: 120px;
                    padding: 0 25px;
                }
            }
        </style>
    </head>
    <body style="">
        <%@include file="Staff_header.jsp" %>

        <div class="container">   
            <div class="invoice-container" ref="document" id="html">
                <table style="width:100%; height:auto;  text-align:center; " BORDER=0 CELLSPACING=0>
                    <thead style="background:#fafafa; padding:8px;">
                        <tr style="font-size: 20px;">
                            <td colspan="4" style="padding:20px 20px;text-align: left;">MIRANO</td>
                        </tr>
                    </thead>
                    <tbody style="background:#ffff;padding:20px;">
                        <tr>
                            <td colspan="4" style="padding:20px 0px 0px 20px;text-align:left;font-size: 20px; font-weight: bold;color:#000;">Hello</td>
                        </tr>
                        <tr>
                            <td colspan="4" style="text-align:left;padding:10px 10px 10px 20px;font-size:18px;">Your order details</td>
                        </tr>
                    </tbody>
                </table>
                <table style="width:100%; height:auto; background-color:#fff;text-align:center; padding:10px; background:#fafafa">
                    <tbody>
                        <tr style="color:#6c757d; font-size: 25px;">
                            <td style="border-right:1.5px dashed  #DCDCDC; width:25%;font-size:20px;font-weight:700;padding: 0px 0px 10px 0px;">Paid Date</td>
                            <td style="border-right: 1.5px dashed  #DCDCDC ;width:25%;font-size:20px;font-weight:700;padding: 0px 0px 10px 0px;">Order No.</td>
                            <td style="border-right:1.5px dashed  #DCDCDC ;width:25%;font-size:20px;font-weight:700;padding: 0px 0px 10px 0px;">Payment</td>
                            <td style="width:25%;font-size:20px;font-weight:700;padding: 0px 0px 10px 0px;">Shipping Address</td>
                        </tr>
                        <tr style="background-color:#fff; font-size:18px; color:#262626;">
                            <td style="border-right:1.5px dashed  #DCDCDC ;width:25%; font-weight:bold;background: #fafafa;">${date}</td>
                            <td style="border-right:1.5px dashed  #DCDCDC ;width:25% ; font-weight:bold;background: #fafafa;">${requestScope.oid}</td>
                            <td style="border-right:1.5px dashed  #DCDCDC ;width:25%; font-weight:bold;background: #fafafa;">Paypal</td>
                            <td style="width:25%; font-weight:bold;background: #fafafa;">${requestScope.address1}</td>
                        </tr>
                    </tbody>
                </table>
                <table style="width:100%; height:auto; background-color:#fff; margin-top:0px;  padding:20px; font-size:20px; border: 1px solid #ebebeb; border-top:0px;">
                    <thead>
                        <tr style=" color: #6c757d;font-weight: bold; padding: 5px;">
                            <td colspan="2" style="text-align: left;"></td>
                            <td style="text-align: center;"></td>
                            <td style="padding: 10px;text-align:center;"></td>
                            <td style="text-align: right;padding: 10px;">PRICE</td>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td style="width:10%; ">
                                <!--<a href=""><img src="https://images.asos-media.com/products/asos-design-puff-sleeve-linen-mini-dress-with-pearl-buttons/13307266-1-black?$XXL$&wid=513&fit=constrain" style="width:100px;" /></a>-->
                            </td>
                            <td style="width:20%;margin-left:10px;text-align: center;"></td>
                            <td style="width:20%;padding: 10px; text-align:center;"> </td>
                            <td style="width:20%;padding: 10px;text-align: center;"></td>
                            <td style="width:30%; ;font-weight: bold;font-size: 14px;">
                                <table style="width:100%;">
                                    <tr><td style="text-align:end;font-size:18px;">${requestScope.price}</td></tr>
                                </table>
                            </td>
                        </tr>
                    </tbody>
                </table>
                <table style="width:100%; height:auto; background-color:#fff;padding:20px; font-size:20px; border: 1px solid #ebebeb; border-top:0">
                    <tbody>
                        <tr style="padding:20px;color:#000;font-size:20px">
                            <td style="font-weight: bold;padding:5px 0px">Total</td>
                            <td style="text-align:right;padding:5px 0px;font-weight: bold;font-size:18px;">${requestScope.price} <i class="fa-solid fa-dong-sign"></i> </td>
                        </tr>

                        <tr>
                            <td colspan="2" style="font-weight:bold;"><span style="color:#c61932;font-weight: bold;">THANK YOU</span> for shipping with us!</td>
                        </tr>
                        <tr>
                            <td colspan="2" style="font-weight:bold;text-align:left;padding:5px 0px 0px 00px;font-size:14px;">If you have trouble of your order, please contact 0354******* for help.</td>
                        </tr>
                    </tbody>
                    <tfoot style="padding-top:20px;font-weight: bold;">
                        <tr>
                            <td style="padding-top:20px;">Thank you for trusting Mirano. Mirano wishes you a good meal.</td>
                        </tr>
                    </tfoot>
                </table>
            </div>
        </div>

        <div class="d-flex justify-content-center">
            <button style="margin: 45px auto"  class="button-74" onclick="window.location = 'staffController'">Go Home</button>
        </div>
        <!--homeController-->
        <%@include file="footer.jsp" %>
    </body>
</html>