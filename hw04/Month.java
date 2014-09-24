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
        }
        if (inputmonth == 1 || inputmonth == 3 || inputmonth == 5 || inputmonth == 7
            || inputmonth == 8 || inputmonth == 10 || inputmonth ==12) {
                Days = 31;
            System.out.println(Days);
            }
        else if (inputmonth == 4 || inputmonth == 6 || inputmonth == 9 || inputmonth == 11) {
             Days = 30;

                
            System.out.println(Days);
            }
        else if (inputmonth == 2) {
            System.out.print("Enter and int giving the year: ");
            int inputyear = myScanner.nextInt();
            if (inputyear == 2000) {
                Days = 29;
                
                System.out.println(Days);
            }
            else {
                Days =28;
                System.out.println(Days);
                
            }
        }

    }
}