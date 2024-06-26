import java.util.Scanner;

public class JavaRolls {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();

        System.out.println("- If you roll a 6, the game stops.");
        System.out.println("- If you roll a 4, nothing happens.");
        System.out.println("- Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll: ");

        int diceRoll = -1;
        int points = 0;

        while(true){
            diceRoll = rollDice();
            if(diceRoll == 6){
                System.out.println("You rolled a " + diceRoll);
                System.out.println("End game");
                break;
            }else if(diceRoll == 4){
                System.out.println("You rolled a " + diceRoll);
                System.out.println("Zero points. Keep rolling");
                continue;
            }else{
                System.out.println("You rolled a " + diceRoll);
                System.out.println("One point. Keep rolling.");
                points++;
            }
        }
        
        if(points >= 3){
            System.out.println("Wow, that's lucky. You win!");
        }else{
            System.out.println("Tough luck, you lose :(");
        }


        scan.close();
    }

    public static int rollDice(){
        int randomNumber = (int)(Math.random()*6+1);
        return randomNumber;
    }
    
}
