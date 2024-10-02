import java.util.*;
public class GameMenu{
	private ArrayList<String> actions;

	public GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}

	public void displayMenu(){
		for(int i = 0; i < actions.size(); i++){
			System.out.println(actions.get(i));
		}
	}
	public String getAction(){
		System.out.println("\nTpe a number to choose an action");
		for(int i = 0; i < actions.size(); i++){
			System.out.println(actions.get(i));
		}
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		return choice;
	}
}