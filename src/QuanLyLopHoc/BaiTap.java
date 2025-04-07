package QuanLyLopHoc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class BaiTap extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;

    public BaiTap() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Sửa từ EXIT thành DISPOSE để không thoát toàn bộ chương trình
        setBounds(100, 100, 895, 652); // Giữ kích thước đồng bộ với ThongTinSinhVien
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 121));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Tiêu đề
        JLabel BaiTap = new JLabel("BÀI TẬP");
        BaiTap.setForeground(Color.WHITE);
        BaiTap.setFont(new Font("Times New Roman", Font.BOLD, 25));
        BaiTap.setBounds(364, 28, 128, 37);
        contentPane.add(BaiTap);

        // Nội dung bài tập (TextArea)
        JTextArea noiDungBaiTap = new JTextArea();
        noiDungBaiTap.setText("Nội dung bài tập:\n1. Hoàn thành bài tập Java\n2. Nộp file .java\n3. Deadline: 10/04/2025");
        noiDungBaiTap.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        noiDungBaiTap.setBounds(53, 100, 795, 248); // Điều chỉnh kích thước và vị trí cho phù hợp
        noiDungBaiTap.setEditable(false);
        noiDungBaiTap.setBackground(Color.WHITE); // Thêm màu nền cho dễ đọc
        contentPane.add(noiDungBaiTap);

        // Nút Nộp bài
        JButton nopBaiButton = new JButton("NỘP BÀI");
        nopBaiButton.setBounds(188, 495, 120, 40);
        nopBaiButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
        nopBaiButton.setBackground(new Color(238, 119, 0));
        nopBaiButton.setForeground(new Color(0, 0, 0)); // Thêm màu chữ cho đồng bộ
        contentPane.add(nopBaiButton);

        // Nút Hủy
        JButton huyButton = new JButton("HỦY NỘP BÀI ");
        huyButton.setBounds(444, 495, 139, 40);
        huyButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
        huyButton.setBackground(new Color(238, 119, 0));
        huyButton.setForeground(new Color(0, 0, 0)); // Thêm màu chữ cho đồng bộ
        contentPane.add(huyButton);
        
        textField = new JTextField();
        textField.setBounds(188, 375, 660, 40);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("LINK BÀI LÀM:");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(54, 375, 124, 40);
        contentPane.add(lblNewLabel);

        // Xử lý sự kiện cho nút Nộp bài
        nopBaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(contentPane, 
                    "Nộp bài thành công!", 
                    "Thành công", 
                    JOptionPane.INFORMATION_MESSAGE);
                dispose(); // Đóng cửa sổ sau khi nộp bài
            }
        });

        // Xử lý sự kiện cho nút Hủy
        huyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(contentPane, 
                    "Bạn có muốn hủy nộp bài không?", 
                    "Xác nhận", 
                    JOptionPane.YES_NO_OPTION);
                
                if (confirm == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(contentPane, 
                        "Hủy nộp bài thành công!", 
                        "Thông báo", 
                        JOptionPane.INFORMATION_MESSAGE);
                    dispose(); // Đóng cửa sổ sau khi hủy
                }
            }
        });
    }
}