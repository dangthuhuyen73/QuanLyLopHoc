package QuanLyLopHoc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;


public class SinhVien extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField HoTen_text;
    private JTextField Mssv_text;
    private JTextField Email_text;
    private JDateChooser NgaySinh;
    private JTextField ThoiGian_text;
    private JTextField MaMon_text;
    private JTextField SoTin_text;
    private JComboBox<String> Lop_ComboBox;
    private JComboBox<String> GioiTinh_ComboBox;
    private JComboBox<String> MonHoc_ComboBox;

    public SinhVien() {
        setBackground(new Color(0, 0, 121));
        setBounds(81, 11, 895, 652);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("SINH VIÊN");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(10, 29, 132, 43);
        add(lblNewLabel);

        // Panel nhập thông tin sinh viên
        JPanel panel = new JPanel();
        panel.setBounds(12, 85, 432, 448);
        add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_2_1 = new JLabel("NHẬP THÔNG TIN SINH VIÊN");
        lblNewLabel_2_1.setForeground(new Color(0, 0, 121));
        lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel_2_1.setBounds(51, 0, 299, 69);
        panel.add(lblNewLabel_2_1);

        JLabel HoTen_Label = new JLabel("HỌ TÊN :");
        HoTen_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        HoTen_Label.setBounds(18, 74, 81, 29);
        panel.add(HoTen_Label);

        JLabel MSSV_Label = new JLabel("MSSV  :");
        MSSV_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        MSSV_Label.setBounds(19, 127, 81, 29);
        panel.add(MSSV_Label);

        JLabel Lop_Label = new JLabel("LỚP :");
        Lop_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Lop_Label.setBounds(18, 187, 81, 29);
        panel.add(Lop_Label);

        JLabel NgaySinh_label = new JLabel("NGÀY SINH:");
        NgaySinh_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        NgaySinh_label.setBounds(18, 250, 103, 29);
        panel.add(NgaySinh_label);

        JLabel GiowiTinh_Label = new JLabel("GIỚI TÍNH:");
        GiowiTinh_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        GiowiTinh_Label.setBounds(256, 250, 94, 29);
        panel.add(GiowiTinh_Label);

        JLabel Email_Label = new JLabel("EMAIL :");
        Email_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Email_Label.setBounds(18, 314, 81, 29);
        panel.add(Email_Label);

        HoTen_text = new JTextField();
        HoTen_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        HoTen_text.setBounds(98, 72, 310, 30);
        panel.add(HoTen_text);
        HoTen_text.setColumns(10);

        Mssv_text = new JTextField();
        Mssv_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Mssv_text.setColumns(10);
        Mssv_text.setBounds(98, 127, 310, 30);
        panel.add(Mssv_text);

        Email_text = new JTextField();
        Email_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Email_text.setColumns(10);
        Email_text.setBounds(98, 314, 310, 30);
        panel.add(Email_text);

        NgaySinh = new JDateChooser();
        NgaySinh.setBounds(112, 249, 130, 30);
        NgaySinh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        NgaySinh.setDateFormatString("dd/MM/yyyy");
        panel.add(NgaySinh);

        String[] items = {"", "Nam", "Nữ"};
        GioiTinh_ComboBox = new JComboBox<>(items);
        GioiTinh_ComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        GioiTinh_ComboBox.setBounds(343, 250, 65, 29);
        panel.add(GioiTinh_ComboBox);

        String[] items2 = {"", "D21CQVTHI-01", "D21CQVTVT-01", "D21CQVT-01N"};
        Lop_ComboBox = new JComboBox<>(items2);
        Lop_ComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Lop_ComboBox.setBounds(98, 187, 310, 29);
        panel.add(Lop_ComboBox);

        // Panel nhập thông tin khóa học
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(454, 85, 432, 448);
        add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_2_1_1 = new JLabel("NHẬP THÔNG TIN KHÓA HỌC");
        lblNewLabel_2_1_1.setForeground(new Color(0, 0, 121));
        lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel_2_1_1.setBounds(66, 0, 299, 69);
        panel_1.add(lblNewLabel_2_1_1);

        JLabel HoTen_Label_1 = new JLabel("MÔN HỌC :");
        HoTen_Label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        HoTen_Label_1.setBounds(24, 71, 103, 29);
        panel_1.add(HoTen_Label_1);

        ThoiGian_text = new JTextField();
        ThoiGian_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ThoiGian_text.setColumns(10);
        ThoiGian_text.setBounds(114, 276, 296, 30);
        panel_1.add(ThoiGian_text);

        MaMon_text = new JTextField();
        MaMon_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        MaMon_text.setColumns(10);
        MaMon_text.setBounds(114, 138, 296, 30);
        panel_1.add(MaMon_text);

        JLabel Lop_Label_1 = new JLabel("MÃ MÔN :");
        Lop_Label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Lop_Label_1.setBounds(24, 139, 81, 29);
        panel_1.add(Lop_Label_1);

        SoTin_text = new JTextField();
        SoTin_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        SoTin_text.setColumns(10);
        SoTin_text.setBounds(113, 205, 296, 30);
        panel_1.add(SoTin_text);

        JLabel Sdt_Label_1 = new JLabel("THỜI GIAN:");
        Sdt_Label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Sdt_Label_1.setBounds(24, 277, 93, 29);
        panel_1.add(Sdt_Label_1);

        MonHoc_ComboBox = new JComboBox<>();
        MonHoc_ComboBox.setModel(new DefaultComboBoxModel<>(new String[] {"", "Cảm Biến", "Java", "Android"}));
        MonHoc_ComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        MonHoc_ComboBox.setBounds(114, 71, 296, 29);
        panel_1.add(MonHoc_ComboBox);

        JLabel SoTin_Label_1_1 = new JLabel("SỐ TÍN :");
        SoTin_Label_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        SoTin_Label_1_1.setBounds(24, 205, 103, 29);
        panel_1.add(SoTin_Label_1_1);

        MonHoc_ComboBox.addItemListener(e -> {
            String selectedSubject = (String) MonHoc_ComboBox.getSelectedItem();
            if ("Cảm Biến".equals(selectedSubject)) {
                MaMon_text.setText("iot");
                SoTin_text.setText("3");
                ThoiGian_text.setText("4/5-6-8");
            } else if ("Java".equals(selectedSubject)) {
                MaMon_text.setText("jv");
                SoTin_text.setText("2");
                ThoiGian_text.setText("6/7-7/8");
            } else if ("Android".equals(selectedSubject)) {
                MaMon_text.setText("ad");
                SoTin_text.setText("3");
                ThoiGian_text.setText("7/7-7/9");
            } else {
                MaMon_text.setText("");
                SoTin_text.setText("");
                ThoiGian_text.setText("");
            }
        });

        // Nút LƯU
        JButton Luu_button = new JButton("LƯU");
        Luu_button.setBackground(new Color(255, 140, 0));
        Luu_button.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Luu_button.setBounds(226, 563, 120, 44);
        add(Luu_button);

        Luu_button.addActionListener(e -> {
            if (HoTen_text.getText().trim().isEmpty() ||
                Mssv_text.getText().trim().isEmpty() ||
                Lop_ComboBox.getSelectedIndex() == 0 ||
                NgaySinh.getDate() == null ||
                GioiTinh_ComboBox.getSelectedIndex() == 0 ||
                Email_text.getText().trim().isEmpty() ||
                MonHoc_ComboBox.getSelectedIndex() == 0 ||
                MaMon_text.getText().trim().isEmpty() ||
                SoTin_text.getText().trim().isEmpty() ||
                ThoiGian_text.getText().trim().isEmpty()) {
                
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ tất cả các thông tin!", "Lỗi",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Lưu thông tin thành công!", "Thành công",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Nút XUẤT
        JButton xuat_button = new JButton("XUẤT");
        xuat_button.setBackground(new Color(255, 215, 0));
        xuat_button.setFont(new Font("Times New Roman", Font.BOLD, 15));
        xuat_button.setBounds(572, 563, 120, 44);
        xuat_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        add(xuat_button);

        xuat_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Kiểm tra các trường bắt buộc
                if (HoTen_text.getText().trim().isEmpty() ||
                    Mssv_text.getText().trim().isEmpty() ||
                    Lop_ComboBox.getSelectedIndex() == 0 ||
                    NgaySinh.getDate() == null ||
                    GioiTinh_ComboBox.getSelectedIndex() == 0 ||
                    Email_text.getText().trim().isEmpty() ||
                    MonHoc_ComboBox.getSelectedIndex() == 0 ||
                    MaMon_text.getText().trim().isEmpty() ||
                    SoTin_text.getText().trim().isEmpty() ||
                    ThoiGian_text.getText().trim().isEmpty()) {
                    
                    JOptionPane.showMessageDialog(SinhVien.this, "Vui lòng điền đầy đủ tất cả các thông tin!", "Lỗi",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    EventQueue.invokeLater(() -> {
                        // Lấy giá trị trực tiếp trong lambda
                        String hoTen = HoTen_text.getText();
                        String mssv = Mssv_text.getText();
                        String lop = Lop_ComboBox.getSelectedItem().toString();
                        String gioiTinh = (String) GioiTinh_ComboBox.getSelectedItem();
                        String email = Email_text.getText();
                        String monHoc = MonHoc_ComboBox.getSelectedItem().toString();
                        String maMon = MaMon_text.getText();
                        String soTin = SoTin_text.getText();
                        String thoiGian = ThoiGian_text.getText();
                        String ngaySinh = "";
                        if (NgaySinh.getDate() != null) {
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            ngaySinh = sdf.format(NgaySinh.getDate());
                        }

                        ThongTinSinhVien frame = new ThongTinSinhVien(hoTen, mssv, lop, ngaySinh, gioiTinh, email, monHoc, maMon, soTin, thoiGian);
                        frame.setVisible(true);
                    });
                }
            }
        });
    }
}