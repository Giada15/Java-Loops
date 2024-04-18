import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int randomNumber = (int)(Math.random()*4 + 1);
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");

        int userGuessNum= scan.nextInt();

        while(userGuessNum != randomNumber){
            System.out.print("Guess again: ");
            userGuessNum = scan.nextInt();
        }

        System.out.println("You got it!");

        scan.close();
    }
    
}
