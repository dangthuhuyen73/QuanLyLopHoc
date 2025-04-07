package QuanLyLopHoc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrangChu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel TrangChinh; // Biến instance để có thể truy cập trong ActionListener
    private Component[] initialComponents; // Lưu các thành phần ban đầu của TrangChinh
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TrangChu frame = new TrangChu();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TrangChu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 700);
        //setExtendedState(JFrame.MAXIMIZED_BOTH); // Full màn hình
        //setUndecorated(false); // Giữ thanh title bar
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 121));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 204, 0));
        panel.setBounds(0, 0, 76, 700);
        contentPane.add(panel);
        panel.setLayout(null);

        JButton TrangChu_Button = new JButton("");
        ImageIcon originalIcon = new ImageIcon(TrangChu.class.getResource("/ICON/house.png"));
        Image resizedImage = originalIcon.getImage().getScaledInstance(56, 47, Image.SCALE_SMOOTH);
        TrangChu_Button.setIcon(new ImageIcon(resizedImage));
        TrangChu_Button.setBounds(0, 93, 76, 76);
        TrangChu_Button.setOpaque(false);
        TrangChu_Button.setContentAreaFilled(false);
        TrangChu_Button.setBorderPainted(false);
        panel.add(TrangChu_Button);
        
        TrangChu_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TrangChinh.removeAll(); // Xóa tất cả nội dung hiện tại
                // Thêm lại các thành phần ban đầu
                for (Component comp : initialComponents) {
                    TrangChinh.add(comp);
                }
                TrangChinh.revalidate();
                TrangChinh.repaint();
            }
        });

        JButton Student_Button = new JButton("");
        Student_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TrangChinh.removeAll(); // Xóa tất cả nội dung hiện tại trong TrangChinh
                SinhVien studentPanel = new SinhVien(); // Tạo panel Student
                studentPanel.setBounds(0, 0, 895, 652); // Đặt kích thước bằng TrangChinh
                TrangChinh.add(studentPanel); // Thêm Student panel vào TrangChinh
                TrangChinh.revalidate(); // Cập nhật layout
                TrangChinh.repaint(); // Vẽ lại giao diện
            }
        });
        ImageIcon originalIcon1 = new ImageIcon(TrangChu.class.getResource("/ICON/student.png"));
        Image resizedImage1 = originalIcon1.getImage().getScaledInstance(56, 47, Image.SCALE_SMOOTH);
        Student_Button.setIcon(new ImageIcon(resizedImage1));
        Student_Button.setOpaque(false);
        Student_Button.setContentAreaFilled(false);
        Student_Button.setBorderPainted(false);
        Student_Button.setBounds(0, 159, 76, 76);
        panel.add(Student_Button);

        JButton Teach_Button = new JButton("");
        Teach_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Có thể thêm logic để hiển thị panel Teach sau này
            }
        });
        ImageIcon originalIcon2 = new ImageIcon(TrangChu.class.getResource("/ICON/teach.png"));
        Image resizedImage2 = originalIcon2.getImage().getScaledInstance(56, 47, Image.SCALE_SMOOTH);
        Teach_Button.setIcon(new ImageIcon(resizedImage2));
        Teach_Button.setOpaque(false);
        Teach_Button.setContentAreaFilled(false);
        Teach_Button.setBorderPainted(false);
        Teach_Button.setBounds(0, 246, 76, 76);
        panel.add(Teach_Button);

        JButton Manage_Button = new JButton("");
        ImageIcon originalIcon3 = new ImageIcon(TrangChu.class.getResource("/ICON/manager.png"));
        Image resizedImage3 = originalIcon3.getImage().getScaledInstance(56, 47, Image.SCALE_SMOOTH);
        Manage_Button.setIcon(new ImageIcon(resizedImage3));
        Manage_Button.setOpaque(false);
        Manage_Button.setContentAreaFilled(false);
        Manage_Button.setBorderPainted(false);
        Manage_Button.setBounds(0, 319, 76, 76);
        panel.add(Manage_Button);

        JButton BaiTap_Button = new JButton("");
        ImageIcon originalIcon4 = new ImageIcon(TrangChu.class.getResource("/ICON/BaiTap.png"));
        Image resizedImage4 = originalIcon4.getImage().getScaledInstance(56, 47, Image.SCALE_SMOOTH);
        BaiTap_Button.setIcon(new ImageIcon(resizedImage4));
        BaiTap_Button.setOpaque(false);
        BaiTap_Button.setContentAreaFilled(false);
        BaiTap_Button.setBorderPainted(false);
        BaiTap_Button.setBounds(0, 394, 76, 76);
        panel.add(BaiTap_Button);

        JButton Exit_Button = new JButton("");
        ImageIcon originalIcon5 = new ImageIcon(TrangChu.class.getResource("/ICON/EXIT.png"));
        Image resizedImage5 = originalIcon5.getImage().getScaledInstance(56, 47, Image.SCALE_SMOOTH);
        Exit_Button.setIcon(new ImageIcon(resizedImage5));
        Exit_Button.setOpaque(false);
        Exit_Button.setContentAreaFilled(false);
        Exit_Button.setBorderPainted(false);
        Exit_Button.setBounds(0, 586, 76, 76);
        panel.add(Exit_Button);

        Exit_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(
                    TrangChu.this,
                    "Bạn có chắc chắn muốn thoát không?",
                    "Xác nhận thoát",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
                );
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/ICON/logo-.png")); // Đảm bảo đường dẫn đúng    
        Image scaledShopp = logoIcon.getImage().getScaledInstance(76, 69, Image.SCALE_SMOOTH);
        ImageIcon resizedShoppIcon = new ImageIcon(scaledShopp);
        JLabel logo = new JLabel(resizedShoppIcon);
        logo.setBounds(0, 23, 76, 69); // Kích thước nhỏ hơn để phù hợp với panel
        panel.add(logo);

        TrangChinh = new JPanel();
        TrangChinh.setBounds(81, 11, 895, 652);
        TrangChinh.setBackground(new Color(0, 0, 121));
        contentPane.add(TrangChinh);
        TrangChinh.setLayout(null);
        
        JLabel TrangChu = new JLabel("Trang Chủ");
        TrangChu.setFont(new Font("Times New Roman", Font.BOLD, 25));
        TrangChu.setForeground(new Color(255, 255, 255));
        TrangChu.setBounds(10, 39, 132, 43);
        TrangChinh.add(TrangChu);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 109, 443, 267);
        TrangChinh.add(panel_1);      

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setBounds(10, 387, 875, 254);
        TrangChinh.add(panel_1_1);      

        JPanel panel_1_2 = new JPanel();
        panel_1_2.setBounds(468, 109, 417, 267);
        TrangChinh.add(panel_1_2);     
        
     // Lưu trạng thái ban đầu của TrangChinh
        initialComponents = TrangChinh.getComponents();
    }
}