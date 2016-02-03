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
public class Lesson02_Exercise {
  public static void main(String [] args){  
  
      int answer, Amount;
      
      Scanner input = new Scanner(System.in);
      
            System.out.println("Currency Conversion \n 1-Kshs \n 2-Dollar");
              answer = input.nextInt();
            
              /* */
              
              if(answer==1){
                  System.out.println("How much do you want to convert to Dollars?");
            Amount = input.nextInt();
            if(Amount >= 200 && Amount <= 5000){
                System.out.println("It will cost Kshs 101.50 to convert" + ' ' + Amount);
            }else if (Amount > 5000 && Amount <=10000) {
                System.out.println("it will cost you Kshs 50 to send" + ' '+ Amount);
            }
            
            /* */
            
            
              }else if(answer==2) {
                  System.out.println("How much do you want to convert to Kshs?");
                  Amount = input.nextInt();
                     if(Amount <= 100 && Amount <= 5000){
                System.out.println("It will cost Kshs 0.101 per dollar to convert to" + ' ' + Amount);
            }else if (Amount > 5000 && Amount <=10000) {
                System.out.println("it will cost you Kshs 30 to send" + ' ' + Amount);
            }
        }
    }

}  
