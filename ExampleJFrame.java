/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import javax.swing.JFrame;

/**
 *
 * @author ilckom
 */
public class ExampleJFrame {
private final JFrame contohFrame;
public ExampleJFrame(){
    contohFrame = new JFrame("Contoh JFrame");
}
public void launchFrame(){
    contohFrame.setSize(400,200);
    contohFrame.setResizable(true);
    contohFrame.setVisible(true);
}
    public static void main(String[] args) {
    ExampleJFrame a = new ExampleJFrame();
    a.launchFrame();
    }
    
}
