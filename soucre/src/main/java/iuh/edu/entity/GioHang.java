package iuh.edu.entity;

import java.util.ArrayList;

public class GioHang {
	private ArrayList<ThanhPhanGioHang> ds=new ArrayList<ThanhPhanGioHang>();
	private double tongTienDonHang;
	public ArrayList<ThanhPhanGioHang> getDs() {
		return ds;
	}
	public void setDs(ArrayList<ThanhPhanGioHang> ds) {
		this.ds = ds;
	}
	public double getTongTienDonHang() {
		return tongTienDonHang;
	}
	public void setTongTienDonHang(double tongTienDonHang) {
		this.tongTienDonHang = tongTienDonHang;
	}
	
	public double tinhTongTienDonHang() {
		double tong=0;
		for (int i = 0; i < ds.size(); i++) {
			ThanhPhanGioHang a= (ThanhPhanGioHang)ds.get(i);
			tong+=a.getTongTien();
		}
		return tong;
	}
	public int getSoMatHang()
	{
		return ds.size();
	}
	public void xoaMatHang(String x)
	{
		int index=0;
		try {
			index =Integer.parseInt(x);
			ds.remove(index-1);
			tinhTongTienDonHang();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void capNhatSoLuong(String strIndex, String strSoLuong)
	{
		double tongGia=0.0;
		double gia=0.0;
		int soLuong=0;
		int index=0;
		ThanhPhanGioHang item=null;
		try {
			index =(Integer.parseInt(strIndex));
			soLuong =Integer.parseInt(strSoLuong);
			if(soLuong>0) {
				item=(ThanhPhanGioHang)ds.get(index-1);
				gia=item.getGiaBan();
				tongGia=gia*soLuong;
				item.setSoLuong(soLuong);
				item.setTongTien(tongGia);
				tinhTongTienDonHang();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ThanhPhanGioHang getThanhPhanGioHang(int index)
	{
		ThanhPhanGioHang cart=null;
		if(ds.size()>index)
		{
			cart=(ThanhPhanGioHang) ds.get(index);
		}
		return cart;
	}
	
	public void themThanhPhanGioHang(String maSanPham, String tenSanPham, String giaBan, String soLuong) {
		double tonngTien=0.0;
		 double giaTien=0.0;
		 int soluong=0;
		 int kt=0;
		 ThanhPhanGioHang cartItem=new ThanhPhanGioHang();
		 try {
			giaTien =Double.parseDouble(giaBan);
			soluong=Integer.parseInt(soLuong);
			if(soluong>0) {
				tonngTien=giaTien*soluong;
				cartItem.setMaSanPham(maSanPham);
				cartItem.setTenSanPham(tenSanPham);
				cartItem.setGiaBan(giaTien);
				cartItem.setSoLuong(soluong);
				cartItem.setTongTien(tonngTien);
				for (int i = 0; i < ds.size(); i++) {
					ThanhPhanGioHang item=getThanhPhanGioHang(i);
					if (item.getMaSanPham().equals(maSanPham)) {
						capNhatSoLuong((i+1)+"",(item.getSoLuong()+1)+"");
						kt++;
					}
				}
				if (kt==0) {
					ds.add(cartItem);
				}
				tinhTongTienDonHang();
				
			}
		} catch (NumberFormatException e) {
			System.out.println("Lỗi : "+ e.getMessage());
			e.printStackTrace();
		}
	}
	public void themThanhPhanGioHang(ThanhPhanGioHang cartItem) {
		 ds.add(cartItem);
	 }
}
