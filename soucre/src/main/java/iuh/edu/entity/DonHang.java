package iuh.edu.entity;
import java.util.ArrayList;
import java.util.Date;

public class DonHang {
	
	private String maDonHang;
	private String tenDangNhap;
	private String tenKhachHang;
	private String diaChi;
	private String soDienThoai;
	private String email;
	private double thanhTien;
	private ArrayList<ChiTietDonHang> listChiTietDonHang;
	public String getMaDonHang() {
		return maDonHang;
	}
	public void setMaDonHang(String maDonHang) {
		this.maDonHang = maDonHang;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	public ArrayList<ChiTietDonHang> getListChiTietDonHang() {
		return listChiTietDonHang;
	}
	public void setListChiTietDonHang(ArrayList<ChiTietDonHang> listChiTietDonHang) {
		this.listChiTietDonHang = listChiTietDonHang;
	}
	@Override
	public String toString() {
		return "DonHang [maDonHang=" + maDonHang + ", tenDangNhap=" + tenDangNhap + ", tenKhachHang=" + tenKhachHang
				+ ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", email=" + email + ", thanhTien="
				+ thanhTien + ", listChiTietDonHang=" + listChiTietDonHang + "]";
	}
	public DonHang(String maDonHang, String tenDangNhap, String tenKhachHang, String diaChi, String soDienThoai,
			String email, double thanhTien, ArrayList<ChiTietDonHang> listChiTietDonHang) {
		super();
		this.maDonHang = maDonHang;
		this.tenDangNhap = tenDangNhap;
		this.tenKhachHang = tenKhachHang;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.thanhTien = thanhTien;
		this.listChiTietDonHang = listChiTietDonHang;
	}
	public DonHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
