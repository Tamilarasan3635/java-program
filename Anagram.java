import java.util.*;
class AnagramCheck{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long num1=sc.nextLong();
    long num2 = sc.nextLong();
    boolean areAnagrams=checkAnagram(num1,num2);
    if(areAnagram){
      System.out.println("Anagram");
    }else{
      System.out.println("Not Anagram");
    }
  }
  public static boolean checkAnagram(long num1,long num2){
    String str1 = Long.toString(num1);
    String str2 = Long.toString(num2);
    if(str1.length() != str2.length()){
      return false;
    }
    char[] arr1 = str1.toCharArray();
    chae[] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1,arr2);
  }
}
