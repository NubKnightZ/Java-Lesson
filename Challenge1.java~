import java.util.Arrays;
public class Challenge1{
  
  public static String ArrRandRemove(String[] arr){
    int B = ((int)(Math.random() * 1000000)) + 1;
    for( ; B > arr.length; ){B = ((int)(Math.random() * 1000000)) + 1; }
    int C = B - 1; System.out.println(arr[C]);
    
//The Loops end in an error for some reason even though Compile doesn't detect an error. I suspect be some debugging issue again. 
//I tried both "For" and "While" loops. Based on the "Test Markers" appearing, it seems to get the error once C is not longer < than arr.length.
    
//for( ; C < arr.length ; C++){arr[C] = arr[C + 1]; System.out.println("Test Marker");}
//while (C < arr.length){arr[C] = arr[C + 1]; System.out.println("Test Marker"); C++; break;}
  
    arr[C] = "Placeholder";
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

//Managed to get a random selection from the Array and a way to move everything behind it up one, leaving a "Placeholder" in the last Index. 
//Still have to figure out how to delete the last Index. Not sure if that's possible because Google says so. 
//Apparently there's something called StringBuffer that would simplify this a lot more but you were looking for String, so I stayed with that.