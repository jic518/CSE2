//Now I will create the tool that will show the first four decimals
//Ji Ho Choi
import java.util.Scanner;//Import the scanner
//Define class
public class FourDigits {
    //main method
    public static void main(String[] args) {
        Scanner DigitScanner;
        DigitScanner = new Scanner( System.in );
        //Scanner setup complete
        System.out.print("Enter a double with four decimal points and I display the four digits to the right of a decimal point- ");
        Double RandomDouble = DigitScanner.nextDouble();
        System.out.print("Enter an integer that is from the left of the decimal point in the previous double- ");
        //type an integer
        int LeftDouble = DigitScanner.nextInt();
        double output1 = RandomDouble-LeftDouble;
        double output2 = output1*10000;
        int output3 = (int) output2;
        
        System.out.println("The four digits are "+output3+". Add zeros in front of the number if less than three digits are shown.");
        
        
        
        
        
        
        
        
        
        
    }//end of main method
}//end of class