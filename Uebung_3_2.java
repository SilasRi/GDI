import java.util.Scanner;

public class Uebung_3_2 {
	public static void main(String[] args) {
		char zeichen;
		System.out.println("Geben Sie a/A oder b/B ein: ");
		Scanner eingabewert = new Scanner(System.in);
		zeichen = eingabewert.next().charAt(0);
		switch (zeichen) {
		case 'a':
		case 'A':
			System.out.println("Anna");
			break;
		case 'b':
		case 'B':
			System.out.println("Berta");
			break;
		default:
			System.out.println("Sonderfall");
		}

	}
}