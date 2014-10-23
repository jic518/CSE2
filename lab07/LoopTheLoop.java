//this program will prompt users for the number and will create the * until the
//loop reaches the number that the user typed. It will then prompt the user
//if he wants to repeat the program again and do so if the user types yes.
import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        String Y = "*";
        System.out.print("Please type in any integer between 1 and 15(inclusive)- ");
        if(myScanner.hasNextInt()) {
            int X = myScanner.nextInt();
            if (X>=1 && X<=15) {
                while (X>=0) {
                    System.out.println(Y*5);
                    X--;
                }
                
            }
            else {
                System.out.println("You did not enter an integer in the range [1,15]");
            }//to determine that the integer is in the range [1,15]
        }//this is the end of the if for determining if the input was an integer
        else {
            System.out.println("You did not enter an integer in the range [1,15]");
            return;
        }//this is the end of the else for determining if the input was an integer or not
        
        
        
        
        
        
        
        
        
    }//end of main method
}//end of class