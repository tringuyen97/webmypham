package iuh.edu.entity;

public class ChiTietDonHang {

	private String maDonHang;
	private String maSanPham;
	private int soLuong;
	public String getMaDonHang() {
		return maDonHang;
	}
	public void setMaDonHang(String maDonHang) {
		this.maDonHang = maDonHang;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public ChiTietDonHang(String maDonHang, String maSanPham, int soLuong) {
		super();
		this.maDonHang = maDonHang;
		this.maSanPham = maSanPham;
		this.soLuong = soLuong;
	}
	public ChiTietDonHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
