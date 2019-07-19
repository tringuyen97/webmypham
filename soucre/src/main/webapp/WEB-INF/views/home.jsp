
<%@page import="org.springframework.web.context.request.SessionScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<%@ include file="_header.jsp" %>
		<div id="chamsocda">
			<div>
				<c:forEach var="s" items="${list}">

					<div class="a">
						<form action="muaSanPham" name="modelDetail" method="post">
							<img alt="sp1"
								src="http://localhost:8080/doan/resources/image/${s.imageURL}"
								width="150px" height="150px" />
							<p>${s.tenSanPham}</p>
							<p>${s.giaBan}</p>

							<input type="hidden" name="ma" value="${s.maSanPham}"> <input
								type="hidden" name="ten" value="${s.tenSanPham}"> <input
								type="hidden" name="gia" value="${s.giaBan}"> <input
								type="submit" name="addToCart" value="Thêm vào giỏ hàng">
						</form>
						<form action="viewChiTietSanPham" name="chitiet" method="post">
							<input type="hidden" name="ma" value="${s.maSanPham}">
							<button class="button" type="submit">Xem chi tiết</button>
						</form>
					</div>
				</c:forEach>
			</div>
			
			

	</div>
	<%@ include file="_footer.jsp" %>
	