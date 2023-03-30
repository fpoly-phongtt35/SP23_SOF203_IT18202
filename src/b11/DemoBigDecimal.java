/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b11;

import java.math.BigDecimal;

/**
 *
 * @author phongtt
 */
public class DemoBigDecimal {
    
    public static void main(String[] args) {
        
        float f1 = 0.1f;
        float f2 = 0.2f;
        float f3 = f1 * f2;
        System.out.println(f3);
        
        double d1 = 0.1;
        double d2 = 0.2;
        double d3 = d1 * d2;
        System.out.println(d3);
        
        BigDecimal bd1 = BigDecimal.valueOf(0.1);
        BigDecimal bd2 = BigDecimal.valueOf(0.2);
        BigDecimal bd3 = bd1.multiply(bd2);
        System.out.println(bd3);
        
    }
}
