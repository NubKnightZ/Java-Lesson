import java.util.Arrays;
import java.util.*;
import java.lang.Math.*;
import java.util.Scanner;

public class RandList{
  ArrayList<String> ListName = new ArrayList<String>();
  int Breaker = 0;
  int yn = 0;
  
  public void Initializer(){
    ListName = new ArrayList<String>();
    ListName.add("Kevin");
    ListName.add("Simon");
    ListName.add("Faggot");
    ListName.add("Nib");
    ListName.add("Victor");
  }
  
  public  void Program(){
    int ListSize = ListName.size();
    if (ListSize != 0){
      int R = (int)(Math.random() * 100000) + 1;
      while (R > ListSize){
        R = (int)(Math.random() * 100000) + 1;
      }
      //System.out.println(R);
      System.out.println(ListName.get(R - 1));
      ListName.remove(R - 1);
      //System.out.println(ListName);
      ListSize = ListName.size();
      //System.out.println(ListSize);
      // System.out.println("debug");
    }
    if (ListSize == 0){
      Breaker = 1;
    }
  }
  
  public  void Displayer(){
    if (Breaker == 0){
      String Check = "";
      System.out.println("Do you wish to continue? (Yes/No)");
      Scanner Continue = new Scanner(System.in);
      Check = Continue.nextLine();
      yn = 0;
      if (Check.equals("Yes")){
        yn = 1;
      }
      while (yn == 1){
        Program();
        Displayer();
        
      }
    }
  }
  
  
  public static void main(String[] args){
    RandList RL1 = new RandList();
    RL1.Initializer();
    RL1.Displayer();
  }
  
}