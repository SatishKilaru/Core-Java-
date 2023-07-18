package Shankar;

import java.util.HashMap;
import java.util.List;

public class MyBatch {
	HashMap<Integer, Float> a = new HashMap<>();
	static HashMap<Students, Object> b = new HashMap<>();

	public MyBatch(List<Students> team) {

		for (Students s : team) {
			a.put(1, 8.3f);
			a.put(2, 9.1f);
			a.put(3, 7.9f);
			a.put(4, 7.5f);
			b.put(s, a);

		}
	}

	@SuppressWarnings("unchecked")
	static void displaySemWiseMarks() {
		for (Students x : b.keySet()) {
			System.out.println("Student:" + x.fullName);
			HashMap<Integer, Float> xyz = (HashMap<Integer, Float>) b.get(x);
			for (Integer y : xyz.keySet()) {
				System.out.println("	Sem:" + y);

				System.out.println("		Marks:" + xyz.get(y));
			}
		}

	}
}
