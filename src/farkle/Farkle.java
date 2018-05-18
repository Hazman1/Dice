package farkle;

import main.*;
import java.util.List;
import java.util.ArrayList;

public class Farkle {
	
	private Player p0;
	private Player p1;
	private Player currentPlayer;
	private boolean noWinner = false;

	public Farkle() {
		
	}
	
	public Farkle(List<Player> players) {
		p0=players.get(0);
		p1=players.get(1);
		System.out.println("Farkle!");
		currentPlayer=p0;
		runGame();
	}
	
	public void runGame() {
		//while(noWinner) {
			currentPlayer.setD1Locked(false);
			currentPlayer.setD2Locked(false);
			currentPlayer.setD3Locked(false);
			currentPlayer.setD4Locked(false);
			currentPlayer.setD5Locked(false);
			currentPlayer.setD6Locked(false);
			roll(currentPlayer);
		//}
	}
	
	private void roll(Player p) {
		if(!p.isD1Locked()) {
			int d1 = (int)(Math.random()*5+1);
		}
		if(!p.isD2Locked()) {
			int d2 = (int)(Math.random()*5+1);
		}
		if(!p.isD3Locked()) {
			int d3 = (int)(Math.random()*5+1);
		}
		if(!p.isD4Locked()) {
			int d4 = (int)(Math.random()*5+1);
		}
		if(!p.isD5Locked()) {
			int d5 = (int)(Math.random()*5+1);;
		}
		if(!p.isD6Locked()) {
			int d6 = (int)(Math.random()*5+1);
		}
	}

}
