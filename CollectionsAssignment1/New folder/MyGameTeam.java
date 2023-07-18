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

class GameScore {
	String gameName;
	int score;

	public GameScore(String gameName, int score) {
		this.gameName = gameName;
		this.score = score;
	}

	@Override
	public String toString() {
		return this.gameName + " " + this.score;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}

public class MyGameTeam extends MyTeam {
	Queue<GameScore> gameScores;

	public MyGameTeam() {
		gameScores = new LinkedList<>();
	}

	public void setScore(GameScore gscore) {
		gameScores.add(gscore);
	}

	public GameScore getScore() {
		Iterator<GameScore> itr = gameScores.iterator();
		while (itr.hasNext()) {
			GameScore gs = itr.next();
			System.out.println(gs.gameName + " " + gs.score);
		}
		return null;
	}

	// public static void main(String args[]) {
	//
	// }
}
