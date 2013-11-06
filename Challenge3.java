public class Challenge3{
  
  public void Initializer(int h, int v){
    char[][] wrdsrch = new char[v][h];
  }
  
  public void WordSearch(String word){
    int horz = 0;
    int vert = 0;
    int horz2 = 0;
    int vert2 = 0;
    lettercount = 0;
    char letter = word.charAt(lettercount);
    int found = 0;
    while(found == 0){
      
      //If not found
      if(horz == h - 1 && vert == v - 1){
        System.out.println("You are a huge faggot. Plug in the right word.");
        found = 1;
      }
      
      if(wrdsrch[vert][horz] == letter && found == 0){
        //Revert point
        horz2 = horz;
        vert2 = vert;
        if(/*If any of the letters surrounding the current letter == letter*/){
          //Locate letter; Find direction of the letter
          //Set Vert and Horz to new position
          lettercount++;
          char letter = word.charAt(lettercount);
          //Continue in same direction (Direction determined by subtracting old vert and horz from position of found letter in-radius 1)
          while(lettercount != word.size - 1 && /* Same direction has next letter */){
            lettercount++;
            char letter = word.charAt(lettercount);
            //Set Vert and Horz to new position
          }
          if(lettercount == word.size - 1){
            System.out.println("The first letter is at " + (horz + 1) + "," + (vert + 1));
            System.out.println("The last letter is at " + (horz2 + 1) + "," + (vert2 +1));  
            found = 1;
          }
        }
      }
      
      
      if(wrdsrch[vert][horz] != letter){
        //Reset if red herring
        lettercount = 0;
        char letter = word.charAt(lettercount);
        horz = horz2;
        vert = vert2;
      }
      
      //Progresses searching by moving to the right, then down
      if (horz == x - 1 && found == 0){
        vert++;        
      }
      if (horz != x - 1 && found == 0){
        horz++;
      }    
    }
    
  }
  
  
  
  
  
  
  
  public static void main(String[] args){
    Challenge3 challenge3 = new Challenge3();
    challenge3.Initializer(10, 10); //Plug in size of Word Search
    challenge3.WordSearch("Hi"); 
  }
  
}