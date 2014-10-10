/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
       int k=4,p=6,q=7,r=8;// changed the location of this switch statement and erased n
        switch(k+p+q+r){
            case 24: 
            case 25: System.out.println("sum is 25");
                    System.out.println("To repeat, you entered "+n);//copied the statement to case 25
            break;//added break
            default:
            break;//added break to insure that the statement is not exclusive to default
            
    }
    }
    else{
      int n=4;
      System.out.println("You entered "+n);
      int k=4,p=6,q=7,r=8;// changed the location of this switch statement and erased n
        switch(k+p+q+r){
            case 24: 
            case 25: System.out.println("sum is 25");
                    System.out.println("To repeat, you entered "+n);//copied the statement that to make the system run this statement
            break;//added 
            
            default:
            break;//added break to insure that the statement is not exclusive to default
            
    }
    }
    
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 */
 //error was caused because n was not initialized because of the scope. I changed the location of the switch statement, changed the location of the System.out.println to fix this program
