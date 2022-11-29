import java.util.Scanner;

public class Uebung_4_3 {

	public static void main(String[] args) {
		System.out.println("Taschenrechner in Infix-Notation: ");
		Scanner eingabewert = new Scanner(System.in);
		Rechner(eingabewert.nextLine());
	}

	static void Rechner(String Infix) {
		String x1 = "";
		String y1 = "";
		double x2;
		double y2;
		char operator = ' ';
		boolean zahl1 = true;
		for (int i = 0; i < Infix.length(); i++) {
			switch (Infix.charAt(i)) {
			case '+':
				operator = '+';
				zahl1 = false;
				break;
			case '-':
				operator = '-';
				zahl1 = false;
				break;
			case '*':
				operator = '*';
				zahl1 = false;
				break;
			case '/':
				operator = '/';
				zahl1 = false;
				break;
			case ' ':
				break;
			default:
				if (zahl1) {
					x1 += Infix.charAt(i);
				} else {

					y1 += Infix.charAt(i);
				}
			}

		}

		x2 = Double.parseDouble(x1);
		y2 = Double.parseDouble(y1);

		switch (operator) {
		case '+':
			System.out.println(x2 + y2);
			break;
		case '-':
			System.out.println(x2 - y2);
			break;
		case '*':
			System.out.println(x2 * y2);
			break;
		case '/':
			System.out.println(x2 / y2);
			break;
		default:

		}

	}

}
