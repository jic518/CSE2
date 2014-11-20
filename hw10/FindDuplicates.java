//This program will compare the each index and a value to show the user if the duplicates occur inside a single array
//the program will show if the array has any duplicates or if it only has one duplicate
import java.util.Scanner;
public class FindDuplicates {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];//create arrays
        String answer = "";
        do {
            System.out.print("Enter 10 ints- ");
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt();
            }
            String out = "The array ";
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {
                out += "has ";//if true
            }
            else {
                out += "does not have ";//if false
            }
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) {
                out += "has ";//if the exactlyOneDup returns true this will happen
            }
            else {
                out += "does not have ";//if the exactlyOneDup returns false this will happen
            }
            out += "exactly one duplicate.";
            System.out.println(out);//this will print out the output
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");//prompt the user if he/she wants to repeat the program again
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));// end of do while loop that will continue the program over and over again until user does not input Y or y
    }//this is the end of the main method

    public static String listArray(int num[]) {
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }// tgus us a method that will print out every single number in an array.
    public static boolean hasDups(int[] num) {// this method will show if the array has any duplicates
        int counter = 0;//counter that will determine how many duplicates there are
        for (int i = 0; i < 10; i++) {
            for (int s = 9; s >= 0; s--) {
                if (num[i] == num[s]) {//comparing each index
                    counter++;
                }
            }
        }
        if(counter > 10) {//the counter should equal ten because the counter will inevitable rise 10 times when compared with the same number
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean exactlyOneDup(int[] num) {
        int target = 12;// if there is only one duplicate, counter will reach 12
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            for (int s = 9; s >= 0; s--) {
                if (num[i] == num[s]) {
                    counter++;
                }
            }
        }
        if(counter == target) {
            return true;
        }
        else {
            return false;
        }
        
    }
}//end of class