package practiceeeee;
// 8. Create a ScoreReaderThread class with the constructor to accept MyGameTeam as an object
// and read the scores of MyGameTeam object.

public class ScoreReaderThread extends Thread {
	MyGameTeam mgt;

	ScoreReaderThread(MyGameTeam mgt) {
		this.mgt = mgt;

	}

	public void run() {
		mgt.getScore();
	}

	public static void main(String args[]) {
		MyGameTeam mgt = new MyGameTeam();
		PlayerThread pt = new PlayerThread(mgt);
		ScoreReaderThread srt = new ScoreReaderThread(mgt);

		srt.start();
		pt.start();
		try {
			srt.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
