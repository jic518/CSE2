public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double[] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }

public static boolean equals(double[] Array1, double[] Array2) {
    boolean TorF=false;
    int counter = 0;
    if(Array1.length == Array2.length) {
      for(int i=0; i<Array1.length;i++){
        if(Array1[i] == Array2[i]) {
          counter++;
        }
      }
      if(counter==Array1.length) {
        TorF = true;
      }
      else{
        TorF = false;
      }
    }
    else{
      TorF = false;
    }
    return TorF;
}
public static double[] addArrays(double[] Array1, double[] Array2) {
    double[] ArrayR;
    if(Array1.length >= Array2.length){
      ArrayR = new double[Array1.length];
      for(int s=0; s<Array2.length; s++) {
        ArrayR[s] = Array1[s] + Array2[s];
      }
      for(int t=Array2.length; t<Array1.length;t++){
        ArrayR[t] = Array1[t];
      }
    }
    else {
      ArrayR = new double[Array2.length];
      for(int j=0; j<Array1.length; j++) {
        ArrayR[j] = Array1[j] + Array2[j];
      }
      for(int k=Array1.length; k<Array2.length;k++){
        ArrayR[k] = Array2[k];
      }
    }
    return ArrayR;
    
}
}