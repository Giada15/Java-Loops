import java.util.Scanner;

/**
 * SignIn
 */
public class SignIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Javagram! Sign in below");

        System.out.print("\nUsername: ");
        String usernameInput = scan.nextLine();
        
        System.out.print("Password: ");
        String passwordInput = scan.nextLine();

        String username = "Samantha";
        String password = "Java<3";

        while(!usernameInput.equals(username) || !passwordInput.equals(password) ){
            System.out.println("\nIncorrect! Please try again!");

            System.out.print("\nUsername: ");
            usernameInput = scan.nextLine();
            
            System.out.print("Password: ");
            passwordInput = scan.nextLine();
        }

        System.out.println("\nSign in successful. Welcome!");

        scan.close();

    }

}