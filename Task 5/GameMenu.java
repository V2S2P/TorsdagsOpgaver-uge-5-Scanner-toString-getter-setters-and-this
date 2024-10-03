import java.util.*;
public class GameMenu{
	// Declaring a private instance variable "actions", which is an ArrayList of type String objects to store the game menu options.
	private ArrayList<String> actions;

	// The constructor takes an ArrayList of "actions" as parameter and we assign it to the insancte variable actions.
	public GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}

	// This method loops through the "actions" ArrayList and prints out each action(each index).
	public void displayMenu(){
		for(int i = 0; i < actions.size(); i++){
			System.out.println(actions.get(i));
		}
	}

	// In this method we first tell the user to enter a number. We then loop through the "actions" ArrayList and prints each option.
	public String getAction(){
		System.out.println("\nTpe a number to choose an action");
		for(int i = 0; i < actions.size(); i++){
			System.out.println(actions.get(i));
		}
		// We create a Scanner object to read the input from the user and we store that input in a String variable we call "choice"
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		// We return the variable choice which holds the input from the user.
		return choice;
	}
}
