/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author ilckom
 */
public class ExampleJComboBox extends JFrame{
    private final JComboBox cbx;
    public ExampleJComboBox(){
        Container a = getContentPane();
        String[] items = {"komputer","mouse","keyboard","hardisk","printer"};
        cbx = new JComboBox(items);
        a.setLayout(new FlowLayout());
        a.add(cbx);
        Component add = a.add(new JScrollPane(cbx));
        setSize(300,190);
        show();
    }
    public static void main(String[] args){
    ExampleJComboBox x = new ExampleJComboBox();
    }
}
