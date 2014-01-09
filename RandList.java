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
    ListName.add("Kong Bucks");
    ListName.add("10 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("10 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("10 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("2.5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("2.5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("2.5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("2.5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("2.5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("2.5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("2.5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("2.5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("2.5 Trillion");
    ListName.add("Kong Bucks");
    ListName.add("2.5 Trillion");
    ListName.add("Black Sun");
    ListName.add("Treat this card as any card in the discard pile OR any Code Block for this turn only.");
    ListName.add("Motorcycle");
    ListName.add("When you move this turn, you may roll two dice instead. If the total rolled is 7 or higher, move that many steps instead of your normal move. Otherwise, move half the amount rolled. (Round Up)");
    ListName.add("Motorcycle");
    ListName.add("When you move this turn, you may roll two dice instead. If the total rolled is 7 or higher, move that many steps instead of your normal move. Otherwise, move half the amount rolled. (Round Up)");
    ListName.add("Motorcycle");
    ListName.add("When you move this turn, you may roll two dice instead. If the total rolled is 7 or higher, move that many steps instead of your normal move. Otherwise, move half the amount rolled. (Round Up)");
    ListName.add("Motorcycle");
    ListName.add("When you move this turn, you may roll two dice instead. If the total rolled is 7 or higher, move that many steps instead of your normal move. Otherwise, move half the amount rolled. (Round Up)");
    ListName.add("Motorcycle");
    ListName.add("When you move this turn, you may roll two dice instead. If the total rolled is 7 or higher, move that many steps instead of your normal move. Otherwise, move half the amount rolled. (Round Up)");
    ListName.add("Juanita");
    ListName.add("When this card is played, you may decrease a cooldown timer by 1.");
    ListName.add("Juanita");
    ListName.add("When this card is played, you may decrease a cooldown timer by 1.");
    ListName.add("Juanita");
    ListName.add("When this card is played, you may decrease a cooldown timer by 1.");
    ListName.add("Juanita");
    ListName.add("When this card is played, you may decrease a cooldown timer by 1.");
    ListName.add("Juanita");
    ListName.add("When this card is played, you may decrease a cooldown timer by 1.");
    ListName.add("Rat");
    ListName.add("Choose up to one player within 8 blocks of your character. That player may not make any movement during their next turn.");
    ListName.add("Rat");
    ListName.add("Choose up to one player within 8 blocks of your character. That player may not make any movement during their next turn.");
    ListName.add("Rat");
    ListName.add("Choose up to one player within 8 blocks of your character. That player may not make any movement during their next turn.");
    ListName.add("Rat");
    ListName.add("Choose up to one player within 8 blocks of your character. That player may not make any movement during their next turn.");
    ListName.add("Rat");
    ListName.add("Choose up to one player within 8 blocks of your character. That player may not make any movement during their next turn.");
    ListName.add("Call Train");
    ListName.add("The train moves to your quadrant.");
    ListName.add("Call Train");
    ListName.add("The train moves to your quadrant.");
    ListName.add("Call Train");
    ListName.add("The train moves to your quadrant.");
    ListName.add("Call Train");
    ListName.add("The train moves to your quadrant.");
    ListName.add("Call Train");
    ListName.add("The train moves to your quadrant.");
    ListName.add("Reason");
    ListName.add("For this turn, if you do battle with another player, add 2 to the amount you roll.");
    ListName.add("Reason");
    ListName.add("For this turn, if you do battle with another player, add 2 to the amount you roll.");
    ListName.add("Reason");
    ListName.add("For this turn, if you do battle with another player, add 2 to the amount you roll.");
    ListName.add("Reset");
    ListName.add("All players move their characters back to their spots at the start of the game.");
    ListName.add("Reset");
    ListName.add("All players move their characters back to their spots at the start of the game.");
    ListName.add("Reset");
    ListName.add("All players move their characters back to their spots at the start of the game.");
    ListName.add("Bullet Proof");
    ListName.add("When your character is attacked by another character, discard this card immediately. No battle is conducted and both characters remain on the same square.");
    ListName.add("Bullet Proof");
    ListName.add("When your character is attacked by another character, discard this card immediately. No battle is conducted and both characters remain on the same square.");
    ListName.add("Bullet Proof");
    ListName.add("When your character is attacked by another character, discard this card immediately. No battle is conducted and both characters remain on the same square.");
    ListName.add("Fisher Yates");
    ListName.add("All players shuffle their hands and the discard pile back into the deck.");
    ListName.add("Fisher Yates");
    ListName.add("All players shuffle their hands and the discard pile back into the deck.");
    ListName.add("Fisher Yates");
    ListName.add("All players shuffle their hands and the discard pile back into the deck.");
    ListName.add("Mr. Ng");
    ListName.add("When a battle is about to be conducted during any player's turn, you may discard this card and end the battle. The characters that were about to conduct battle stay on the same spot.");
    ListName.add("Mr. Ng");
    ListName.add("When a battle is about to be conducted during any player's turn, you may discard this card and end the battle. The characters that were about to conduct battle stay on the same spot.");
    ListName.add("Mr. Ng");
    ListName.add("When a battle is about to be conducted during any player's turn, you may discard this card and end the battle. The characters that were about to conduct battle stay on the same spot.");
    ListName.add("Hyper Card");
    ListName.add("Randomly select 1 card in the discard pile and add it to your hand.");
    ListName.add("Hyper Card");
    ListName.add("Randomly select 1 card in the discard pile and add it to your hand.");
    ListName.add("Hyper Card");
    ListName.add("Randomly select 1 card in the discard pile and add it to your hand.");
    ListName.add("CIC");
    ListName.add("Choose one of the other players and look at his or her hand. Select one card and take it from that player.");
    ListName.add("CIC");
    ListName.add("Choose one of the other players and look at his or her hand. Select one card and take it from that player.");
    ListName.add("CIC");
    ListName.add("Choose one of the other players and look at his or her hand. Select one card and take it from that player.");
    ListName.add("FED");
    ListName.add("Choose one of the other players and take one random card from his or her hand.");
    ListName.add("FED");
    ListName.add("Choose one of the other players and take one random card from his or her hand.");
    ListName.add("FED");
    ListName.add("Choose one of the other players and take one random card from his or her hand.");






             
  }
  
  public  void Program(){
    int ListSize = (ListName.size() / 2);
    if (ListSize != 0){
      int R = (int)(Math.random() * 100000) + 1;
      while (R > ListSize){
        R = (int)(Math.random() * 100000) + 1;
      }
      System.out.println(ListName.get((R * 2) - 2));
      ListName.remove((R * 2) - 2);
      System.out.println(ListName.get((R * 2) - 2));
      ListName.remove((R * 2) - 2);
      ListSize = ListName.size();
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