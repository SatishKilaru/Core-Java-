package pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class Stud {
	int r;
	String f;
	Date d;
	String b;
	Float C;
	short y;

	Stud(int regNo, String fullName, Date dob, String branch, float CGPA, short yearOfPass) {
		r = regNo;
		f = fullName;
		d = dob;
		b = branch;
		C = CGPA;
		y = yearOfPass;

	}

	void displayProfile() {
		System.out.println("Profile Displayed");

		System.out.println(r);
		System.out.println(f);
		System.out.println(d);
		System.out.println(C);
		System.out.println(y);
	}

	public String toString() {
		return r + " " + f + " " + " " + d + " " + C + " " + y;
	}

}

class Myteam {
	@SuppressWarnings("deprecation")
	// long d1 = Date.parse("03 / 11 / 2001");
	// @SuppressWarnings("deprecation")
	// Stud s1 = new Stud(1, "Sam", new Date("03/11/2002"), "CSE", 8f, (short) 22);
	// @SuppressWarnings("deprecation")
	// Stud s2 = new Stud(2, "Beu", new Date("21 / 04 / 2003"), "ECE", 7f, (short) 21);
	// Stud s3 = new Stud(3, "Shek", new Date("18 / 02 / 1991"), "EEE", 9.1f, (short) 20);

	Stud s1 = new Stud(1, "Sam", new Date(2001 - 9 - 03), "CSE", 8f, (short) 22);
	Stud s2 = new Stud(2, "Beu", new Date(2001 - 9 - 04), "ECE", 7f, (short) 21);
	Stud s3 = new Stud(3, "Sam", new Date(2002 - 10 - 23), "EEE", 9.1f, (short) 20);

	List<Stud> Team = new ArrayList<Stud>();

	Myteam() {
		System.out.println("Team Displayed");

		Team.add(s1);
		Team.add(s2);
		Team.add(s3);
		for (Stud i : Team) {

			System.out.println(i.toString());
		}

	}

	public void sortAndPrintByDOB() {
		Collections.sort(Team, new ExternalSort());
		for (Stud i : Team) {

			System.out.println(i.toString());
		}

	}

	public void sortAndPrintByCGPA() {
		Collections.sort(Team, new ExternalSort2());
		for (Stud i : Team) {

			System.out.println(i.toString());
		}

	}

}

class ExternalSort implements Comparator<Stud> {

	public int compare(Stud o1, Stud o2) {
		if (o1.d.compareTo(o2.d) > 0) {
			return 1;
		} else if (o1.d.compareTo(o2.d) < 0) {
			return -1;
		} else {
			return 0;
		}

	}
}

class ExternalSort2 implements Comparator<Stud> {

	public int compare(Stud o1, Stud o2) {
		if (o1.C.compareTo(o2.C) > 0) {
			return 1;
		} else if (o1.C.compareTo(o2.C) < 0) {
			return -1;
		} else {
			return 0;
		}

	}
}

class MyBatch {
	HashMap<Stud, HashMap<Integer, Float>> semWiseMarks = new HashMap<>();
	HashMap<Integer, Float> h2 = new HashMap<>();

	// long d1 = Date.parse("03 / 11 / 2001");
	// @SuppressWarnings("deprecation")
	// Stud s1 = new Stud(1, "Sam", new Date("03/11/2002"), "CSE", 8f, (short) 22);
	// @SuppressWarnings("deprecation")
	// Stud s2 = new Stud(2, "Beu", new Date("21 / 04 / 2003"), "ECE", 7f, (short) 21);
	// Stud s3 = new Stud(3, "Shek", new Date("18 / 02 / 1991"), "EEE", 9.1f, (short) 20);
	//
	Stud s1 = new Stud(1, "Sam", new Date(2001 - 9 - 03), "CSE", 8f, (short) 22);
	Stud s2 = new Stud(2, "Beu", new Date(2001 - 9 - 04), "ECE", 7f, (short) 21);
	Stud s3 = new Stud(3, "Sam", new Date(2002 - 10 - 23), "EEE", 9.1f, (short) 20);

	MyBatch() {

		h2.put(1, 8.3f);
		h2.put(2, 7.3f);
		h2.put(3, 9.8f);
		h2.put(4, 6.7f);

		// h2.put(, 8.3f);

		semWiseMarks.put(s1, h2);
		semWiseMarks.put(s2, h2);
		semWiseMarks.put(s3, h2);

	}

	void displaySemWiseMarks() {
		for (Stud key : semWiseMarks.keySet())
			System.out.println(key + " - " + semWiseMarks.get(key));
		System.out.println();

	}

}

class MyGameTeam extends Myteam {
	Queue<GameScore> gameScores = new LinkedList<>();

