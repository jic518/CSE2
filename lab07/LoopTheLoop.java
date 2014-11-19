//this program will prompt users for the number and will create the * until the
//loop reaches the number that the user typed. It will then prompt the user
//if he wants to repeat the program again and do so if the user types yes.
import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int nStars = 10;
        int S = 10;
        System.out.println("Please type integer between 1 and 15 inclusive- " );
        
        
        while(S>=1){//this will print out how many lines there are
            while(nStars>=S) {
                System.out.print("*");//prints out the stars according to S
                nStars--;
            }
            System.out.println();
            nStars=10;//I need to reset
            S--;//counter
        }
        

        
        
        
        
        
        
        
        
    }//end of main method
}//end of class