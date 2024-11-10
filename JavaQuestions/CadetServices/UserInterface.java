import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Cadet> list=new ArrayList<Cadet>();
		System.out.println("Enter the Total Number of Cadet details Needed to add in the list");
		int no=scanner.nextInt();
		System.out.println("Enter the Cadet details");
		String[] data=new String[no];
		for(int i=0;i<no;i++)
		{
			data[i]=scanner.next();
			String[] arr=data[i].split(":");
			Cadet c=new Cadet(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]));
			list.add(c);
		}
		System.out.println("Enter the Group name");
		String group=scanner.next();
		CadetService cs=new CadetService();
		List<Cadet> l=cs.retrieveDetailsByGroupName(list.stream(), group);
		if(l.isEmpty())
		{
			System.out.println("No Cadets is found for the given group name");
		}
		else
		{
			for (Cadet cadet : l) {
				System.out.println(cadet);
			}
		}
		
		
		System.out.println("Enter the Age");
		int age=scanner.nextInt();
		
		Stream<Cadet> s1=cs.retrieveDetailsByAge(list.stream(), age);
		List<Cadet> l2=s1.toList();
		if(l2.isEmpty())
		{
			System.out.println("No Cadets are present above the given age");
		}
		else
		{
			for (Cadet cadet : l2) {
				
				System.out.println(cadet);
			}
		}
		
		
		System.out.println("Enter the number of Cadets to be retrieved from the list");
		int count=scanner.nextInt();
		Stream<Cadet> s2=cs.retrieveCadetDetailsByAgeForGivenCount(list.stream(), count);
		List<Cadet> l3=s2.toList();
		if(!l3.isEmpty()) {
			System.out.println("Cadets based on maximum age:");
		for (Cadet cadet : l3) {
			System.out.println(cadet.getCadetNumber());
		}
		}
	}
}





