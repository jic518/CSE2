//This program will calculate the how much days are in a month
//Ji Ho Choi
import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter an int giving the number of the month (1-12)- ");
        int inputmonth = myScanner.nextInt();
        int Days;
        if (inputmonth > 12) {
            System.out.println("You did not enter int (1-12)");
            return;
        }//end of if statement
        if (inputmonth >= 0) {
            System.out.println("You did not enter int (1-12)");
        }
        if (inputmonth == 1 || inputmonth == 3 || inputmonth == 5 || inputmonth == 7
            || inputmonth == 8 || inputmonth == 10 || inputmonth ==12) {
                Days = 31;
            System.out.println(Days);
            }//end of if
        else if (inputmonth == 4 || inputmonth == 6 || inputmonth == 9 || inputmonth == 11) {
             Days = 30;

                
            System.out.println(Days);
            }//used else if to input months that only have 30 days
        else if (inputmonth == 2) {
            System.out.print("Enter and int giving the year: ");
            int inputyear = myScanner.nextInt();
            if (inputyear == 2000) {
                Days = 29;
                //used if inside else if
                
                System.out.println(Days);
            }
            else {
                Days =28;
                System.out.println(Days);
                
            }
        }

    }
}