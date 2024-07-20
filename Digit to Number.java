import java.util.*;
class DigitToNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n=s.nextLine();
    String digit="";

  for(int i=0;i<n.length();i++){
    char ch=n.charAt(i);
    if(Character.isDigit(ch)){
      digit+=ch;
    }
  }
    if(digit.isEmpty()){
      System.out.println("0");
    }
    else{
      System.out.println(digit);
    }
  }
}
