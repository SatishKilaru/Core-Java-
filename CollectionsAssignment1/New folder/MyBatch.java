import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
 * 4. Create a class MyBatch with a member HashMap<Student,<HashMap<int,float>> semWiseMarks And add constructor to
 * initialize the semWiseMarks member with atleast 4 semester marks.
 * 
 * 
 * 5. Add the following method void displaySemWiseMarks() -Display sem wise score for all students
 */

public class MyBatch {
	HashMap<Student, HashMap<Integer, Float>> semWiseMarks;
	List<Student> team;
	Scanner sc;

	public MyBatch() {
		sc = new Scanner(System.in);
		semWiseMarks = new HashMap<>();
		MyTeam mt = new MyTeam();
		team = mt.team;
		for (Student std : team) {
			int i;
			System.out.println("Enter the number of semesters for: " + std.getFullName());
			i = sc.nextInt();
			HashMap<Integer, Float> oneStdMarks = new HashMap<>();
			for (int j = 1; j <= 4; j++) {
				System.out.println("Enter the " + j + " Semester values: ");
				oneStdMarks.put(j, sc.nextFloat());
			}
			semWiseMarks.put(std, oneStdMarks);
		}
	}

	public void displayMyBatch() {
		for (Student stdkey : semWiseMarks.keySet()) {
			HashMap<Integer, Float> inner = semWiseMarks.get(stdkey);
			System.out.println("All semester marks of " + stdkey.getFullName());
			for (Integer innerkey : inner.keySet()) {
				System.out.println(innerkey + " semester result: " + inner.get(innerkey));
			}
			System.out.println();
		}
	}

	public void displaySemWiseMarks() {
		System.out.println("Enter the no of sems: ");
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			System.out.println(i + " sem marks of all students:");
			for (Student std : semWiseMarks.keySet()) {
				HashMap<Integer, Float> inner = semWiseMarks.get(std);
				System.out.println(std.getFullName() + "'s " + i + " sem marks: " + inner.get(i));
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		MyBatch mb = new MyBatch();
		mb.displaySemWiseMarks();
		System.out.println();
		mb.displayMyBatch();
	}

}
