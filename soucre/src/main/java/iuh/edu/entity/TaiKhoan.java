package iuh.edu.entity;

public class TaiKhoan {
	private String tenKhachHang;
	private String diaChi;
	private String email;
	private String soDienThoai;
	private String tenDangNhap;
	private String matKhau;
	private boolean vaiTro = false;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public boolean isVaiTro() {
		return vaiTro;
	}
	public void setVaiTro(boolean vaiTro) {
		this.vaiTro = vaiTro;
	}
	@Override
	public String toString() {
		return "TaiKhoan [tenKhachHang=" + tenKhachHang + ", diaChi=" + diaChi + ", email=" + email + ", soDienThoai="
				+ soDienThoai + ", tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau + ", vaiTro=" + vaiTro + "]";
	}
	public TaiKhoan(String tenKhachHang, String diaChi, String email, String soDienThoai, String tenDangNhap,
			String matKhau, boolean vaiTro) {
		super();
		this.tenKhachHang = tenKhachHang;
		this.diaChi = diaChi;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.vaiTro = vaiTro;
	}
	public TaiKhoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
