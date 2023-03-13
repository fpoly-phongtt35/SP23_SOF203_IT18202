/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author phongtt
 */
public class ChuongTrinhTinhTuoi {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Chương trình tính tuổi");
        
        // Bố cục căn trái
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        frame.setLayout(layout);
        
        // Thêm nhãn
        JLabel lbNamSinh = new JLabel("Nhập năm sinh: ");
        frame.add(lbNamSinh);
        
        // Thêm ô nhập
        JTextField txtNamSinh = new JTextField();
        txtNamSinh.setColumns(5);
        frame.add(txtNamSinh);
        
        // Thêm nút
        JButton btnTinhTuoi = new JButton("Tính tuổi");
        btnTinhTuoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // Lấy chuỗi người dùng vừa nhập
                String namSinhStr = txtNamSinh.getText();
                
                // Convert Chuỗi -> Số
                Integer namSinh = Integer.valueOf(namSinhStr);
                
                // Tính tuổi = Năm hiện tại - năm sinh
                Integer tuoi = 2023 - namSinh;
                
                JOptionPane.showMessageDialog(null, tuoi + " tuổi");
            }
        });
        frame.add(btnTinhTuoi);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // Tự động bố cục khít với component, không cần setSize
        frame.setVisible(true); // Hiển thị giao diện
    }
}
