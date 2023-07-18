
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

class Student {
	int regNo;
	String fullName;
	Date dob;
	String branch;
	float cgpa;
	int yearOfPass;

	public Student(int regNo, String fullName, Date dob, String branch, float cgpa, int yearOfPass) {

		this.regNo = regNo;
		this.fullName = fullName;
		this.dob = dob;
		this.branch = branch;
		this.cgpa = cgpa;
		this.yearOfPass = yearOfPass;
	};

	public String toString() {
		return regNo + "  " + fullName + "  " + dob + "  " + branch + "  " + cgpa + "  " + yearOfPass;
	}

	void displayProfile() {
		System.out.println("regNo" + regNo + "  fullName " + fullName + "  dob " + dob + "  branch " + branch
				+ "  cgpa " + cgpa + " yearOfPass " + yearOfPass);
	}
}

@SuppressWarnings("deprecation")
class MyTeam {
	List<Student> team = new ArrayList<>();
	Student s1 = new Student(1, "Luke", new Date(1, 2, 1998), "cse", 9.1f, 4);
	Student s2 = new Student(2, "Marnie", new Date(24, 2, 1997), "ece", 7.2f, 4);
	Student s3 = new Student(3, "Anne", new Date(16, 4, 1997), "ece", 8.5f, 4);
	Student s4 = new Student(4, "Lucy", new Date(16, 9, 1997), "ece", 7.7f, 4);
	Student s5 = new Student(5, "Chelsea", new Date(19, 5, 1999), "cse", 8.2f, 4);
	Student s6 = new Student(6, "Kelly", new Date(6, 7, 1997), "cse", 7.3f, 4);
	Student s7 = new Student(7, "Todd", new Date(16, 11, 1998), "cse", 6.9f, 4);
	Student s8 = new Student(8, "Suzanne", new Date(18, 3, 1997), "cse", 8.9f, 4);
	Student s9 = new Student(9, "Hori", new Date(29, 2, 2000), "cse", 9.7f, 4);
	Student s10 = new Student(10, "Miyamura", new Date(29, 3, 1997), "cse", 7.5f, 4);

	MyTeam() {
		team.add(s1);
		team.add(s2);
		team.add(s3);
		team.add(s4);
		team.add(s5);
		team.add(s6);
		team.add(s7);
		team.add(s8);
		team.add(s9);
		team.add(s10);
	}

	void sortAndPrintByDOB() {
		Comparator<Student> dob = (Student o1, Student o2) -> {
			return o1.dob.compareTo(o2.dob);
		};
		Collections.sort(team, dob);
		printer();
	}

	void sortAndPrintByCGPA() {
		Comparator<Student> cgpa = (Student o1, Student o2) -> {
			return (int) (o1.cgpa - o2.cgpa);
		};
		Collections.sort(team, cgpa);
		printer();
	}

	void printer() {
		for (Student st : team)
			System.out.println(st);
	}
}

@SuppressWarnings("deprecation")
class MyBatch {
	HashMap<Student, HashMap<Integer, Float>> swm = new HashMap<>();
	Student s1 = new Student(1, "Luke", new Date(1, 2, 1998), "cse", 9.1f, 4);
	Student s2 = new Student(2, "Marnie", new Date(24, 2, 1997), "ece", 7.2f, 4);
	Student s3 = new Student(3, "Anne", new Date(16, 4, 1997), "ece", 8.5f, 4);
	Student s4 = new Student(4, "Lucy", new Date(16, 9, 1997), "ece", 7.7f, 4);
	Student s5 = new Student(5, "Chelsea", new Date(19, 5, 1999), "cse", 8.2f, 4);
	Student s6 = new Student(6, "Kelly", new Date(6, 7, 1997), "cse", 7.3f, 4);
	Student s7 = new Student(7, "Todd", new Date(16, 11, 1998), "cse", 6.9f, 4);
	Student s8 = new Student(8, "Suzanne", new Date(18, 3, 1997), "cse", 8.9f, 4);
	Student s9 = new Student(9, "Hori", new Date(29, 2, 2000), "cse", 9.7f, 4);
	Student s10 = new Student(10, "Miyamura", new Date(29, 3, 1997), "cse", 7.5f, 4);

