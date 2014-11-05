import java.util.Scanner;
public class HW8 {
    public static void main(String[] arg) {
        char input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input = getInput(scan, "Cc");
        System.out.println("You entered '" + input + "'");
            System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
            input = getInput(scan, "yYnN", 5); //give up after 5 attempts
            if (input != ' ') {
                System.out.println("You entered '" + input + "'");
            }
            input = getInput(scan, "Choose a digit.", "0123456789");
            System.out.println("You entered '" + input + "'");
        }
    
    
    public static char getInput(Scanner abc, String test) { //to scan the user's input
            char input;
            String USER = abc.next();
            int Length = test.length(); //this will calculate the length
            if (Length > 1) {
                for (int i = 0; i < Length; i++) {
                    if (USER.charAt(0) == test.charAt(i)) {

                        return input.toChar(USER);
                    }
                    else {
                        System.out.println("you did not enter a character from the list 'Cc', try again");
                        return input.toChar(USER);
                    }
                }
            }
            else {
                System.out.println("You should enter exactly one character");
            }

        } //method for continue?
    public static char getInput(Scanner cde, String Hi, int Increment) {
        char input;
        String Second = cde.next();
        for (int i = 5; i < 1; i--) {
            if (Second.equals("Y") || Second.equals("y") || Second.equals("N") || Second.equals("n")) {// this will take the response from the user yYNn
                input = (char)Second;
            }//end of if
            else {
                continue;
            }//end of else
        }//end of for loop
        return input;
    }//end of 2nd method

    public static int getInput(Scanner xyz, String digit, String number) {// this will calculate the digit
        System.out.print("enter one of '0' '1' '2' '3' '4' '5' '6' '7' '8' '9'- " );
        int INput= xyz.nextInt();
        char input;
        input=(int)input;
        boolean t= INput<0||INput>9;
        while(false){
            if (INput>9||INput<0) {
                System.out.println("You did not enter one of above");
                continue;
            }
            else{
                input = INput;
                return input;
            }
        }
    }
}//end of class