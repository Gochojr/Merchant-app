/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontojava.joseph;
import java.util.Scanner;
/**
 *
 * @author oracle
 */
public class Lesson03_Exercise {
  public static void main(String [] args){  
  
      int answer, Amount;
      
      Scanner input = new Scanner(System.in);
      
            System.out.println("M-Pesa Services \n 1-Send Money \n 2-Withdraw");
              answer = input.nextInt();
            
              /* */
              
              if(answer==1){
                  System.out.println("How much do you want to send?");
            Amount = input.nextInt();
            if(Amount <= 100 && Amount <= 5000){
                System.out.println("It will cost Kshs 27 to send" + ' ' + Amount);
            }else if (Amount > 5000 && Amount <=10000) {
                System.out.println("it will cost you Kshs 50 to send" + ' '+ Amount);
            }
            
            /* */
            
            
              }else if(answer==2) {
                  System.out.println("How much do you want to withdraw?");
                  Amount = input.nextInt();
                     if(Amount <= 100 && Amount <= 5000){
                System.out.println("It will cost Kshs 30 to send" + ' ' + Amount);
            }else if (Amount > 5000 && Amount <=10000) {
                System.out.println("it will cost you Kshs 30 to send" + ' ' + Amount);
            }
        }
    }

}
             


 