/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontojava.joseph;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author oracle
 */
public class Lesson09_Gui {

    //Declare class variables
    JFrame frame;
    JButton btn, btn1;
    JPanel Panel;
    JLabel label;
    JTextField field;
    JComboBox cbo;
    JMenuBar bar;
    JMenuItem item;
    JMenu menu;

    public Lesson09_Gui() {

        btn = new JButton("Lesson 09");
        Inner C = new Inner();
        btn.addActionListener(C);
        btn1 = new JButton("Lesson 09 Button");
        btn1.addActionListener(C);
        
        label = new JLabel("Introduction to GUI");
        field = new JTextField(30);
        String[] Names = {"kiiru", "moses", "miriam", "joseph", "mbusa", "brian"};
        cbo = new JComboBox(Names);
        
        item = new JMenuItem("Exit");
        menu = new JMenu("File");
        bar = new JMenuBar();
        menu.add(item);
        bar.add(menu);

        Panel = new JPanel();
        Panel.add(bar);
        Panel.add(btn);
        Panel.add(btn1);
        Panel.add(label);
        Panel.add(field);
        Panel.add(cbo);


        frame = new JFrame("Introduction to GUI");
        frame.add(Panel);
        // frame.add(bar);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Lesson09_Gui();

    }

    class Inner implements ActionListener {

        public void actionPerformed(ActionEvent evt) {
            if (evt.getSource() == btn) {
                JOptionPane.showMessageDialog(null, "Button was clicked");
                //displays dialog box that btn was clicked

            }
            else if(evt.getSource()==btn1){
            field.setText("Btn1 was clicked");
            //sets into text box!
            
        }
        }
    }
}
