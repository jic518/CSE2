//this will be a program that prompts the user to
//type in number and the program will compute that number
//Fundamentals of Programming
//Ji Ho Choi
import java.util.Scanner;
//importing the scanner
//define the class
public class Bicycle {
    //main method
    public static void main(String[] args) {
        //place the variable scanner
        Scanner CoolScanner;
        CoolScanner = new Scanner( System.in );
        /// will take the input from the commandline
        Double InchesWheel=27.0000;
        Double DiameterWheel=InchesWheel/63360;
        //convert to miles
        Double PI = 3.141592;
        //diameter is 27 inches
        System.out.print("Please enter the number of seconds: ");
        Double Seconds = CoolScanner.nextDouble();
        System.out.print("Please enter the number of counts: ");
        Double Counts = CoolScanner.nextDouble();
        Double Distance = Counts*PI*DiameterWheel;
        //this will calculate the distance
        //Now I need to calculate minutes
        Double Minutes = Seconds/60;
        Double Hours = Minutes/60;
        //Now calculate the average miles per hour
        Double MilesperHour = Distance/Hours;
        System.out.println("The distance was "+Distance+" miles and took "+Minutes+" minutes. ");
        System.out.println("The average mph was "+MilesperHour);
    
    
    }
}