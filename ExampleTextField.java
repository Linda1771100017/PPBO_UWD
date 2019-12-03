/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ilckom
 */
public class ExampleTextField extends JFrame{
    private final JTextField txt1;
    private final JPasswordField pss1;
    private final JTextArea txtA1;
    public ExampleTextField(){
        Container b = getContentPane();
        setLayout(new FlowLayout());
        txt1 = new JTextField(10);
        b.add(txt1);
        pss1 = new JPasswordField(10);
        b.add(pss1);
        txtA1 = new JTextArea(5,20);
        b.add(txtA1);
        setSize(300,160);
        show();
    }
    public static void main(String[] args){
    ExampleTextField a = new ExampleTextField();
    }
}
