package practiceeeee;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// 4. Create a class MyBatch with a member
// HashMap<Student,<HashMap<int,float>> semWiseMarks
// And add constructor to initialize the semWiseMarks member with atleast 4 semester marks.

// 5. Add the following method
// void displaySemWiseMarks() -Display sem wise score for all students

public class MyBatch {

	HashMap<Students, HashMap<Integer, Float>> semWiseMarks;
	List<Students> team;

	public MyBatch() {
		MyTeam mt = new MyTeam();
		Scanner sc = new Scanner(System.in);
		team = mt.team;
		semWiseMarks = new HashMap<>();
		for (Students siter : team) {
			HashMap<Integer, Float> innerHash = new HashMap<>();
			System.out.println("enter the marks of: " + siter.fullName);
			for (int j = 0; j < 4; j++) {
				System.out.println("enter" + (j + 1) + " sem marks: ");
				float sgpa = sc.nextFloat();
				innerHash.put(j + 1, sgpa);
			}
			semWiseMarks.put(siter, innerHash);
		}

	}

	void getStudentsMarks() {
		for (Students std : semWiseMarks.keySet()) {
			HashMap<Integer, Float> ih = semWiseMarks.get(std);
			for (Integer sem : ih.keySet()) {
				Float cgpas = ih.get(sem);
				System.out.println(std.fullName + " " + sem + " semester marks: " + cgpas);
			}
		}
	}

	void displaySemWiseMarks() {
		for (int i = 1; i <= 4; i++) {
			System.out.println("\n" + i + "Semeser marks:::");
			for (Students stds : semWiseMarks.keySet()) {
				HashMap<Integer, Float> ih = semWiseMarks.get(stds);
				System.out.println(stds.fullName + "'s " + i + " sem marks :" + ih.get(i));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBatch mb = new MyBatch();
		// mb.getStudentsMarks();
		mb.displaySemWiseMarks();
	}

}
