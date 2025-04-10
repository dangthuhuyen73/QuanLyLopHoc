package QuanLyLopHoc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThongTinSinhVien extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel ThongTinSinhVien;
    private JTextField MSSV_text1;
    private JTextField HoTen_text1;
    private JTextField MaMon_text1;
    private JTextField SoTin_text1;
    private JTextField NgaySinh_text;
    private JComboBox<String> GioiTinh_ComboBox; // Sử dụng JComboBox cho giới tính
    private JTextField Email_text1;
    private JTextField ThoiGian_text1;
    private JComboBox<String> MonHoc_comboBox1;
    private JComboBox<String> Lop_comboBox_1;
    private JLabel avata;

    // Constructor mặc định
    public ThongTinSinhVien() {
        initialize();
    }

    // Constructor nhận dữ liệu từ SinhVien
    public ThongTinSinhVien(String hoTen, String mssv, String lop, String ngaySinh, String gioiTinh, String email, String monHoc, String maMon, String soTin, String thoiGian) {
        initialize();
        HoTen_text1.setText(hoTen);
        MSSV_text1.setText(mssv);
        Lop_comboBox_1.setSelectedItem(lop);
        NgaySinh_text.setText(ngaySinh);
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

        // Khởi tạo các trường JTextField và JComboBox
        HoTen_text1 = new JTextField();
        HoTen_text1.setBounds(539, 95, 310, 30);
        HoTen_text1.setEditable(false);
        ThongTinSinhVien.add(HoTen_text1);
        HoTen_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        HoTen_text1.setColumns(10);

        MSSV_text1 = new JTextField();
        MSSV_text1.setBounds(540, 146, 309, 30);
        MSSV_text1.setEditable(false);
        ThongTinSinhVien.add(MSSV_text1);
        MSSV_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        MSSV_text1.setColumns(10);

        Lop_comboBox_1 = new JComboBox<>(new String[]{"", "D21CQVTHI-01", "D21CQVTVT-01", "D21CQVT-01N"});
        Lop_comboBox_1.setBounds(539, 203, 309, 30);
        Lop_comboBox_1.setEnabled(false);
        ThongTinSinhVien.add(Lop_comboBox_1);

        NgaySinh_text = new JTextField();
        NgaySinh_text.setBounds(544, 260, 120, 30);
        NgaySinh_text.setEditable(false);
        ThongTinSinhVien.add(NgaySinh_text);
        NgaySinh_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        NgaySinh_text.setColumns(10);

        GioiTinh_ComboBox = new JComboBox<>(new String[]{"", "Nam", "Nữ"});
        GioiTinh_ComboBox.setBounds(793, 260, 56, 30);
        GioiTinh_ComboBox.setEnabled(false);
        ThongTinSinhVien.add(GioiTinh_ComboBox);

        Email_text1 = new JTextField();
        Email_text1.setBounds(538, 317, 311, 30);
        Email_text1.setEditable(false);
        ThongTinSinhVien.add(Email_text1);
        Email_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Email_text1.setColumns(10);

        MonHoc_comboBox1 = new JComboBox<>(new String[]{"", "Cảm Biến", "Java", "Android"});
        MonHoc_comboBox1.setBounds(539, 376, 309, 30);
        MonHoc_comboBox1.setEnabled(false);
        ThongTinSinhVien.add(MonHoc_comboBox1);

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

        SoTin_text1 = new JTextField();
        SoTin_text1.setBounds(538, 436, 311, 30);
        SoTin_text1.setEditable(false);
        ThongTinSinhVien.add(SoTin_text1);
        SoTin_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        SoTin_text1.setColumns(10);

        MaMon_text1 = new JTextField();
        MaMon_text1.setBounds(537, 498, 312, 30);
        MaMon_text1.setEditable(false);
        ThongTinSinhVien.add(MaMon_text1);
        MaMon_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        MaMon_text1.setColumns(10);

        ThoiGian_text1 = new JTextField();
        ThoiGian_text1.setBounds(537, 560, 312, 30);
        ThoiGian_text1.setEditable(false);
        ThongTinSinhVien.add(ThoiGian_text1);
        ThoiGian_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ThoiGian_text1.setColumns(10);

        // Các nhãn (Label)
        JLabel HoTen_Label = new JLabel("HỌ TÊN :");
        HoTen_Label.setForeground(new Color(255, 255, 255));
        HoTen_Label.setBounds(448, 96, 81, 29);
        ThongTinSinhVien.add(HoTen_Label);
        HoTen_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel MSSV_Label = new JLabel("MSSV  :");
        MSSV_Label.setForeground(new Color(255, 255, 255));
        MSSV_Label.setBounds(449, 147, 81, 29);
        ThongTinSinhVien.add(MSSV_Label);
        MSSV_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel Lop_Label = new JLabel("LỚP :");
        Lop_Label.setForeground(new Color(255, 255, 255));
        Lop_Label.setBounds(448, 203, 81, 29);
        ThongTinSinhVien.add(Lop_Label);
        Lop_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel NgaySinh_label = new JLabel("NGÀY SINH:");
        NgaySinh_label.setForeground(new Color(255, 255, 255));
        NgaySinh_label.setBounds(448, 261, 103, 29);
        ThongTinSinhVien.add(NgaySinh_label);
        NgaySinh_label.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel NgaySinh_label_2 = new JLabel("GIỚI TÍNH:");
        NgaySinh_label_2.setForeground(new Color(255, 255, 255));
        NgaySinh_label_2.setBounds(690, 261, 93, 29);
        ThongTinSinhVien.add(NgaySinh_label_2);
        NgaySinh_label_2.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel Email_Label_1 = new JLabel("EMAIL :");
        Email_Label_1.setForeground(new Color(255, 255, 255));
        Email_Label_1.setBounds(449, 318, 66, 29);
        ThongTinSinhVien.add(Email_Label_1);
        Email_Label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel HoTen_Label_1 = new JLabel("MÔN HỌC :");
        HoTen_Label_1.setForeground(new Color(255, 255, 255));
        HoTen_Label_1.setBounds(448, 376, 93, 29);
        ThongTinSinhVien.add(HoTen_Label_1);
        HoTen_Label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel MSSV_Label_1 = new JLabel("SỐ TÍN:");
        MSSV_Label_1.setForeground(new Color(255, 255, 255));
        MSSV_Label_1.setBounds(448, 437, 81, 29);
        ThongTinSinhVien.add(MSSV_Label_1);
        MSSV_Label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel Lop_Label_1 = new JLabel("MÃ MÔN :");
        Lop_Label_1.setForeground(new Color(255, 255, 255));
        Lop_Label_1.setBounds(448, 499, 81, 29);
        ThongTinSinhVien.add(Lop_Label_1);
        Lop_Label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel Sdt_Label_1_1 = new JLabel("THỜI GIAN:");
        Sdt_Label_1_1.setForeground(new Color(255, 255, 255));
        Sdt_Label_1_1.setBounds(448, 561, 93, 29);
        ThongTinSinhVien.add(Sdt_Label_1_1);
        Sdt_Label_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));

        // Các nút
        JButton Sua_button_1 = new JButton("SỬA");
        Sua_button_1.setBounds(61, 360, 120, 44);
        Sua_button_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Sua_button_1.setBackground(new Color(50, 150, 255)); // Màu xanh sáng
        Sua_button_1.setForeground(new Color(0, 0, 0)); // Chữ màu trắng
        Sua_button_1.setBorder(new LineBorder(Color.WHITE, 1)); // Viền trắng
        ThongTinSinhVien.add(Sua_button_1);

        Sua_button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HoTen_text1.setEditable(true);
                MSSV_text1.setEditable(true);
                NgaySinh_text.setEditable(true);
                GioiTinh_ComboBox.setEnabled(true);
                Email_text1.setEditable(true);
                SoTin_text1.setEditable(true);
                MaMon_text1.setEditable(true);
                ThoiGian_text1.setEditable(true);
                Lop_comboBox_1.setEnabled(true);
                MonHoc_comboBox1.setEnabled(true);
            }
        });

        JButton Luu_button_1_1 = new JButton("LƯU");
        Luu_button_1_1.setBounds(252, 360, 120, 44);
        Luu_button_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Luu_button_1_1.setBackground(new Color(50, 150, 255)); // Màu xanh sáng
        Luu_button_1_1.setForeground(new Color(0, 0, 0)); // Chữ màu trắng
        Luu_button_1_1.setBorder(new LineBorder(Color.WHITE, 1)); // Viền trắng
        ThongTinSinhVien.add(Luu_button_1_1);

        Luu_button_1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!HoTen_text1.getText().trim().isEmpty() &&
                    !MSSV_text1.getText().trim().isEmpty() &&
                    !NgaySinh_text.getText().trim().isEmpty() &&
                    GioiTinh_ComboBox.getSelectedIndex() != 0 &&
                    !Email_text1.getText().trim().isEmpty() &&
                    !SoTin_text1.getText().trim().isEmpty() &&
                    !MaMon_text1.getText().trim().isEmpty() &&
                    !ThoiGian_text1.getText().trim().isEmpty() &&
                    Lop_comboBox_1.getSelectedIndex() != 0 &&
                    MonHoc_comboBox1.getSelectedIndex() != 0) {

                    JOptionPane.showMessageDialog(ThongTinSinhVien, "Sửa thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);

                    HoTen_text1.setEditable(false);
                    MSSV_text1.setEditable(false);
                    NgaySinh_text.setEditable(false);
                    GioiTinh_ComboBox.setEnabled(false);
                    Email_text1.setEditable(false);
                    SoTin_text1.setEditable(false);
                    MaMon_text1.setEditable(false);
                    ThoiGian_text1.setEditable(false);
                    Lop_comboBox_1.setEnabled(false);
                    MonHoc_comboBox1.setEnabled(false);

                    updateAvatar((String) GioiTinh_ComboBox.getSelectedItem());
                } else {
                    JOptionPane.showMessageDialog(ThongTinSinhVien, "Vui lòng điền đầy đủ tất cả các thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton NopBaiTap_button_2_1 = new JButton("NỘP BÀI TẬP");
        NopBaiTap_button_2_1.setBounds(139, 471, 162, 44);
        NopBaiTap_button_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        NopBaiTap_button_2_1.setBackground(new Color(255, 165, 80)); 
        NopBaiTap_button_2_1.setForeground(new Color(0, 0, 0)); // Chữ màu trắng
        NopBaiTap_button_2_1.setBorder(new LineBorder(Color.WHITE, 1)); // Viền trắng
        ThongTinSinhVien.add(NopBaiTap_button_2_1);
        
        NopBaiTap_button_2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BaiTap baiTapFrame = new BaiTap();
                baiTapFrame.setVisible(true);
            }
        });

        avata = new JLabel();
        avata.setBounds(99, 95, 224, 227);
        avata.setBorder(new LineBorder(Color.WHITE, 3));
        avata.setBackground(Color.WHITE);
        avata.setOpaque(true);
        ThongTinSinhVien.add(avata);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 204, 0));
        panel.setBounds(0, 0, 881, 57);
        panel.setLayout(null);
        ThongTinSinhVien.add(panel);

        JLabel lblTitle = new JLabel("THÔNG TIN SINH VIÊN");
        lblTitle.setBounds(284, 11, 302, 37);
        panel.add(lblTitle);
        lblTitle.setForeground(new Color(0, 0, 0));
        lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
    }

    private void updateAvatar(String gioiTinh) {
        String avatarPath;
        if ("Nữ".equalsIgnoreCase(gioiTinh)) {
            avatarPath = "/Icon/avata_nu.png";
        } else if ("Nam".equalsIgnoreCase(gioiTinh)) {
            avatarPath = "/Icon/avata_nam.png";
        } else {
            avatarPath = "/Icon/avata_nam.png";
        }

        ImageIcon avatarIcon = new ImageIcon(getClass().getResource(avatarPath));
        Image scaledImage = avatarIcon.getImage().getScaledInstance(224, 227, Image.SCALE_SMOOTH);
        avata.setIcon(new ImageIcon(scaledImage));
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