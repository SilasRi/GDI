import java.util.Scanner;

public class Uebung_3_4 {
	public static void main(String[] args) {
		int Dezimalzahl;
		System.out.println("Geben Sie eine postivie ganze Zahl ein: ");
		Scanner eingabewert = new Scanner(System.in);
		Dezimalzahl = eingabewert.nextInt();
		System.out.println(Quersumme(Dezimalzahl));
	}

	public static int Quersumme(int n) {
		int help = 0;
		while (n > 0) {
			help += n % 10;
			n /= 10;
		}
		return help;
	}

}
