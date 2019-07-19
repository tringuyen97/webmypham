<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="_header.jsp" %>
		<div id="chamsocda">

			<form:form method="post" action="datHang">
				<div id="left">
				<c:set var="tk" value='<%=session.getAttribute("taiKhoan")%>'></c:set>
					<table>
						<tr>
							<td>Tên khách hàng:</td>
							<td><form:input type="text" path="tenKhachHang" value="${tk.tenKhachHang}" /></td>
						</tr>
						<tr>
							<td>Địa chỉ:</td>
							<td><form:input type="text" path="diaChi" value="${tk.diaChi}" /></td>
						</tr>
						<tr>
							<td>Số điện thoại:</td>
							<td><form:input type="text" path="soDienThoai" value="${tk.soDienThoai}" /></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><form:input type="text" path="email"  value="${tk.email}" /></td>
						</tr>
					</table>
					<input type="submit" value="Thanh toán" />
				</div>
				<div id="right"><table width="100%" border="1">
					<tr bgcolor="#CCCCCC">
						<td>Tên Sản phẩm</td>
						<td>Số lượng</td>
						<td>Giá bán</td>
						<td>Tổng tiền</td>
						<td></td>
					</tr>
					<c:if test="${cart.getSoMatHang()==0}">
						<tr>
							<td colspan="4">Giỏ hàng rỗng <br />
						</tr>
					</c:if>
					<c:forEach items="${cart.ds}" var="cartItem" varStatus="counter">
						<tr>
							<td><c:out value="${cartItem.maSanPham}" /><br> <c:out
									value="${cartItem.tenSanPham}" /></td>
							<td><input type="text" name="quantity" size="2"
								value='<c:out value="${cartItem.soLuong}"/>' /></td>

							<td>$<c:out value="${cartItem.giaBan}"></c:out></td>
							<td>$<c:out value="${cartItem.tongTien}"></c:out></td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="5">Tổng tiền đơn hàng là: 
						<form:input path="thanhTien" value="${cart.tinhTongTienDonHang()}" /></td>
					</tr>
				</table></div>
			</form:form>
		</div>
		<%@ include file="_footer.jsp" %>