import java.util.*;
class LowerCase{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    StringBuilder sb = new StringBuilder();
    for(char ch:str.toCharArray()){
      if(Character.isLowerCase(ch)){
        break;
      }
      d.append(ch);
    }
      System.out.println(d.toString());
  }
}
