<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="include/header.jsp" %>


        
        <!-- 주문자 정보 ------------------------------------------------------------------------------------------------------------>


        <section class="py-5 bg-light">
            <div class="container px-4 px-lg-5">
                <div class="row px-4 gx-4 gx-lg-5 align-items-center">
                    <table style="text-align: center;">
                        <tr>
                            <td rowspan="7" style="width: 50%;">사진자리임</td>
                            <td colspan="3">상품명</td>
                        </tr>
                        <tr>
                            <td>사이즈</td>
                            <td colspan="2" style="text-align: left;">
                                <select>
                                    <c:forEach items="${size_sizelist}" var="list">
                                        <option value="${list.size}">${list.size}</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="3"><a href="membership">등급별 혜택</a></td>
                        </tr>
                        <tr>
                            <td colspan="3"><hr></td>
                        </tr>
                        <tr>
                            <td colspan="3">합계</td>
                        </tr>
                        <tr>
                            <td colspan="3">~~원</td>
                        </tr>
                        <tr>
                            <td>찜</td>
                            <td>찜</td>
                            <td>찜</td>
                        </tr>
                    </table>
                </div>          
            </div>
        </section>       


        <!-- 리뷰 소제목 + 리스트 ------------------------------------------------------------------------------------------------------------>


        <section class="pb-5 bg-light">
            <div class="container px-4 px-lg-5">
                <h3 class="mb-4">리뷰</h3>
                <div class="row px-4 gx-4 gx-lg-5 align-items-center">
                    <table style="border-collapse: collapse; text-align: center;">
                        <tr>
                            <td class="py-2" style="width: 7%;">번호</td>
                            <td style="width: 68%;">내 용</td>
                            <td style="width: 10%;">이름</td>
                            <td style="width: 15%;">작성일</td>
                        </tr>
                        <c:forEach items="${review_writelist}" var="list">
                            <tr style="border-top: 1px solid grey; ">
                                <td class="py-2">${list.r_no}</td>
                                <td class="px-3" style="text-align: left;">${list.r_content }</td>
                                <td >${list.id }</td>
                                <td>${list.pqd }</td>
                            </tr>
                        </c:forEach>
                    </table>                    
                </div>                
            </div>
        </section>


        <!-- 문의 소제목 + 리스트 ------------------------------------------------------------------------------------------------------------>


        <section class="pb-5 bg-light">
            <div class="container px-4 px-lg-5">
                <h3 class="mb-4">문의</h3>
                <div class="row px-4 gx-4 gx-lg-5 align-items-center">
                    <table style="border-collapse: collapse; text-align: center;">
                        <tr style="border-bottom: 1px solid grey">
                            <td class="py-2" style="width: 7%;">번호</td>
                            <td style="width: 68%;">내 용</td>
                            <td style="width: 10%;">이름</td>
                            <td style="width: 15%;">작성일</td>
                        </tr>
                        
						<c:forEach items="${productone_productinfo}" var="list" varStatus="num">
                            <tr style="border-top: 1px solid rgb(206, 206, 206);">
                                <td class="py-2" rowspan="2" style="vertical-align: text-top;">번호</td>
                                <td class="px-2 pt-2" style="text-align: left;">
                                    <div>
                                        <input class="bg-light" type='button' value='제목' id='titlebtn' onclick='toggleBtn${num.count}()' style="border: none;"/>
                                    </div>                                    
                                </td>
                                <td rowspan="2" style="vertical-align: text-top;">${list.signin_id}</td>
                                <td rowspan="2" style="vertical-align: text-top;">${list.pqd }</td>
                            </tr>
                            <tr>
                                <td class="px-3 py-1" style="text-align: left;">
                                    <div id='content${num.count }'>
                                        <p>
                                        	${list.p_content }
                                        </p>
                                        <from action="" method="">
                                            <input type="text" name="content" style="width: 70%;">
                                            <input type="submit" value="답변등록" style="min-width: 50px; white-space: inherit;">
                                        </from>
                                    </div>
                                </td>
                            </tr>

                        </c:forEach>
                        
                    </table>                    
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
        <script src="js/scripts.js"></script>
        <c:forEach items="${productone_productinfo}" var="list" varStatus="num">
	        <script>
/* 	            function toggleBtn${num.count}() {
	    
	                // 토글 할 버튼 선택 (btn1)
	                const btn1 = document.getElementById('content'+${num.count });
	                
	                // btn1 숨기기 (display: none)
	                if(btn1.style.display !== 'none') {
	                btn1.style.display = 'none';
	                }
	                // btn` 보이기 (display: block)
	                else {
	                btn1.style.display = 'block';
	                }
	            } */
	        </script>
        </c:forEach>
    </body>
</html>
