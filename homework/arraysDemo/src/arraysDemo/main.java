package arraysDemo;

public class main {

	public static void main(String[] args) {

		String[] students = { "Huseyin", "Atakan", "Yunus" };

		for (String student : students) {
			System.out.println(student);
		}

		System.out.println("");

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Huseyin";
		ogrenciler[1] = "Atakan";
		ogrenciler[2] = "Yunus";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

	}

}
