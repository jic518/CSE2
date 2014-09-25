//This program will display time in conventional form if it is given the seconds.
import java.util.Scanner;
//first import the scanner
//define the class
public class TimePadding {
    public static void main(String[] args) {
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
        System.out.print("Enter the time in seconds- ");
        if (myScanner.hasNextInt()) { //if 1 (verifies if it is an integer)
            int Seconds = myScanner.nextInt();
           
            int hours = (Seconds/3600);
            int minutes = (Seconds/60)-(Seconds/60)%1-(hours*60);
        
            if (minutes < 10) {
                System.out.print("The time is "+hours+":0" + minutes);
            }
            else if (minutes > 10) {
                System.out.print("The time is "+hours+":"+minutes);
            }
            if  ((Seconds-(3600*hours)-(60*minutes-minutes%1)) < 10) {
                System.out.println(":"+"0"+((Seconds-(3600*hours)-(60*minutes-minutes%1))));
            }
            else if ((Seconds-(3600*hours)-(60*minutes-minutes%1)) > 10) {
                System.out.println(":"+((Seconds-(3600*hours)-(60*minutes-minutes%1))));
            }
            
            
            
            
            
            
            
            
        }//if 1
        
    }//end of main method
    
}//end of class