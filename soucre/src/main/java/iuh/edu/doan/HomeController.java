package iuh.edu.doan;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
/**
 * Handles requests for the application home page.
 */
import org.springframework.web.servlet.ModelAndView;

import iuh.edu.dao.ChiTietDonHangDao;
import iuh.edu.dao.DonHangDao;
import iuh.edu.dao.SanPhamDao;
import iuh.edu.dao.TaiKhoanDao;
import iuh.edu.entity.ChiTietDonHang;
import iuh.edu.entity.DonHang;
import iuh.edu.entity.GioHang;
import iuh.edu.entity.SanPham;
import iuh.edu.entity.TaiKhoan;
import iuh.edu.entity.ThanhPhanGioHang;
@Controller
public class HomeController {

	@Autowired
	SanPhamDao spdao;
	@Autowired
	TaiKhoanDao tkdao;
	@Autowired
	DonHangDao dhdao;
	@Autowired
	ChiTietDonHangDao ctdhdao;


	@RequestMapping(value="/")
	public ModelAndView viewSanPham(HttpSession session) {
		List<SanPham> list= spdao.getAllSanPhamKinhDoanh();
		String path = session.getServletContext().getRealPath("/resources/image/") ;
		ModelAndView mav = new ModelAndView("home", "list", list);
		mav.addObject("path", path);
		return mav;
	}



	@RequestMapping(value="/viewDanhSachSanPhamSon")
	public ModelAndView viewDanhSachSanPhamSon(HttpSession session) {
		List<SanPham> list= spdao.getAllSanPhamSon();
		String path = session.getServletContext().getRealPath("/resources/image/") ;
		ModelAndView mav = new ModelAndView("danhsachsanpham", "list", list);
		mav.addObject("path", path);
		return mav;
	}

	@RequestMapping(value="/viewChiTietSanPham")
	public ModelAndView viewChiTietSanPham(HttpSession session, HttpServletRequest request) {
		String ma = request.getParameter("ma");

		SanPham sp = spdao.getSanPhamById(ma);
		String path = session.getServletContext().getRealPath("/resources/image/") ;
		ModelAndView mav = new ModelAndView("chitietsanpham", "ctsanpham", sp);
		mav.addObject("path", path);
		return mav;
	}

	@RequestMapping(value="/viewThongTinTaiKhoan")
	public ModelAndView viewThongTinTaiKhoan(HttpSession session, HttpServletRequest request) {

		session = request.getSession();
		TaiKhoan tk=(TaiKhoan) session.getAttribute("taiKhoan");

		if(tk==null)
			return new ModelAndView("dangnhap", "command", new TaiKhoan());
		else
			return new ModelAndView("thongtintaikhoan", "command",new TaiKhoan());
	}
	
	@RequestMapping(value="/viewCapNhatTaiKhoan")
	public ModelAndView viewCapNhatTaiKhoan(HttpSession session, HttpServletRequest request) {
		
		session = request.getSession();
		TaiKhoan tk=(TaiKhoan) session.getAttribute("taiKhoan");
		return new ModelAndView("suathongtintaikhoan", "command",tk);
	}
	
	
	@RequestMapping(value="/viewDangKi")
	public ModelAndView viewDangKi() {

		return new ModelAndView("dangki", "command",new TaiKhoan());
	}

	@RequestMapping(value="/viewGioHang")
	public ModelAndView viewGioHang() {

		return new ModelAndView("giohang", "command",new GioHang());
	}

	@RequestMapping(value="/viewDangNhap")
	public ModelAndView viewDangNhap() {

		return new ModelAndView("dangnhap", "command",new TaiKhoan());
	}


	@RequestMapping(value="/viewThemSanPham")
	public ModelAndView viewThemSanPham() {
		return new ModelAndView("themsanpham", "command",new SanPham());

	}


