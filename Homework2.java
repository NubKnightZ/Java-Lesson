import java.util.*;

public class Homework2{
  ArrayList<Integer> arraylist = new ArrayList<Integer>();
  
  public void Initializer(){
    arraylist = new ArrayList<Integer>();
    arraylist.add(1);
    arraylist.add(2);
    arraylist.add(4);
    arraylist.add(5);
    arraylist.add(6);
    arraylist.add(7);
    arraylist.add(8);
    arraylist.add(10);
    arraylist.add(13);
  }
  
  public int BinarySearch(int x){
    int marker = ((arraylist.size() - 1) / 2);
    int lower = 0;
    int upper = (arraylist.size() - 1);
    if (x > marker){
      lower = marker;
    }
    if (x < marker){
      upper = marker;
    }
    
    //Finder
    while (x != arraylist.get(marker)){
      if(x > marker){
        lower = marker;
        marker = marker + ((upper - lower) / 2);
      }
      if(x < marker){
        upper = marker;
        marker = marker - ((upper - lower) / 2);
      }
    }
    
    System.out.println(marker + 1);
    return(marker + 1);
  }  
  
  
  public static void main(String[] args){
    Homework2 HW2 = new Homework2();
    HW2.Initializer();
    HW2.BinarySearch(10);
  }
  
  
}