	MyGameTeam() {
	}

	void setScore(GameScore gscore) {
		gameScores.add(gscore);

	};

	GameScore getScore() {
		Iterator<GameScore> itr = gameScores.iterator();

		while (itr.hasNext()) {
			// next() returns the next element in the iteration

			System.out.println(itr.next().toString());
		}
		return null;

	};

}

class GameScore {
	String gameName;
	int score;

	GameScore(String gameName, int score) {
		this.gameName = gameName;
		this.score = score;
	}

	public String toString() {
		return gameName + " " + score;
	}
}

class PlayerThread extends Thread {
	GameScore gs1 = new GameScore("Cricket", 74);
	GameScore gs2 = new GameScore("Hockey", 460);
	GameScore gs3 = new GameScore("IPL", 784);
	GameScore gs4 = new GameScore("Football", 29);
	MyGameTeam mgt;

	PlayerThread(MyGameTeam mgt) {
		this.mgt = mgt;
	}

	public void run() {
		mgt.setScore(gs1);
		mgt.setScore(gs2);
		mgt.setScore(gs3);
		mgt.setScore(gs4);
	}
}

class ScoreReaderThread extends Thread {
	MyGameTeam mgt;

	ScoreReaderThread(MyGameTeam mgt) {
		this.mgt = mgt;
	}

	public void run() {
		mgt.getScore();
	}

}

class ConcurrentQueue {
	ConcurrentLinkedQueue<PlayerThread> clq = new ConcurrentLinkedQueue<PlayerThread>();

	GameScore gs1 = new GameScore("Cricket", 134);
	GameScore gs2 = new GameScore("Hockey", 150);
	GameScore gs3 = new GameScore("IPL", 214);
	GameScore gs4 = new GameScore("Football", 99);
	MyGameTeam mgt = new MyGameTeam();

	PlayerThread pt = new PlayerThread(mgt);
	PlayerThread pt1 = new PlayerThread(mgt);
	PlayerThread pt2 = new PlayerThread(mgt);
	ScoreReaderThread srt = new ScoreReaderThread(mgt);
	ScoreReaderThread srt1 = new ScoreReaderThread(mgt);
	ScoreReaderThread srt2 = new ScoreReaderThread(mgt);

	ConcurrentQueue() {

		clq.add(pt);
		clq.add(pt1);
		clq.add(pt2);
		ConcurrentLinkedQueue<Thread> clq1 = new ConcurrentLinkedQueue<Thread>(clq);

		clq1.add(srt);
		clq1.add(srt1);
		clq1.add(srt2);
		Iterator<Thread> itr = clq1.iterator();
		while (itr.hasNext()) {

			// Thread t = itr.next();

			// if (t instanceof ScoreReaderThread) {
			//
			// System.out.println(" Score Reader Thread Running");
			//// System.out.println(t);
			// itr.next().start();
			// } else if (t instanceof PlayerThread) {

			// System.out.println(" Player Thread Running");
			// System.out.println(t);
			itr.next().start();
			// }

		}

	}
}

public class exam {
	public static void main(String[] args) {
		List<Stud> Team = new ArrayList<Stud>();
		Myteam mt = new Myteam();
		System.out.println("sortAndPrintByDOB");
		mt.sortAndPrintByDOB();
		System.out.println("sortAndPrintByCGPA");
		mt.sortAndPrintByCGPA();

		MyBatch mb = new MyBatch();
		System.out.println("Sem Wise Marks");
		mb.displaySemWiseMarks();
		GameScore gs1 = new GameScore("Cricket", 134);
		GameScore gs2 = new GameScore("Hockey", 150);
		GameScore gs3 = new GameScore("IPL", 214);
		GameScore gs4 = new GameScore("Football", 99);
		MyGameTeam mgt = new MyGameTeam();
		mgt.setScore(gs1);
		mgt.setScore(gs2);
		mgt.setScore(gs3);
		mgt.setScore(gs4);
		System.out.println("GamesScores are");
		mgt.getScore();

		PlayerThread pt = new PlayerThread(mgt);
		PlayerThread pt1 = new PlayerThread(mgt);
		PlayerThread pt2 = new PlayerThread(mgt);
		System.out.println("Player Team Thread Running");
		// pt.start();
		// pt1.start();
		// pt2.start();

		ScoreReaderThread srt = new ScoreReaderThread(mgt);
		ScoreReaderThread srt1 = new ScoreReaderThread(mgt);
		ScoreReaderThread srt2 = new ScoreReaderThread(mgt);
		System.out.println(" Score Reader Thread Running");
		// srt.start();
		System.out.println(" ConcurrentQueue Execution");
		ConcurrentQueue cq = new ConcurrentQueue();
	}
}
