//import java.util.Arrays;

public class Challenge2{

  public static void BoxTest(int x){
    int[][] sq = new int[x][x]; 
    
//Magic Square Calculation
     
    //Counter
    int e = 1;
          
    //Total Sum of each Side and Diagonal
    int y = ((x * ((x * x) + 1)) / 2);
    
    
    int z = (x * x);
    
    //Odd Input; Assigns all the boxes their numbers (Checks every fucking situation and how to respond to it)
    if((x % 2) != 0){
      
      //Position of 1 for Odd Input
      int w = (x / 2);
      
      //Coordinates for Odd Input
      int c = 0;
      int d = w;
      
      sq[c][d] = e;
      while(e < z){
        //If the current spot isn't on the top or right border and the spot isn't taken
        if(c != 0 && d != (x - 1) && sq[c - 1][d + 1] == 0){
          e++;
          System.out.println(e);
          sq[c - 1][d + 1] = e;
          c--;
          d++;}
        //If the current spot isn't on the top or right or bottom border and the spot is taken
        if(c != 0 && d != (x - 1) && sq[c - 1][d + 1] != 0 && c != (x - 1)){
          e++;
          System.out.println(e);
          sq[c + 1][d] = e;
          c++;}
        //If the current spot is on the bottom border and isn't on the right border and the spot is taken
        if(d != (x - 1) && sq[c - 1][d + 1] != 0 && c == (x - 1)){
          e++;
          System.out.println(e);
          sq[0][d] = e;
          c = 0;}
        //If the current spot is on the top and right border and the spot isn't taken
        if(c == 0 && d == (x - 1) && sq[x - 1][0] == 0){
          e++;
          System.out.println(e);
          sq[(x - 1)][0] = e;
          c = (x - 1);
          d = 0;}
        //If the current spot is on the top and right border and the spot is taken
        if(c == 0 && d == (x - 1) && sq[x - 1][0] != 0){
          e++;
          sq[c + 1][d] = e;
          c++;}
        //If the current spot is on the bottom and right border and the spot is taken
        if(c == (x - 1) && d == (x - 1) && sq[x - 1][0] != 0){
          e++;
          System.out.println(e);
          sq[0][d] = e;
          c = 0;}
        //If the current spot is on the top border and not the right border and the spot isn't taken
        if(c == 0 && d != (x - 1) && sq[x - 1][d + 1] == 0){
          e++;
          sq[(x - 1)][d + 1] = e;
          c = (x - 1);
          d++;}
        //If the current spot is on the top border and not the right border and the spot is taken
        if(c == 0 && d != (x - 1) && sq[x - 1][d + 1] != 0){
          e++;
          System.out.println(e);
          sq[(c + 1)][d] = e;
          c++;}
        //If the current spot is on the right border and isn't on the top border and the spot isn't taken
        if(d == (x - 1) && c != 0 && sq[c - 1][0] == 0){
          e++;
          System.out.println(e);
          sq[c - 1][0] = e;
          c--;
          d = 0;}
        //If the current spot is on the right border and isn't on the top or bottom border the spot is taken
        if(d == (x - 1) && c != 0 && c != (x - 1) && sq[c - 1][0] != 0){
          e++;
          System.out.println(e);
          sq[c + 1][d] = e;
          c++;}
      }
      //DoneWithEverything
    }
//Box Creator
    for(int a = 0 ; a < x ; a++ )
    {for(int b = 0 ; b < x ; b++ )
      {//sq[a][b] = ((a + 1) * (b + 1)); 
      System.out.print(sq[a][b] + "  ");} 
    System.out.println("  ");}
  }
  
//Main
  public static void main(String[] args)
  {
    BoxTest(3);
  }
  
}