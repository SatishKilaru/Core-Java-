package practiceeeee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

// 2. Create a class MyTeam with a member
// List<Stutdent> team
// and create a zero argument constructor to initialize the team member with with 10 different student
// objects



public class MyTeam {
	List<Students> team;

	MyTeam() {
		Students s1 = new Students(1, "Satvika", new Date("12/30/2000"), "MCA", 8.6f, (short) 2023);
	
		Students s2 = new Students(2, "Dhana", new Date("2/18/2001"), "MBA", 8.3f, (short) 2023);
	
		 Students s3 = new Students(3, "Teja Sree", new Date("6/24/1996"), "Btech", 8.2f, (short) 1996);
		
		 Students s4 = new Students(4, "Kartikeya Reddy", new Date("2/26/2003"), "Btech", 7.8f, (short) 2024);
		
		Students s5 = new Students(5, "Arun", new Date("9/20/2000"), "MCA", 9.1f, (short) 2023);
		
		 Students s6 = new Students(6, "Indira", new Date("10/15/2001"), "Btech", 8.4f, (short) 2023);
		
		 Students s7 = new Students(7, "DhanaSree", new Date("2/3/2001"), "Btech", 8.6f, (short) 23);
	
		 Students s8 = new Students(8, "Sowjanya", new Date("4/8/1998"), "MCA", 7.5f, (short) 23);

		 Students s9 = new Students(9, "Dinesh", new Date("4/4/2001"), "MCA", 8.2f, (short) 23);
	
		 Students s10 = new Students(10, "Shruti", new Date("12/3/2000"), "Btech", 7.6f, (short) 23);
		 s10.displayProfile();

		// for list
		team = new ArrayList<Students>();

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

// 3. Add the following instance methods to MyTeam class
// void sortAndPrintByDOB() -Sort the students by their dob and print
// void sortAndPrintByCGPA() -Sort the students by their CGPA -use Lambda

	void sortAndPrintByDOB() {
		System.out.println("********before sorting ************");
		for (Students s : team) {
			System.out.println(s);
		}
		System.out.println("********after sorting with DOB************");
		Collections.sort(team, new StudentComparator());
		for (Students s : team) {
			System.out.println(s);
		}

	}

	void sortAndPrintByCGPA() {
		

		Collections.sort(team, (Students s1, Students s2) -> {
			double val = (s1.cgpa - s2.cgpa);
			if (val < 0)
				return -1;
			else if (val > 0)
				return 1;
			else
				return 0;
		});
		System.out.println("********after sorting with cgpa************");
		for (Students s : team) {
			System.out.println(s);
		}

	}

	public static void main(String args[]) {
		MyTeam mt = new MyTeam();
		mt.sortAndPrintByDOB();
		mt.sortAndPrintByCGPA();
	}

}

class StudentComparator implements Comparator<Students> {
	public int compare(Students s1, Students s2) {
		return s1.dob.compareTo(s2.dob);
	}
}
