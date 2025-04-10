package QuanLyLopHoc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.toedter.calendar.JDateChooser;

import java.io.File;

public class BaiTap extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField GiangVien;
    private JTextField TieuDe_text;
    private JLabel LinkNop; // Label để hiển thị tên file đã chọn
    private JDateChooser NgayNop;
    private TimePicker timePicker;

    public BaiTap() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 895, 652);
        setLocationRelativeTo(null);
        
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 121));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Panel tiêu đề
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

        // Thông tin giảng viên và môn học
        JLabel lblGiaoVien = new JLabel("GIẢNG VIÊN:");
        lblGiaoVien.setForeground(Color.WHITE);
        lblGiaoVien.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblGiaoVien.setBounds(442, 79, 114, 31);
        contentPane.add(lblGiaoVien);
        
        GiangVien = new JTextField();
        GiangVien.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        GiangVien.setEditable(false);
        GiangVien.setColumns(10);
        GiangVien.setBounds(551, 79, 306, 31);
        contentPane.add(GiangVien);
        
        JLabel lblMonHoc = new JLabel("TÊN MÔN:");
        lblMonHoc.setForeground(Color.WHITE);
        lblMonHoc.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblMonHoc.setBounds(23, 80, 114, 30);
        contentPane.add(lblMonHoc);
        
        JComboBox<String> Mon_comboBox = new JComboBox<String>();
        Mon_comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Mon_comboBox.setEnabled(false);
        Mon_comboBox.setBounds(113, 79, 300, 30);
        contentPane.add(Mon_comboBox);
        
        JLabel lblTieuDe = new JLabel("TIÊU ĐỀ:");
        lblTieuDe.setForeground(Color.WHITE);
        lblTieuDe.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblTieuDe.setBounds(23, 121, 138, 30);
        contentPane.add(lblTieuDe);
        
        TieuDe_text = new JTextField();
        TieuDe_text.setFont(new Font("Times New Roman", Font.BOLD, 15));
        TieuDe_text.setColumns(10);
        TieuDe_text.setBounds(113, 122, 744, 31);
        contentPane.add(TieuDe_text);

     // Nội dung bài tập (TextArea)
        JTextArea noiDungBaiTap = new JTextArea();
        noiDungBaiTap.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        /*JScrollPane scrollPane = new JScrollPane(noiDungBaiTap); // Thêm JScrollPane để hỗ trợ cuộn
        scrollPane.setBounds(23, 216, 834, 248);
        contentPane.add(scrollPane);*/
        noiDungBaiTap.setBounds(23, 216, 834, 248); // Điều chỉnh kích thước và vị trí cho phù hợp
        noiDungBaiTap.setEditable(false);
        noiDungBaiTap.setBackground(Color.WHITE); // Thêm màu nền cho dễ đọc
        contentPane.add(noiDungBaiTap);
        
        JButton btnChonTep = new JButton("Chọn tệp");
        btnChonTep.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnChonTep.setBackground(Color.WHITE);
        btnChonTep.setBounds(23, 480, 124, 31);
        contentPane.add(btnChonTep);

        LinkNop = new JLabel("");
        LinkNop.setBackground(new Color(255, 255, 255)); // Màu nền trắng
        LinkNop.setFont(new Font("Times New Roman", Font.BOLD, 15));
        LinkNop.setForeground(new Color(0, 0, 0)); // Chữ màu đen
        LinkNop.setBounds(161, 480, 260, 31);
        LinkNop.setOpaque(true); // Bật chế độ hiển thị màu nền
        LinkNop.setBorder(new LineBorder(Color.WHITE, 2)); // Thêm khung viền trắng với độ dày 2px
        contentPane.add(LinkNop);
        
        btnChonTep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Java files", "java"));
                int result = fileChooser.showOpenDialog(BaiTap.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    LinkNop.setText(selectedFile.getName());
                    LinkNop.setToolTipText(selectedFile.getAbsolutePath()); // Hiển thị đường dẫn đầy đủ khi hover
                }
            }
        });
        
        JLabel lblNewLabel = new JLabel("HẠN NỘP:");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(526, 475, 89, 40);
        contentPane.add(lblNewLabel);
        //Gio nop
        TimePickerSettings timeSettings = new TimePickerSettings();
        timeSettings.setDisplaySpinnerButtons(true);
        timeSettings.setColor(TimePickerSettings.TimeArea.TimePickerTextDisabled, new Color(0, 51, 102));
        timeSettings.setFormatForDisplayTime("hh:mm a"); // Hiển thị AM/PM trong TimePicker
        timePicker = new TimePicker(timeSettings);
        timePicker.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        timePicker.setBounds(611, 482, 89, 30);
        //timePicker.setLayout(null);
        contentPane.add(timePicker);
        
        //ngay nop
        NgayNop = new JDateChooser();
        NgayNop.setBounds(710, 481, 147, 30);
        NgayNop.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        NgayNop.setDateFormatString("dd/MM/yyyy");
        contentPane.add(NgayNop);

        // Nút Nộp bài
        JButton NộpBaiButton = new JButton("NỘP BÀI");
        NộpBaiButton.setBounds(187, 550, 162, 42);
        NộpBaiButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
        NộpBaiButton.setBackground(new Color(0, 221, 55));
        NộpBaiButton.setForeground(Color.BLACK);
        NộpBaiButton.setBorder(new LineBorder(Color.WHITE, 1));
        contentPane.add(NộpBaiButton);
        
        NộpBaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (LinkNop.getText().equals("Chưa chọn tệp nào")) {
                    JOptionPane.showMessageDialog(contentPane, 
                        "Vui lòng chọn tệp bài làm trước khi nộp!", 
                        "Lỗi", 
                        JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(contentPane, 
                        "Nộp bài thành công!\nTệp: " + LinkNop.getText(), 
                        "Thành công", 
                        JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            }
        });

        // Nút Hủy
        JButton HuyBaiButton = new JButton("HỦY NỘP BÀI");
        HuyBaiButton.setBounds(551, 549, 162, 44);
        HuyBaiButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
        HuyBaiButton.setBackground(new Color(255, 53, 53));
        HuyBaiButton.setForeground(Color.BLACK);
        HuyBaiButton.setBorder(new LineBorder(Color.WHITE, 1));
        contentPane.add(HuyBaiButton);
        
        JLabel lblNoiDung = new JLabel("NỘI DUNG BÀI TẬP");
        lblNoiDung.setForeground(Color.WHITE);
        lblNoiDung.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNoiDung.setBounds(23, 164, 180, 41);
        contentPane.add(lblNoiDung);
        

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
                    dispose();
                }
            }
        });
    }
}