import java.util.Scanner;
public class UserInterface{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user id");
		String id=sc.next();
		if(id.length()!=14)
		{
			System.out.println(id.length()+" is an invalid length");
			return;
		}
		String first=id.substring(0,2);
		if(first.matches("^[A-Z]{2}$"))
		{
			String mobile=id.substring(2,12);
			Integer i=mobile.indexOf(0);
			if( mobile.matches("6[0-9]{9}$")||mobile.matches("7[0-9]{9}$")||mobile.matches("8[0-9]{9}$")||mobile.matches("9[0-9]{9}$"))
			{
				
				String age=id.substring(12);
				if(Integer.parseInt(age)>=21 && Integer.parseInt(age)<=30)
				{//int gd=Integer.parseInt(mobile);
					
					StringBuilder b=new StringBuilder();
					b.append(mobile.substring(1,2));
					b.append(mobile.substring(3,4));
					b.append(mobile.substring(5,6));
					b.append(mobile.substring(7,8));
					b.append(mobile.substring(9,10));
					b.append(age);
					System.out.println("OTP: "+b.toString());
				}
				else
				{
					System.out.println(age+" is an invalid age");
					return;
				}
			}
			else
			{
				System.out.println(mobile+" is an invalid mobile number");
				return ;
			}
			
		}
		else
		{
			System.out.println(id+" is an invalid user id");
			return;
		}
		
		
	
	}

}