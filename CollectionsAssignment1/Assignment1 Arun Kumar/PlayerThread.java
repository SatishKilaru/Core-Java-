
/*
 * 7. Create a PlayerThread class with the constructor to accept MyGameTeam as an object and add some random scores to
 * the recieved MyGameTeam object through setScore() method under the run() method of thread.
 */

public class PlayerThread extends Thread {
	private MyGameTeam mgt;

	public PlayerThread(MyGameTeam mgt) {
		this.mgt = mgt;
	}

	public void run() {
		int score1 = (int) (Math.random() * 100);
		String gname1 = "Cricket";
		int score2 = (int) (Math.random() * 100);
		String gname2 = "BaseBall";
		mgt.setScore(new GameScore(gname1, score1));
		mgt.setScore(new GameScore(gname2, score2));
	}

	// public static void main(String[] args) {
	//
	// MyGameTeam mgt = new MyGameTeam();
	// PlayerThread pt1 = new PlayerThread(mgt);
	// pt1.run();
	// mgt.getScore();
	// }

}
