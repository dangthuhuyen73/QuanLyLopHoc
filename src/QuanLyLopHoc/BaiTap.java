package QuanLyLopHoc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class BaiTap extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;

    public BaiTap() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setBounds(100, 100, 895, 652); 
        setLocationRelativeTo(null);
        
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 121));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Nội dung bài tập (TextArea)
        JTextArea noiDungBaiTap = new JTextArea();
        noiDungBaiTap.setText("Nội dung bài tập:\n1. Hoàn thành bài tập Java\n2. Nộp file .java\n3. Deadline: 10/04/2025");
        noiDungBaiTap.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        noiDungBaiTap.setBounds(53, 100, 795, 248); // Điều chỉnh kích thước và vị trí cho phù hợp
        noiDungBaiTap.setEditable(false);
        noiDungBaiTap.setBackground(Color.WHITE); // Thêm màu nền cho dễ đọc
        contentPane.add(noiDungBaiTap);

        // Nút Nộp bài
        JButton NộpBaiButton = new JButton("NỘP BÀI");
        NộpBaiButton.setBounds(188, 473, 162, 42);
        NộpBaiButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
        NộpBaiButton.setBackground(new Color(255, 165, 80));
        NộpBaiButton.setForeground(new Color(0, 0, 0)); // Thêm màu chữ cho đồng bộ
        NộpBaiButton.setBorder(new LineBorder(Color.WHITE, 1));
        contentPane.add(NộpBaiButton);

        // Nút Hủy
        JButton HuyBaiButton = new JButton("HỦY NỘP BÀI");
        HuyBaiButton.setBounds(558, 472, 162, 44);
        HuyBaiButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
        HuyBaiButton.setBackground(new Color(255, 53, 53)); 
        HuyBaiButton.setForeground(new Color(0, 0, 0)); // Chữ màu đen
        HuyBaiButton.setBorder(new LineBorder(Color.WHITE, 1)); // Viền trắng
        contentPane.add(HuyBaiButton);

        contentPane.add(HuyBaiButton);
        
        textField = new JTextField();
        textField.setBounds(188, 375, 660, 40);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("LINK BÀI LÀM:");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(54, 375, 124, 40);
        contentPane.add(lblNewLabel);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255, 204, 0));
        panel.setBounds(0, 0, 881, 57);
        contentPane.add(panel);
        
        JLabel lblBiTp = new JLabel("BÀI TẬP");
        lblBiTp.setForeground(Color.BLACK);
        lblBiTp.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblBiTp.setBounds(393, 11, 133, 37);
        panel.add(lblBiTp);

        // Xử lý sự kiện cho nút Nộp bài
        NộpBaiButton.addActionListener(new ActionListener() {
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
        HuyBaiButton.addActionListener(new ActionListener() {
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