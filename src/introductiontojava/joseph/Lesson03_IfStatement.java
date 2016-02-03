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
/* String Gender means declaring variable Gender of datatype string */
/* null means we dont have a Form to present our message boxes */
public class Lesson03_IfStatement {
      public static void main(String [] args){
          
        /* String Gender; 
       Gender = JOptionPane.showInputDialog("Are you - \n 1-Male \n 2-Female");
       if(Gender.equals("Female")) {
          JOptionPane.showMessageDialog(null, "Entry points is 59"); 
      }else if (Gender.equals("Male")){
          JOptionPane.showMessageDialog(null, "Entry points is 62");
      }
       */
       String Color;
        Color=JOptionPane.showInputDialog("Name 1 Color in the Kenyan Flag?");
        if(Color.equals("Black")) {
            JOptionPane.showMessageDialog(null, "stands for Kenyan skin color");
        }else if (Color.equals("Red")) {
            JOptionPane.showMessageDialog (null, "stands for blood shed to attain independence");
        }else if (Color.equals("Green")) {
            JOptionPane.showMessageDialog(null, "stands for vegetation");
        }else if (Color.equals("White")) {
            JOptionPane.showMessageDialog(null, "symbolizes for peace");
        }else {
            JOptionPane.showMessageDialog (null, "Invalid Color");
        }      
      }
      }
