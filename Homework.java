import java.lang.Math.*;

public class Homework
{
  
//Fib Loop - #1 
  public static int FibLoop(int x)
  {
    int y = 0;
    int z = 1;
    while(x > 0){
      int a = y;
      int b = z;
      z = a + b;
      y = b;
      x--;
    }
    return y;
  }
  
//Rand 1-1000 - #2
   public static void Rand(){
     double rand = Math.random();
     rand = rand * 1000;
     rand = (int)rand;
     System.out.println(rand);
  }
    
  
//Array Middle
   public static String ArrayMiddle(String[] arr){
     int i;  for(i = 0; i < arr.length; i++){}
     System.out.println((int)((i + 1) / 2));
     return null;
  }

//Main
   public static void main(String[] args)
   {
     System.out.println(FibLoop(6));
     Rand();
     String[] arr = new String[5];
     arr[0] = "A";
     arr[1] = "B";
     arr[2] = "C";
     arr[3] = "D";
     arr[4] = "E";
     ArrayMiddle(arr);
   }
}




                    
                      

                      