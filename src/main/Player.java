package main;

public class Player {

	private boolean AI = false;
	private int score = 0;
	private int round = 0;

	public Player() {
		
	}
	
	public Player(boolean aI, int score, int round) {
		super();
		AI = aI;
		this.score = score;
		this.round = round;
	}
		
	public boolean isAI() {
		return AI;
	}

	public void setAI(boolean aI) {
		AI = aI;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}
}
