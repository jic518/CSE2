//this lab will make me practice the alternate handlings of the same code.
import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
	Scanner scan=new Scanner(System.in);
	int n=0;

	System.out.print("Enter an int- ");
	if(!scan.hasNextInt()){
	do {
	    scan.next(); //get rid of the junk entered by user
	    System.out.print("You did not enter an int; try again- ");
	}
	while(!scan.hasNextInt());
	}
	//COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A 
	//DO-WHILE LOOP
        n=scan.nextInt();
    int j = 0;
    int t = 0;
    while(j<n) {
        while(t<j+1){
            System.out.print("*");
            t++;
        }
        System.out.println();
        j++;
        t=0;
    }
	//COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH 
	//WHILE STATEMENTS
      
	int k=4;

	while(k<5){
	    System.out.println("k="+k);
	    k++;
	}
         
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
	//WITH A WHILE LOOP


	int count1 = 0;
	for(;;){
	    if(n==1 || n==2){
	        System.out.print("Case 2 ");
	        continue;
	    }
	    else if(n == 3){
	        break;
	    }
	    else if (n==4||n==5) {
	        System.out.println("Case 4");
	        System.out.println("Case 5");
	    }
	    else {
	        System.out.println(n + " is > 5 or <1");
	    }
	    count1++;
	    if(count1>10){
	        break;
	    }
	    
	}
	//COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE UING
	// ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
	//RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G., 
	//   -5, 1, 20, 5, ETC.
	//IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY 
	//SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    }
}