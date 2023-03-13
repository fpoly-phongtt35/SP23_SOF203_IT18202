/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author phongtt
 */
public class BoCucDoc {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        
        GridLayout gLayout = new GridLayout(6, 1); // Dòng x Cột
        frame.setLayout(gLayout);
        
        FlowLayout centerLayout = new FlowLayout(FlowLayout.CENTER);
        
        // Câu 1
        JPanel pnCau1 = new JPanel(centerLayout);
        pnCau1.add(new JLabel("Xuân khứ bách hoa lạc"));
        frame.add(pnCau1);
        
        // Câu 2
        JPanel pnCau2 = new JPanel(centerLayout);
        pnCau2.add(new JLabel("Xuân đáo bách hoa khai"));
        frame.add(pnCau2);
        
        // Tương tự...
        frame.add(new JLabel("Sự trục nhãn tiền quá"));
        frame.add(new JLabel("Lão tòng đầu thượng lai"));
        frame.add(new JLabel("Mạc vị xuân tàn hoa lạc tận"));
        frame.add(new JLabel("Đình tiền tạc dạ nhất chi mai"));
        
        frame.pack();
        frame.setVisible(true);
    }
}
