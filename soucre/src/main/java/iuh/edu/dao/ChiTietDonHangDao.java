package iuh.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import iuh.edu.entity.ChiTietDonHang;
import iuh.edu.entity.SanPham;

@Repository
public class ChiTietDonHangDao {
	@Autowired
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<ChiTietDonHang> getAll(){
		return template.query("select * from ChiTietDonHang", new RowMapper<ChiTietDonHang>() {
			public ChiTietDonHang mapRow(ResultSet rs, int row) throws SQLException{
				ChiTietDonHang s=new ChiTietDonHang();
				s.setMaDonHang(rs.getString(1));
				s.setMaSanPham(rs.getString(2));
				s.setSoLuong(rs.getInt(3));
			
				return s;
			}
		});
	}
	
	public int save(ChiTietDonHang s)
	{
		String sql="insert into ChiTietDonHang (MaDonHang, MaSanPham, SoLuong) values('"
				+s.getMaDonHang()+"','"+s.getMaSanPham()+"',"+s.getSoLuong()+")";
		return template.update(sql);
	}
}
