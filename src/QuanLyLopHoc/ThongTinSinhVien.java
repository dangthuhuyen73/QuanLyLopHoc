package QuanLyLopHoc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ThongTinSinhVien extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel ThongTinSinhVien;
    private JTextField MSSV_text1;
    private JTextField HoTen_text1;
    private JTextField MaMon_text1;
    private JTextField SoTin_text1;
    private JDateChooser NgaySinh_text;
    private JComboBox<String> GioiTinh_ComboBox;
    private JTextField Email_text1;
    private JTextField ThoiGian_text1;
    private JComboBox<String> MonHoc_comboBox1;
    private JComboBox<String> Lop_comboBox_1;
    private JLabel avata;

    public ThongTinSinhVien() {
        initialize();
    }

    public ThongTinSinhVien(String hoTen, String mssv, String lop, String ngaySinh, String gioiTinh, 
                           String email, String monHoc, String maMon, String soTin, String thoiGian) {
        initialize();
        HoTen_text1.setText(hoTen);
        MSSV_text1.setText(mssv);
        Lop_comboBox_1.setSelectedItem(lop);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            NgaySinh_text.setDate(sdf.parse(ngaySinh));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        GioiTinh_ComboBox.setSelectedItem(gioiTinh);
        Email_text1.setText(email);
        MonHoc_comboBox1.setSelectedItem(monHoc);
        MaMon_text1.setText(maMon);
        SoTin_text1.setText(soTin);
        ThoiGian_text1.setText(thoiGian);
        updateAvatar(gioiTinh);
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 895, 652);
        setLocationRelativeTo(null);
        
        ThongTinSinhVien = new JPanel();
        ThongTinSinhVien.setBackground(new Color(0, 0, 121));
        ThongTinSinhVien.setBorder(new EmptyBorder(5, 5, 5, 5));
        ThongTinSinhVien.setLayout(null);
        setContentPane(ThongTinSinhVien);

        // Panel tiêu đề
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 204, 0));
        panel.setBounds(0, 0, 881, 57);
        panel.setLayout(null);
        ThongTinSinhVien.add(panel);

        JLabel lblTitle = new JLabel("THÔNG TIN SINH VIÊN");
        lblTitle.setBounds(284, 11, 302, 37);
        lblTitle.setForeground(new Color(0, 0, 0));
        lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
        panel.add(lblTitle);

        // Avatar
        avata = new JLabel();
        avata.setBounds(99, 95, 224, 227);
        avata.setBorder(new LineBorder(Color.WHITE, 3));
        avata.setBackground(Color.WHITE);
        avata.setOpaque(true);
        ThongTinSinhVien.add(avata);

        // Các trường thông tin
        HoTen_text1 = new JTextField();
        HoTen_text1.setBounds(539, 95, 310, 30);
        HoTen_text1.setEditable(false);
        HoTen_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ThongTinSinhVien.add(HoTen_text1);

        MSSV_text1 = new JTextField();
        MSSV_text1.setBounds(539, 146, 310, 30);
        MSSV_text1.setEditable(false);
        MSSV_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ThongTinSinhVien.add(MSSV_text1);

        Lop_comboBox_1 = new JComboBox<>(new String[]{"", "D21CQVTHI-01", "D21CQVTVT-01", "D21CQVT-01N"});
        Lop_comboBox_1.setBounds(539, 197, 310, 30);
        Lop_comboBox_1.setEnabled(false);
        Lop_comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ThongTinSinhVien.add(Lop_comboBox_1);

        NgaySinh_text = new JDateChooser();
        NgaySinh_text.setBounds(539, 248, 150, 30);
        NgaySinh_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        NgaySinh_text.setDateFormatString("dd/MM/yyyy");
        NgaySinh_text.setEnabled(false);
        ThongTinSinhVien.add(NgaySinh_text);

        GioiTinh_ComboBox = new JComboBox<>(new String[]{"", "Nam", "Nữ"});
        GioiTinh_ComboBox.setBounds(793, 248, 56, 30);
        GioiTinh_ComboBox.setEnabled(false);
        GioiTinh_ComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ThongTinSinhVien.add(GioiTinh_ComboBox);

        Email_text1 = new JTextField();
        Email_text1.setBounds(539, 299, 310, 30);
        Email_text1.setEditable(false);
        Email_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ThongTinSinhVien.add(Email_text1);

        MonHoc_comboBox1 = new JComboBox<>(new String[]{"", "Cảm Biến", "Java", "Android"});
        MonHoc_comboBox1.setBounds(539, 350, 310, 30);
        MonHoc_comboBox1.setEnabled(false);
        MonHoc_comboBox1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ThongTinSinhVien.add(MonHoc_comboBox1);

        SoTin_text1 = new JTextField();
        SoTin_text1.setBounds(539, 401, 310, 30);
        SoTin_text1.setEditable(false);
        SoTin_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ThongTinSinhVien.add(SoTin_text1);

        MaMon_text1 = new JTextField();
        MaMon_text1.setBounds(539, 452, 310, 30);
        MaMon_text1.setEditable(false);
        MaMon_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ThongTinSinhVien.add(MaMon_text1);

        ThoiGian_text1 = new JTextField();
        ThoiGian_text1.setBounds(539, 503, 310, 30);
        ThoiGian_text1.setEditable(false);
        ThoiGian_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ThongTinSinhVien.add(ThoiGian_text1);

        // Các nhãn
        JLabel HoTen_Label = new JLabel("HỌ TÊN :");
        HoTen_Label.setForeground(Color.WHITE);
        HoTen_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        HoTen_Label.setBounds(448, 95, 81, 29);
        ThongTinSinhVien.add(HoTen_Label);

        JLabel MSSV_Label = new JLabel("MSSV :");
        MSSV_Label.setForeground(Color.WHITE);
        MSSV_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        MSSV_Label.setBounds(448, 146, 81, 29);
        ThongTinSinhVien.add(MSSV_Label);

        JLabel Lop_Label = new JLabel("LỚP :");
        Lop_Label.setForeground(Color.WHITE);
        Lop_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Lop_Label.setBounds(448, 197, 81, 29);
        ThongTinSinhVien.add(Lop_Label);

        JLabel NgaySinh_label = new JLabel("NGÀY SINH:");
        NgaySinh_label.setForeground(Color.WHITE);
        NgaySinh_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        NgaySinh_label.setBounds(448, 248, 103, 29);
        ThongTinSinhVien.add(NgaySinh_label);

        JLabel GioiTinh_label = new JLabel("GIỚI TÍNH:");
        GioiTinh_label.setForeground(Color.WHITE);
        GioiTinh_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        GioiTinh_label.setBounds(700, 248, 93, 29);
        ThongTinSinhVien.add(GioiTinh_label);

        JLabel Email_Label = new JLabel("EMAIL :");
        Email_Label.setForeground(Color.WHITE);
        Email_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Email_Label.setBounds(448, 299, 81, 29);
        ThongTinSinhVien.add(Email_Label);

        JLabel MonHoc_Label = new JLabel("MÔN HỌC :");
        MonHoc_Label.setForeground(Color.WHITE);
        MonHoc_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        MonHoc_Label.setBounds(448, 350, 93, 29);
        ThongTinSinhVien.add(MonHoc_Label);

        JLabel SoTin_Label = new JLabel("SỐ TÍN:");
        SoTin_Label.setForeground(Color.WHITE);
        SoTin_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        SoTin_Label.setBounds(448, 401, 81, 29);
        ThongTinSinhVien.add(SoTin_Label);

        JLabel MaMon_Label = new JLabel("MÃ MÔN :");
        MaMon_Label.setForeground(Color.WHITE);
        MaMon_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        MaMon_Label.setBounds(448, 452, 81, 29);
        ThongTinSinhVien.add(MaMon_Label);

        JLabel ThoiGian_Label = new JLabel("THỜI GIAN:");
        ThoiGian_Label.setForeground(Color.WHITE);
        ThoiGian_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        ThoiGian_Label.setBounds(448, 503, 93, 29);
        ThongTinSinhVien.add(ThoiGian_Label);

        // Các nút
        JButton Sua_button = new JButton("SỬA");
        Sua_button.setBounds(61, 360, 120, 44);
        Sua_button.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Sua_button.setBackground(new Color(50, 150, 255));
        Sua_button.setForeground(Color.BLACK);
        Sua_button.setBorder(new LineBorder(Color.WHITE, 1));
        ThongTinSinhVien.add(Sua_button);

        Sua_button.addActionListener(e -> {
            HoTen_text1.setEditable(true);
            MSSV_text1.setEditable(true);
            NgaySinh_text.setEnabled(true);
            GioiTinh_ComboBox.setEnabled(true);
            Email_text1.setEditable(true);
            SoTin_text1.setEditable(true);
            MaMon_text1.setEditable(true);
            ThoiGian_text1.setEditable(true);
            Lop_comboBox_1.setEnabled(true);
            MonHoc_comboBox1.setEnabled(true);
        });

        JButton Luu_button = new JButton("LƯU");
        Luu_button.setBounds(252, 360, 120, 44);
        Luu_button.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Luu_button.setBackground(new Color(50, 150, 255));
        Luu_button.setForeground(Color.BLACK);
        Luu_button.setBorder(new LineBorder(Color.WHITE, 1));
        ThongTinSinhVien.add(Luu_button);

        Luu_button.addActionListener(e -> {
            if (HoTen_text1.getText().trim().isEmpty() ||
                MSSV_text1.getText().trim().isEmpty() ||
                NgaySinh_text.getDate() == null ||
                GioiTinh_ComboBox.getSelectedIndex() == 0 ||
                Email_text1.getText().trim().isEmpty() ||
                SoTin_text1.getText().trim().isEmpty() ||
                MaMon_text1.getText().trim().isEmpty() ||
                ThoiGian_text1.getText().trim().isEmpty() ||
                Lop_comboBox_1.getSelectedIndex() == 0 ||
                MonHoc_comboBox1.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ tất cả các thông tin!", 
                    "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thành công!", 
                    "Thành công", JOptionPane.INFORMATION_MESSAGE);
                
                HoTen_text1.setEditable(false);
                MSSV_text1.setEditable(false);
                NgaySinh_text.setEnabled(false);
                GioiTinh_ComboBox.setEnabled(false);
                Email_text1.setEditable(false);
                SoTin_text1.setEditable(false);
                MaMon_text1.setEditable(false);
                ThoiGian_text1.setEditable(false);
                Lop_comboBox_1.setEnabled(false);
                MonHoc_comboBox1.setEnabled(false);
                
                updateAvatar((String) GioiTinh_ComboBox.getSelectedItem());
            }
        });

        JButton NopBaiTap_button = new JButton("NỘP BÀI TẬP");
        NopBaiTap_button.setBounds(139, 471, 162, 44);
        NopBaiTap_button.setFont(new Font("Times New Roman", Font.BOLD, 15));
        NopBaiTap_button.setBackground(new Color(255, 165, 80));
        NopBaiTap_button.setForeground(Color.BLACK);
        NopBaiTap_button.setBorder(new LineBorder(Color.WHITE, 1));
        ThongTinSinhVien.add(NopBaiTap_button);

        NopBaiTap_button.addActionListener(e -> {
            BaiTap baiTapFrame = new BaiTap();
            baiTapFrame.setVisible(true);
        });

        // Xử lý khi chọn môn học
        MonHoc_comboBox1.addItemListener(e -> {
            String selectedSubject = (String) MonHoc_comboBox1.getSelectedItem();
            if ("Cảm Biến".equals(selectedSubject)) {
                MaMon_text1.setText("iot");
                SoTin_text1.setText("3");
                ThoiGian_text1.setText("4/5-6-8");
            } else if ("Java".equals(selectedSubject)) {
                MaMon_text1.setText("jv");
                SoTin_text1.setText("2");
                ThoiGian_text1.setText("6/7-7/8");
            } else if ("Android".equals(selectedSubject)) {
                MaMon_text1.setText("ad");
                SoTin_text1.setText("3");
                ThoiGian_text1.setText("7/7-7/9");
            } else {
                MaMon_text1.setText("");
                SoTin_text1.setText("");
                ThoiGian_text1.setText("");
            }
        });
    }

    private void updateAvatar(String gioiTinh) {
        String avatarPath = "/Icon/avata_nam.png";  // Default avatar
        if ("Nữ".equalsIgnoreCase(gioiTinh)) {
            avatarPath = "/Icon/avata_nu.png";
        } else if ("Nam".equalsIgnoreCase(gioiTinh)) {
            avatarPath = "/Icon/avata_nam.png";
        }
        
        try {
            ImageIcon avatarIcon = new ImageIcon(getClass().getResource(avatarPath));
            Image scaledImage = avatarIcon.getImage().getScaledInstance(224, 227, Image.SCALE_SMOOTH);
            avata.setIcon(new ImageIcon(scaledImage));
        } catch (Exception e) {
            avata.setText("Avatar not found");
            avata.setHorizontalAlignment(JLabel.CENTER);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ThongTinSinhVien frame = new ThongTinSinhVien();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}