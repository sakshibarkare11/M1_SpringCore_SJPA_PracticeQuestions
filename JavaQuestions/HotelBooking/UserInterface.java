import java.util.Scanner;

public class UserInterface {
	public static boolean idValid(String str)
	{
		if(str.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@*$#])$"))
			return false;
		else
			return true;
	}
	public static String reverseIndex(String str)
	{
		StringBuilder reverse=new StringBuilder();
		int i=0;
		int j=0;
		while(i<=str.length())
		{
			if(i==str.length()-1)
			{
				reverse.append(str.charAt(i));
				break;
			}
			else if(j==str.length()-1)
			{
				//reverse.append(str.charAt(j));
				break;
			}
			else if(i==str.length())
				break;
			else
			{
				j=i+1;
				reverse.append(str.charAt(j));
				reverse.append(str.charAt(i));
				reverse.append(" ");
			}
			i=j+1;
		}
		
		return reverse.toString();
	}
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		if(str.contains("@")|str.contains("#")|str.contains("*")|str.contains("$"))
		{
			System.out.println(str+" is an invalid String as it contain special characters");
		}
		else
		{
			
			String wordC=str.trim();
			if(wordC.length()>=2 && wordC.length()<=20)
			{
				
				if(str.contains(" "))
				{
					StringBuilder reverse=new StringBuilder();
					String[] words=str.split(" ");
					String abc=reverseIndex(words[0]);
					String[] abcArray=abc.split(" ");
					String[] xyz=new String[abcArray.length];
					for(int i=0;i<abcArray.length;i++)
					{
						xyz[i]=abcArray[abcArray.length-1-i];
					}
					for(int i=0;i<xyz.length;i++)
					{
						System.out.print(xyz[i]+" ");
					}
					System.out.println();
					for(int i=1;i<words.length;i++)
					{
						
						System.out.println(reverseIndex(words[i]));
					}
				}
				else
				{
					
					System.out.println(reverseIndex(str));
				}
			}
			else
				System.out.println(str+" is an invalid string which has a length of "+wordC.length());
		}
			
	}
}