	public MyBatch() {
		HashMap<Integer, Float> h1 = new HashMap<Integer, Float>();
		HashMap<Integer, Float> h2 = new HashMap<Integer, Float>();
		HashMap<Integer, Float> h3 = new HashMap<Integer, Float>();
		HashMap<Integer, Float> h4 = new HashMap<Integer, Float>();
		HashMap<Integer, Float> h5 = new HashMap<Integer, Float>();
		HashMap<Integer, Float> h6 = new HashMap<Integer, Float>();
		HashMap<Integer, Float> h7 = new HashMap<Integer, Float>();
		HashMap<Integer, Float> h8 = new HashMap<Integer, Float>();
		HashMap<Integer, Float> h9 = new HashMap<Integer, Float>();
		HashMap<Integer, Float> h10 = new HashMap<Integer, Float>();

		h1.put(1, 70f);
		h1.put(2, 80f);
		h1.put(3, 90f);
		h1.put(4, 95f);

		h2.put(1, 87f);
		h2.put(2, 88f);
		h2.put(3, 89f);
		h2.put(4, 97f);

		h3.put(1, 85f);
		h3.put(2, 87f);
		h3.put(3, 98f);
		h3.put(4, 87f);

		h4.put(1, 90f);
		h4.put(2, 87f);
		h4.put(3, 85f);
		h4.put(4, 89f);

		h5.put(1, 89f);
		h5.put(2, 98f);
		h5.put(3, 87f);
		h5.put(4, 89f);

		h6.put(1, 96f);
		h6.put(2, 57f);
		h6.put(3, 98f);
		h6.put(4, 90f);

		h7.put(1, 87f);
		h7.put(2, 87f);
		h7.put(3, 99f);
		h7.put(4, 87f);

		h8.put(1, 87f);
		h8.put(2, 87f);
		h8.put(3, 98f);
		h8.put(4, 86f);

		h9.put(1, 87f);
		h9.put(2, 87f);
		h9.put(3, 98f);
		h9.put(4, 98f);

		h10.put(1, 99f);
		h10.put(2, 99f);
		h10.put(3, 99f);
		h10.put(4, 99f);

		swm.put(s1, h1);
		swm.put(s2, h2);
		swm.put(s3, h3);
		swm.put(s4, h4);
		swm.put(s5, h5);
		swm.put(s6, h6);
		swm.put(s7, h7);
		swm.put(s8, h8);
		swm.put(s9, h9);
		swm.put(s10, h10);
	}

	void displaySemWiseMarks() {
		// System.out.println(swm);
		for (Student s : swm.keySet()) {
			System.out.println(s);
			for (Integer i : swm.get(s).keySet()) {
				System.out.println(i + " " + swm.get(s).get(i));
			}
		}
	}
}

class MyGameTeam extends MyTeam {
	Queue<GameScore> gameScores = new LinkedList<>();

	MyGameTeam() {
	}

	void setScore(GameScore gscore) {
		gameScores.add(gscore);
	}

	GameScore getScore() {
		Iterator<GameScore> itr = gameScores.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next().toString() + " by " + Thread.currentThread());
		}
		return null;
	}

}

class GameScore {
	String gameName;
	int score;

	public GameScore(String gameName, int score) {
		this.gameName = gameName;
		this.score = score;
	}

	public String toString() {
		return gameName + "  " + score;
	}
}

class PlayerThread extends Thread {
	MyGameTeam mgt;

	GameScore g1 = new GameScore("Cricket", 97);
	GameScore g2 = new GameScore("FootBall", 89);
	GameScore g3 = new GameScore("Hockey", 89);
	GameScore g4 = new GameScore("Rugby", 95);

