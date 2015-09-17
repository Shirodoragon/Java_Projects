//TeamTest to test methods from Team
public class TeamTest {

	
	public static void main(String[] args) {
		

		//using the empty constructor
		Team team1 = new Team();
		
		//should print out Null
		System.out.println(team1);
		
		//using the constructor to initialize 3 team objects
		Team team2 = new Team("Dublin", 5);
		Team team3 = new Team("Kerry", 2);
		Team team4 = new Team("Dublin", 5);
		
		//print out teams team2, team3 and team3
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team4);
		
		//checks is team2 the same as team4
		if (team2.equals(team4)) {
			System.out.println("Dublin is Dublin :D");
		}
		else {
			System.out.println("Dublin is not Kerry :D");
		}
		
		//check is team3 the same as team4
		if (team3.equals(team4)) {
			System.out.println("Kerry is Kerry :P");
		}
		else {
			System.out.println("Kerry is definately not Dublin :P");
		}
		
		//change how many scores team 2 has
		team2.setScores(1);
		
		
		System.out.println(team2);
		
		//now check if they are still the same
		if (team2.equals(team4)) {
			System.out.println("Dublin is still Dublin");
		}
		else {
			System.out.println("Dublin wasn't itself this time? oh no!");
		}
		
		
	}

}