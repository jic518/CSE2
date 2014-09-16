///this program will calculate cube root
//Ji Ho Choi
import java.util.Scanner;
//define class
public class Root {
    //main method
    public static void main(String[] args) {
        Scanner RootScanner;
        RootScanner = new Scanner( System.in );//scanner ready
        System.out.print("Enter a double, and I print its cube root- ");
        Double Cube = RootScanner.nextDouble();
        Double Guess1 = Cube/3;
        Double Guess2 = (2*Guess1*Guess1*Guess1+Cube)/(3*Guess1*Guess1);
        Double Guess3 = (2*Guess2*Guess2*Guess2+Cube)/(3*Guess2*Guess2);
        Double Guess4 = (2*Guess3*Guess3*Guess3+Cube)/(3*Guess3*Guess3);
        Double Guess5 = (2*Guess4*Guess4*Guess4+Cube)/(3*Guess4*Guess4);
        Double Guess6 = (2*Guess5*Guess5*Guess5+Cube)/(3*Guess5*Guess5);
        System.out.println("The cube root is "+Guess6+":");
        System.out.println(Guess6+"*"+Guess6+"*"+Guess6+"=" + (Guess6*Guess6*Guess6));
    
    }//end of main method
}//end of public class