//This program will display time in conventional form if it is given the seconds.
import java.util.Scanner;
//first import the scanner
//define the class
public class TimePadding {
    public static void main(String[] args) {
        Scanner myScanner;
        int minutes, hours;
        myScanner = new Scanner(System.in);
        System.out.print("Enter the time in seconds- ");
        if (myScanner.hasNextInt()) { //if 1 (verifies if it is an integer)
            int Seconds = myScanner.nextInt();
                    if (Seconds < 60 && Seconds%60>=10) {//if2 (if it is more than 60 seconds, it will calculate it into minutes)
                System.out.println("The time is "+"00:00:"+Seconds%60);
                
            }//if2
            if (Seconds%60<10 && Seconds < 60) {//this if will add 0 in front of the seconds if the number turns out to be a single number
                    System.out.println("The time is "+"00:00:0"+Seconds%60);
                }// end of if 0 turns out single second
            else if (Seconds >= 60 && ((Seconds/60)-((Seconds/60)%1)) > 10 &&Seconds <= 3600) {//else if 1
                System.out.println("The time is "+"00:"+((Seconds/60)-((Seconds/60)%1))+":"+Seconds%60);
                 if (Seconds%60<10 && Seconds < 60) {//this if will add 0 in front of the seconds if the number turns out to be a single number
                    System.out.println("The time is "+"00:00:0"+Seconds%60);
                }// I need to copy this in case I will have eg. 65 secs
            }//end of else if 1
            else if (Seconds >= 60 && ((Seconds/60)-((Seconds/60)%1)) < 10 &&Seconds <= 3600) {
                System.out.println("The time is "+"00:0"+((Seconds/60)-((Seconds/60)%1))+":"+Seconds%60);
                 if (Seconds%60<10 && Seconds < 60) {//this if will add 0 in front of the seconds if the number turns out to be a single number
                    System.out.println("The time is "+"00:00:0"+Seconds%60);
                }// end of if 0 turns out single second
            }
            else if (Seconds >=3600) {
                System.out.println("The time is "+((Seconds/3600)-((Seconds/3600)%1))+":0"+((Seconds/3600)-(Seconds/3600)%60)+":0"+Seconds%60);
            }
            
            
            
            
            
            
            
            
        }//if 1
        
    }//end of main method
    
}//end of class