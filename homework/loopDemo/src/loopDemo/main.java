package loopDemo;

public class main {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("Dongu bitti.");

		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("Dongu bitti.");

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("Dongu bitti.");

		int j = 1;

		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);

		System.out.println("Dongu bitti.");

	}

}
