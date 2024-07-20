import java.util.*;
class MagicNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=s.nextInt();
    int sod=0;
    int ognum=n;
    while(n>0){
      sod+=n%10;
      n/=10;
    }
    int rev=reversenum(ognum);
    int prd=sod*rev;
    if(prd==rev){
      System.out.println("Magic Number");
        }
    else{
      System.out.println("Not a MAagic Number");
    }
  }
  public static int reversenum(int num){
    int reversed=0;
    while(num>0){
      reversed=revsersed*10+num%10;
      number/=10;
    }
    return reversed;
  }
}
