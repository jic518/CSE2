import java.util.Scanner;

public class RandomGames {
   public static void main(String[] args) {
       //First I need to generate a lottery number]
       int Roulette = (int)(Math.random() * 36);
       Scanner myScanner = new Scanner(System.in);
       System.out.print("Enter R or r for roulette, C or c for craps, P or p for pick a card: ");
       if (myScanner.hasNextLine()) {
           String EnteraGame = myScanner.nextLine();
           if (EnteraGame == "R" || EnteraGame == "r") {
               System.out.println("hja");
           }//end of Roulette
       }//if for has next string
       else {
           System.out.println("What are you saying");
       }
   } //end of main method
}//end of class