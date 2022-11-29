import java.util.Scanner;

public class Uebung_4_1 {

	public static void main(String[] args) {
		String einlesen;
		System.out.println("beliebige Eingabe:");
		Scanner eingabewert = new Scanner(System.in);
		einlesen = eingabewert.next();
		System.out.println(palindrom(einlesen));
	}

	private static boolean palindrom(String text) {
		if (text.length() <= 1) {
			return true;
		}

		if (text.charAt(0) != text.charAt(text.length() - 1)) {
			return false;

		}
		text = text.substring(1, text.length() - 1);
		return palindrom(text);
	}

}
