import java.util.*;
class main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int i=1;
    while(n>0){
      n=n-i;
      i++;
    }
    if(n==0){
      System.out.print("Triangular Number");
    }else{
      System.out.print("Not a Triangular Number");
    }
  }
}
