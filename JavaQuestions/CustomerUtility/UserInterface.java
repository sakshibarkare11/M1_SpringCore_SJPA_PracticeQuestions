import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserInterface {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CustomerUtility customerUtility=new CustomerUtility();
		List<Customer> customers=new ArrayList<Customer>();
		
		System.out.println("Enter the total number of customers needed to add in the list");
		int no=sc.nextInt();
		
		System.out.println("Enter the customer details");
		for(int i=0;i<no;i++)
		{
			String input=sc.next();
			String[] details=input.split(",");
			
			customers.add(new Customer(details[0], details[1], details[2], details[3], Integer.parseInt(details[4])));
		}
		System.out.println("Enter the product type");
		String type=sc.next();
		
		List<Customer> custType=customerUtility.retrieveCustomerComplaintDetails_ByProductType(customers.stream(), type);
		if(custType.isEmpty())
			System.out.println("No complaints for this product");
		else
			custType.forEach(System.out::println);
		
		System.out.println("Enter the address");
		String address=sc.next();
		
		List<Customer> custAddr=customerUtility.retrieveCustomerComplaintDetails_ByAddress(customers.stream(), address).collect(Collectors.toList());
		if(custAddr.isEmpty())
			System.out.println("No complaints from this address");
		else
			custAddr.forEach(System.out::println);
		
		System.out.println("Enter the number of gift available");
		int gift=sc.nextInt();
		
		List<Customer> lucky=customerUtility.checkForLuckyWinners(customers.stream(), gift).collect(Collectors.toList());
		System.out.println("Lucky Winners are");
		lucky.forEach(c->System.out.println(c.getName()));
	}
}
