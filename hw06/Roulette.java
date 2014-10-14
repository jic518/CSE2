//this program will generate a random bet for a computer and simulate the outcome
//1000 times. The program will then tell the user how many times a person loses everything.
//it will compute the total winning and number of times person walks away with a profit in one session of 100 spins of the wheel.
public class Roulette {
    public static void main(String[] args) {
        
        int Bet = (int)(1+Math.random() * 38);
        int SimHund = 0;
        int SimThousand = 0;
        int NumMatchesHun = 0;
        int NumMatchThou = 0;
        int NumoftimesProfit = 0;
        int LossProfit = 0;
        
        while (SimThousand < 1000) {//experiment while
        
        SimThousand++;
        
        while (SimHund < 100){
        SimHund++;
        int Roulette = (int)(1+Math.random() * 38);
            if (Roulette == Bet) {
            NumMatchesHun++;
            }//this is an if statement that will calculate how many times the roulette number matches the bet
            
        }//this is a while statement that will simulate the Roulette for 1000 times
        if (NumMatchesHun >= 3) {
            NumoftimesProfit++;
            }// if to calculate number of profit a user makes for a single 100 roulette roll
    
        if (NumMatchesHun==0){
            LossProfit++;
        }
        
        }//experiment while
        
        System.out.println("I've got profit "+ NumoftimesProfit+" times");
        System.out.println("I've lost everything "+LossProfit+" times");
        System.out.println("I've won "+ NumMatchesHun+" times");
        
        
        
        
        
        
        
        
        
        
    }//end of main method
}//end of class
//I don't understand how you can repeat something under while statement 1000 more times. 10/13/14