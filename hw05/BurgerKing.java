//this program will prompt the user to enter a choice and the details of their choices
//to reveal the overall order.

import java.util.Scanner;

public class BurgerKing {
    public static void main(String[] args) {
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
        String BurFriSod, Final, End;
        System.out.print("Enter a letter to indicate the choice of Burger(B or b), Soda (S or s), Fries (F or f)- ");
        String BSF = myScanner.nextLine();
        switch (BSF) {
            case "B" : Final = "Burger";
                        
                        break;
            case "b" : Final = "Burger";
                        break;
            case "s" : Final = "Soda";
                        break;
            case "S" : Final = "Soda";
                        break;
            case "f" : Final = "fries";
                        break;
            case "F" : Final = "fries";
                        break;
            default : Final = "You did not enter B, b, s, S, f, F";
                        break;
        }// end of switch
        if (Final == "Burger") {
            System.out.print("type a or A for all the fixins, c or C for cheese, N or n for none of the above- ");
            String Cheese = myScanner.nextLine();
            switch (Cheese) {
                case "C" : End = "a burger with cheese";
                break;
                case "c" : End = "a burger with cheese";
                break;
                default : End = "a burger";
                break;
            }// end of switch
        }//if for burger
        else if (Final == "Soda") {
            System.out.print("Do you want Pepsi (p or P), Coke (C or c), Sprite (s or S) or Mountain Dew (M or m)- ");
            String Soda = myScanner.nextLine();
            switch (Soda) {
                case "p" : End = "Pepsi";
                break;
                case "P" : End = "Pepsi";
                break;
                case "C" : End = "Coke";
                break;
                case "c" : End = "Coke";
                break;
                case "s" : End = "Sprite";
                break;
                case "S" : End = "Sprite";
                break;
                case "M" : End = "Mountain Dew";
                break;
                case "m" : End = "Mountain Dew";
                break;
                default : End = "You did not enter a selection of a soda";
                break;
            }// end of switch for soda
        }//else if for soda
        else if (Final == "fries") {
            System.out.print("Do you want a large or small order of fries? (S, s, l, L)- ");
            String Size = myScanner.nextLine();
            switch (Size) {
                case "s" : End = "small fries";
                break;
                case "S" : End = "small fries";
                break;
                case "L" : End = "large fries";
                break;
                case "l" : End = "large fries";
                break;
                default : End = "you did not enter a size";
            }// end of switch for size
        }//end of else if for fries
        else if (Final == "You did not enter B, b, s, S, f, F") {
            End = "You did not enter B, b, s, S, f, F";
        }
        else {
            End = "Single character expected";
        }
        System.out.println("You ordered "+ End);
        
        
        
        
        
        
        
        
        
        
    }//end of main method
}//end of class