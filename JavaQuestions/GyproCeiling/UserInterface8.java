
import java.util.List;
import java.util.Scanner;

public class UserInterface8 {

	public static void main(String args[]) {
		// Fill the code here

		Ceiling obj = new Ceiling();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of records to be added");
		int number = sc.nextInt();
		sc.nextLine();

		if (number < 0) {
			System.out.println("Invalid");
		}
		System.out.println("Enter the records (Order Id: Ceiling Type)");
		for (int i = 0; i <= number; i++) {

			String details = sc.nextLine();
			
			obj.addCeilingDetails(details);

//			String[] part = details.split(":");
//
//			String orderId = part[0];
//			String cType = part[1];
//
//			obj.addCeilingDetails(cType);

		}
		System.out.println("Enter the Ceiling type to be searched");
		String searchType = sc.nextLine();
		Integer s2 = Integer.parseInt(searchType);
		s2 = obj.findCountOfOrderIdsBasedOnTheCeilingType(searchType);

//	    if(s2.isEmpty()) {
//			
		System.out.println("No Order were found for " + s2);
//			
//		}else {
		System.out.println("The Order based on " + s2 + " are");
//			
//		}

		System.out.println("Enter the Ceiling type to identify the Order Ids");
		String orderid = sc.nextLine();

		List<String> e = obj.findOrderIdsBasedOnTheCeilingType(orderid);
		if (e.isEmpty()) {
			System.out.println("No Order Ids were found for beam");
		} else {
			System.out.println("Order Ids based on the " + e + " are");

		}
	}

}