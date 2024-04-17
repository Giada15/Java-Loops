public class ForLoopExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10

        for(int i=1; i<11; i++){
            System.out.println(i);

        } 

        // Example 2: Print "Hello, world!" 5 times
        for(int i=0; i<5; i++){
            System.out.println("Hello, world!");
        }

        // Example 3: Print the multiplication table of 5 up to 10
        System.out.println("\nMultiplication Table");
        for(int i=1; i<11; i++){
            System.out.println(5*i);
        }

        System.out.println("\nReverse order");
        // Example 4: Print the numbers from 10 to 1 in reverse order
        for(int i=10; i>0; i--){
            System.out.println(i);
        }

        System.out.println("\nEven numbers");
        // Example 5: Print the first 10 even numbers
        for(int i=0; i<19; i+=2){
            System.out.println(i);
        }
    }
}
