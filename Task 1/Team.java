import java.util.*;
public class Team{
	private String teamName;
	private int teamRank;
	private ArrayList<String> playerNames;

	public Team(String teamName){
		this.teamName = teamName;
		this.playerNames = new ArrayList<>();
	}

	public void addPlayer(String playerName){
		this.playerNames.add(playerName);
	}

	public void setRank(int number){
		this.teamRank = number;
	}
	public String toString(){
		StringBuilder result = new StringBuilder();
		result.append("Team: ").append(teamName)
		.append(", Rank: ").append(teamRank)
		.append("\nPlayers:\n");

		for (String player :playerNames) {
			result.append(player).append("\n");
		}
		return result.toString();
	}
}