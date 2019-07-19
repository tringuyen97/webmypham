<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="_header.jsp" %>
		<div id="chamsocda">
				<h3>${ma }</h3>
				<h3>${ma}</h3>
				<form:form method="post" action="capNhatSanPham" enctype="multipart/form-data">
					<table>
						
						<tr>
							<td>Mã sản phẩm:</td>
							<td><form:input path="maSanPham" readonly="true" /></td>
						</tr>
						<tr>
							<td>Tên sản phẩm:</td>
							<td><form:input path="tenSanPham" /></td>
						</tr>
						<tr>
							<td>Giá thực:</td>
							<td><form:input path="giaThuc" /></td>
						</tr>
						<tr>
							<td>Giá bán: </td>
							<td><form:input path="giaBan" /></td>
						</tr>
						<tr>
							<td>Tình trạng: </td>
							<td><form:select path="tinhTrang">
								<form:option value="true">Còn kinh doanh</form:option>	
								<form:option value="false">Ngưng kinh doanh</form:option>							
							</form:select></td>
						</tr>
						
						<tr>
							<td>Image: </td>
							<td></td>
						</tr>
						<tr>
							<td colspan="2"><input name="file" type="file" /></td>
						</tr>
						<tr>
							<td><input type="submit" value="Lưu" /></td>
						</tr>
					</table>
				
				</form:form>
					
		</div>
		<%@ include file="_footer.jsp" %>