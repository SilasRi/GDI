import java.util.Scanner;

public class Uebung_4_2 {

	public static void main(String[] args) {
		Gluecksspiel();

	}

	static void Gluecksspiel() {
		int einsatz;
		int raten;
		int random;
		int money = 10000;
		Scanner eingabewert = new Scanner(System.in);
		while (money > 0) {
			do {
				System.out.println("Geben Sie einen Einsatz von " + 1 + " - " + money + "!");
				einsatz = eingabewert.nextInt();
			} while (einsatz > money || einsatz < 1);

			do {

				System.out.println("Raten Sie eine Zahl von 1-9!");
				raten = eingabewert.nextInt();

			} while (raten < 0 || raten > 9);
			random = (int) (Math.random() * 10);
			if (raten == random) {
				money += einsatz * 9;
				System.out.println("Gewonnen! :)");
			} else {
				money -= einsatz;
				System.out.println("Verloren! :(");
			}

		}
		System.out.println("Du bist pleite! :((");
	}
}
