package QuanLyLopHoc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThongTinGiangVien extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel ThongTinGiangVienPanel;
    private JTextField HoTen_text1;
    private JTextField MaGV_text1;
    private JTextField Email_text1;
    private JTextField SoDienThoai_text1;
    private JTextField MaMon_text1;
    private JLabel avata;
    private boolean isEditing = false;
    private JButton btnSua;
    private JComboBox<String> Mon_ComboBox;

    public ThongTinGiangVien() {
        initialize();
    }

    public ThongTinGiangVien(String hoTen, String maGV, String email, String soDienThoai, String monGiangDay, String maMon) {
        initialize();
        HoTen_text1.setText(hoTen);
        MaGV_text1.setText(maGV);
        Email_text1.setText(email);
        SoDienThoai_text1.setText(soDienThoai);
        Mon_ComboBox.setSelectedItem(monGiangDay);
        MaMon_text1.setText(maMon);
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 895, 652);
        setLocationRelativeTo(null);

        ThongTinGiangVienPanel = new JPanel();
        ThongTinGiangVienPanel.setBackground(new Color(0, 0, 121));
        ThongTinGiangVienPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        ThongTinGiangVienPanel.setLayout(null);
        setContentPane(ThongTinGiangVienPanel);

        // Khởi tạo các trường nhập liệu
        HoTen_text1 = new JTextField();
        HoTen_text1.setBounds(539, 95, 310, 30);
        HoTen_text1.setEditable(false);
        ThongTinGiangVienPanel.add(HoTen_text1);
        HoTen_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));

        MaGV_text1 = new JTextField();
        MaGV_text1.setBounds(539, 157, 309, 30);
        MaGV_text1.setEditable(false);
        ThongTinGiangVienPanel.add(MaGV_text1);
        MaGV_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));

        Email_text1 = new JTextField();
        Email_text1.setBounds(540, 226, 309, 30);
        Email_text1.setEditable(false);
        ThongTinGiangVienPanel.add(Email_text1);
        Email_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));

        SoDienThoai_text1 = new JTextField();
        SoDienThoai_text1.setBounds(539, 296, 309, 30);
        SoDienThoai_text1.setEditable(false);
        ThongTinGiangVienPanel.add(SoDienThoai_text1);
        SoDienThoai_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));

        MaMon_text1 = new JTextField();
        MaMon_text1.setBounds(539, 436, 309, 30);
        MaMon_text1.setEditable(false);
        ThongTinGiangVienPanel.add(MaMon_text1);
        MaMon_text1.setFont(new Font("Times New Roman", Font.PLAIN, 15));

        // Các nhãn
        JLabel HoTen_Label = new JLabel("HỌ TÊN:");
        HoTen_Label.setForeground(new Color(255, 255, 255));
        HoTen_Label.setBounds(374, 96, 81, 29);
        ThongTinGiangVienPanel.add(HoTen_Label);
        HoTen_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel MaGV_Label = new JLabel("MÃ GV:");
        MaGV_Label.setForeground(new Color(255, 255, 255));
        MaGV_Label.setBounds(374, 158, 81, 29);
        ThongTinGiangVienPanel.add(MaGV_Label);
        MaGV_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel Email_Label = new JLabel("EMAIL:");
        Email_Label.setForeground(new Color(255, 255, 255));
        Email_Label.setBounds(374, 227, 81, 29);
        ThongTinGiangVienPanel.add(Email_Label);
        Email_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel SoDienThoai_Label = new JLabel("SỐ ĐIỆN THOẠI:");
        SoDienThoai_Label.setForeground(new Color(255, 255, 255));
        SoDienThoai_Label.setBounds(374, 297, 137, 29);
        ThongTinGiangVienPanel.add(SoDienThoai_Label);
        SoDienThoai_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel MonGiangDay_Label = new JLabel("MÔN GIẢNG DẠY:");
        MonGiangDay_Label.setForeground(new Color(255, 255, 255));
        MonGiangDay_Label.setBounds(363, 364, 137, 29);
        ThongTinGiangVienPanel.add(MonGiangDay_Label);
        MonGiangDay_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));

        JLabel MaMon_Label = new JLabel("MÃ MÔN:");
        MaMon_Label.setForeground(new Color(255, 255, 255));
        MaMon_Label.setBounds(374, 437, 81, 29);
        ThongTinGiangVienPanel.add(MaMon_Label);
        MaMon_Label.setFont(new Font("Times New Roman", Font.BOLD, 15));

        avata = new JLabel();
        avata.setBounds(77, 121, 224, 227);
        avata.setBorder(new LineBorder(Color.WHITE, 3));
        avata.setBackground(Color.WHITE);
        avata.setOpaque(true);
        ThongTinGiangVienPanel.add(avata);

        // Tải hình ảnh và xử lý lỗi nếu không tìm thấy
        ImageIcon avatarIcon = new ImageIcon(getClass().getResource("/Icon/GV.png"));
        if (avatarIcon.getImage() != null) {
            Image scaledImage = avatarIcon.getImage().getScaledInstance(224, 227, Image.SCALE_SMOOTH);
            avata.setIcon(new ImageIcon(scaledImage));
        } else {
            JOptionPane.showMessageDialog(this,
                "Không thể tải hình ảnh avatar! Vui lòng kiểm tra đường dẫn /Icon/GV.png",
                "Lỗi",
                JOptionPane.ERROR_MESSAGE);
        }

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 204, 0));
        panel.setBounds(0, 0, 881, 57);
        panel.setLayout(null);
        ThongTinGiangVienPanel.add(panel);

        JLabel lblTitle = new JLabel("THÔNG TIN GIẢNG VIÊN");
        lblTitle.setBounds(284, 11, 339, 37);
        panel.add(lblTitle);
        lblTitle.setForeground(new Color(0, 0, 0));
        lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 25));

        // Khởi tạo JComboBox cho Môn giảng dạy
        Mon_ComboBox = new JComboBox<>();
        Mon_ComboBox.setBounds(539, 363, 310, 30);
        Mon_ComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Mon_ComboBox.setModel(new DefaultComboBoxModel<>(new String[] {"", "Cảm Biến", "Java", "Android"}));
        Mon_ComboBox.setEnabled(false);
        ThongTinGiangVienPanel.add(Mon_ComboBox);

        // Xử lý khi chọn môn học để cập nhật mã môn
        Mon_ComboBox.addItemListener(e -> {
            String selectedSubject = (String) Mon_ComboBox.getSelectedItem();
            if ("Cảm Biến".equals(selectedSubject)) {
                MaMon_text1.setText("iot");
            } else if ("Java".equals(selectedSubject)) {
                MaMon_text1.setText("jv");
            } else if ("Android".equals(selectedSubject)) {
                MaMon_text1.setText("ad");
            } else {
                MaMon_text1.setText("");
            }
        });

        // Nút SỬA
        btnSua = new JButton("SỬA");
        btnSua.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnSua.setBounds(97, 514, 129, 44);
        btnSua.setBackground(new Color(50, 150, 255)); // Màu xanh sáng
        btnSua.setForeground(Color.WHITE); // Chữ màu trắng (sửa lỗi)
        btnSua.setBorder(new LineBorder(Color.WHITE, 1)); // Viền trắng
        ThongTinGiangVienPanel.add(btnSua);

        btnSua.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!isEditing) {
                    btnSua.setText("LƯU");
                    btnSua.setBackground(new Color(255, 53, 53)); // Màu đỏ
                    btnSua.setForeground(Color.WHITE); // Chữ màu trắng (sửa lỗi)
                    btnSua.setBorder(new LineBorder(Color.WHITE, 1)); // Viền trắng
                    setFieldsEditable(true);
                    isEditing = true;
                } else {
                    if (checkFieldsFilled()) {
                        btnSua.setText("SỬA");
                        btnSua.setBackground(new Color(50, 150, 255)); // Màu xanh sáng
                        btnSua.setForeground(Color.WHITE); // Chữ màu trắng (sửa lỗi)
                        btnSua.setBorder(new LineBorder(Color.WHITE, 1)); // Viền trắng
                        setFieldsEditable(false);
                        isEditing = false;
                        JOptionPane.showMessageDialog(ThongTinGiangVien.this,
                            "Thông tin đã được sửa thành công!",
                            "Thành công",
                            JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(ThongTinGiangVien.this,
                            "Vui lòng điền đầy đủ thông tin!",
                            "Cảnh báo",
                            JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });

        JButton btnChamDiem = new JButton("CHẤM ĐIỂM");
        btnChamDiem.setBackground(new Color(255, 140, 0));
        btnChamDiem.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnChamDiem.setBounds(286, 514, 137, 44);
        btnChamDiem.setBorder(new LineBorder(Color.WHITE, 1));
        ThongTinGiangVienPanel.add(btnChamDiem);

        JButton btnGiaoBai = new JButton("GIAO BÀI");
        btnGiaoBai.setBackground(new Color(255, 215, 0));
        btnGiaoBai.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnGiaoBai.setBounds(469, 514, 129, 44);
        btnGiaoBai.setBorder(new LineBorder(Color.WHITE, 1));
        ThongTinGiangVienPanel.add(btnGiaoBai);
        btnGiaoBai.addActionListener(e -> {
            String hoTen = HoTen_text1.getText();
            String monGiangDay = (String) Mon_ComboBox.getSelectedItem();
            if (monGiangDay != null && !monGiangDay.isEmpty()) {
                GiaoBaiTap thongTin = new GiaoBaiTap(hoTen, monGiangDay);
                thongTin.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(ThongTinGiangVien.this,
                    "Vui lòng chọn môn giảng dạy!",
                    "Cảnh báo",
                    JOptionPane.WARNING_MESSAGE);
            }
        });

        JButton btnDiemDanh = new JButton("ĐIỂM DANH");
        btnDiemDanh.setBackground(new Color(255, 165, 80));
        btnDiemDanh.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnDiemDanh.setBounds(652, 514, 129, 44);
        btnDiemDanh.setBorder(new LineBorder(Color.WHITE, 1));
        ThongTinGiangVienPanel.add(btnDiemDanh);
        btnDiemDanh.addActionListener(e -> {
            String monGiangDay = (String) Mon_ComboBox.getSelectedItem();
            if (monGiangDay != null && !monGiangDay.isEmpty()) {
                DiemDanh diemDanh = new DiemDanh(monGiangDay);
                diemDanh.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(ThongTinGiangVien.this,
                    "Vui lòng chọn môn giảng dạy!",
                    "Cảnh báo",
                    JOptionPane.WARNING_MESSAGE);
            }
        });
    }

    // Bật/tắt chế độ chỉnh sửa cho các trường
    private void setFieldsEditable(boolean editable) {
        HoTen_text1.setEditable(editable);
        MaGV_text1.setEditable(editable);
        Email_text1.setEditable(editable);
        SoDienThoai_text1.setEditable(editable);
        MaMon_text1.setEditable(editable);
        Mon_ComboBox.setEnabled(editable);
    }

    // Kiểm tra xem tất cả các trường đã được điền chưa
    private boolean checkFieldsFilled() {
        return !HoTen_text1.getText().trim().isEmpty() &&
               !MaGV_text1.getText().trim().isEmpty() &&
               !Email_text1.getText().trim().isEmpty() &&
               !SoDienThoai_text1.getText().trim().isEmpty() &&
               !MaMon_text1.getText().trim().isEmpty() &&
               Mon_ComboBox.getSelectedIndex() != 0;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ThongTinGiangVien frame = new ThongTinGiangVien();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}