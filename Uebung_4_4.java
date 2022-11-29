import java.util.Scanner;
import java.lang.*;

public class Uebung_4_4 {

	public static void main(String[] args) {
		System.out.println("Wie viele Jahre sollen berechnet werden?   ");
		Scanner eingabewert = new Scanner(System.in);
		int years = eingabewert.nextInt();

		long zeitpunktStart = System.nanoTime();
		System.out.print("Iterativ: " + FiboIterativ(years) + " - Dauer in Nanoseconds: ");
		long zeitpunktEnde = System.nanoTime();
		long dauer = zeitpunktEnde - zeitpunktStart;
		System.out.println(dauer);

		zeitpunktStart = System.nanoTime();
		System.out.print("Rekursiv: " + FiboRekursiv(years) + " - Dauer in Nanoseconds: ");
		zeitpunktEnde = System.nanoTime();
		dauer = zeitpunktEnde - zeitpunktStart;
		System.out.println(dauer);
	}

	public static long FiboIterativ(int years) {

		long last = 0;
		long next = 1;
		if (years == 0) {
			return 0;
		} else if (years == 1) {
			return 1;
		}
		for (int i = 2; i <= years; i++) {
			long help = last;
			last = next;
			next = help + next;
		}
		return next;

	}

	static long FiboRekursiv(int years) {
		long pair = 0;
		if (years == 0) {
			return 0;
		} else if (years == 1) {
			return 1;
		} else {
			return (FiboRekursiv(years - 1) + FiboRekursiv(years - 2));
		}
	}
}
