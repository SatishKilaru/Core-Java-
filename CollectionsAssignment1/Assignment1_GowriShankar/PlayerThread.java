package Shankar;

public class PlayerThread extends Thread {
	MyGameTeam gt;

	PlayerThread(MyGameTeam t) {
		gt = t;
	}

	public void run() {
		GameScore s = new GameScore("Cricket", 205);
		GameScore s1 = new GameScore("Kabbadi", 45);
		gt.setScore(s);
		gt.setScore(s1);
	}
}

class ScoreReaderThread extends Thread {
	MyGameTeam mg;

	public ScoreReaderThread(MyGameTeam mgt) {
		mg = mgt;
	}

	public void run() {
		mg.getScores();
	}

}