
public class Team {
	private String name;
	private int scores;
	
	
	//empty constructor that takes no arguments
	public Team() {	
		
		
	}
	
	//constructor to initialize team name and scores
	public Team(String tm, int sc) {
		this.name = tm;
		this.scores = sc;
	}
	
	//getter method for name
	public String getName() {
		
		return this.name;
	}
	
	//getter method for scores
	public int getScores() {
		
		return scores;
	}
	
	//setter method for name
	public void setName(String name) {
		this.name = name;
	}
	
	
	//setter method for scores
	public void setScores(int sc) {
		scores = sc;
	}
	
	
	//override to string method
	@Override
	public String toString() {
		return "Team Name: " + name + " - Scores:" + scores;
	}
	
	//Override equals method
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null)
	        return false;
	    if (getClass() != obj.getClass())
	        return false;
	    final Team other = (Team) obj;
	    if (name != other.name)
	        return false;
	    return true;
	}		

}
	

