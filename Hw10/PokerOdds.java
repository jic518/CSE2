//This program will randomly take out the cards from the deck and will display it to the user until user wants
//to stop the process. When showHands() is terminated, the program will repeat the showhands 10000 times to check
//the probability of having only one pair and sort it by the rank.
import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {
        showHands();
        simulateOdds();
    }
    public static void showHands() {
        //create a deck
        String Input;
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        do {
            int[] Deck = new int[52];
            String[] Suits = {
                "Clovers", "Diamonds", "Hearts", "Spades"
            }; //4 suits
            String[] Numbers = {
                "Ace of", "2 of", "3 of", "4 of", "5 of", "6 of", "7 of", "8 of", "9 of", "10 of", "Jack of", "King of", "Queen of"
            }; //13#s in a card
            //create a element for each arrays
            for (int i = 0; i < Deck.length; i++) {
                Deck[i] = i; //automatically create the deck
            }
            int[] Hand = {
                -1, -1, -1, -1, -1
            }; //create the array that will represent the hand
            for (int t = 0; t < Hand.length; t++) {
                do {
                    int Draw = (int)(Math.random() * Deck.length); //this will randomize the draw
                    int Origin = Hand[t]; //create variable Origin to save the original array Hand
                    Hand[t] = Deck[Draw]; //replace the elements in Hand with the deck
                    Deck[Draw] = Origin; // place -1 inside the deck to switch the ones that have been taken out

                }
                while (Hand[t] < 0);
            }
            for (int s = 0; s < Hand.length; s++) {
                String CDHS = Suits[Hand[s] / 13];
                String Num = Numbers[Hand[s] % 13];
                System.out.println("You drew " + Num + " " + CDHS);
            }
            System.out.print("Would you like to do it again? y or Y to continue anything else to quit- ");
            Input = myScanner.nextLine();
        }
        while (Input.equals("y") || Input.equals("Y"));
    }
    public static void simulateOdds() {
        int[] Deck = new int[52];
        //create a element for each arrays
        int NoPair = 0, counter = 0;
        int nA = 0, nTwo = 0, nThree = 0, nFour = 0, nFive = 0, nSix = 0, nSeven = 0, nEight = 0, nNine = 0, nTen = 0, nJack = 0, nQueen = 0, nKing = 0;
        //created a variable that will keep track of the number of single pairs user encounters during the simulation
        for (int Sim = 0; Sim < 10000; Sim++) {
            for (int i = 0; i < Deck.length; i++) {
                Deck[i] = i; //automatically create the deck
            }

            int[] Hand = {
                -1, -1, -1, -1, -1
            }; //create the array that will represent the hand
            for (int t = 0; t < Hand.length; t++) {
                do {
                    int Draw = (int)(Math.random() * Deck.length); //this will randomize the draw
                    int Origin = Hand[t]; //create variable Origin to save the original array Hand
                    Hand[t] = Deck[Draw]; //replace the elements in Hand with the deck
                    Deck[Draw] = Origin; // place -1 inside the deck to switch the ones that have been taken out

                }
                while (Hand[t] < 0);
            }
            
            for (int Verify = 0; Verify < 5; Verify++) {
                for (int Verify2 = 0; Verify2 < 5; Verify2++) {//these two loops will allow for comparison
                    if(Index( Verify, Verify2, Hand[Verify],Hand[Verify2])==true){//if I nest another if statement like if(Verify!=Verify2) the
                    //program wouldn't run the if statement also if(Hand[Verify]==Hand[Verify2] && Verify!=Verify2)
                    //did not work. But since the program will meet the requirements for if statement 50000 times I decided to divide
                    //the outcome by 5 which gave me 10,000, but if the program were to have a real pair inside it
                    //the counter will inevitably run 7 times
                    //using method doesn't work//it works,but not as intended
                         switch (Hand[Verify]%13) {
                            case 0:
                                nA++;
                                break;
                            case 1:
                                nTwo++;
                                break;
                            case 2:
                                nThree++;
                                break;
                            case 3:
                                nFour++;
                                break;
                            case 4:
                                nFive++;
                                break;
                            case 5:
                                nSix++;
                                break;
                            case 6:
                                nSeven++;
                                break;
                            case 7:
                                nEight++;
                                break;
                            case 8:
                                nNine++;
                                break;
                            case 9:
                                nTen++;
                                break;
                            case 10:
                                nJack++;
                                break;
                            case 11:
                                nQueen++;
                                break;
                            case 12:
                                nKing++;
                                break;
                        }//case statement to increase the counter
                    }
                }
            }
        }
        System.out.println("Rank   Freq of exactly one pair");
        System.out.println("A      "+nA/12);
        System.out.println("K      "+nKing/12);
        System.out.println("Q      "+nQueen/12);
        System.out.println("J      "+nJack/12);
        System.out.println("10     "+nTen/12);
        System.out.println("9      "+nNine/12);
        System.out.println("8      "+nEight/12);
        System.out.println("7      "+nSeven/12);
        System.out.println("6      "+nSix/12);
        System.out.println("5      "+nFive/12);
        System.out.println("4      "+nFour/12);
        System.out.println("3      "+nThree/12);
        System.out.println("2      "+nTwo/12);
        System.out.println("_____________");
        int Sum = nA/12+nKing/12+nQueen/12+nJack/12+nTen/12+nNine/12+nEight/12+nSeven/12+nSix/12+nFive/12+nFour/12+nThree/12+nTwo/12;
        System.out.println("total not exactly one pair:   "+(10000-Sum));
    }//this will display the numbers
    public static boolean Index(int Verify, int Verify2, int Hand, int Hand2){//method that will compare doesn't work if i set index = Verify!=Verify2
        boolean index = Hand==Hand2;
        if(index==true){
            index = Verify==Verify2;
        }
        else{
            index = false;
        }
        return index;
    }
}
