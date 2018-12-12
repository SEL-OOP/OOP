package polymorphism;

public class JoinTeam {
	
	int totalTeam;
	String newPlayer;
	

	public int joinTeamOfGroup(int footballTeam) {// method overloading
		return totalTeam= footballTeam ;
	}
	
	public int oinTeamOfGroup(int footballTeam, int baseballTeam) { // method overloading
		return totalTeam = footballTeam + baseballTeam;
	}
	
	public String newPlayer(String footballTeam) {// method overloading 
		return footballTeam;
	}
	
	public String newPlayer(String baseballPlayer , String footballPlayer) { // method overloading
		return newPlayer = baseballPlayer.concat(baseballPlayer);
	}

}