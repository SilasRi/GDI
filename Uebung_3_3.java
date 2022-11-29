import java.util.Scanner;

public class Uebung_3_3 {

	public static void main(String[] args) {
		int Dezimalzahl;
		System.out.println("Geben Sie eine Dezimalzahl ein: ");
		Scanner eingabewert = new Scanner(System.in);
		Dezimalzahl = eingabewert.nextInt();
		printDual(Dezimalzahl);

	}

	static void printDual(int n) {
		if (n > 0) {
			printDual(n / 2);
			System.out.print(n % 2);
		}
	};

}
