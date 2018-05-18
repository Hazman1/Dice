package main;

import java.util.List;
import farkle.*;
import java.util.ArrayList;

public class Main {

	private List<Player> players;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		new Main(args[0], Integer.parseInt(args[1]));
		} catch(Exception e) {System.err.println(e);}
	}
	
	public Main(String game, int players) throws Exception {
		this.players = new ArrayList<Player>();
		for(int i=0; i<players; i++){
			this.players.add(new Player());
		}
		
		if(game.equalsIgnoreCase("farkle")) {
			if(this.players.size()!=2) {
				throw new Exception("This is a 2 player game");
			}
			new Farkle(this.players);
		}
	}

}
