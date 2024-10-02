import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess:");

        if(scanner.hasNextDouble()){ // We check if the user entered a numeric value. 
            double guess = scanner.nextDouble(); // If the input is a numeric value the "nextDouble()" will read the input as a double.

                if(guess == rnd_number){ // If the user input is the same as the random number, then the user guessed correctly.
                    System.out.println("Congratulations! You guessed the correct number: " + rnd_number);

                }else if(guess < rnd_number){ // If the user inpurt is less than the random number, we give a hint to the user that the number is too low.
                    System.out.println("Your guess is too low. Try again.");
                    makeAGuess(); // If their number is too low we call the method again and they will be allowed to try again.

                }else{ // If the user input is too high, we again let the user know that their number is too high.
                    System.out.println("You guess is too high. Try again.");
                    makeAGuess(); // We let the user try again by calling the method if they guess wrong.
            }

        }else{
            System.out.println("Invalid input! Please enter a number value."); // If the input from the top is not a numeric value, we will tell the user.
            scanner.next(); // scanner.next() is used to clear the invalid input from the user.
            makeAGuess(); // We call the method (so it's a recursive method) and let them try to enter a number again.
        }
    }
}
	// Create a Scanner object   	 
        // use hasNextDouble to check if input is numeric, 
        // if so...
	// Read user input
        // Compare it with the random number
        // Let the user know the result of the comparison
        // Let the user try again by calling this method recursively
        // Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively