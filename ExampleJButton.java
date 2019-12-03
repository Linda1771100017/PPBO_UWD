/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ilckom
 */
public class ExampleJButton extends JFrame{
    private final JButton btn1, btn2;
    public ExampleJButton(){
        Container b = getContentPane();
        btn1 = new JButton("Oke");
        btn2 = new JButton("Cancel");
        b.add(btn1);b.add(btn2);
        setSize(300,100);
        show();
    }
    public static void main(String[] args){
    ExampleJButton a = new ExampleJButton();
    }
}
