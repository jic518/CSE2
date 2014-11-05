import java.util.Scanner;
public class BlockedAgain {
    public static void main(String[] s) {
            int m;
            //force user to enter int in range 1-9, inclusive.
            m = getInt();
            allBlocks(m);
        } //end of main method
    public static int getInt(){
        Scanner myScanner;//call scanner
        myScanner = new Scanner(System.in);
        boolean Check=false;// this is a boolean to check if it is integer
        int User = -1;
        while(Check != true) {
            System.out.print("Enter an integer between 1 and 9, inclusive: ");
            if(checkInt(myScanner)){//this will bring the checkInt method
            User = myScanner.nextInt();
                if(checkRange(User)) {
                    Check = true;
                }
            }
        }
        return User;
        
    }//end of get int
    public static boolean checkInt(Scanner myScanner){
        boolean Check;
        if(myScanner.hasNextInt()) {
            Check = true;
        }
        else {
            System.out.println("You did not enter an integer try again.");
            myScanner.next();
            Check = false;
        }
        return Check;// this method will check the scanner and see if it is an integer
    }//end of checkInt
    public static boolean checkRange(int b){
        boolean Check;
        if(b<10 && b>0) {
            Check = true;
        }
        else{
            System.out.println("You did not enter an integer between 1 and 9 inclusive");
            Check = false;
        }
        return Check;
    }//end of checkRange
    public static void allBlocks(int x) {
    int s = 1;
                int No = x - s;
                if (x >= 1 && x <= 9) {

                    for (int i = 1; i <= x; i++) {
                        int increment = 2 * i - 1;//this calculates how many numbers there will be in a line



                        for (int c = 1; c <= i; c++) {

                            for (s = x; s > i; s--) {
                                System.out.print(" ");

                            }
                            for (int j = 1; j <= increment; j++) {

                                System.out.print(i);//this will print out how many numbers

                            }

                            System.out.println("");
                        }
                        for (s = x; s > i; s--) {// for loop for the indent
                                System.out.print(" ");

                            }
                        for (int b = 1; b <= increment; b++) {
                            System.out.print("-");
                        }
                        System.out.println("");//space that will come after the system prints out -
                    }
                }
    }//this method will be called to make the rocket
    
}//end of class