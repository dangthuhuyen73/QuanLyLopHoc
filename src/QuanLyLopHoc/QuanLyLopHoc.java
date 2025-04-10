package QuanLyLopHoc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuanLyLopHoc extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField HienThi;
    private JButton lastClickedButton = null; // Theo dõi nút được nhấn cuối cùng

    public QuanLyLopHoc() {
        setBackground(new Color(0, 0, 121));
        setBounds(81, 11, 895, 652);
        setLayout(null);

        JList<String> DanhSach_list = new JList<>();

        // Tiêu đề
        JLabel lblNewLabel = new JLabel("QUẢN LÝ LỚP HỌC");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(334, 11, 261, 40);
        add(lblNewLabel);

        // Tạo JPopupMenu cho nút Quản Lý
        JPopupMenu manageLopMenu = new JPopupMenu("Danh Sách Lớp Học");
        manageLopMenu.setFont(new Font("Times New Roman", Font.BOLD, 14));
        manageLopMenu.setBackground(new Color(255, 204, 0));
        manageLopMenu.setForeground(Color.BLACK);
        JMenuItem lop1 = new JMenuItem("D21CQVT01-N");
        JMenuItem lop2 = new JMenuItem("D21CQVTHI01-N");
        JMenuItem lop3 = new JMenuItem("D21CQVTVT01-N");
        manageLopMenu.add(lop1);
        manageLopMenu.add(lop2);
        manageLopMenu.add(lop3);

        // Nút Danh Sách Lớp Học
        JButton Lop_bnt = new JButton("Danh Sách Lớp Học");
        Lop_bnt.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Lop_bnt.setBackground(new Color(255, 215, 0));
        Lop_bnt.setForeground(Color.BLACK);
        Lop_bnt.setBounds(72, 61, 187, 40);
        add(Lop_bnt);

        // Tạo JPopupMenu cho nút Danh Sách Môn Học
        JPopupMenu subjectsMenu = new JPopupMenu("Danh Sách Môn Học");
        subjectsMenu.setFont(new Font("Times New Roman", Font.BOLD, 15));
        subjectsMenu.setBackground(new Color(255, 204, 0));
        subjectsMenu.setForeground(Color.BLACK);
        JMenuItem mon1 = new JMenuItem("Toán Cao Cấp");
        JMenuItem mon2 = new JMenuItem("Lập Trình Java");
        JMenuItem mon3 = new JMenuItem("Cơ Sở Dữ Liệu");
        subjectsMenu.add(mon1);
        subjectsMenu.add(mon2);
        subjectsMenu.add(mon3);

        // Nút Danh Sách Môn Học
        JButton Mon_bnt = new JButton("Danh Sách Môn Học");
        Mon_bnt.setFont(new Font("Times New Roman", Font.BOLD, 14));
        Mon_bnt.setBackground(new Color(255, 215, 0));
        Mon_bnt.setForeground(Color.BLACK);
        Mon_bnt.setBounds(362, 61, 187, 40);
        add(Mon_bnt);

        // Nút Xuất Excel
        JButton btnDetails = new JButton("Xuất Excel");
        btnDetails.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnDetails.setBackground(new Color(0, 204, 0));
        btnDetails.setForeground(Color.WHITE);
        btnDetails.setBounds(679, 64, 150, 40);
        add(btnDetails);

        // Hàm xử lý màu khi nhấn nút
        ActionListener buttonColorHandler = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                // Nếu có nút được nhấn trước đó, đặt lại màu cũ
                if (lastClickedButton != null && lastClickedButton != clickedButton) {
                    if (lastClickedButton == btnDetails) {
                        lastClickedButton.setBackground(new Color(0, 204, 0)); // Màu xanh ban đầu
                    } else {
                        lastClickedButton.setBackground(new Color(255, 215, 0)); // Màu vàng ban đầu
                    }
                }
                // Đổi màu nút hiện tại
                if (clickedButton == btnDetails) {
                    clickedButton.setBackground(new Color(0, 153, 0)); // Màu xanh đậm
                } else {
                    clickedButton.setBackground(new Color(255, 153, 0)); // Màu cam đậm
                }
                lastClickedButton = clickedButton; // Cập nhật nút được nhấn cuối cùng

                // Xử lý hiển thị popup menu nếu có
                if (clickedButton == Lop_bnt) {
                    manageLopMenu.show(Lop_bnt, 0, Lop_bnt.getHeight());
                } else if (clickedButton == Mon_bnt) {
                    subjectsMenu.show(Mon_bnt, 0, Mon_bnt.getHeight());
                }
            }
        };

        // Gán sự kiện cho các nút
        Lop_bnt.addActionListener(buttonColorHandler);
        Mon_bnt.addActionListener(buttonColorHandler);
        btnDetails.addActionListener(buttonColorHandler);

        // Thêm sự kiện khi chọn lớp
        lop1.addActionListener(e -> HienThi.setText("Danh Sách Lớp: D21CQVT01-N"));
        lop2.addActionListener(e -> HienThi.setText("Danh Sách Lớp: D21CQVTHI01-N"));
        lop3.addActionListener(e -> HienThi.setText("Danh Sách Lớp: D21CQVTVT01-N"));

        // Thêm sự kiện khi chọn môn
        mon1.addActionListener(e -> HienThi.setText("Danh Sách Lớp Môn:Toán Cao Cấp"));
        mon2.addActionListener(e ->HienThi.setText("Danh Sách Lớp Môn:Lập Trình Java"));
        mon3.addActionListener(e -> HienThi.setText("Danh Sách Lớp Môn:Cơ Sở Dữ Liệu"));

        DanhSach_list.setBounds(31, 179, 833, 444);
        add(DanhSach_list);

        HienThi = new JTextField();
        HienThi.setFont(new Font("Times New Roman", Font.BOLD, 15));
        HienThi.setBounds(72, 125, 371, 31);
        add(HienThi);
        HienThi.setColumns(10);
    }
}