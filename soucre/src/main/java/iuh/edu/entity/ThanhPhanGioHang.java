package iuh.edu.entity;

public class ThanhPhanGioHang {
	private String maSanPham;
	private String tenSanPham;
	private double giaBan;
	private int soLuong;
	private double tongTien;
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public ThanhPhanGioHang(String maSanPham, String tenSanPham, double giaBan, int soLuong, double tongTien) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
		this.tongTien = tongTien;
	}
	public ThanhPhanGioHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ThanhPhanGioHang [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", giaBan=" + giaBan
				+ ", soLuong=" + soLuong + ", tongTien=" + tongTien + "]";
	}
	
}
