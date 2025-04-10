package QuanLyLopHoc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class QuanLyBaiTap extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JComboBox<String> TimMon_comboBox;

	public QuanLyBaiTap() {
		setBackground(new Color(0, 0, 121)); // Màu nền đồng bộ với TrangChu
		setBounds(81, 11, 895, 652);
		setLayout(null);

		// Tiêu đề
		 JLabel lblNewLabel = new JLabel("QUẢN LÝ BÀI TẬP");
	     lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
	     lblNewLabel.setForeground(new Color(255, 255, 255));
	     lblNewLabel.setBounds(300, 10, 300, 40);
	     add(lblNewLabel);

		// Nút Thêm bài tập
		JButton DaNop_btn = new JButton("Bài Tập Đã Nộp");
		DaNop_btn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		DaNop_btn.setBackground(new Color(255, 204, 0));
		DaNop_btn.setForeground(Color.BLACK);
		DaNop_btn.setBounds(45, 566, 150, 40);
		add(DaNop_btn);

		// Nút Sửa bài tập
		JButton ChuaNop_btn = new JButton("Bài Tập Chưa Nộp ");
		ChuaNop_btn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		ChuaNop_btn.setBackground(new Color(255, 204, 0));
		ChuaNop_btn.setForeground(Color.BLACK);
		ChuaNop_btn.setBounds(210, 566, 150, 40);
		add(ChuaNop_btn);
		
		// Nút Nộp bài
		JButton btnXuat = new JButton("Xuất Excel");
		btnXuat.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnXuat.setBackground(new Color(0, 204, 0)); // Màu xanh để nổi bật
		btnXuat.setForeground(Color.WHITE);
		btnXuat.setBounds(691, 566, 150, 40);
		add(btnXuat);
		
		ImageIcon icon = new ImageIcon("/Icon/find.png"); 
        Image scaledImage = icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);
        JButton btnTimKiem = new JButton("Tìm Kiếm", icon);
        btnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnTimKiem.setForeground(Color.BLACK);
		btnTimKiem.setBounds(502, 72, 124, 40);
        btnTimKiem.setHorizontalTextPosition(SwingConstants.RIGHT); // Chữ bên phải icon
        btnTimKiem.setVerticalTextPosition(SwingConstants.CENTER);   // Căn giữa theo chiều dọc
        add(btnTimKiem);
		
        TimMon_comboBox = new JComboBox<>();
        TimMon_comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"", "Cảm Biến", "Java", "Android"}));
        TimMon_comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        TimMon_comboBox.setBounds(173, 72, 296, 40);
        add(TimMon_comboBox);
        
        
		JList DanhSach_List = new JList();
		DanhSach_List.setBounds(28, 151, 841, 381);
		add(DanhSach_List);
	}

	
	
}