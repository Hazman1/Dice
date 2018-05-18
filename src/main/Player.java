package main;

public class Player {

	private boolean AI = false;
	private int score = 0;
	private int round = 0;
	
	private boolean d1Locked = false;
	private boolean d2Locked = false;
	private boolean d3Locked = false;
	private boolean d4Locked = false;
	private boolean d5Locked = false;
	private boolean d6Locked = false;
	
	

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

	public boolean isD1Locked() {
		return d1Locked;
	}

	public void setD1Locked(boolean d1Locked) {
		this.d1Locked = d1Locked;
	}

	public boolean isD2Locked() {
		return d2Locked;
	}

	public void setD2Locked(boolean d2Locked) {
		this.d2Locked = d2Locked;
	}

	public boolean isD3Locked() {
		return d3Locked;
	}

	public void setD3Locked(boolean d3Locked) {
		this.d3Locked = d3Locked;
	}

	public boolean isD4Locked() {
		return d4Locked;
	}

	public void setD4Locked(boolean d4Locked) {
		this.d4Locked = d4Locked;
	}

	public boolean isD5Locked() {
		return d5Locked;
	}

	public void setD5Locked(boolean d5Locked) {
		this.d5Locked = d5Locked;
	}

	public boolean isD6Locked() {
		return d6Locked;
	}

	public void setD6Locked(boolean d6Locked) {
		this.d6Locked = d6Locked;
	}
}
