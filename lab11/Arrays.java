import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        int[] Array1 = new int[10];
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.println("Enter 10 ints- ");
        for(int i=0;i<10;i++) {
            Array1[i] = myScanner.nextInt();
        }//initialize and take user input and store into an Array
        int Sum = 0;
        for(int s=0;s<10;s++) {
            Sum = Sum + Array1[s];
        }//for loop for adding the sum
        int min = Array1[0];
        for(int t=0;t<10;t++) {
            if(min > Array1[t]) {
                min = Array1[t];
            }
        }//loop for min
        int max = Array1[0];
        for(int v=0; v<10; v++) {
            if(max<Array1[v]){
                max = Array1[v];
            }
        }
        System.out.println("The lowest entry is "+min);
        System.out.println("The highest entry is "+max);
        System.out.println("The sum is "+ Sum);
        for(int x=0;x<10;x++) {
            System.out.print(Array1[x]);
            System.out.println("      "+Array1[9-x]);
        }
        
    }// main method
}