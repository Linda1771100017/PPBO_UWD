/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ilckom
 */
public class ExampleLabel extends JFrame{
    Jlabel label1;
    Flowlayout f1;
    public ExampleLabel(){
        Container b = getContentPane();
        JLabel Jlabel;
        Jlabel = new JLabel("Praktikum GUI");
        b.add(Jlabel);
        setLayout(new FlowLayout());
        setSize(300,100);
        show();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        ExampleLabel a = new ExampleLabel();
    }
}
