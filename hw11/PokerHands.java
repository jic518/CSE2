//This program will prompt the user to create their own poker hand.
//It will then display the hand and tell the user the rank of their own hand!
import java.util.Scanner;
public class PokerHands {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        boolean Again = true;
        while(Again = true){
        String suit;
        int[] hand = new int[5];
        hand[0]=100;
        hand[1]=101;
        hand[2]=102;
        hand[3]=103;
        hand[4]=104;//dummy number
        int[] Sort = new int[5];
        
        int Counter = 0;
        boolean Esc = false;
        boolean jump = false;//dummy boolean
        String rank="randomlol";//dummy String
        int temp; //temp that will keep track of the hand in case user types in something that is a duplicate
        
        for (int i = 0; i < hand.length; i++) {//continue this five times
            
                do {
                    System.out.print("enter the suit(c,d,h,s)- ");
                    suit = myScanner.nextLine();
                    if (suit.equals("c") || suit.equals("s") || suit.equals("h") || suit.equals("d")) {
                        
                        Esc = false;
                    }
                    else {
                        System.out.println("enter a valid input");//in case user screws up
                    }
                } while (!"c".equals(suit) && !"s".equals(suit) && !"h".equals(suit) && !"d".equals(suit));
            
            if(suit.equals("c")){//using the calculation I was able to find this out
                hand[i] = 0;
            }
            if(suit.equals("d")){
                hand[i] = 13;
            }
            if(suit.equals("h")){
                hand[i] = 26;
            }
            if(suit.equals("s")){
                hand[i] = 39;
            }
            Esc = false;
            do{
                temp = hand[i];
                System.out.print("enter a rank(a, k, q, j, 10~2)- ");
                rank = myScanner.nextLine();
                if(rank.equals("a")){//depending on the rank, the program will add numbers corresponding to that hand
                    hand[i] = hand[i]+0;
                }
                if(rank.equals("k")){
                    hand[i] = hand[i]+1;
                }
                if(rank.equals("q")){
                    hand[i] = hand[i]+2;
                }
                if(rank.equals("j")){
                    hand[i] = hand[i]+3;
                }
                if(rank.equals("10")){
                    hand[i] = hand[i]+4;
                }
                if(rank.equals("9")){
                    hand[i] = hand[i]+5;
                }
                if(rank.equals("8")){
                    hand[i] = hand[i]+6;
                }
                if(rank.equals("7")){
                    hand[i] = hand[i]+7;
                }
                if(rank.equals("6")){
                    hand[i] = hand[i]+8;
                }
                if(rank.equals("5")){
                    hand[i] = hand[i]+9;
                }
                if(rank.equals("4")){
                    hand[i] = hand[i]+10;
                }
                if(rank.equals("3")){
                    hand[i] = hand[i]+11;
                }
                if(rank.equals("2")){
                    hand[i] = hand[i]+12;
                }
                
                if(i>0){// now I want to find out something that is bigger than index of zero
                    if(hand[i] == hand[i-1]){
                        jump = false;
                        hand[i] = temp;
                        System.out.println("The card you typed in already exists!");//in case of a duplicate
                    }
                    else{
                        jump = true;
                    }
                }
                else{
                    jump = true;
                }
            }
            while(i>0&&hand[i-1]==hand[i]);
            jump = false;
        }//
        
        Sort(hand);//this will sort the numbers and will help when Straight method to function
        Sort = SortforStraight(hand);
        SortSort(Sort);
        showOneHand(hand);//this function displays the hand
        HandRank(hand, Sort);//this function prints out the hand rank
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand-");
		String Y = myScanner.nextLine();
		Again = (Y.equals("y")||Y.equals("Y"));
        }
    }
    
    public static void showOneHand(int[] hand) {
        String suit[] = {
            "Clubs:    ", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        String out = "";
        for (int s = 0; s < 4; s++) {
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < 5; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out);
    }
    public static void HandRank(int[] hand, int[] Sort){
        String out = "This is a ";
        if(Straight(Sort)){
            out+="Straight ";
        }
        if(Flush(hand)){
            out+="Flush";
        }
        else{
            out+=Pairs(hand);
        }
        if(Royal(hand)){
            out="This is a Royal Flush!";
        }
        if("This is a ".equals(out)){//in case there are no higher ranks
            out+="high card";
        }
        System.out.println(out);
    }
    public static boolean Flush(int[] hand){
        int clubs = 0, diamonds = 0, hearts = 0, spades = 0;
        for(int i=0;i<hand.length;i++){//to minimize the chaos I had to calculate this
            if(hand[i]<13){
                clubs++;
            }
            if(hand[i]<26&&hand[i]>=13){
                diamonds++;
            }
            if(hand[i]>=26&&hand[i]<39){
                hearts++;
            }
            if(hand[i]>=39&&hand[i]<52){
                spades++;
                
            }
        }
        if(clubs==5||diamonds==5||hearts==5||spades==5){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean Straight(int[] Sort){
        int clubs = 0, diamonds = 0, hearts = 0, spades = 0;
        for(int i = 1;i<Sort.length; i++){
            if(Sort[i]<13){
                if(Sort[i]%13==((Sort[i-1]%13)+1)){//compares with the one behind the sorted array
                    clubs++;
                }
            }
        }
        for(int i = 1;i<Sort.length; i++){
            if(Sort[i]>=13&&Sort[i]<26){
                if(Sort[i]%13==((Sort[i-1]%13)+1)){
                    diamonds++;
                }
            }
        }
        for(int i = 1;i<Sort.length; i++){
            if(Sort[i]>=26&&Sort[i]<39){
                if(Sort[i]%13==((Sort[i-1]%13)+1)){
                    hearts++;
                }
            }
        }
        for(int i = 1;i<Sort.length; i++){
            if(Sort[i]>=39&&Sort[i]<52){
                if(Sort[i]%13==((Sort[i-1]%13)+1)){
                    spades++;
                }
            }
        }
        int sum = clubs+diamonds+hearts+spades;
       
        if(sum==4){
            return true;
        }
        
        if(sum==3){//in case A,2,3,4,5 it is a straight, but a, k, q,2,,3 is not a straight.
            if(Sort[0]==1||Sort[1]==1||Sort[2]==1||Sort[3]==1||Sort[4]==1){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
        
    }
    public static void Sort(int[] hand){//this method will help Straight to function well.
        for(int i = 0; i<hand.length;i++){
            int Min = hand[i];
            int MinIndex = i;
            
            for(int j = i+1; j<hand.length;j++){
                if(Min>hand[j]){
                    Min = hand[j];
                    MinIndex = j;
                }
            }
            if(MinIndex != i){
                hand[MinIndex] = hand[i];
                hand[i] = Min;
            }
        }
    }
    public static String Pairs(int[] hand){// this will take care of the pairs in the hand as well as full house and three four of a kind
        int counter = 0;
        String out = "";
        for(int i = 0;i<hand.length;i++){
            for(int h=0;h<hand.length;h++){
                if(hand[i]%13==(hand[h]%13)){//each same numbers have 13 difference in them.
                    counter++;
                }
            }
        }
        if(counter==7){//calculating the numbers taking forever
            out+="One Pair";
        }
        if(counter==9){
             out+="Two Pair";
        }
        if(counter==11){
             out+="Three of a Kind";
        }
        if(counter==13){
             out+="Full House";
        }
        if(counter==17){
             out+="Four of a Kind";
        }
        
        return out;
        
    }
    public static boolean Royal(int[] hand){
        int clubs = 0, diamonds = 0, hearts = 0, spades = 0;
        for(int i = 1;i<hand.length; i++){
            if(hand[i]<13){
                if(hand[i]==(hand[i-1]+1)){//compares with the one behind the sorted array
                    clubs++;
                }
            }
        }
        for(int i = 1;i<hand.length; i++){
            if(hand[i]>=13&&hand[i]<26){
                if(hand[i]==(hand[i-1]+1)){
                    diamonds++;
                }
            }
        }
        for(int i = 1;i<hand.length; i++){
            if(hand[i]>=26&&hand[i]<39){
                if(hand[i]==(hand[i-1]+1)){
                    hearts++;
                }
            }
        }
        for(int i = 1;i<hand.length; i++){
            if(hand[i]>=39&&hand[i]<52){
                if(hand[i]==(hand[i-1]+1)){
                    spades++;
                }
            }
        }
        if(clubs==4||diamonds==4||hearts==4||spades==4){
            if(hand[0]==0&&hand[1]==1&&hand[2]==2&&hand[3]==3&&hand[4]==4){//using the calculations we can see the patterns of royal flushes
                return true;
            }
            if(hand[0]==13&&hand[1]==14&&hand[2]==15&&hand[3]==16&&hand[4]==17){
                return true;
            }
            if(hand[0]==26&&hand[1]==27&&hand[2]==28&&hand[3]==29&&hand[4]==30){
                return true;
            }
            if(hand[0]==39&&hand[1]==40&&hand[2]==41&&hand[3]==42&&hand[4]==43){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
     public static int[] SortforStraight(int[] hand){//this method will help Straight to function well.
        int[] Sort = new int[5];
        Sort[0]=hand[0]%13;
        Sort[1]=hand[1]%13;
        Sort[2]=hand[2]%13;
        Sort[3]=hand[3]%13;
        Sort[4]=hand[4]%13;
        return Sort;
    }
    public static void SortSort(int[] Sort){//this method will help Straight to function well.
        for(int i = 0; i<Sort.length;i++){
            int Min = Sort[i];
            int MinIndex = i;
            
            for(int j = i+1; j<Sort.length;j++){
                if(Min>Sort[j]){
                    Min = Sort[j];
                    MinIndex = j;
                }
            }
            if(MinIndex != i){
                Sort[MinIndex] = Sort[i];
                Sort[i] = Min;
            }
        }
    }
}
