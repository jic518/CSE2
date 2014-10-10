// this program will prompt the user of the order
//and give the resulting answer and the price of that order
import java.util.Scanner;
//import the scanner
public class BigMacAgain {
    public static void main(String[] args)    {
        Scanner myScanner;
        myScanner = new Scanner( System. in );
        double PriceMacs;
        System.out.print("Enter the number of Big Macs- ");
        if(myScanner.hasNextInt()) {
            int nBigMacs = myScanner.nextInt();
            if(nBigMacs > 0) {
                PriceMacs = nBigMacs*2.22;
                double CleanPriceMacs = (int)(PriceMacs * 100);
                double finalMacs = CleanPriceMacs/100;
                System.out.println("You ordered "+nBigMacs +"Big Macs for the cost of "+nBigMacs+"*2.22 =" + finalMacs);
                System.out.print("Do you want an order of fries? (Y/y/N/n)- ");
                if (myScanner.hasNext()) {
                    String Fries = myScanner.next();
                    if (Fries.equals("Y")||Fries.equals("y")) {
                        System.out.println("You ordered fries at a cost of $2.15");
                        System.out.println("The total cost of the meal is $"+finalMacs+2.15);
                }//checks if the usere wants the fries case yes
                    else if (Fries.equals("N")||Fries.equals("n")) {
                        System.out.println("The total cost of the meal is $"+finalMacs);
                    }//end of the no
                    else {
                        System.out.println("You did not enter Y/y/N/n");
                    }//end of else
                
                }//end of fries if
                else {
                    System.out.println("You did not enter a String");
                }//hasnextline
            }//checks if the number is bigger than 0
            else {
                System.out.println("You did not enter an integer bigger than 0");
            }//end of bigger than 0
        }//end of BigMacs int
        else {
            System.out.println("You did not enter an integer");
        }
    }//end of main method
}//end of class
