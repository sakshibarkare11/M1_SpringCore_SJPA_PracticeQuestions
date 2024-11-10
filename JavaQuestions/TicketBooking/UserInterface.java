import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        TicketBooking ticketBooking=new TicketBooking();

        System.out.println("Enter the number of tickets to be booked");
        int no=sc.nextInt();
        
        System.out.println("Enter the ticket details (Seat Number: Ticket Type)");
        for(int i=0;i<no;i++)
        {
        	String input=sc.next();
        	String[] details=input.split(":");
        	
        	ticketBooking.addTicketBookingDetails(details[0], details[1]);
        }
        System.out.println("Enter the ticket type to count the seats filled");
        String type=sc.next();
        
        int count=ticketBooking.findTotalCountOfSeatNumbersBasedOnTicketType(type);
        if(count==-1)
        	System.out.println("No tickets were booked in ticket type "+type);
        else
        	System.out.println("Number of seats filled in ticket type "+type+" is "+count);
        
       System.out.println("Enter the ticket type to find seat numbers");
       String seatType=sc.next();
       List<String> seats=ticketBooking.searchSeatNumbersByTicketType(seatType);
       if(seats.isEmpty())
    	   System.out.println("No tickets were booked in ticket type "+seatType);
       else
       {
    	   System.out.println("Seat numbers in ticket type "+seatType+" are");
    	   seats.forEach(System.out::println);
    	  
       }
    	   
    }
}
