import java.util.Random;
import java.util.Scanner;

public class Game {

    public static int runGame(String computerPick, String userPick){
        int output = -1;
        if(computerPick.equals("Rock") && userPick.equals("Paper")){
            output = 1;
        } else if(computerPick.equals("Rock") && userPick.equals("Scissor")){
            output = 0;
        } else if(computerPick.equals("Paper") && userPick.equals("Scissor")){
            output = 1;
        } else if(computerPick.equals("Paper") && userPick.equals("Rock")){
            output = 0;
        } else if(computerPick.equals("Scissor") && userPick.equals("Rock")){
            output = 1;
        } else if(computerPick.equals("Scissor") && userPick.equals("Paper")){
            output = 0;
        } else if(computerPick.equals(userPick)){
            output = 2;
        }
        return output;
    }

    public static void main(String[] args) {
        String[] componentsArray = {"Rock", "Paper", "Scissor"};
        Random random = new Random();
        int randomValue = random.nextInt(3);
        String computerPick = componentsArray[randomValue];
        System.out.println(computerPick);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Make a Choice by Entering Numeric Values \n 1. Rock \n 2. Paper \n 3. Scissor \n ");
        int val = sc.nextInt();
        String userPick = componentsArray[val-1];
        System.out.println(userPick);

        int result = runGame(computerPick,userPick);
        if(result == 1){
            System.out.println("Player Won!");
        } else if(result == 2) {
            System.out.println("Game Draw!");
        } else {
            System.out.println("Computer Won!");
        }
    }

}
