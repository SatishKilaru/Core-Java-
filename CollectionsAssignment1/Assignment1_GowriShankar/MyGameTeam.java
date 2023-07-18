package Shankar;

import java.util.LinkedList;
import java.util.Queue;

public class MyGameTeam extends MyTeam {

	Queue<GameScore> gameScores = new LinkedList<>();

	void setScore(GameScore gs) {
		gameScores.add(gs);
	}

	GameScore getScores() {

		for (GameScore i : gameScores) {
			System.out.println("Name" + i.gameName + "\n Score" + i.score);
		}
		return null;
	}

}

class GameScore {
	String gameName;
	int score;

	GameScore(String gn, int s) {
		this.gameName = gn;
		this.score = s;

	}

}