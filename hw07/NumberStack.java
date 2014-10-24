//this program will prompt the user for a number and will run a loop until it reaches
//the user's number.

import java.util.Scanner;
public class NumberStack {
    public static void main(String[] args) {
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            int i, count;
            System.out.print("please enter a number between 1 and 9- ");
            if (myScanner.hasNextInt()) {

                int Input = myScanner.nextInt();
                if (Input >= 1 && Input <= 9) {
                    System.out.println("using for loops: ");

                    for (i = 1; i <= Input; i++) {
                        int increment = 2 * i - 1;
                        for (int c = 1; c <= i; c++) {

                            for (int j = 1; j <= increment; j++) {

                                System.out.print(i);
                            }

                            System.out.println("");
                        }
                        for (int b = 1; b <= increment; b++) {
                            System.out.print("-");
                        }
                        System.out.println("");
                    }


                    /////Start of while loops
                    System.out.println("Using while loops: ");

                    int d = 1;
                    int e = 1;
                    int f = 1;
                    int g = 1;
                    
                    while (d <= Input) {
                        int increment2 = 2 * d - 1;
                        while (e <= d) {
                            while (f <= increment2) {
                                System.out.print(d);
                                f++;
    
                            }
                            
                            
                            System.out.println("");
                            e++;
                            f=0;
                        }
                        e=0;
                        while (g <= increment2) {
                            
                            System.out.print("-");
                            g++;
                        }
                        g=0;
                        System.out.println("");
                        d++;
            
                    }
                    
                    ////////////Start of do while loops
                    
                    System.out.println("Using do while loops: ");
                    int Last1 = 1;
                    int Last2 = 1;
                    int Last3 = 1;
                    int Last4 = 1;
                    
                } //end of if for the 1-9    






                else {
                    System.out.println("you did not enter a integer between 1 and 9");
                } // end of else


            } //if for int

        } //end of main method
} //end of class