package collectionsAssignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class Student {
	int regNo;
	String fullName;
	Date dob;
	String branch;
	float cgpa;
	short yearOfPass;

	public Student(int regNo, String fullName, Date dob, String branch, float cgpa, short yearOfPass) {
		this.regNo = regNo;
		this.fullName = fullName;
		this.dob = dob;
		this.branch = branch;
		this.cgpa = cgpa;
		this.yearOfPass = yearOfPass;

	}

	public void displayProfile() {
		System.out.println("Student Details:\n Registration Number :" + regNo + "\n Name :" + fullName + "\n DOB :"
				+ dob + "\n" + " Branch :" + branch + "\n CGPA:" + cgpa + "\n YearOfPass :" + yearOfPass);
	}

	public String toString() {
		return "Student Details:\n Registration Number :" + regNo + "\n Name :" + fullName + "\n DOB :" + dob + "\n"
				+ " Branch :" + branch + "\n CGPA:" + cgpa + "\n YearOfPass :" + yearOfPass;
		// To check in concise format below return statement
		// return "DOB :" + dob + "CGPA:" + cgpa;

	}

}

// question2
class myTeam {
	List<Student> Team = new ArrayList<>();
	Student s;

	public myTeam() {
		// List<Student> Team = new ArrayList<>();
		Student s1 = new Student(1, "Akshaya", new Date("07/03/2002"), "CSE", 8.4f, (short) 2023);
		Student s2 = new Student(2, "Sathvika", new Date("12/10/2001"), "CSE", 8.1f, (short) 2023);
		Student s3 = new Student(3, "Beulah", new Date("12/12/2003"), "CSE", 7.4f, (short) 2023);
		Student s4 = new Student(4, "Bhavya", new Date("12/30/2002"), "CSE", 8.9f, (short) 2023);
		Student s5 = new Student(5, "Bhavana", new Date("12/30/2001"), "CSE", 6.4f, (short) 2023);
		Student s6 = new Student(6, "Vinay", new Date("12/30/2004"), "CSE", 7.6f, (short) 2023);
		Student s7 = new Student(7, "Adithya", new Date("12/30/2001"), "CSE", 7.1f, (short) 2023);
		Student s8 = new Student(8, "Dheeraj", new Date("10/30/1999"), "CSE", 8.2f, (short) 2023);
		Student s9 = new Student(9, "Sathvik", new Date("11/30/2000"), "CSE", 6.9f, (short) 2023);
		Student s10 = new Student(10, "Bhargavi", new Date("02/09/2000"), "CSE", 8.4f, (short) 2023);
		Team.add(s1);
		Team.add(s2);
		Team.add(s3);
		Team.add(s4);
		Team.add(s5);
		Team.add(s6);
		Team.add(s7);
		Team.add(s8);
		Team.add(s9);
		Team.add(s10);

	}

	// By Default adding default Team Members sem marks
	public void addSemMarks() {
		for (Student s : Team) {
			System.out.println(s);
			MyBatch mb = new MyBatch(s);
		}

	}

	public void sortAndPrintByDOB() {
		Collections.sort(Team, new externalSortDOB());
		for (Student s : Team) {
			System.out.println(s);

		}
	}

	public void sortAndPrintByCGPA() {
		Collections.sort(Team, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				if (o1.cgpa < o2.cgpa)
					return 1;
				else if (o1.cgpa == o2.cgpa)
					return 0;
				else
					return -1;

			}
		});
		for (Student s : Team) {
			System.out.println(s);
		}
	}

}

// Class for Sorting the team ArrayList based on DOB
class externalSortDOB implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if (o1.dob.compareTo(o2.dob) > 0)
			return 1;
		else if (o1.dob.compareTo(o2.dob) < 0)
			return -1;
		else
			return 0;

	}

}

// Question-4 Class
class MyBatch {
	HashMap<Student, HashMap<Integer, Float>> semWiseMarks = new HashMap<>();
	HashMap<Integer, Float> sem = new HashMap<>();

