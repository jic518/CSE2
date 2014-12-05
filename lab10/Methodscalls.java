public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    public static int addDigit(int number,String digit) {
        if(number > 10 && number < 100) {
            number = digit*100+number;
        }
        if(number>100&&number<1000) {
            number = digit*1000+number;
        }
        if(number>1000&&number<10000) {
            number = digit*10000 + number;
        }
        else {
            number = digit * 10 + number;
        }
        return number;
    }
    public static int join(int number, int numbers) {
        for(int i=0; i<numbers.length; i++){
            number = 10 * number;
        }
        return number + numbers;
    }
}  
