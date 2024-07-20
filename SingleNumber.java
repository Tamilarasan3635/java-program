import java.util.*;
class SingleNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String res = newdigit(input);
    System.out.print(res);
  }
  public static String newdigit(String input){
    StringBuilder sb=new StringBuider();
    for(int i=0;i<input.length();i++){
      char c = input.charAt(i);
      if(Character.isDigit(c)){
        sb.append(c);
      }
    }
    return sb.length() = 0 ? "0" : sb.toString();
  }
}
