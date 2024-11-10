import java.util.Scanner;
import java.util.regex.Pattern;

public class UserInterface {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// fill the code here
		System.out.println("Enter the dealership name");
		String dealname = sc.nextLine();

		if (!isValidName(dealname)) {
			System.out.println(dealname + " is an invalid dealership name");
			return;

		}
		if (!dealname.matches("[a-zA-Z ]+")) {
			System.out.println(dealname + " is an invalid dealership name");
			return;

		}

		System.out.println("Enter the branch office location");
		String location = sc.nextLine();

		if (!isValidLocation(location)) {
			System.out.println(location + " is an invalid branch office location");
			return;

		}

		if (!location.matches("[a-zA-Z]")) {
			System.out.println(location + " is an invalid branch office location");
			return;

		}

		System.out.println("Unique dealership id is:");

	}

	private static boolean isValidName(String dealerName) {

		String n1 = dealerName.substring(0);
		if (Pattern.matches(dealerName, n1)) {
			return true;

		} else {
			return false;

		}

	}

	private static boolean isValidLocation(String location) {

		int sum = 0;
		int ascii = 0;

		for (int i = 0; i < ascii; i++) {
			char ch;
			

			sum = sum + i;

		}

		return false;

	}
}
