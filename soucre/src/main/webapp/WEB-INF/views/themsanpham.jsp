<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="_header.jsp" %>
		<div id="chamsocda">
				
				<form:form method="post" action="themSanPham" enctype="multipart/form-data">
					<table>
						
						<tr>
							<td>Ten:</td>
							<td><form:input path="tenSanPham" /></td>
						</tr>
						<tr>
							<td>Gia thuc:</td>
							<td><form:input path="giaThuc" /></td>
						</tr>
						<tr>
							<td>Gia ban</td>
							<td><form:input path="giaBan" /></td>
						</tr>
						<tr>
							<td>Image: </td>
							<td></td>
						</tr>
						<tr>
							<td colspan="2"><input name="file" type="file" /></td>
						</tr>
						<tr><td><input type="submit" value="Save" name="file" /></td></tr>
					</table>
				
				</form:form>
					
		</div>
		<%@ include file="_footer.jsp" %>
