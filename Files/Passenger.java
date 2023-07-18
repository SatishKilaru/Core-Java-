//package collectionsPract;

public class Passenger {
	static float basePrice = 350;
	String name;
	int age;
	char gender;
	String prefBerth;
	float ticketCost;

	public Passenger(String name, int age, char gender, String prefBerth) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.prefBerth = prefBerth;
		if ((age > 65 && gender == 'm') || (age > 58 && gender == 'f'))
			ticketCost = basePrice * 75.0f;
		else if (age < 5)
			ticketCost = 0;
		else if (age < 12)
			ticketCost = basePrice * 0.50f;
		else
			ticketCost = basePrice;
	}
public String getName() {
		return name;
}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPrefBerth() {
		return prefBerth;
	}

	public void setPrefBerth(String prefBerth) {
		this.prefBerth = prefBerth;
	}
}
