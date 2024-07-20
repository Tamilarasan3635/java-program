import java.util.*;
class MonotonicNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h=n.nextInt();
    boolean t=false;
    int arr[] = new int[h];
    for(int i=0;i<h;i++){
      if(arr[j-1]>arr[j]){
        t=true;
      }
      else{
        t=flase;
        break;
      }
    }
  }
  else{
    for(int y=1;y<h;i++){
      if(arr[y-1]<arr[y]){
        t=true;
      }else{
        t=false;
        break;
      }
    }
  }
  if(t){
  System.out.println("Monotonic");
}
else{
  System.out.printfln("Not Monotonic");
}
}
}
