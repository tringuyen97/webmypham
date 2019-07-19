package iuh.edu.entity;

public class SanPham {
	
		private String maSanPham;
		private String tenSanPham;
		private double giaThuc;
		private double giaBan;
		private String loai;
		private String moTa;
		private boolean tinhTrang;
		private String imageURL;
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
		public double getGiaThuc() {
			return giaThuc;
		}
		public void setGiaThuc(double giaThuc) {
			this.giaThuc = giaThuc;
		}
		public double getGiaBan() {
			return giaBan;
		}
		public void setGiaBan(double giaBan) {
			this.giaBan = giaBan;
		}
		public String getLoai() {
			return loai;
		}
		public void setLoai(String loai) {
			this.loai = loai;
		}
		public String getMoTa() {
			return moTa;
		}
		public void setMoTa(String moTa) {
			this.moTa = moTa;
		}
		public boolean isTinhTrang() {
			return tinhTrang;
		}
		public void setTinhTrang(boolean tinhTrang) {
			this.tinhTrang = tinhTrang;
		}
		public String getImageURL() {
			return imageURL;
		}
		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}
		public SanPham(String maSanPham, String tenSanPham, double giaThuc, double giaBan, String loai, String moTa,
				boolean tinhTrang, String imageURL) {
			super();
			this.maSanPham = maSanPham;
			this.tenSanPham = tenSanPham;
			this.giaThuc = giaThuc;
			this.giaBan = giaBan;
			this.loai = loai;
			this.moTa = moTa;
			this.tinhTrang = tinhTrang;
			this.imageURL = imageURL;
		}
		public SanPham() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
