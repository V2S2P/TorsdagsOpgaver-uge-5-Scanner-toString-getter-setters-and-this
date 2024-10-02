import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.println("Please type your name:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		System.out.println("Hello " + name + ". Please enter your age:");
		int age = scanner.nextInt();

		System.out.println("\nYou are " + age + " years old.");

		int retirement = 67 - age;
		if(retirement == 0){
			System.out.println("\nYou can enjoy retirement RIGHT NOW!!!");
		}else{
			System.out.println("\nYou have " + retirement + " yeras left until you can retire.");
		}
	}
}