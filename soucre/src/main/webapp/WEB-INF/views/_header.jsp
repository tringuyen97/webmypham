
<%@page import="org.springframework.web.context.request.SessionScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trang chủ</title>
<link rel="stylesheet" type="text/css" href="resources/css/Layout.css">
</head>
<body>
	<div id="header">
		<div class="left">Hotline: 0989123456</div>
		<div class="right">
			<a href="viewDangKi">Đăng kí | </a><a href="dangXuat">Đăng xuất |
			</a>
			<c:set var="tk" value='<%=session.getAttribute("taiKhoan")%>'></c:set>
			<%
				if (session.getAttribute("taiKhoan") != null) {
			%>

			Xin chào :<strong> <c:out value="${tk.tenKhachHang }"></c:out>

			</strong>

			<%
				} else {
			%>

			<a href="viewDangNhap">Đăng nhập</a>
			<%
				}
			%>
		</div>
	</div>

	<div id="banner">
		<div class="left">
			<img src="resources/image/logo.png">
		</div>

		<div class="mid">
			<form action="timKiem" method="post">
				<input type="text" name="timkiem"
					placeholder="Tìm kiếm sản phẩm mà bạn mong muốn...." class="search" />
				<input type="submit" value="Tìm kiếm" class="button-search">
			</form>
		</div>
		<div class="right">
			<img alt="cart" src="resources/image/cart.png" width="50px"height="50px" align="middle" />
		</div>
	</div>

	<div id="wrapper">

		<div id="menu">
			<ul>
				<li><a href="viewThemSanPham" target="_self">Home</a></li>
				<li><a href="New.html" target="_self">New</a></li>
				<li><a href="DuongDa.html" target="_self">Dưỡng Da</a>
				<li><a href="TrangDiem.html" target="_self">Trang Điểm</a>
				<li><a href="TrangDiem.html" target="_self">Thương Hiệu</a>
				<li><a href="TrangDiem.html" target="_self">Sale</a></li>
				<li><a href="TrangDiem.html" target="_self">Dưới 200k</a></li>
			</ul>
		</div>

		<div id="nav">
			<div class="h2">DANH MỤC SẢN PHẨM</div>
			<ul>
				<li><a href="viewDanhSachSanPhamSon">Son</a></li>
				<li><a href="">Sữa rửa mặt</a></li>
				<li><a href="">Mặt nạ</a></li>
				<li><a href="">Kem</a></li>
			</ul>
		</div>