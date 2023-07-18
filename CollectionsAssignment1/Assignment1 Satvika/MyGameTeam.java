package practiceeeee;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// 6. Write a class MyGameTeam extending MyTeam class with following Members and methods
// Queue<GameScore> gameScores -member to store different game scores
// void setScore(GameScore gscore) -to set the score to gameScores
// GameScore getScore() -to read the score from gameScores
// class GameScore{
// String gameName;
// int score;
// }

public class MyGameTeam extends MyTeam {
	Queue<GameScore> gameScores;

	MyGameTeam() {
		gameScores = new LinkedList<GameScore>();

	}

	void setScore(GameScore gscore) {
		gameScores.add(gscore);
	}

	GameScore getScore() {
		Iterator<GameScore> it = gameScores.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		return null;

	}

}

class GameScore {
	String gameName;
	int score;

	GameScore(String gameName, int score) {
		this.gameName = gameName;
		this.score = score;
	}

	@Override
	public String toString() {
		return gameName + " " + score;
	}
}
