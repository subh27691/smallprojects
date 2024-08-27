import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

class Gusser{
    int gusser;
    int gussernum(){
        Scanner sc=new Scanner(System.in);
        gusser=sc.nextInt();
        return gusser;
    }
}
class Player{
    int player;
    int playernum(){
        Scanner sc=new Scanner(System.in);
        player=sc.nextInt();
        return player;
    }
}
class umpire{
    Random rand=new Random();
    int gusserNUM;
    int player1=rand.nextInt(10);
    int player2=rand.nextInt(10);
    int player3=rand.nextInt(10);

    void collectgussernum(){
        System.out.println("Guess the number");
        Gusser gu=new Gusser();
        gusserNUM=gu.gussernum();

    }
  /*  void collectplayernum(){
        
        System.out.println("player 1 guess the number");
        Player pl=new Player();
        player1=pl.playernum();
       //5 System.out.println(player1);
        System.out.println("player 2 guess the number");
        Player p2=new Player();
        player2=p2.playernum();
        System.out.println("player 3 guess the number");
        Player p3=new Player();
        player3=p3.playernum();


    }*/
    void comparepl(){
        if(gusserNUM==player1)
        {
            if(gusserNUM==player2 && gusserNUM==player3){System.out.println("All player won the game");}
            else if(gusserNUM==player2){System.out.println("player1 and player2 won the game");}
            else if(gusserNUM==player3){System.out.println("player1 and player3 won the game");}
            else{System.out.println("only player1 won the game");}
        }
        else if(gusserNUM==player2){
            if(gusserNUM==player3){System.out.println("player2 and player3 won the game");}
            else{System.out.println("only player1 won the game");}
        }
        else if(gusserNUM==player3){
            System.out.println("only player3 won the game");
        }
        else {System.out.println("No one won the game");}

    }
}
public class Gussergame{
    public static void main(String[] args) {
        while (true) {
            
        
        System.out.println("-------Game Start----------");
        umpire up=new umpire();
        up.collectgussernum();
        //up.collectplayernum();
        up.comparepl();
        System.out.println("--------Game over----------");
        }


        
    }
}