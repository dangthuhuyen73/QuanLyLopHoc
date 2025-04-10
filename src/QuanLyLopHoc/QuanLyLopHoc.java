package QuanLyLopHoc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class QuanLyLopHoc extends JPanel {

	private static final long serialVersionUID = 1L;
    

	public QuanLyLopHoc() {
		setBackground(new Color(0, 0, 121));
        setBounds(81, 11, 895, 652);
        setLayout(null);

		// Tiêu đề
        JLabel lblNewLabel = new JLabel("QUẢN LÝ LỚP HỌC");
	    lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
	    lblNewLabel.setForeground(new Color(255, 255, 255));
	    lblNewLabel.setBounds(300, 10, 300, 40);
	    add(lblNewLabel);
	    
	 // Tạo JPopupMenu cho nút Quản Lý
        JPopupMenu manageLopMenu = new JPopupMenu("Danh Sách Lớp Học");
        manageLopMenu.setFont(new Font("Times New Roman", Font.BOLD, 14));
        manageLopMenu.setBackground(new Color(255, 204, 0));
        manageLopMenu.setForeground(Color.BLACK);
        manageLopMenu.setBounds(356, 83, 187, 40);
        JMenuItem lop1 = new JMenuItem("D21CQVT01-N");
        JMenuItem lop2 = new JMenuItem("D21CQVTHI01-N");
        JMenuItem lop3= new JMenuItem("D21CQVTVT01-N");
        add(manageLopMenu);

        manageLopMenu.add(lop1);
        manageLopMenu.add(lop2);
        manageLopMenu.add(lop3);

		// Nút Sửa lớp học
		JButton Mon_bnt = new JButton("Danh Sách Môn Học");
		Mon_bnt.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Mon_bnt.setBackground(new Color(255, 204, 0));
		Mon_bnt.setForeground(Color.BLACK);
		Mon_bnt.setBounds(356, 83, 187, 40);
		add(Mon_bnt);

		// Nút Xóa lớp học
		JButton GiaoVien_bnt = new JButton("Danh Sách Giáo Viên");
		GiaoVien_bnt.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GiaoVien_bnt.setBackground(new Color(255, 204, 0));
		GiaoVien_bnt.setForeground(Color.BLACK);
		GiaoVien_bnt.setBounds(632, 83, 187, 40);
		add(GiaoVien_bnt);

		// Nút Xem chi tiết
		JButton btnDetails = new JButton("Xuất Excel");
		btnDetails.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDetails.setBackground(new Color(0, 204, 0)); // Màu xanh để nổi bật
		btnDetails.setForeground(Color.WHITE);
		btnDetails.setBounds(688, 589, 150, 40);		
		add(btnDetails);
		
		JList Dánhach_list = new JList();
		Dánhach_list.setBounds(33, 156, 833, 411);
		add(Dánhach_list);
	}

	
	
}