import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public static void main(String args[]) {
		// Fill the code here

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of fruits to be added");
		int no=sc.nextInt();
		System.out.println("Enter the fruit details (FruitName: Quantity)");
		//sc.nextLine();
		String[] str=new String[no];
		List<FruitStall> list=new ArrayList<FruitStall>();
		FruitStall f=new FruitStall();
		for(int i=0;i<no;i++)
		{
			str[i]=sc.next();
			String[] arr=str[i].split(":");
			f.addFruits(arr[0].trim(), Double.parseDouble(arr[1]) );
			
		}
		System.out.println("Enter the fruit name");
		String name=sc.next();
		double data=f.findQuantity(name);
	
		if(data==-1)
		{
			System.out.println(name+"  is not available");
		}
		else
		{
			System.out.println(data+" tons of "+name+" is available");
		}
		
		System.out.println("Enter the minimum quantity");
		int quatity=sc.nextInt();
		List<String> list1=f.findFruitsToBePurchased(quatity);
		if(list1.isEmpty())
		{
			System.out.println("No fruits available with minimum quantity "+quatity);
		}
		else
		{
			System.out.println("Fruits with minimum quantity are");
			for (String string : list1) {
				System.out.println(string);
			}
		}
	}

}