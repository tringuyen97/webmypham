<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="_header.jsp"%>
<div id="chamsocda">
	<form:form method="post" action="viewCapNhatTaiKhoan">
		<table>

			<tr>
				<td>Họ và tên:</td>
				<td>${tk.tenKhachHang}</td>
			</tr>
			<tr>
				<td>Địa chỉ:</td>
				<td>${tk.diaChi}</td>
			<tr>
				<td>Email:</td>
				<td>${tk.email}</td>
			</tr>
			<tr>
				<td>Số điện thoại:</td>
				<td>${tk.soDienThoai}</td>
			</tr>
		</table>
		<input type="submit" value="Sửa thông tin:" />
	</form:form>
</div>
<%@ include file="_footer.jsp"%>
</body>
</html>
