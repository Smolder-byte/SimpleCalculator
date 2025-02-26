/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectb;

import javax.swing.JFrame;


/**
 *
 * @author Настя
 */
public class MyFrame extends JFrame {
    
    public MyFrame(){
        setTitle("My form frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(new CalculatorGUI());
        pack();
    }
    
}
