<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="_header.jsp" %>
		</div>
		<div id="chamsocda">
			<p>
				<a href="${pageContext.request.contextPath}/">Tiếp tục chọn sản
					phẩm</a>
			</p>
			<table width="100%" border="1">
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
						<td>
							<form name="item" method="POST" action="capNhatSoLuong">
								<input type="text" name="quantity" size="2"
									value='<c:out value="${cartItem.soLuong}"/>' /> <input
									type="hidden" name="itemIndex"
									value='<c:out value="${counter.count}"/>' /> <input
									type="submit" name="action" value="Update" />
							</form>
						</td>

						<td>$<c:out value="${cartItem.giaBan}"></c:out></td>
						<td>$<c:out value="${cartItem.tongTien}"></c:out></td>
						<td><form name="item" method="POST" action="xoaGioHang">
								<input type="hidden" name="itemIndex"
									value='<c:out value="${counter.count}"/>' /> <input
									type="submit" name="action" value="Delete" />
							</form></td>
					</tr>
				</c:forEach>

				<tr>
					<td colspan="5">Tổng tiền đơn hàng là: $<c:out
							value="${cart.tinhTongTienDonHang()}" /></td>

				</tr>
			</table>
			<a href="viewDatHang">Dat hang</a>
		</div>
			<%@ include file="_footer.jsp" %>
