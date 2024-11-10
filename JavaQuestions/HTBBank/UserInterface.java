import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) throws InvalidAccountDetailsException {
        Scanner scanner = new Scanner(System.in);
        
       // Fill the code here
        AccountLinkingSystem obj=new AccountLinkingSystem();
        
        System.out.println("Enter Account Number:");
        String acNum=scanner.nextLine();
        
        System.out.println("Enter Aadhar Number:");
        String  aadharNum=scanner.nextLine();
        
        System.out.println("Enter PAN Number:");
        String  panNum=scanner.nextLine();
        try {
        	 obj.validateAccountDetails(acNum, aadharNum, panNum);
        	 
        	 //System.out.println(acNum,aadharNum,panNum);
        }
        catch(InvalidAccountDetailsException e) {
        	System.out.println(e.getMessage());
        	
        }
       
        
    }
}