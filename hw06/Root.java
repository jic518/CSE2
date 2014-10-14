//this program will force the user to enter a double that is greater than 0
//uses the algorithm to compute the square root of the number, and then prints it out.
import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        double low = 0;
        double high = 0;
        double middle = 0;
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print("type in a double and I'll find the root of that double using the bisection method- ");
        if(myScanner.hasNextDouble()) {
            double UserX = myScanner.nextDouble();
            if (UserX >= 0) {
                high = UserX + 1;
                while ((high-low)>.0000001*(1+UserX)) {
                    middle = ((high - low)/2)+low;
                    
                    if(middle * middle > UserX) {
                        high = middle;
                    
                    }//end of the if for comparison
                    if(middle * middle < UserX) {
                    low = middle;
                    }//end of else
                    
                }//end of while
            System.out.println(middle);
            }//end of if
            else { 
                System.out.println("double you entered is less than zero");
        }
        
        
        }//end of myscanner next double
        
        
        
        
        
        
        else {
            System.out.println("type double and not a character!!");
        }//this comes up if the user does not enter a string
        
        
        
        
        
        
        
        
    }//end of main method
}//end of class