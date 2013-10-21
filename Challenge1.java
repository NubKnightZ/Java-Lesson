import java.util.Arrays;
public class Challenge1{
  
  public static String ArrRandRemove(String[] arr){
    int B = ((int)(Math.random() * 1000000)) + 1;
    for( ; B > arr.length; ){B = ((int)(Math.random() * 1000000)) + 1; }
    int C = B - 1;
    System.out.println(arr[C]);
    while (C < (arr.length - 1)){
      arr[C] = arr[C + 1]; 
      System.out.println("Test Marker");
      C++;
    }
    arr[C] = null;
    System.out.println(Arrays.toString(arr));
    return(Arrays.toString(arr));
  }
  
//Main
  public static void main(String[] args)
  {
    String[] arr = {"hi", "there", "how", "are", "you"};
    ArrRandRemove(arr);
    }
}

