package QuanLyLopHoc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

public class QuanLyGiangVien extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	

	public QuanLyGiangVien() {
		setBackground(new Color(0, 0, 121));
        setBounds(81, 11, 895, 652);
        setLayout(null);

		// Tiêu đề
         JLabel lblNewLabel = new JLabel("QUẢN LÝ GIẢNG VIÊN");
	     lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
	     lblNewLabel.setForeground(new Color(255, 255, 255));
	     lblNewLabel.setBounds(300, 10, 300, 40);
	     add(lblNewLabel);

		// Khu vực nút chức năng
		JButton btnAdd = new JButton("THÊM");
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAdd.setBackground(new Color(255, 204, 0));
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setBounds(627, 165, 100, 30);
		btnAdd.setBorder(new LineBorder(Color.WHITE, 1));
		add(btnAdd);

		JButton btnDelete = new JButton("XÓA");
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDelete.setBackground(new Color(255, 204, 0));
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setBounds(773, 165, 100, 30);
		btnDelete.setBorder(new LineBorder(Color.WHITE, 1));
		add(btnDelete);

		JButton btnExport = new JButton("XUẤT EXCEL");
		btnExport.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnExport.setBackground(new Color(0, 255, 0)); // Màu hồng giống trong hình
		btnExport.setForeground(new Color(0, 0, 0));
		btnExport.setBounds(715, 594, 158, 30);
		add(btnExport);

		// Sửa phần nút THÔNG TIN CHI TIẾT
		JButton btnTTGV = new JButton("THÔNG TIN CHI TIẾT");
		btnTTGV.setForeground(new Color(255, 255, 255));
		btnTTGV.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnTTGV.setBackground(new Color(50, 150, 255));
		btnTTGV.setBounds(47, 165, 210, 30);
		btnTTGV.setBorder(new LineBorder(Color.WHITE, 1));
		add(btnTTGV); 
		
		ImageIcon icon = new ImageIcon("/Icon/find.png"); 
        Image scaledImage = icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);
        JButton btnTimKiem = new JButton("Tìm Kiếm", icon);
        btnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnTimKiem.setForeground(Color.BLACK);
		btnTimKiem.setBounds(610, 75, 117, 40);
        btnTimKiem.setHorizontalTextPosition(SwingConstants.RIGHT); // Chữ bên phải icon
        btnTimKiem.setVerticalTextPosition(SwingConstants.CENTER);   // Căn giữa theo chiều dọc
        add(btnTimKiem);
        
        textField = new JTextField();
        textField.setBounds(269, 75, 321, 40);
        add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Mã Giảng Viên:");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(140, 75, 117, 40);
        add(lblNewLabel_1);
        
        JList list = new JList();
        list.setBounds(24, 217, 849, 365);
        add(list);

		
	}
}