<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="_header.jsp" %>
		<div id="chamsocda">
			<form action="muaSanPham" name="modelDetail" method="post">
				<img alt="sp"
					src="http://localhost:8080/doan/resources/image/${ctsanpham.imageURL}"
					width="400px" height="400px"/>
				<table>
					<tr>
						<td>Tên sản phẩm:</td>
						<td>${ctsanpham.tenSanPham}</td>
					</tr>
					<tr>
						<td>Giá bán:</td>
						<td>${ctsanpham.giaBan}</td>
					</tr>
					<tr>
						<td>Mô tả:</td>
						<td>${ctsanpham.giaBan}</td>
					</tr>
				</table>

				<input type="hidden" name="ma" value="${ctsanpham.maSanPham}"> <input
					type="hidden" name="ten" value="${ctsanpham.tenSanPham}"> <input
					type="hidden" name="gia" value="${ctsanpham.giaBan}"> <input
					type="submit" name="addToCart" value="Thêm vào giỏ hàng">
			</form>

</div>
		<%@ include file="_footer.jsp" %>
