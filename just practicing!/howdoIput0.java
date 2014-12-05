public class howdoIput0 {
    public static void main(String[] args) {
        int x[]={1,2,4,6};
        int u[]={3,4,5,6,7}, v = {2,21,5};
        System.out.println(enigma(u,enigma(u,v)));
    }
    public static int enigma(int x[], int y[]){
        int []temp;
        temp = x;
        temp[y[1]]=42;
        x=y;
        y=temp;
        y[0] = 33;
        return y[x[0]];
    }
}
