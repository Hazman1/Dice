package farkle;

import main.*;
import java.util.List;
import java.util.ArrayList;

public class Farkle {

	public Farkle() {
		
	}
	
	public Farkle(List<Player> players) {
		System.out.println(players.size());
		System.out.println(players.get(0).isAI());
	}

}
