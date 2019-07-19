<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="_header.jsp" %>
		<div id="chamsocda">
				
				<table width="100%" border="1">
				<tr bgcolor="#CCCCCC">
					<div style="text-align: center">
					<td>Mã sản phẩm</td>
					<td>Tên sản phẩm</td>
					<td>Giá thực</td>
					<td>Giá bán</td>
					<td>Tình trạng</td>
					<td></td>
					</div>
				</tr>
				<c:forEach items="${list}" var="list" varStatus="counter">
					<tr>
					<form:form action="viewCapNhatSanPham" method="post">
						<td><c:out value="${list.maSanPham}" /><br></td>						
						<td><c:out value="${list.tenSanPham}" /><br></td>
						<td><c:out value="${list.giaThuc}" /><br></td>
						<td><c:out value="${list.giaBan}" /><br></td>
						<td><c:out value="${list.tinhTrang}" /><br></td>
						<input type="hidden" name="ma" value="${list.maSanPham}" />		
						<td><input type="submit" value="Sửa" /></td>
					</form:form>								
					</tr>
				</c:forEach>
			</table>
			<a href="viewDanhSachDonHang">danh sach don hang</a>
			<a href="viewThemSanPham">Them san pham</a>
			
		</div>
			<%@ include file="_footer.jsp" %>