	public PlayerThread(MyGameTeam mgt) {
		this.mgt = mgt;
	}

	public void run() {
		mgt.setScore(g1);
		System.out.println("score set to " + g1.score + " by " + Thread.currentThread());
		mgt.setScore(g2);
		System.out.println("score set to " + g2.score + " by " + Thread.currentThread());
		mgt.setScore(g3);
		System.out.println("score set to " + g3.score + " by " + Thread.currentThread());
		mgt.setScore(g4);
		System.out.println("score set to " + g4.score + " by " + Thread.currentThread());
	}
}

class ScoreReaderThread extends Thread {
	MyGameTeam mgt;

	public ScoreReaderThread(MyGameTeam mgt) {
		this.mgt = mgt;
	}

	public void run() {
		System.out.println(mgt.getScore());

	}
}

class ConcQueueUse {
	ConcurrentLinkedQueue<PlayerThread> clq = new ConcurrentLinkedQueue<PlayerThread>();
	GameScore g1 = new GameScore("Cricket", 97);
	GameScore g2 = new GameScore("FootBall", 89);
	GameScore g3 = new GameScore("Hockey", 89);
	GameScore g4 = new GameScore("Rugby", 95);

	MyGameTeam mgtTest = new MyGameTeam();

	PlayerThread p1 = new PlayerThread(mgtTest);
	PlayerThread p2 = new PlayerThread(mgtTest);
	PlayerThread p3 = new PlayerThread(mgtTest);
	ScoreReaderThread srt1 = new ScoreReaderThread(mgtTest);
	ScoreReaderThread srt2 = new ScoreReaderThread(mgtTest);
	ScoreReaderThread srt3 = new ScoreReaderThread(mgtTest);

	public ConcQueueUse() {
		clq.add(p1);
		clq.add(p2);
		clq.add(p3);
		ConcurrentLinkedQueue<Thread> concLink = new ConcurrentLinkedQueue<Thread>(clq);
		Iterator<Thread> itr = concLink.iterator();
		while (itr.hasNext()) {
			itr.next().start();
		}
	}
}

public class Tester {
	public static void main(String[] args) {
		List<Student> Team = new ArrayList<>();
		MyTeam myTeam = new MyTeam();
		System.out.println("\nsortAndPrintByDOB\n");
		myTeam.sortAndPrintByDOB();
		System.out.println("\nsortAndPrintByCGPA\n");
		myTeam.sortAndPrintByCGPA();

		MyBatch myBatch = new MyBatch();
		System.out.println("\n\nSem Wise Marks");
		myBatch.displaySemWiseMarks();
		GameScore g1 = new GameScore("Cricket", 97);
		GameScore g2 = new GameScore("FootBall", 89);
		GameScore g3 = new GameScore("Hockey", 89);
		GameScore g4 = new GameScore("Rugby", 95);
		MyGameTeam mgt1 = new MyGameTeam();
		MyGameTeam mgt2 = new MyGameTeam();
		MyGameTeam mgt3 = new MyGameTeam();
		mgt1.setScore(g1);
		mgt2.setScore(g2);
		mgt3.setScore(g3);
		mgt1.setScore(g4);
		System.out.println("\n\nGamesScores");
		mgt1.getScore();
		mgt2.getScore();
		mgt3.getScore();

		PlayerThread p1 = new PlayerThread(mgt1);
		PlayerThread p2 = new PlayerThread(mgt2);
		PlayerThread p3 = new PlayerThread(mgt3);
		System.out.println("\n\nPlayerThread");
		p1.start();
		p2.start();
		p3.start();

		ScoreReaderThread srt1 = new ScoreReaderThread(mgt1);
		ScoreReaderThread srt2 = new ScoreReaderThread(mgt2);
		ScoreReaderThread srt3 = new ScoreReaderThread(mgt3);
		srt1.start();
		srt2.start();
		srt3.start();
		System.out.println("\n\nScoreReaderThread");

	}
}
