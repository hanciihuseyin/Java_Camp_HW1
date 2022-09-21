package sesliHarfler;

public class main {

	public static void main(String[] args) {

		char harf = 'E';

		switch (harf) {
		case 'A', 'U', 'I', 'O':
			System.out.println("Kalın Sesli harf.");
			break;
		case 'E', 'İ', 'Ü', 'Ö':
			System.out.println("İnce Sesli harf.");
			break;
		default:
			System.out.println("Lütfen sesli bir harf giriniz!");
		}

	}

}
