import java.util.Scanner;
public class NumberGame
{ 
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int chances=5;
    int finals=0;
    boolean playagain=true;
    System.out.println("Welcome Buddy!");
    System.out.println("Hey Buddy you have about" +chances+" to win the game");
    while(playagain){
        int rand=getrandN(1,100);
        boolean guess=false;
        for(int i=0; i<chances; i++){
            System.out.println("Chances"+(i+1)+"Enter your guess:");
            int user=sc.nextInt();
            if(user==rand){
                guess=true;
                finals = 1;
                System.out.println("You guessed it right");
                break;
            }
            else if(user>rand){
                System.out.println("too high");
            }
            else {
                System.out.println("too low");
            }
        } if(guess==false){
            System.out.println("Sorry Buddy you missed.The number is"+rand);

        }System.out.println("do you want to play again(y/n)");
         String pA=sc.next();
         playagain=pA.equalsIgnoreCase("y");
    }
    System.out.println("Thats it Buddy,hope you enjoyed it");
    System.out.println("Here is your score"+finals);
    
    

}public static int getrandN(int min,int max){
    return (int)(Math.random()*(max-min+1)+min);
 }
}
    
