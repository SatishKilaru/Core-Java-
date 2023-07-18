package practiceeeee;

// 7. Create a PlayerThread class with the constructor to accept MyGameTeam as an object
// and add some random scores to the recieved MyGameTeam object through setScore() method
// under the run() method of thread.

class PlayerThread extends Thread {
	MyGameTeam mgt;
	GameScore g1 = new GameScore("Cricket", 1000);
	GameScore g2 = new GameScore("Base ball", 2000);

	public PlayerThread(MyGameTeam mgt) {

		this.mgt = mgt;
	}

	public void run() {
		mgt.setScore(g1);
		mgt.setScore(g2);
	}

}
