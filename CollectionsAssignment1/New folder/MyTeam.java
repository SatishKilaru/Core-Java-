import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/*
 * 2. Create a class MyTeam with a member List<Stutdent> team and create a zero argument constructor to initialize the
 * team member with with 10 different student objects.
 * 
 * 
 * 
 * 3. Add the following instance methods to MyTeam class void sortAndPrintByDOB() -Sort the students by their dob and
 * print void sortAndPrintByCGPA() -Sort the students by their CGPA -use Lambda
 */

public class MyTeam implements Comparator<Student> {
	List<Student> team;

	public MyTeam() {
		team = new ArrayList<>();
		Student s1 = new Student(1, "Arun", new Date("9/21/2000"), "MCA", 8.9f, (short) 2023);
		Student s2 = new Student(2, "Sai", new Date("10/17/1998"), "MCA", 8.1f, (short) 2023);
		Student s3 = new Student(3, "Vinay", new Date("6/17/2001"), "MCA", 8.3f, (short) 2023);
		Student s4 = new Student(4, "Shannu", new Date("1/1/1999"), "MCA", 8.2f, (short) 2023);
		Student s5 = new Student(5, "Poja", new Date("4/17/2010"), "MCA", 8.1f, (short) 2023);
		Student s6 = new Student(6, "Reina", new Date("8/18/2009"), "MCA", 9.1f, (short) 2023);
		Student s7 = new Student(7, "Srinu", new Date("1/8/2000"), "MCA", 7.1f, (short) 2023);
		Student s8 = new Student(8, "Raja", new Date("9/24/1998"), "MCA", 6.1f, (short) 2023);
		Student s9 = new Student(9, "Arjun", new Date("6/17/1990"), "MCA", 5.1f, (short) 2023);
		Student s10 = new Student(10, "Gana", new Date("12/21/2000"), "MCA", 9.0f, (short) 2023);
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

	// using dob
	public int compare(Student s1, Student s2) {
		return s1.getDob().compareTo(s2.getDob());
	}

	public void sortAndPrintByDOB() {
		Collections.sort(team, new MyTeam());
		Iterator itr = team.iterator();
		Student std;
		while (itr.hasNext()) {
			std = (Student) itr.next();
			System.out.println(std);
		}
	}

	public void sortAndPrintByCGPA() {
		Collections.sort(team, (Student s1, Student s2) -> {
			if (s1.getCgpa() > s2.getCgpa())
				return 1;
			else if (s1.getCgpa() == s2.getCgpa())
				return 0;
			else
				return -1;
		});

		Iterator itr = team.iterator();
		Student std;
		while (itr.hasNext()) {
			std = (Student) itr.next();
			System.out.println(std);
		}

	}

	// public static void main(String args[]) {
	// MyTeam mt1 = new MyTeam();
	// mt1.sortAndPrintByDOB();
	// System.out.println();
	// mt1.sortAndPrintByCGPA();
	// }

}
