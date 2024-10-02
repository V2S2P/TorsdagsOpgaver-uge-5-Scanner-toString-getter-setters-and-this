public class Main{
	public static void main(String[] args){
		Team team0 = new Team("The GOATS");
		Team team1 = new Team("Kittens");
		Team team2 = new Team("Bulldogs");
		Team team3 = new Team("Dragons");
		Team team4 = new Team("Actually Babies");
		Team team5 = new Team("Bulldozers");

		team0.setRank(1);
		team1.setRank(2);
		team2.setRank(3);
		team3.setRank(4);
		team4.setRank(5);
		team5.setRank(6);

		team0.addPlayer("Big Hank");
		team0.addPlayer("Even Bigger Hank");
		team1.addPlayer("Little Hank");
		team2.addPlayer("Jessica");
		team3.addPlayer("Karl");
		team4.addPlayer("Bob");
		team5.addPlayer("Duck");

		System.out.println(team0);
		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team4);
		System.out.println(team5);
	}
}