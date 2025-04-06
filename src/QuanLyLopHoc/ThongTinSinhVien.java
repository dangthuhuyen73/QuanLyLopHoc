package QuanLyLopHoc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThongTinSinhVien extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel ThongTinSinhVien;
    private JTextField Email_text;
    private JTextField Sdt_text;
    private JTextField Lop_text;
    private JTextField MSSV_text;
    private JTextField HoTen_text;
    private JTextField HocPhi_test;
    private JTextField TenGV_text;
    private JTextField MaMon_text;
    private JTextField LopHoc_text;
    private JTextField MonHoc_text;
    private JTextField NgaySinh_text;
    private JTextField TimKiem_text;
    private JTextField ThoiGian_test;
    private JTextField GioiTinh_text;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ThongTinSinhVien frame = new ThongTinSinhVien();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ThongTinSinhVien() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 895, 652);
        ThongTinSinhVien = new JPanel();
        ThongTinSinhVien.setBackground(new Color(0, 0, 121));
        ThongTinSinhVien.setBorder(new EmptyBorder(5, 5, 5, 5));
        ThongTinSinhVien.setLayout(null);
        setContentPane(ThongTinSinhVien);

        JLabel lblTitle = new JLabel("THÔNG TIN SINH VIÊN");
        lblTitle.setForeground(new Color(255, 255, 255));
        lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblTitle.setBounds(283, 11, 302, 37);
        ThongTinSinhVien.add(lblTitle);

        JPanel panel = new JPanel();
        panel.setBounds(10, 80, 861, 524);
        ThongTinSinhVien.add(panel);
        panel.setLayout(null);

        // Buttons
        ImageIcon timKiemIcon = new ImageIcon(ThongTinSinhVien.class.getResource("/ICON/find.png"));
        JButton TimKiemButton = new JButton("Tìm Kiếm", timKiemIcon);
        TimKiemButton.setBackground(new Color(255, 204, 0));
        TimKiemButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Image resizedImage = timKiemIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        TimKiemButton.setIcon(new ImageIcon(resizedImage));
        TimKiemButton.setHorizontalTextPosition(SwingConstants.RIGHT); // Chữ bên phải icon
        TimKiemButton.setVerticalTextPosition(SwingConstants.CENTER);  // Căn giữa dọc
        TimKiemButton.setBounds(208, 28, 130, 30);
        panel.add(TimKiemButton);
        
        JLabel HoTen_Label = new JLabel("HỌ TÊN :");
        HoTen_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        HoTen_Label.setBounds(11, 114, 81, 29);
        panel.add(HoTen_Label);
        
        JLabel MSSV_Label = new JLabel("MSSV  :");
        MSSV_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        MSSV_Label.setBounds(12, 165, 81, 29);
        panel.add(MSSV_Label);
        
        JLabel Lop_Label = new JLabel("LỚP :");
        Lop_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Lop_Label.setBounds(11, 225, 81, 29);
        panel.add(Lop_Label);
        
        JLabel NgaySinh_label = new JLabel("NGÀY SINH:");
        NgaySinh_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        NgaySinh_label.setBounds(11, 284, 103, 29);
        panel.add(NgaySinh_label);
        
        JLabel Sdt_Label = new JLabel("SDT :");
        Sdt_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Sdt_Label.setBounds(11, 345, 81, 29);
        panel.add(Sdt_Label);
        
        JLabel Email_Label = new JLabel("EMAIL :");
        Email_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Email_Label.setBounds(10, 397, 81, 29);
        panel.add(Email_Label);
        
        Email_text = new JTextField();
        Email_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Email_text.setColumns(10);
        Email_text.setBounds(90, 397, 297, 30);
        panel.add(Email_text);
        
        Sdt_text = new JTextField();
        Sdt_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Sdt_text.setColumns(10);
        Sdt_text.setBounds(90, 346, 297, 30);
        panel.add(Sdt_text);
        
        Lop_text = new JTextField();
        Lop_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Lop_text.setColumns(10);
        Lop_text.setBounds(91, 224, 296, 30);
        panel.add(Lop_text);
        
        MSSV_text = new JTextField();
        MSSV_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        MSSV_text.setColumns(10);
        MSSV_text.setBounds(91, 165, 296, 30);
        panel.add(MSSV_text);
        
        HoTen_text = new JTextField();
        HoTen_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        HoTen_text.setColumns(10);
        HoTen_text.setBounds(91, 112, 296, 30);
        panel.add(HoTen_text);
        
        JLabel HoTen_Label_1 = new JLabel("MÔN HỌC :");
        HoTen_Label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        HoTen_Label_1.setBounds(466, 112, 103, 29);
        panel.add(HoTen_Label_1);
        
        JLabel MSSV_Label_1 = new JLabel("LỚP HỌC:");
        MSSV_Label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        MSSV_Label_1.setBounds(467, 165, 102, 29);
        panel.add(MSSV_Label_1);
        
        JLabel Lop_Label_1 = new JLabel("MÃ MÔN :");
        Lop_Label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Lop_Label_1.setBounds(466, 224, 81, 29);
        panel.add(Lop_Label_1);
        
        JLabel NgaySinh_label_1 = new JLabel("TÊN GV:");
        NgaySinh_label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        NgaySinh_label_1.setBounds(466, 284, 103, 29);
        panel.add(NgaySinh_label_1);
        
        JLabel Sdt_Label_1 = new JLabel("THỜI GIAN:");
        Sdt_Label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Sdt_Label_1.setBounds(466, 345, 93, 29);
        panel.add(Sdt_Label_1);
        
        JLabel Email_Label_1 = new JLabel("HỌC PHÍ:");
        Email_Label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Email_Label_1.setBounds(466, 398, 81, 29);
        panel.add(Email_Label_1);
        
        HocPhi_test = new JTextField();
        HocPhi_test.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        HocPhi_test.setColumns(10);
        HocPhi_test.setBounds(555, 397, 297, 30);
        panel.add(HocPhi_test);
        
        TenGV_text = new JTextField();
        TenGV_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        TenGV_text.setColumns(10);
        TenGV_text.setBounds(555, 283, 297, 30);
        panel.add(TenGV_text);
        
        MaMon_text = new JTextField();
        MaMon_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        MaMon_text.setColumns(10);
        MaMon_text.setBounds(555, 223, 296, 30);
        panel.add(MaMon_text);
        
        LopHoc_text = new JTextField();
        LopHoc_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        LopHoc_text.setColumns(10);
        LopHoc_text.setBounds(556, 164, 296, 30);
        panel.add(LopHoc_text);
        
        MonHoc_text = new JTextField();
        MonHoc_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        MonHoc_text.setColumns(10);
        MonHoc_text.setBounds(556, 111, 296, 30);
        panel.add(MonHoc_text);
        
        NgaySinh_text = new JTextField();
        NgaySinh_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        NgaySinh_text.setColumns(10);
        NgaySinh_text.setBounds(107, 283, 120, 30);
        panel.add(NgaySinh_text);
        
        TimKiem_text = new JTextField();
        TimKiem_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        TimKiem_text.setColumns(10);
        TimKiem_text.setBounds(363, 28, 296, 30);
        panel.add(TimKiem_text);
        
        ThoiGian_test = new JTextField();
        ThoiGian_test.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ThoiGian_test.setColumns(10);
        ThoiGian_test.setBounds(555, 344, 296, 30);
        panel.add(ThoiGian_test);
        
        JLabel NgaySinh_label_2 = new JLabel("GIỚI TÍNH:");
        NgaySinh_label_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        NgaySinh_label_2.setBounds(237, 284, 93, 29);
        panel.add(NgaySinh_label_2);
        
        GioiTinh_text = new JTextField();
        GioiTinh_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        GioiTinh_text.setColumns(10);
        GioiTinh_text.setBounds(331, 283, 56, 30);
        panel.add(GioiTinh_text);
        
        JButton Sua_button = new JButton("SỬA");
        Sua_button.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Sua_button.setBackground(new Color(238, 119, 0));
        Sua_button.setBounds(208, 450, 120, 44);
        panel.add(Sua_button);
        
        JButton Xoa_button_1 = new JButton("XÓA");
        Xoa_button_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Xoa_button_1.setBackground(new Color(238, 119, 0));
        Xoa_button_1.setBounds(398, 450, 120, 44);
        panel.add(Xoa_button_1);
        
        JButton NopBaiTap_button_2 = new JButton("NỘP BÀI TẬP");
        NopBaiTap_button_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        NopBaiTap_button_2.setBackground(new Color(238, 119, 0));
        NopBaiTap_button_2.setBounds(584, 450, 162, 44);
        panel.add(NopBaiTap_button_2);
    }
    
}