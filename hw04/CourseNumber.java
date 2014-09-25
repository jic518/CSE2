//This Program will help the user calculate what year and what semester the course was offered
//first import the scanner
import java.util.Scanner;

public class CourseNumber {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a six digit number giving the course semester- ");
        if (myScanner.hasNextInt()) {//if #1 this if will set the input number to an integer
            int SixDigit = myScanner.nextInt();
            if (SixDigit <= 201440 && SixDigit >= 186510) {//if 2//this if will set the range that the number should be in
                if (SixDigit%100 == 10) {//if 3 //these ifs and else ifs will set the actual output
                    
                    System.out.println("The course was offered in the spring semester of "+(SixDigit-SixDigit%100)/100);
                
                }//end of if 3
                
                else if (SixDigit%100 == 20) {//if 4
                    
                    System.out.println("The course was offered in the summer 1 semester of "+(SixDigit-SixDigit%100)/100);
                }//end of if 4
                else if (SixDigit%100 == 30) {//if 5
                    
                    System.out.println("The course was offered in the summer 2 semester of "+(SixDigit-SixDigit%100)/100);
                }//end of if 5
                
                else if (SixDigit%100 == 40) {//if 6
                
                    System.out.println("The course was offered in the fall semester of "+(SixDigit-SixDigit%100)/100);
                    
                }//end of if6
                else {
                        System.out.println(SixDigit%100+" is not a legitimate semester.");
                        return;
                }//end of else
       
            }//End of if 2
        else {//else2
            System.out.println("The number was outside the range [186510, 201440]");
            return;
        }//end of else2
        }//end of if #1
        
        else {//else 3
            System.out.println("Your number is not an integer");
        }//else3
        
        
        
    }///end of method
}///end of class