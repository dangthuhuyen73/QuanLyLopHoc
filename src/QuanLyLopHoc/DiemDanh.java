package QuanLyLopHoc;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class DiemDanh extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField monTextField; // Sử dụng JTextField thay vì JTextArea cho phù hợp
    private JTable table;

    public DiemDanh(String monGiangDay) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 895, 652);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 121));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 204, 0));
        panel.setBounds(0, 0, 881, 57);
        panel.setLayout(null);
        contentPane.add(panel);

        JLabel lblTitle = new JLabel("ĐIỂM DANH");
        lblTitle.setBounds(342, 11, 198, 37);
        panel.add(lblTitle);
        lblTitle.setForeground(new Color(0, 0, 0));
        lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 25));

        JLabel lblNewLabel = new JLabel("MÔN GIẢNG DẠY:");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(35, 82, 149, 31);
        contentPane.add(lblNewLabel);

        // Sử dụng JTextField để hiển thị môn giảng dạy
        monTextField = new JTextField(monGiangDay); // Gán monGiangDay trực tiếp
        monTextField.setFont(new Font("Times New Roman", Font.BOLD, 15));
        monTextField.setForeground(new Color(0, 0, 0));
        monTextField.setBounds(206, 82, 302, 31);
        monTextField.setEditable(false); // Không cho phép chỉnh sửa
        contentPane.add(monTextField);

        JButton btnXuat = new JButton("Xuất Excel");
        btnXuat.setForeground(new Color(0, 0, 0));
        btnXuat.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnXuat.setBackground(new Color(0, 204, 0));
        btnXuat.setBounds(704, 552, 150, 40);
        contentPane.add(btnXuat);

        JButton btnLuu = new JButton("LƯU");
        btnLuu.setForeground(Color.BLACK);
        btnLuu.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnLuu.setBackground(new Color(0, 204, 0));
        btnLuu.setBounds(593, 552, 101, 40);
        contentPane.add(btnLuu);

        JButton btnSua = new JButton("SỬA");
        btnSua.setForeground(Color.BLACK);
        btnSua.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnSua.setBackground(new Color(0, 204, 0));
        btnSua.setBounds(482, 552, 101, 40);
        contentPane.add(btnSua);
        
        table = new JTable();
        table.setBounds(20, 138, 839, 403);
        contentPane.add(table);
    }

    public static void main(String[] args) {
        
    }
}