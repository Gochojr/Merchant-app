/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontojava.joseph;
 
import javax.swing.JOptionPane;
/**
 *
 * @author oracle
 */
public class Lesson01_UserInput {
    public static void main(String [] args){
        String Name;
        Name = JOptionPane.showInputDialog("Type your Name");
        
        System.out.println("Your Name is" + ' ' + Name);
        JOptionPane.showMessageDialog(null, "Your Name is" + Name);
    }
        
}
