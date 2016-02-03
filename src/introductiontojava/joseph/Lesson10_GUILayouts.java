/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontojava.joseph;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author oracle
 */

public class Lesson10_GUILayouts {
    JFrame frame;
    JPanel panel, panel1, panel2;
    JLabel lbltitle, lbluser, lblpass, lbldomain;
    JTextField txtuser; 
    JComboBox cbo;
    JButton btnlogin;
    JPasswordField txtpass;
    
    public Lesson10_GUILayouts () {
        lbltitle = new JLabel("Login App");
        lbluser = new JLabel ("Username");
        lblpass = new JLabel("Password");
        lbldomain = new JLabel ("Login As?");
        txtuser = new JTextField (25);
        txtpass = new JPasswordField(25);
        btnlogin = new JButton ("Login");
        
          String[] domain = {"Admin", "User"};
        cbo = new JComboBox(domain);
        
        panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.add(lbltitle);
        
        
        panel1 = new JPanel (new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        g.insets = new Insets(5,5,5,5);
        panel1.add(lbluser, g);
        
        g.gridx = 1;
        g.gridy = 0;
        panel1.add(txtuser, g);
        
        g.gridx = 0;
        g.gridy = 1;
        panel1.add(lblpass, g);
        
        g.gridx = 1;
        g.gridy = 1;
        panel1.add(txtpass, g);
        
        g.gridx = 0;
        g.gridy = 2;
        panel1.add(lbldomain, g);
        
        g.gridx = 1;
        g.gridy = 2;
        panel1.add(cbo, g);
        
        g.gridx = 1;
        g.gridy = 3;
        panel1.add(btnlogin, g);
            
       
    
        frame = new JFrame("Login App");
        frame.add(panel, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new Lesson10_GUILayouts();
        
        
    }
}
/*
 * To change this template, choose Tools | Templates
 * package introductiontojava.joseph;

import java.awt.*;
import javax.swing.*;



public class Lesson10_GUILayouts {
    JFrame frame;
    JPanel panel;
    JLabel lbltitle, lbluser, lblpass, lbldomain;
    JTextField txtuser; 
    JComboBox cbo;
    JButton btnlogin;
    JPasswordField txtpass;
    
    public Lesson10_GUILayouts () {
        lbltitle = new JLabel("Login App");
        lbluser = new JLabel ("Username");
        lblpass = new JLabel("Password");
        lbldomain = new JLabel ("Login As?");
        txtuser = new JTextField (25);
        txtpass = new JPasswordField(25);
        btnlogin = new JButton ("Login");
        
        String[] domain = {"Admin", "User"};
        cbo = new JComboBox(domain);
        
        panel = new JPanel(new BorderLayout());
        panel.add(lbltitle, BorderLayout.NORTH);
        panel.add(lbluser, BorderLayout.CENTER);
        panel.add(txtuser, BorderLayout.EAST);
        panel.add(lblpass,BorderLayout.WEST);
        panel.add(txtpass);
        panel.add(lbldomain);
        panel.add(cbo);
        panel.add(btnlogin, BorderLayout.SOUTH);       

    
        frame = new JFrame("Login App");
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new Lesson10_GUILayouts();
        
        
    }
}
 * and open the template in the editor.
 */