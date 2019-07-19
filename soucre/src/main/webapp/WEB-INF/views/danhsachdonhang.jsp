<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="_header.jsp"%>
<div id="chamsocda">

	<table width="100%" border="1">
		<tr bgcolor="#CCCCCC">
			<div style="text-align: center">
				<td>Mã đơn hàng</td>
				<td>Tên đang nhập</td>
				<td>Tên khách hàng</td>
				<td>Địa chỉ</td>
				<td>Số điện thoại</td>
				<td>Email</td>
				<td>Thành tiền</td>

			</div>
		</tr>
		<c:forEach items="${list}" var="list" varStatus="counter">
			<tr>
				<form:form action="" method="post">
					<td><c:out value="${list.maDonHang}" /><br></td>
					<td><c:out value="${list.tenDangNhap}" /><br></td>
					<td><c:out value="${list.tenKhachHang}" /><br></td>
					<td><c:out value="${list.diaChi}" /><br></td>
					<td><c:out value="${list.soDienThoai}" /><br></td>
					<td><c:out value="${list.email}" /><br></td>
					<td><c:out value="${list.thanhTien}" /><br></td>


				</form:form>
			</tr>
		</c:forEach>
	</table>
	<a href="viewDanhSachDonHang">danh sach don hang</a>
</div>
<%@ include file="_footer.jsp"%>

