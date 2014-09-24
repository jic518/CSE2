//This program will calculate the how much the income tax is
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Please enter an int giving the number of thousands: ");
        int Income = myScanner.nextInt();
        double TaxRate, Tax, incomeTax, realIncome, TaxRateinPercent;
        if (Income < 0) {
            System.out.println("You did not enter a positive integer");
            return;// simple error message
        }// end of if
        
        else if (Income < 20) {
            TaxRate = .05;
            TaxRateinPercent = TaxRate * 100;
            realIncome = Income * 1000;
            incomeTax = realIncome * TaxRate;
            System.out.println("The tax rate on $"+realIncome+" is "+TaxRateinPercent+"%"+", and the tax is $"+incomeTax);
        }
        else if (20 <= Income && Income < 40) {// I need to use && because I want to only limit that area
            TaxRate = .07;
            TaxRateinPercent = TaxRate * 100;
            realIncome = Income * 1000;
            incomeTax = realIncome * TaxRate;
            System.out.println("The tax rate on $"+realIncome+" is "+TaxRateinPercent+"%"+", and the tax is $"+incomeTax);
        }
        else if(40 <= Income && Income < 78) {
            TaxRate = .12;
            TaxRateinPercent = TaxRate * 100;
            realIncome = Income * 1000;
            incomeTax = realIncome * TaxRate;
            System.out.println("The tax rate on $"+realIncome+" is "+TaxRateinPercent+"%"+", and the tax is $"+incomeTax);
        }
        else if(Income >= 78) {
            TaxRate = .14;
            TaxRateinPercent = TaxRate * 100;
            realIncome = Income * 1000;
            incomeTax = realIncome * TaxRate;
            System.out.println("The tax rate on $"+realIncome+" is "+TaxRateinPercent+"%"+", and the tax is $"+incomeTax);
        }
        
       
        
    }//end of main method
}//end of class