package QuanLyLopHoc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThongTinSinhVien extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel ThongTinSinhVien;
    private JTextField MSSV_text1;
    private JTextField HoTen_text1;
    private JTextField MaMon_text1;
    private JTextField SoTin_text1; // Số tín
    private JTextField NgaySinh_text;
    private JTextField GioiTinh_text;
    private JTextField Email_text1;    // Email
    private JTextField ThoiGian_text1;  // Thời gian
    private JComboBox<String> MonHoc_comboBox1;   // Môn học
    private JComboBox<String> Lop_comboBox_1; // Lớp

    // Constructor mặc định
    public ThongTinSinhVien() {
        initialize();
    }

    // Constructor nhận dữ liệu từ SinhVien
    public ThongTinSinhVien(String hoTen, String mssv, String lop, String ngaySinh, String gioiTinh, String email, String monHoc, String maMon, String soTin, String thoiGian) {
        initialize();
        // Gán dữ liệu vào các trường
        HoTen_text1.setText(hoTen);
        MSSV_text1.setText(mssv);
        Lop_comboBox_1.setSelectedItem(lop); // Lớp
        NgaySinh_text.setText(ngaySinh);
        GioiTinh_text.setText(gioiTinh);
        Email_text1.setText(email);       // Email
        MonHoc_comboBox1.setSelectedItem(monHoc); // Môn học
        MaMon_text1.setText(maMon);
        SoTin_text1.setText(soTin);     // Số tín
        ThoiGian_text1.setText(thoiGian);  // Thời gian
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 895, 652);
        ThongTinSinhVien = new JPanel();
        ThongTinSinhVien.setBackground(new Color(0, 0, 121));
        ThongTinSinhVien.setBorder(new EmptyBorder(5, 5, 5, 5));
        ThongTinSinhVien.setLayout(null);
        setContentPane(ThongTinSinhVien);

        JLabel lblTitle = new JLabel("THÔNG TIN SINH VIÊN");
        lblTitle.setForeground(new Color(255, 255, 255));
        lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblTitle.setBounds(283, 22, 302, 37);
        ThongTinSinhVien.add(lblTitle);

        // Khởi tạo các trường JTextField và JComboBox
        HoTen_text1 = new JTextField();
        HoTen_text1.setBounds(539, 95, 310, 30);
        HoTen_text1.setEditable(false); // Khóa ban đầu
        ThongTinSinhVien.add(HoTen_text1);
        HoTen_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        HoTen_text1.setColumns(10);

        MSSV_text1 = new JTextField();
        MSSV_text1.setBounds(540, 146, 309, 30);
        MSSV_text1.setEditable(false);
        ThongTinSinhVien.add(MSSV_text1);
        MSSV_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        MSSV_text1.setColumns(10);

        NgaySinh_text = new JTextField();
        NgaySinh_text.setBounds(544, 260, 120, 30);
        NgaySinh_text.setEditable(false);
        ThongTinSinhVien.add(NgaySinh_text);
        NgaySinh_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        NgaySinh_text.setColumns(10);

        GioiTinh_text = new JTextField();
        GioiTinh_text.setBounds(793, 260, 56, 30);
        GioiTinh_text.setEditable(false);
        ThongTinSinhVien.add(GioiTinh_text);
        GioiTinh_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        GioiTinh_text.setColumns(10);

        Email_text1 = new JTextField(); // Email
        Email_text1.setBounds(538, 317, 311, 30);
        Email_text1.setEditable(false);
        ThongTinSinhVien.add(Email_text1);
        Email_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Email_text1.setColumns(10);

        SoTin_text1 = new JTextField(); // Số tín
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

        ThoiGian_text1 = new JTextField(); // Thời gian
        ThoiGian_text1.setBounds(537, 560, 312, 30);
        ThoiGian_text1.setEditable(false);
        ThongTinSinhVien.add(ThoiGian_text1);
        ThoiGian_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ThoiGian_text1.setColumns(10);

        Lop_comboBox_1 = new JComboBox<>(new String[]{"", "D21CQVTHI-01", "D21CQVTVT-01", "D21CQVT-01N"});
        Lop_comboBox_1.setBounds(539, 203, 309, 30);
        Lop_comboBox_1.setEnabled(false); // Khóa ban đầu
        ThongTinSinhVien.add(Lop_comboBox_1);

        MonHoc_comboBox1 = new JComboBox<>(new String[]{"", "Cảm Biến", "Java", "Android"});
        MonHoc_comboBox1.setBounds(539, 376, 309, 30);
        MonHoc_comboBox1.setEnabled(false);
        ThongTinSinhVien.add(MonHoc_comboBox1);
     // Xử lý khi chọn môn học
        MonHoc_comboBox1.addItemListener(e -> {
            String selectedSubject = (String) MonHoc_comboBox1.getSelectedItem();
            if ("Cảm Biến".equals(selectedSubject)) {
            	MaMon_text1.setText("iot");         // Mã môn
                SoTin_text1.setText("3");           // Số tín
                ThoiGian_text1.setText("4/5-6-8");       // Thời gian
            } else if ("Java".equals(selectedSubject)) {
            	MaMon_text1.setText("jv");          // Mã môn
                SoTin_text1.setText("2");           // Số tín
                ThoiGian_text1.setText("6/7-7/8");       // Thời gian
            } else if ("Android".equals(selectedSubject)) {
            	MaMon_text1.setText("ad");          // Mã môn
                SoTin_text1.setText("3");           // Số tín
                ThoiGian_text1.setText("7/7-7/9");       // Thời gian
            } else {
            	MaMon_text1.setText("");            // Xóa nếu không chọn
                SoTin_text1.setText("");
                ThoiGian_text1.setText("");
            }
        });

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
        Sua_button_1.setBackground(new Color(238, 119, 0));
        ThongTinSinhVien.add(Sua_button_1);
        // Thêm hành động cho nút "SỬA"
        Sua_button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HoTen_text1.setEditable(true);
                MSSV_text1.setEditable(true);
                NgaySinh_text.setEditable(true);
                GioiTinh_text.setEditable(true);
                Email_text1.setEditable(true);    // Email
                SoTin_text1.setEditable(true);  // Số tín
                MaMon_text1.setEditable(true);
                ThoiGian_text1.setEditable(true);  // Thời gian
                Lop_comboBox_1.setEnabled(true);    // Lớp
                MonHoc_comboBox1.setEnabled(true);      // Môn học
            }
        });

        JButton Luu_button_1_1 = new JButton("LƯU");
        Luu_button_1_1.setBounds(252, 360, 120, 44);
        Luu_button_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Luu_button_1_1.setBackground(new Color(238, 119, 0));
        ThongTinSinhVien.add(Luu_button_1_1);
     // Thêm hành động cho nút "LƯU"
        Luu_button_1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Kiểm tra xem tất cả các trường có được điền đầy đủ không
                if (!HoTen_text1.getText().trim().isEmpty() &&
                    !MSSV_text1.getText().trim().isEmpty() &&
                    !NgaySinh_text.getText().trim().isEmpty() &&
                    !GioiTinh_text.getText().trim().isEmpty() &&
                    !Email_text1.getText().trim().isEmpty() &&
                    !SoTin_text1.getText().trim().isEmpty() &&
                    !MaMon_text1.getText().trim().isEmpty() &&
                    !ThoiGian_text1.getText().trim().isEmpty() &&
                    Lop_comboBox_1.getSelectedIndex() != 0 && // Không chọn ""
                    MonHoc_comboBox1.getSelectedIndex() != 0) { // Không chọn ""
                    
                    // Hiển thị thông báo sửa thành công
                    JOptionPane.showMessageDialog(ThongTinSinhVien, "Sửa thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                    
                    // Khóa các trường sau khi lưu
                    HoTen_text1.setEditable(false);
                    MSSV_text1.setEditable(false);
                    NgaySinh_text.setEditable(false);
                    GioiTinh_text.setEditable(false);
                    Email_text1.setEditable(false);
                    SoTin_text1.setEditable(false);
                    MaMon_text1.setEditable(false);
                    ThoiGian_text1.setEditable(false);
                    Lop_comboBox_1.setEnabled(false);
                    MonHoc_comboBox1.setEnabled(false);
                } else {
                    // Hiển thị thông báo lỗi nếu thiếu thông tin
                    JOptionPane.showMessageDialog(ThongTinSinhVien, "Vui lòng điền đầy đủ tất cả các thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton NopBaiTap_button_2_1 = new JButton("NỘP BÀI TẬP");
        NopBaiTap_button_2_1.setBounds(139, 471, 162, 44);
        NopBaiTap_button_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        NopBaiTap_button_2_1.setBackground(new Color(238, 119, 0));
        ThongTinSinhVien.add(NopBaiTap_button_2_1);
       //hanh dong nut nop
        NopBaiTap_button_2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tạo và hiển thị cửa sổ BaiTap
                BaiTap baiTapFrame = new BaiTap();
                baiTapFrame.setVisible(true);
            }
        });

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