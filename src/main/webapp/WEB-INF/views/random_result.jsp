<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Shop Item - Start Bootstrap Template</title>
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="/resources/test/css/styles.css" rel="stylesheet">
    </head>
    <body>
        
  <!-- Navigation ------------------------------------------------------------------------------------------------------------>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container px-4 px-lg-5">
                <a class="navbar-brand" href="/">NotFound404</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="/recommend">Recommend</a></li>
                        <li class="nav-item"><a class="nav-link" href="/productlist">woman</a></li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">man</a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="#!">All Products</a></li>
                                <li><hr class="dropdown-divider" /></li>
                                <li><a class="dropdown-item" href="#!">Popular Items</a></li>
                                <li><a class="dropdown-item" href="#!">New Arrivals</a></li>
                            </ul>
                        </li>
                        <li class="nav-item"><a class="nav-link" href="#!">ranking</a></li>
                        <li class="nav-item"><a class="nav-link" href="#!">cuntomer service</a></li>
                        
                        
                    </ul>
                    
                    <button class="btn" type="submit" style="margin-top: 5px;">
                        <img src="/resources/test/icon/people.svg" style="width: 30px;">
                    </button>
                    
                    <button class="btn position-relative" type="submit" style="margin-top: 5px;">
                        <img src="/resources/test/icon/cart.svg" style="width: 30px;">
                        <span class="position-absolute translate-middle badge rounded-pill bg-danger" style="margin-top: 8px;">
                            1
                            <span class="visually-hidden">unread messages</span>
                          </span>
                    </button>
                    
                </div>
            </div>
        </nav>



        <!-- 입력창 section ------------------------------------------------------------------------------------------------------------>


        <section class="py-5 bg-light">
            <div class="container px-4 px-lg-5 mt-5">
                <h2 class="fw-bolder mb-4 pb-5" style="text-align: center;">짜잔~</h2>

                    <c:forEach var="list" items="${productlist}" varStatus="status">
	                	<c:if test="${status.count%4 eq 1}">
	                	<div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
	                	</c:if>
		                    <div class="col mb-5">
		                        <div class="card h-100">
		                            <!-- Product image                                인기상품1-->
		                            <img class="card-img-top" src="/resources/test/img/${list.img_name}" alt="..." style="height: 300px;"/>
		                            <!-- Product details-->
		                            <div class="card-body p-4">
		                                <div class="text-center">
		                                    <!-- Product name-->
		                                    <h5 class="fw-bolder">${list.p_name}</h5>
		                                    <!-- Product price-->
											${list.p_sale}원
		                                </div>
		                            </div>
		                            <!-- Product actions-->
		                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
		                                <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">View options</a></div>
		                            </div>
		                        </div>
	                    	</div>
	                    <c:if test="${status.count%4 eq 3}">
	                	</div>
	                	</c:if>
	                </c:forEach> 

                <!-- 구매버튼 -->

	                <div style="text-align: center;">
	                    <form action="" method="">
	                        <input type="hidden" name="code1">
	                        <input type="hidden" name="code2">
	                        <input type="hidden" name="code3">
	                        <input type="submit" class="btn btn-outline-dark btn-lg" value="결제하기">
	                    </form>
                    </div>
            </div>
        </section>       


        <!-- Footer ------------------------------------------------------------------------------------------------------------>


        <footer class="py-5 bg-dark">
            <div class="container"><p class="m-0 text-center text-white">Copyright &copy; NOTFOUND404</p></div>
        </footer>


        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="/resources/test/js/scripts.js"></script>
    </body>
</html>