	@RequestMapping(value="/viewQuanLiSanPham")
	public ModelAndView viewQuanLiSanPham(HttpSession session, HttpServletRequest request) {
		List<SanPham> list= spdao.getAll();
		String path = session.getServletContext().getRealPath("/resources/image/") ;
		ModelAndView mav = new ModelAndView("quanlisanpham", "list", list);
		mav.addObject("path", path);

		session = request.getSession();
		TaiKhoan tk=(TaiKhoan) session.getAttribute("taiKhoan");

		if(tk==null)
			return new ModelAndView("dangnhap", "command", new TaiKhoan());
		else
			if(tk.getTenDangNhap().equals("admin"))
				return mav;
			else
				return new ModelAndView("thongbaoloi", "command", new TaiKhoan());
	}

	@RequestMapping(value="/viewCapNhatSanPham", method = RequestMethod.POST)
	public ModelAndView viewCapNhatSanPham(HttpServletRequest request) {
		String maSanPham = request.getParameter("ma");
		SanPham sp = spdao.getSanPhamById(maSanPham);
		ModelAndView mav = new ModelAndView("suasanpham", "command", sp);
		return mav;
	}

	@RequestMapping(value="/viewDatHang")
	public ModelAndView viewDatHang() {

		return new ModelAndView("dathang", "command",new DonHang());
	}
	@RequestMapping(value="/viewDanhSachDonHang")
	public ModelAndView viewDanhSachDonHang(HttpSession session, HttpServletRequest request) {
		List<DonHang> list=dhdao.getAll();

		session = request.getSession();
		TaiKhoan tk=(TaiKhoan) session.getAttribute("taiKhoan");

		if(tk==null)
			return new ModelAndView("dangnhap", "command", new TaiKhoan());
		else
			if(tk.getTenDangNhap().equals("admin"))
				return new ModelAndView("danhsachdonhang", "list",list);
			else
				return new ModelAndView("thongbaoloi", "command", new TaiKhoan());
	}

	
	
	@RequestMapping(value="/timKiem")
	public ModelAndView timKiem(HttpSession session, HttpServletRequest request) {
		String x=request.getParameter("timkiem");
		List<SanPham> list= spdao.timKiem(x);
		String path = session.getServletContext().getRealPath("/resources/image/") ;
		ModelAndView mav = new ModelAndView("home", "list", list);
		mav.addObject("path", path);
		return mav;
	}
	
	@RequestMapping(value="/dangNhap", method = RequestMethod.POST)
	public String dangNhap(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		session = request.getSession();
		String tenDangNhap =  request.getParameter("tenDangNhap");
		String mauKhau =  request.getParameter("matKhau");
		ArrayList<TaiKhoan> dstk=new ArrayList<TaiKhoan>();
		dstk=(ArrayList<TaiKhoan>) tkdao.getAll();
		for (TaiKhoan tk : dstk) {
			if(tk.getTenDangNhap().equals(tenDangNhap) && tk.getMatKhau().equals(mauKhau))
			{
				session.setAttribute("taiKhoan", tk);
			}
		}
		TaiKhoan taikhoan=(TaiKhoan) session.getAttribute("taiKhoan");
		if(taikhoan.getTenDangNhap().equals("admin"))
			return "redirect:/viewQuanLiSanPham";
		else
			return "redirect:/";
	}

	@RequestMapping(value="/dangXuat")
	public String dangXuat(HttpServletRequest reques, HttpSession session) throws Exception {

		session.removeAttribute("taiKhoan");
		return "redirect:/";
	}

	@RequestMapping(value="/themTaiKhoan", method = RequestMethod.POST)
	public String dangKi(@ModelAttribute("tk") TaiKhoan tk) throws Exception {


		tkdao.save(tk);
		return "redirect:/";
	}



