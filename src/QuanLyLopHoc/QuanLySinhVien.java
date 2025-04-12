package QuanLyLopHoc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;

public class QuanLySinhVien extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField MaSV_text;
	private JTable table;

	
	public QuanLySinhVien() {
		setBackground(new Color(0, 0, 121));
        setBounds(81, 11, 895, 652);
        setLayout(null);

		// Tiêu đề
        JLabel lblNewLabel = new JLabel("QUẢN LÝ SINH VIÊN");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(300, 10, 300, 40);
        add(lblNewLabel);

		// Khu vực nút chức năng
		JButton btnAdd = new JButton("THÊM");
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAdd.setBackground(new Color(255, 204, 0));
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setBounds(612, 167, 100, 30);
		add(btnAdd);

		JButton btnDelete = new JButton("XÓA");
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDelete.setBackground(new Color(255, 204, 0));
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setBounds(762, 167, 100, 30);
		add(btnDelete);

		JButton btnExport = new JButton("XUẤT EXCEL");
		btnExport.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnExport.setBackground(new Color(0, 255, 0));
		btnExport.setForeground(new Color(0, 0, 0));
		btnExport.setBounds(704, 596, 158, 30);
		add(btnExport);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Sinh Viên:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(142, 74, 117, 40);
		add(lblNewLabel_1);
		
		MaSV_text = new JTextField();
		MaSV_text.setColumns(10);
		MaSV_text.setBounds(271, 74, 321, 40);
		add(MaSV_text);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm", null);
		btnTimKiem.setVerticalTextPosition(SwingConstants.CENTER);
		btnTimKiem.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnTimKiem.setForeground(Color.BLACK);
		btnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnTimKiem.setBounds(612, 74, 117, 40);
		add(btnTimKiem);
		
		JButton btn_TTSV = new JButton("THÔNG TIN CHI TIẾT");
		btn_TTSV.setForeground(Color.WHITE);
		btn_TTSV.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn_TTSV.setBorder(new LineBorder(Color.WHITE, 1));
		btn_TTSV.setBackground(new Color(50, 150, 255));
		btn_TTSV.setBounds(36, 167, 210, 30);
		add(btn_TTSV);
		
		table = new JTable();
		table.setBounds(25, 219, 848, 366);
		add(table);


	}
}