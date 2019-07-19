package iuh.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import iuh.edu.entity.DonHang;


@Repository
public class DonHangDao {
	@Autowired
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<DonHang> getAll(){
		return template.query("select * from DonHang", new RowMapper<DonHang>() {
			public DonHang mapRow(ResultSet rs, int row) throws SQLException{
				DonHang s=new DonHang();
				s.setMaDonHang(rs.getString(1));
				s.setTenDangNhap(rs.getString(2));
				s.setTenKhachHang(rs.getString(3));
				s.setDiaChi(rs.getString(4));
				s.setSoDienThoai(rs.getString(5));
				s.setEmail(rs.getString(6));
				s.setThanhTien(rs.getDouble(7));
				return s;
			}
		});
	}
	
	public String getMaDonHangMoiNhat(){
		String sql ="SELECT TOP 1  [MaDonHang], [TenDangNhap],[TenKhachHang],[DiaChi],[SoDienThoai],[Email], [ThanhTien] FROM [dbo].[DonHang] \r\n" + 
				"ORDER BY  [MaDonHang] DESC";
		DonHang dh=template.queryForObject(sql, new BeanPropertyRowMapper<DonHang>(DonHang.class));
		return dh.getMaDonHang();
	}
	
	
	
	public int save(DonHang s)
	{
		String sql="insert into DonHang ( TenDangNhap, TenKhachHang, DiaChi, SoDienThoai, Email, ThanhTien) values('"
				+s.getTenDangNhap()+"','"+s.getTenKhachHang()+"','"+s.getDiaChi()+"','"+s.getSoDienThoai()+"','"+s.getEmail()+"','"+s.getThanhTien()+"')";
		return template.update(sql);
	}
}