	@RequestMapping(value="/themSanPham", method = RequestMethod.POST)
	public String themSanPham(@ModelAttribute("sp") SanPham sp, @RequestParam CommonsMultipartFile file,HttpSession session) throws Exception {

		ServletContext context = session.getServletContext();
		String path = context.getRealPath("/resources/image");

		String filename = file.getOriginalFilename();
		System.out.println(path + File.separator + filename);


		byte[] bytes = file.getBytes();
		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(path + File.separator + filename)));
		stream.write(bytes);
		stream.flush();
		stream.close();

		sp.setTinhTrang(true);
		sp.setImageURL(filename);
		spdao.save(sp);
		return "redirect:/";
	}
	@RequestMapping(value="/capNhatSanPham", method = RequestMethod.POST)
	public String capNhatSanPham(@ModelAttribute("sp") SanPham sp, @RequestParam CommonsMultipartFile file,HttpSession session) throws Exception {

		ServletContext context = session.getServletContext();
		String path = context.getRealPath("/resources/image");

		String filename = file.getOriginalFilename();
		System.out.println(path + File.separator + filename);


		byte[] bytes = file.getBytes();
		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(path + File.separator + filename)));
		stream.write(bytes);
		stream.flush();
		stream.close();

		sp.setImageURL(filename);
		spdao.update(sp);
		return "redirect:/";
	}
	
	@RequestMapping(value="/capNhatTaiKhoan", method = RequestMethod.POST)
	public String capNhatTaiKhoan(@ModelAttribute("tk") TaiKhoan tk, HttpServletRequest request, HttpSession session) throws Exception {
		
		session = request.getSession();
		TaiKhoan tkss=(TaiKhoan) session.getAttribute("taiKhoan");
		tk.setTenDangNhap(tkss.getTenDangNhap());
		tk.setTenDangNhap(tkss.getMatKhau());
		tkdao.update(tk);
		session.setAttribute("taiKhoan", tk);
		return "redirect:/";
	}
	
	@RequestMapping(value="/datHang", method = RequestMethod.POST)
	public String thanhToan(@ModelAttribute("dh") DonHang dh,HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		TaiKhoan tk=(TaiKhoan) session.getAttribute("taiKhoan");
		dh.setTenDangNhap(tk.getTenDangNhap());
		dhdao.save(dh);

		int maMoiNhat=Integer.parseInt(dhdao.getMaDonHangMoiNhat());

		GioHang gh=(GioHang) session.getAttribute("cart");
		for (ThanhPhanGioHang tpgh : gh.getDs()) {

			ChiTietDonHang ctdh=new ChiTietDonHang(maMoiNhat+"", tpgh.getMaSanPham(), tpgh.getSoLuong());
			ctdhdao.save(ctdh);
		}
		session.removeAttribute("cart");
		return "redirect:/";
	}

	@RequestMapping(value="/muaSanPham")
	public String themGioHang(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String maSanPham = request.getParameter("ma");
		String soLuong = "1";
		String tenSanPham = request.getParameter("ten");
		String giaBan = request.getParameter("gia");
		GioHang cart = null;

		Object objcart = session.getAttribute("cart");
		if (objcart != null) {
			cart = (GioHang) objcart;
			if(request.getParameter("ma") !=null)
			{
				cart.themThanhPhanGioHang(maSanPham, tenSanPham, giaBan, soLuong);
			}
			session.setAttribute("cart", cart);
		} else {
			cart = new GioHang();
			if(request.getParameter("ma") !=null)
			{
				cart.themThanhPhanGioHang(maSanPham, tenSanPham, giaBan, soLuong);
			}
			session.setAttribute("cart", cart);
		}

		return "giohang";
	}

	@RequestMapping(value="/xoaGioHang")
	public ModelAndView xoaGioHang(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String strIndex = request.getParameter("itemIndex");
		GioHang cart = null;

		Object objcart = session.getAttribute("cart");
		if (objcart != null) {
			cart = (GioHang) objcart;
		} else {
			cart = new GioHang();
		}
		cart.xoaMatHang(strIndex);
		return new ModelAndView("giohang", "cart",cart);
	}

	@RequestMapping(value="/capNhatSoLuong")
	public ModelAndView capNhatSoLuong(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String strIndex = request.getParameter("itemIndex");
		String strSoLuong=request.getParameter("quantity");
		GioHang cart = null;

		Object objcart = session.getAttribute("cart");
		if (objcart != null) {
			cart = (GioHang) objcart;
		} else {
			cart = new GioHang();
		}
		cart.capNhatSoLuong(strIndex, strSoLuong);
		return new ModelAndView("giohang", "cart",cart);
	}


}
