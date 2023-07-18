
/*
 * 8. Create a ScoreReaderThread class with the constructor to accept MyGameTeam as an object and read the scores of
 * MyGameTeam object.
 * 
 * 
 * 9. Write a class to demonstrate the usage of concurrent Queue by adding different gamescores by different
 * PlayerThreads and subsequently read the scores by using ScoreReaderThread.
 */

public class ScoreReaderThread extends Thread {
	private MyGameTeam mgt;

	public ScoreReaderThread(MyGameTeam mgt) {
		this.mgt = mgt;
	}

	public void run() {
		mgt.getScore();
	}

	public static void main(String[] args) {

		MyGameTeam mgt = new MyGameTeam();
		PlayerThread pt1 = new PlayerThread(mgt);
		pt1.start();

		try {
			pt1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ScoreReaderThread srt = new ScoreReaderThread(mgt);
		srt.start();

		try {
			srt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Completed..");

	}
}
