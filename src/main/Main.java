package main;

import java.util.List;
import farkle.*;
import java.util.ArrayList;

public class Main {

	private List<Player> players;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main(args[0], Integer.parseInt(args[1]));
	}
	
	public Main(String game, int players) {
		this.players = new ArrayList<Player>();
		for(int i=0; i<players; i++){
			this.players.add(new Player());
		}
		
		if(game.equalsIgnoreCase("farkle")) {
			new Farkle(this.players);
		}
	}

}
