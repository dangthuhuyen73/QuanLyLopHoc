package QuanLyLopHoc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DateFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.border.LineBorder;

public class GiaoBaiTap extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField TenGV_text;
    private JFormattedTextField NgayNop;
    private JTextField TieuDe_Text;
    private JTextArea ND_textArea;
    private JComboBox<String> Mon_comboBox;

    // Constructor mặc định
    public GiaoBaiTap() {
        initialize();
    }

    // Constructor nhận thông tin tên giảng viên và môn học
    public GiaoBaiTap(String tenGV, String monHoc) {
        initialize();
        TenGV_text.setText(tenGV); // Hiển thị tên giảng viên
        Mon_comboBox.setSelectedItem(monHoc); // Hiển thị môn học
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 895, 652);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 160));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 204, 0));
        panel.setBounds(0, 0, 881, 57);
        panel.setLayout(null);
        contentPane.add(panel);

        JLabel lblTitle = new JLabel("GIAO BÀI TẬP");
        lblTitle.setBounds(342, 11, 198, 37);
        panel.add(lblTitle);
        lblTitle.setForeground(new Color(0, 0, 0));
        lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 25));

        JLabel lblTieuDe = new JLabel("TIÊU ĐỀ:");
        lblTieuDe.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblTieuDe.setForeground(new Color(255, 255, 255));
        lblTieuDe.setBounds(25, 147, 138, 30);
        contentPane.add(lblTieuDe);

        TieuDe_Text = new JTextField();
        TieuDe_Text.setFont(new Font("Times New Roman", Font.BOLD, 15));
        TieuDe_Text.setBounds(155, 148, 704, 31);
        contentPane.add(TieuDe_Text);
        TieuDe_Text.setColumns(10);

        JLabel lblGiaoVien = new JLabel("GIẢNG VIÊN:");
        lblGiaoVien.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblGiaoVien.setForeground(new Color(255, 255, 255));
        lblGiaoVien.setBounds(25, 92, 145, 31);
        contentPane.add(lblGiaoVien);

        TenGV_text = new JTextField();
        TenGV_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        TenGV_text.setBounds(155, 94, 292, 31);
        TenGV_text.setEditable(false); // Không cho phép chỉnh sửa tên giảng viên
        contentPane.add(TenGV_text);
        TenGV_text.setColumns(10);

        JLabel lblMonHoc = new JLabel("TÊN MÔN:");
        lblMonHoc.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblMonHoc.setForeground(new Color(255, 255, 255));
        lblMonHoc.setBounds(469, 93, 114, 30);
        contentPane.add(lblMonHoc);

        Mon_comboBox = new JComboBox<>();
        Mon_comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Mon_comboBox.setBounds(559, 93, 300, 30);
        Mon_comboBox.setModel(new DefaultComboBoxModel<>(new String[]{"", "Cảm Biến", "Java", "Android"}));
        Mon_comboBox.setEnabled(false); // Không cho phép chỉnh sửa môn học
        contentPane.add(Mon_comboBox);

        JLabel lblNoiDung = new JLabel("NỘI DUNG BÀI TẬP");
        lblNoiDung.setForeground(Color.WHITE);
        lblNoiDung.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNoiDung.setBounds(25, 190, 180, 41);
        contentPane.add(lblNoiDung);

        ND_textArea = new JTextArea();
        ND_textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
        JScrollPane scrollPane = new JScrollPane(ND_textArea); // Thêm JScrollPane để hỗ trợ cuộn
        scrollPane.setBounds(25, 229, 832, 261);
        contentPane.add(scrollPane);

        JLabel lblHanNop = new JLabel("HẠN NỘP:");
        lblHanNop.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblHanNop.setForeground(new Color(255, 255, 255));
        lblHanNop.setBounds(25, 515, 88, 28);
        contentPane.add(lblHanNop);

        // Sử dụng JFormattedTextField với DateFormatter hỗ trợ cả ngày và giờ
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        NgayNop = new JFormattedTextField(new DateFormatter(dateFormat));
        NgayNop.setFont(new Font("Times New Roman", Font.BOLD, 15));
        NgayNop.setBounds(123, 514, 342, 30);
        NgayNop.setToolTipText("Nhập ngày và giờ theo định dạng dd/MM/yyyy HH:mm (ví dụ: 10/04/2025 14:30)");
        contentPane.add(NgayNop);

        JButton Giaobai_bnt = new JButton("GIAO BÀI");
        Giaobai_bnt.setForeground(Color.BLACK);
        Giaobai_bnt.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Giaobai_bnt.setBorder(new LineBorder(Color.WHITE, 1));
        Giaobai_bnt.setBackground(new Color(255, 165, 80));
        Giaobai_bnt.setBounds(653, 540, 162, 42);
        contentPane.add(Giaobai_bnt);

        // Thêm sự kiện cho nút GIAO BÀI
        Giaobai_bnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tenGV = TenGV_text.getText();
                String monHoc = (String) Mon_comboBox.getSelectedItem();
                String tieuDe = TieuDe_Text.getText();
                String noiDung = ND_textArea.getText();
                Object dateValue = NgayNop.getValue();

                // Kiểm tra xem thông tin có đầy đủ không
                if (tenGV.isEmpty() || monHoc == null || monHoc.isEmpty()) {
                    JOptionPane.showMessageDialog(GiaoBaiTap.this,
                            "Vui lòng điền đầy đủ thông tin giảng viên và môn học!",
                            "Cảnh báo",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (tieuDe.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(GiaoBaiTap.this,
                            "Vui lòng điền tiêu đề bài tập!",
                            "Cảnh báo",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (noiDung.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(GiaoBaiTap.this,
                            "Vui lòng điền nội dung bài tập!",
                            "Cảnh báo",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (dateValue == null) {
                    JOptionPane.showMessageDialog(GiaoBaiTap.this,
                            "Vui lòng nhập ngày và giờ hạn nộp hợp lệ (dd/MM/yyyy HH:mm)!",
                            "Cảnh báo",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Chuyển đổi giá trị hạn nộp thành chuỗi
                Date date = (Date) dateValue;
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                String hanNop = sdf.format(date);

                // Hiển thị thông báo giao bài thành công
                String thongBao = "📌 Giao bài thành công!\n\n"
                        + "Tiêu đề: " + tieuDe + "\n"
                        + "Giảng viên: " + tenGV + "\n"
                        + "Môn học: " + monHoc + "\n"
                        + "Hạn nộp: " + hanNop;

                JOptionPane.showMessageDialog(GiaoBaiTap.this, thongBao, "Thành công", JOptionPane.INFORMATION_MESSAGE);

                // Ở đây bạn có thể thêm logic để lưu dữ liệu (ví dụ: vào cơ sở dữ liệu hoặc file)
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GiaoBaiTap frame = new GiaoBaiTap();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}