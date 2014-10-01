//
import java.util.Scanner;

public class BoolaBoola {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int Boola = (int)(Math.random()*2)+1;
        int Boola2 = (int)(Math.random()*2)+1;
        int TorF = (int)(Math.random()*2)+1;
        int TorF2 = (int)(Math.random()*2)+1;
        int TorF3 = (int)(Math.random()*2)+1;
        String BoolaBoola1, BoolaBoola2, TF1, TF2, TF3;
        switch (Boola) {
            case 1: BoolaBoola1 = "||";
            break;
            case 2: BoolaBoola1 = "&&";
            break;
            default: BoolaBoola1 = "Error";
            break;
        }//end of switch for boola1
        switch (Boola2) {
            case 1: BoolaBoola2 = "||";
            break;
            case 2: BoolaBoola2 = "&&";
            break;
            default: BoolaBoola2 = "Error";
            break;
        }//end of switch for boola2
        switch (TorF) {
            case 1: TF1 = "true";
            break;
            case 2: TF1 = "false";
            break;
            default: TF1 = "Error";
            break;
        }//end of switch for TorF
        switch (TorF2) {
            case 1: TF2 = "true";
            break;
            case 2: TF2 = "false";
            break;
            default: TF2 = "Error";
            break;
        }//end of switch for TorF2
         switch (TorF3) {
            case 1: TF3 = "true";
            break;
            case 2: TF3 = "false";
            break;
            default: TF3 = "Error";
            break;
        }//end of switch for TorF3
        //now I need to generate the problem
        String Question = TF1+BoolaBoola1+TF2+BoolaBoola2+TF3;
        String UltimateAns;
        switch (Question) {
            case "true||false||false" : UltimateAns = "t";
            break;
            case "false||true||false" : UltimateAns = "t";
            break;
            case "true&&true||false" : UltimateAns = "t";
            break;
            case "true||true||false" : UltimateAns = "t";
            break;
            case "true||false||true" : UltimateAns = "t";
            break;
            case "true&&true&&true" : UltimateAns = "t";
            break;
            case "true||true&&true" : UltimateAns = "t";
            break;
            case "true||true||true" : UltimateAns = "t";
            break;
            case "false||true||true" : UltimateAns = "t";
            break;
            case "false||false||true" : UltimateAns = "t";
            break;
            case "true&&true||true" : UltimateAns = "t";
            break;
            case "false||true&&true" : UltimateAns = "t";
            break;
            default: UltimateAns = "f";
            break;
        }

        System.out.print("Does "+Question+" have the value True or False?(t/f) - ");
        String Answer = myScanner.nextLine();
        
        if(UltimateAns.equals(Answer)) {
            System.out.println("Correct");
        }
        else {
            System.out.println("incorrect");
        }
        
        
        
        
        
        
        
    }//end of main method
}//end of class