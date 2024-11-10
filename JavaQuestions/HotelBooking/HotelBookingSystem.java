public class HotelBookingSystem 
{
	public boolean validateBookingDetails(String username, String couponCode, String roomType) throws InvalidBookingDetailsException 
	{
		if(username.matches("(?=.*[a-z])(?=.*[0-9])(?=.*[_]).{5,15}"))
        {
        	if(couponCode.matches("code[0-9]{3}"))
        	{
        		if(roomType.equals("single")||roomType.equals("double")||roomType.equals("suite"))
        		{
        			return true;
        		}
        		else
        			throw new InvalidBookingDetailsException("Invalid room type");
        	}
        	else
        		throw new InvalidBookingDetailsException("Invalid coupon code");
        }
		else
			throw new InvalidBookingDetailsException("Invalid username");
    	}

	public String getBookingStatus() 
   	{
       	    // String str="Enjoy Your Stay";
	    return "Enjoy Your Stay";
  	}
}