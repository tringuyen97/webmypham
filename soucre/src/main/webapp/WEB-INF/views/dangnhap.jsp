<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="_header.jsp" %>
		<div id="chamsocda">
				
				<form:form method="post" action="dangNhap">
					<table>
						
						<tr>
							<td>Tên đăng nhập:</td>
							<td><input type="text" name="tenDangNhap"></td>
						</tr>
						<tr>
							<td>Mật khẩu:</td>
							<td><input type="password" name="matKhau"></td>
						
						<tr><td><input type="submit" value="Đăng nhập" /></td></tr>
					</table>
				
				</form:form>
					
		</div>
		<%@ include file="_footer.jsp" %>