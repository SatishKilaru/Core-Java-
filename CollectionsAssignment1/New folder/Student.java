import java.util.Date;
/*
 * 1. Create a Student class with following members and methods. -int regNo -String fullName -Date dob -String branch
 * -float CGPA -short yearOfPass void displayProfile()
 */

public class Student {
	private int regNo;
	private String fullName;
	private Date dob;
	private String branch;
	private float cgpa;
	private short yearOfPass;

	public Student(int regNo, String fullName, Date dob, String branch, float cgpa, short yearOfPass) {
		this.regNo = regNo;
		this.fullName = fullName;
		this.dob = dob;
		this.branch = branch;
		this.cgpa = cgpa;
		this.yearOfPass = yearOfPass;
	}

	public void displayProfile() {
		System.out.println("Registration No: " + regNo + "\nFull Name: " + fullName + "\nDate of birth: " + dob
				+ "\nBranch: " + branch + "\nCgpa: " + cgpa);
	}

	public String toString() {
		return regNo + " " + fullName + " " + branch + " " + cgpa + " " + dob;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public short getYearOfPass() {
		return yearOfPass;
	}

	public void setYearOfPass(short yearOfPass) {
		this.yearOfPass = yearOfPass;
	}

	// public static void main(String args[]) {
	// new Student(1, "Arun", new Date("9/21/2000"), "MCA", 8.1f, (short) 2023).displayProfile();
	// }
}
