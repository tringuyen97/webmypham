package iuh.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import iuh.edu.entity.DonHang;
import iuh.edu.entity.SanPham;
import iuh.edu.entity.TaiKhoan;
@Repository
public class TaiKhoanDao {
	@Autowired
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int update(TaiKhoan p) {
		String sql ="update TaiKhoan set tenKhachHang='" + p.getTenKhachHang()+"', diaChi='"+p.getDiaChi()+"',email='"+p.getEmail()+"',soDienThoai='"+p.getSoDienThoai()+"' where TenDangNhap='"+p.getTenDangNhap()+"'";
		return template.update(sql);
	}
	
	public List<TaiKhoan> getAll(){
		return template.query("select * from TaiKhoan", new RowMapper<TaiKhoan>() {
			public TaiKhoan mapRow(ResultSet rs, int row) throws SQLException{
				TaiKhoan s=new TaiKhoan();
				s.setTenKhachHang(rs.getString(1));
				s.setDiaChi(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setSoDienThoai(rs.getString(4));
				s.setTenDangNhap(rs.getString(5));
				s.setMatKhau(rs.getString(6));
				return s;
			}
		});
	}
	
	public int save(TaiKhoan tk)
	{
		String sql="insert into TaiKhoan (TenKhachHang, DiaChi, Email, SoDienThoai, TenDangNhap,MatKhau) values('"+tk.getTenKhachHang()+"','"+tk.getDiaChi()+"','"+tk.getEmail()+"','"+tk.getSoDienThoai()
				+"','"+tk.getTenDangNhap()+"','"+tk.getMatKhau()+"')";
		return template.update(sql);
	}
	
}