	public MyBatch(Student s) {
		sem.put(1, 8.9f);
		sem.put(2, 8.8f);
		sem.put(3, 8.4f);
		sem.put(4, 8.0f);
		semWiseMarks.put(s, sem);

		for (Student x : semWiseMarks.keySet()) {
			System.out.println("Student:" + x.fullName);
			Map<Integer, Float> xyz = semWiseMarks.get(x);
			for (Integer y : xyz.keySet()) {
				System.out.println("	Sem:" + y);

				System.out.println("		Marks:" + xyz.get(y));
			}
		}
	}

	// Question-5
	public void displaySemWiseMarks() {
		myTeam m = new myTeam();
		m.addSemMarks();
	}

}

// Question-6
class MyGameTeam extends myTeam {
	Queue<GameScore> gameScores; // member to store different game scores

	public MyGameTeam() {
		gameScores = new LinkedList<>();
	}

	// to set the score to gameScores
	void setScore(GameScore gscore) {
		gameScores.add(gscore);
	}

	// to read the score from gameScores
	public GameScore getScore() {
		Iterator<GameScore> itr = gameScores.iterator();

		// hasNext() returns true if the queue has more elements
		while (itr.hasNext()) {
			// next() returns the next element in the iteration
			System.out.println(itr.next().toString());
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
		return "GameName :" + this.gameName + "\nScore :" + score + "\n";
	}
}

// Question-7
class PlayerThread extends Thread {
	MyGameTeam mg;
	GameScore gs = new GameScore("Cricket", 43);
	GameScore gs1 = new GameScore("Hockey", 99);

	public PlayerThread(MyGameTeam mgt) {
		mg = mgt;
	}

	public void run() {
		mg.setScore(gs);
		mg.setScore(gs1);
	}

}

// Question-8
class ScoreReaderThread extends Thread {
	MyGameTeam mg;

	public ScoreReaderThread(MyGameTeam mgt) {
		mg = mgt;
	}

	public void run() {
		mg.getScore();
	}

}

// Question-9

// Write a class to demonstrate the usage of concurrent Queue by adding different gamescores
// by different PlayerThreads and subsequently read the scores by using ScoreReaderThread.
class useofConcurrentQueue {
	ConcurrentLinkedQueue<PlayerThread> clq = new ConcurrentLinkedQueue<>();

	MyGameTeam mgt = new MyGameTeam();
	PlayerThread pt = new PlayerThread(mgt);
	PlayerThread pt1 = new PlayerThread(mgt);
	PlayerThread pt2 = new PlayerThread(mgt);
	ScoreReaderThread st = new ScoreReaderThread(mgt);
	ScoreReaderThread st1 = new ScoreReaderThread(mgt);
	ScoreReaderThread st2 = new ScoreReaderThread(mgt);

	public useofConcurrentQueue() {
		clq.add(pt);
		clq.add(pt1);
		clq.add(pt2);
		ConcurrentLinkedQueue<Thread> clq1 = new ConcurrentLinkedQueue<>(clq);
		clq1.add(st);
		// clq1.add(st1);
		// clq1.add(st2);
		// Iterator<PlayerThread> itr = clq.iterator();
		Iterator<Thread> itr1 = clq1.iterator();

		while (itr1.hasNext()) {
			// System.out.println(itr1.next().start());
			itr1.next().start();

		}

	}

}

public class assignment1Akshaya{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student(1, "Akshaya", new Date("12/30/2000"), "CSE", 8.4f, (short) 2023);
		s.displayProfile();
		myTeam m = new myTeam();
		m.sortAndPrintByDOB();
		m.sortAndPrintByCGPA();
		MyBatch mb = new MyBatch(s);
		mb.displaySemWiseMarks();

		GameScore gs = new GameScore("Cricket", 125);
		GameScore gs1 = new GameScore("Hockey", 13);
		MyGameTeam mgt = new MyGameTeam();
		// mgt.setScore(gs);
		// mgt.setScore(gs1);
		// mgt.getScore();
		// PlayerThread pt = new PlayerThread(mgt);
		// pt.start();
		// ScoreReaderThread st = new ScoreReaderThread(mgt);
		//
		// ScoreReaderThread st1 = new ScoreReaderThread(mgt);
		// st.start();
		// st1.start();
		System.out.println("Concurrent Queue Execution");
		useofConcurrentQueue ucq = new useofConcurrentQueue();
	}

}
