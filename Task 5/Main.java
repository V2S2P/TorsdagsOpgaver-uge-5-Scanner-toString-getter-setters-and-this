import java.util.*;
public class Main{
	public static void main(String[] args){
		ArrayList<String> actions = new ArrayList<>(); // Initialize ArrayList of type String.
		// Adding Strings to the ArrayList "actions".
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		// Creating a "GameMenu" object that we call "game". The "actions" list is passed to its constructor (parameter) to initialize the menu.
		GameMenu game = new GameMenu(actions);

		// Call the displayMenu() method on the "game" object, which will print all the options in the "actions" list.
		game.displayMenu();

		// Call the getAction() method, which allows the user to input their choice. The user input is then stored in the "choice" variable as a String.
		String choice = game.getAction();

		// Converting the String input from the user into an int by using the "Integer.parseInt()". This integer will then represent the choice from the user.
		int userChoice = Integer.parseInt(choice);

		// Call the doAction() method and passing the "userChoice" integer as parameter. The method will run the the code that corresponds to the input from the userChoice.
		doAction(userChoice);
	}
	// This method will execute code depending on the "action" parameter, which is the user's choice.
	public static void doAction(int action){
		switch(action){
		case 1:
			System.out.println("Starting the game now");
			break;
		case 2:
			System.out.println("Fetching previously saved game data");
			break;
		case 3:
			System.out.println("Game paused");
			break;
		case 4:
			System.out.println("Ending game");
			break;
		default:
			System.out.println("Invalid choice. Please choose from the 4 options seen in menu.");
		}
	}
}
