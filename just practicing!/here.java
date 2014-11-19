import java.util.Scanner;
//first import the scanner
//define the class
public class here {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        int x=myScanner.nextInt();
        x=sumPow(x);
        System.out.println(x);
    }
    public static int sumPow(int x){
    int i=0,j=0,a=0,k=0;
     for (i=1;i<=x;i++){
         a=i;
         for(j=1;j<i;j++){
             a=a*i;
         }
         k=k+a;
     }
     return k;
    }
}