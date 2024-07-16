import java.util.*;
class BubbleSort{
  public static void main(String[] args){
    String[] arr={'banana','apple','pineapple','grapes','orange'};
    bubblesort(arr);
    System.out.println("Sorted Array "+Arrays.toString(arr));
  }
  public static void bubble(char[] arr){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        if(arr[i],compareTo(arr[j+1])>0){
          String temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
