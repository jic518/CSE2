//this lab will focus on sorting
public class lab13 {
    public static void main(String[] args){
        int[] Arrays = new int[5];
        int[] Arrays2 = new int[8];
        int[] Arrays3 = new int[11];
        int[] Arrays4 = new int [14];
        int[] Arrays5 = new int[17];//initialize the arrays
        for(int i=0;i<Arrays.length;i++){
            Arrays[i] = (int)(Math.random() *40);
        }
        for(int i=0;i<Arrays2.length;i++){
            Arrays2[i] = (int)(Math.random() *40);
        }
        for(int i=0;i<Arrays3.length;i++){
            Arrays3[i] = (int)(Math.random() *40);
        }
        for(int i=0;i<Arrays4.length;i++){
            Arrays4[i] = (int)(Math.random() *40);
        }
        for(int i=0;i<Arrays5.length;i++){
            Arrays5[i] = (int)(Math.random() *40);
        }//set random numbers for each arrays
        for(int s=0;s<Arrays.length;s++){
            System.out.print(Arrays[s]+" ");
        }
        System.out.println();
        for(int s=0;s<Arrays2.length;s++){
            System.out.print(Arrays2[s]+" ");
        }
        System.out.println();
        for(int s=0;s<Arrays3.length;s++){
            System.out.print(Arrays3[s]+" ");
        }
        System.out.println();
        for(int s=0;s<Arrays4.length;s++){
            System.out.print(Arrays4[s]+" ");
        }
        System.out.println();
        for(int s=0;s<Arrays5.length;s++){
            System.out.print(Arrays5[s]+" ");
        }
        System.out.println();
        System.out.println("-------------After Sorting---------------");
        
        for(int t=0;t<Arrays.length;t++){
            int currentMin = Arrays[t];
            int currentMinIndex = t;
            for(int j = t+1;j<Arrays.length;j++){
                if(currentMin>Arrays[j]){
                    currentMin=Arrays[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != t){
                Arrays[currentMinIndex] = Arrays[t];
                Arrays[t] = currentMin;
            }
        }
         for(int t=0;t<Arrays2.length;t++){
            int currentMin = Arrays2[t];
            int currentMinIndex = t;
            for(int j = t+1;j<Arrays2.length;j++){
                if(currentMin>Arrays2[j]){
                    currentMin=Arrays2[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != t){
                Arrays2[currentMinIndex] = Arrays2[t];
                Arrays2[t] = currentMin;
            }
        }
         for(int t=0;t<Arrays3.length;t++){
            int currentMin = Arrays3[t];
            int currentMinIndex = t;
            for(int j = t+1;j<Arrays3.length;j++){
                if(currentMin>Arrays3[j]){
                    currentMin=Arrays3[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != t){
                Arrays3[currentMinIndex] = Arrays3[t];
                Arrays3[t] = currentMin;
            }
        }
         for(int t=0;t<Arrays4.length;t++){
            int currentMin = Arrays4[t];
            int currentMinIndex = t;
            for(int j = t+1;j<Arrays4.length;j++){
                if(currentMin>Arrays4[j]){
                    currentMin=Arrays4[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != t){
                Arrays4[currentMinIndex] = Arrays4[t];
                Arrays4[t] = currentMin;
            }
        }
         for(int t=0;t<Arrays5.length;t++){
            int currentMin = Arrays5[t];
            int currentMinIndex = t;
            for(int j = t+1;j<Arrays5.length;j++){
                if(currentMin>Arrays5[j]){
                    currentMin=Arrays5[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != t){
                Arrays5[currentMinIndex] = Arrays5[t];
                Arrays5[t] = currentMin;
            }
        }
        for(int s=0;s<Arrays.length;s++){
            System.out.print(Arrays[s]+" ");
        }
        System.out.println();
         for(int s=0;s<Arrays2.length;s++){
            System.out.print(Arrays2[s]+" ");
        }
        System.out.println();
        for(int s=0;s<Arrays3.length;s++){
            System.out.print(Arrays3[s]+" ");
        }
        System.out.println();
        for(int s=0;s<Arrays4.length;s++){
            System.out.print(Arrays4[s]+" ");
        }
        System.out.println();
        for(int s=0;s<Arrays5.length;s++){
            System.out.print(Arrays5[s]+" ");
        }
        System.out.println();
        
        //This will print out the arrays before sorting.
    }
 
}