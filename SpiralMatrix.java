import java.util.*;
class SpiralMatrix{
  public static void main(String[] args){
    System.out.print("Enter the value for N :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] spiral=new int[n][n];
    int value =1;
    int mincol=0;
    int maxcol=n-1;
    int minrow=0;
    int maxrow=n-1;
    while(value<=n*n){
      for(int i=mincol;i<=maxcol;i++){
        spiral[minrow][i]=value;
        value++;
      }
      for(int i=minrow+1;i<=maxrow;i++){
        spiral[i][maxcol]=value;
        value++;
      }
      for(int i=maxcol-1;i>=minrow;i--){
        spiral[maxrow][i]=value;
        value++;
      }
      for(int i=maxrow-1;i>=minrow+1;i--){
        spiral[i][mincol]=value;
        value++;
      }
      mincol++;
      minrow++;
      maxcol++;
      maxrow++;
    }
    for(int i=0;i<spiral.length;i++){
      for(int j=0;j<spiral.length;i++){
        System.out.print(spiral[i][j]+"\t");
      }
      System.out.println();
    }
  }
}
