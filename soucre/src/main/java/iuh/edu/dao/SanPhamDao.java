package iuh.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import iuh.edu.entity.SanPham;

@Repository
public class SanPhamDao {
	@Autowired
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int update(SanPham p) {
		String sql ="update SanPham set tenSanPham=N'"+ p.getTenSanPham()+"', giaThuc="+p.getGiaThuc()+",giaBan="+p.getGiaBan()+",loai='"+p.getLoai()+"',moTa='"+p.getMoTa()+"',tinhTrang='"+p.isTinhTrang()+"',imageURL='"+p.getImageURL()+"' where maSanPham='"+p.getMaSanPham()+"'";
		return template.update(sql);
	}
	public int delete(int maSanPham) {
		String sql="delete form SanPham where maSanPham="+maSanPham+"";
		return template.update(sql);
	}
	public List<SanPham> getAll(){
		return template.query("select * from SanPham", new RowMapper<SanPham>() {
			public SanPham mapRow(ResultSet rs, int row) throws SQLException{
				SanPham s=new SanPham();
				s.setMaSanPham(rs.getString(1));
				s.setTenSanPham(rs.getString(2));
				s.setGiaThuc(rs.getDouble(3));
				s.setGiaBan(rs.getDouble(4));
				s.setLoai(rs.getString(5));
				s.setMoTa(rs.getString(6));
				s.setTinhTrang(rs.getBoolean(7));
				s.setImageURL(rs.getString(8));
				return s;
			}
		});
	}
	
	public List<SanPham> getAllSanPhamKinhDoanh(){
		return template.query("select * from SanPham where TinhTrang='true'", new RowMapper<SanPham>() {
			public SanPham mapRow(ResultSet rs, int row) throws SQLException{
				SanPham s=new SanPham();
				s.setMaSanPham(rs.getString(1));
				s.setTenSanPham(rs.getString(2));
				s.setGiaThuc(rs.getDouble(3));
				s.setGiaBan(rs.getDouble(4));
				s.setLoai(rs.getString(5));
				s.setMoTa(rs.getString(6));
				s.setTinhTrang(rs.getBoolean(7));
				s.setImageURL(rs.getString(8));
				return s;
			}
		});
	}
	
	public int save(SanPham s)
	{
		String sql="insert into SanPham (TenSanPham,GiaThuc, GiaBan, Loai, MoTa, TinhTrang, ImageURL) values('"+s.getTenSanPham()+"',"+s.getGiaThuc()+","+s.getGiaBan()+",'"+s.getLoai()+"','"+s.getMoTa()+"','"+s.isTinhTrang()
				+"','"+s.getImageURL()+"')";
		return template.update(sql);
	}
	
	public SanPham getSanPhamById(String id) {
		String sql = "select * from SanPham where maSanPham = ?";
		return template.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper<SanPham>(SanPham.class));
	}
	
	public List<SanPham> getAllSanPhamSon(){
		return template.query("select * from SanPham where loai = 'son'", new RowMapper<SanPham>() {
			public SanPham mapRow(ResultSet rs, int row) throws SQLException{
				SanPham s=new SanPham();
				s.setMaSanPham(rs.getString(1));
				s.setTenSanPham(rs.getString(2));
				s.setGiaThuc(rs.getDouble(3));
				s.setGiaBan(rs.getDouble(4));
				s.setLoai(rs.getString(5));
				s.setMoTa(rs.getString(6));
				s.setTinhTrang(rs.getBoolean(7));
				s.setImageURL(rs.getString(8));
				return s;
			}
		});
	}
	
	public List<SanPham> timKiem(String x){
		return template.query("select * from SanPham where TenSanPham LIKE '%"+x+"%'", new RowMapper<SanPham>() {
			public SanPham mapRow(ResultSet rs, int row) throws SQLException{
				SanPham s=new SanPham();
				s.setMaSanPham(rs.getString(1));
				s.setTenSanPham(rs.getString(2));
				s.setGiaThuc(rs.getDouble(3));
				s.setGiaBan(rs.getDouble(4));
				s.setLoai(rs.getString(5));
				s.setMoTa(rs.getString(6));
				s.setTinhTrang(rs.getBoolean(7));
				s.setImageURL(rs.getString(8));
				return s;
			}
		});
	}
}
