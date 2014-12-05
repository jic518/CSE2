public class D {
    public static void main(String args[]) {
        System.out.println(x("one", "two", "three"));
    }
    public static String x(int a, String b){
		return a+b;
	}

	public static int  x(int a, int b, int c){
		return a+b*c;
	}

}