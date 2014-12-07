//This program will create random 3d array with random values. It will then show the array, find the minimum value inside an array
//and then sort the third slab using selection sort and insertion sort.
public class MatrixSorter {
  public static void main(String arg[]) {
    int mat3d[][][];
    mat3d = buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is " +
      findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
  }
  public static int[][][] buildMat3d() {
    int[][][] mat3d = new int[3][][]; //there are 3 slabs.
    for (int s = 0; s < 3; s++) {
      mat3d[s] = new int[3 + (2 * s)][];
    }
    for (int s = 0; s < 3; s++) {
      for (int j = 0; j < mat3d[s].length; j++) {
        mat3d[s][j] = new int[s + j + 1]; //this will generate a ragged array
      }
    }
    for (int s = 0; s < 3; s++) {
      for (int j = 0; j < mat3d[s].length; j++) {
        for (int c = 0; c < mat3d[s][j].length; c++) {
          mat3d[s][j][c] = (int)(1 + Math.random() * 100); //generate random number
        }
      }
    }
    return mat3d;
  }
  public static void show(int[][][] mat3d) {
    for (int s = 0; s < 3; s++) {
      System.out.println("-----------------------Slab " + (s + 1));
      for (int j = 0; j < mat3d[s].length; j++) {
        for (int c = 0; c < mat3d[s][j].length; c++) {
          System.out.print(mat3d[s][j][c] + " "); //print out each elements in an array.
        }
        System.out.println();
      }
    }
  }
  public static int findMin(int[][][] mat3d) {
    int Min = 1000;
    for (int s = 0; s < 3; s++) {
      for (int j = 0; j < mat3d[s].length; j++) {
        for (int c = 0; c < mat3d[s][j].length; c++) {
          if (Min > mat3d[s][j][c]) {
            Min = mat3d[s][j][c];
          }
        }
      }
    }
    return Min;
  }
  public static void sort(int[][] mat3d) {
    //selection sort the entries
    int temp;
    for (int j = 0; j < mat3d.length; j++) {
      for (int i = 0; i < mat3d[j].length; i++) {
        int currentMin = mat3d[j][i];
        int currentMinIndex = i;
        for (int z = i + 1; z < mat3d[j].length; z++) {
          if (currentMin > mat3d[j][z]) {
            currentMin = mat3d[j][z];
            currentMinIndex = z;
          }
        }
        if (currentMinIndex != i) {
          mat3d[j][currentMinIndex] = mat3d[j][i];
          mat3d[j][i] = currentMin;
        }
      }
    } //this is the selection sort, similar to single dimensional sort, but added j to the equation.
    //start of the insertion sorting
    int key; //this is the number that is in front of each row in the array
    int y;
    for (int x = 1; x < mat3d.length; x++) {
      key = mat3d[x][0];
      for (y = x - 1;(y >= 0)&&(mat3d[y][0]>key);y--) {
        int[] temp2 = mat3d[y+1];
        mat3d[y+1] = mat3d[y];
        mat3d[y] = temp2;//rows
      }
      mat3d[y + 1][0] = key;
    }
  }//end of sort

}//end of class
