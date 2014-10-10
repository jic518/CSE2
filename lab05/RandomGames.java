import java.util.Scanner;

public class RandomGames {
   public static void main(String[] args) {
       //First I need to generate a lottery number
       int Roulette = (int)(1+Math.random() * 40);
       Scanner myScanner = new Scanner(System.in);
       System.out.print("Enter R or r for roulette, C or c for craps, P or p for pick a card: ");
       
           String EnteraGame = myScanner.next();
           int RResult=Roulette;
           if (EnteraGame.equals("r") || EnteraGame.equals("R")) {
               switch (Roulette) {
                   case 1: System.out.println("00");
                   break;
                   case 2: System.out.println("0");
                   break;
                   default: System.out.println(RResult-4);
                   break;
               }//end of switch
           }//end of Roulette
           else if (EnteraGame.equals("C") || EnteraGame.equals("c")) {
               System.out.println("Craps not implemented yet");
           }//end of craps
           else if (EnteraGame.equals("P") || EnteraGame.equals("p")) {
               System.out.println("Picking a card not implemented");
           }
           else {
               System.out.println("'"+EnteraGame+"' is not one of 'R','r','C','c','P','p' ");
           }
     
   } //end of main method
}//end of class