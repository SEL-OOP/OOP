package polymorphism;

public class TestTeam {
	public static void main(String [] args) {
	
	JoinTeam ad1 = new JoinTeam();
	ad1.joinTeamOfGroup (30);
	
	ad1.oinTeamOfGroup (30, 10);
	System.out.println(ad1.joinTeamOfGroup(23) + ad1.oinTeamOfGroup(30, 10));
	System.out.println(String.valueOf(ad1.joinTeamOfGroup(23)) + " " + String.valueOf(ad1.oinTeamOfGroup(30, 10)));
	
	
	
	Team pr1 = new Team(30);
	System.out.println("Football Team is" + " " + pr1.footballTeam);
	
	
	Team pr2 = new Team(30,10);
	System.out.println("Football team is " + " "+ pr2.footballTeam + " Baseballteam is " + " "+ pr2.baseballTeam);
	
	NewTeam nw = new NewTeam();
	nw.joinTeamOfGroup(30);
	
	nw.joinTeamTeamOfGroup(30, 10);
	System.out.println(nw.joinTeamOfGroup(30));
	System.out.println(nw.joinTeamTeamOfGroup(30, 10));
	
	@SuppressWarnings("unused")
	JoinTeam ne1 = new NewTeam();
	

}
}