<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<%@ include file="_header.jsp" %>
		<div id="chamsocda">

			<form:form method="post" action="themTaiKhoan">
				<table>

					<tr>
						<td>Tên đăng nhập:</td>
						<td><form:input path="tenDangNhap" /></td>
					</tr>
					<tr>
						<td>Mật khẩu</td>
						<td><form:password path="matKhau" /></td>
					<tr>
						<td>Họ tên:</td>
						<td><form:input path="tenKhachHang" /></td>
					</tr>
					<tr>
						<td>Email:</td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td>Địa chỉ:</td>
						<td><form:input path="diaChi" /></td>
					</tr>
					<tr>
						<td>Số điện thoại:</td>
						<td><form:input path="soDienThoai" /></td>
					</tr>
					
					<tr>
						<td><input type="submit" value="Đăng kí" /></td>
					</tr>
				</table>

			</form:form>

		</div>
		<%@ include file="_footer.jsp" %>
