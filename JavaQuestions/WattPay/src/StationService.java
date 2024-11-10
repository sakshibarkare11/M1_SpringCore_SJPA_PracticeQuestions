
public class StationService {
	
	public boolean validateLicensePlate(String licensePlate) throws InvalidChargingDataException 
	{
	    //Fill the code here		
		if(!licensePlate.matches("[A-Z][0-9]\\-") && licensePlate.length()!=8)
		{
			throw new InvalidChargingDataException("Invalid license plate number");
		}
	    
	    return true;
	}
	
	public boolean validateVehicleType(String vehicleType) throws InvalidChargingDataException
	{
	    //Fill the code here
		if(!vehicleType.equals("Hybrid")&& !vehicleType.equals("Electric")) {
			
			throw new InvalidChargingDataException("Vehicle type is not supported");
		}
		
		
//		if(!vehicleType.equals("Electric" ) && !vehicleType.equals("Hybrid" ))
//		{
//			throw new InvalidChargingDataException("Vehicle type is not supported");
//		}
	    
	    return true;
	}
	
	public boolean validateBatteryLevel(double batteryLevel) throws InvalidChargingDataException
	{
	    //Fill the code here
		if (batteryLevel>95.0) {
			throw new InvalidChargingDataException("Battery level is too high to start charging");
		}
		return true;
		
		
		/*
		 * if(batteryLevel>95.0) { throw new
		 * InvalidChargingDataException("Battery level is too high to start charging");
		 * }
		 * 
		 * return true;
		 */
	}
	
	public boolean validatePaymentType(String paymentType) throws InvalidChargingDataException
	{
	    //Fill the code here
		if(!paymentType.equals("Card") && !paymentType.equals("Cash") && !paymentType.equals("Digital Wallet") && !paymentType.equals("UPI"))
		{
			throw new InvalidChargingDataException("Payment method is not supported");
		}
			
	    return true;
	}

	public double calculateChargingCost(String vehicleType,double energyConsumed, String paymentType) throws InvalidChargingDataException {
		double discount =0;
		double totalCost =0;
		if(vehicleType.equals("Electric")) {
			totalCost=energyConsumed*10;
		}
		else if(vehicleType.equals("Hybrid")) {
			totalCost=energyConsumed*15;
		}
		
		
		if(vehicleType.equals("Digital Wallet")) {
			discount =5;
		}
		else if(vehicleType.equals("Card")) {
			discount =3;
		}
		else if(vehicleType.equals("Cash")) {
			discount =0;

		}
		else if(vehicleType.equals("UPI")) {
			discount =2;

		}
		double discountedPrice= totalCost* (discount/100);
		totalCost=totalCost-discountedPrice;
		
		return totalCost;
//		
//		double totalCost = 0;
//	    double discount=0;
//	    
//	    //Fill the code here
//	    if(vehicleType.equals("Electric"))
//	    {
//	    	totalCost=energyConsumed * 10;
//	    }
//	    else if(vehicleType.equals("Hybrid"))
//	    {
//	    	totalCost=energyConsumed * 15;
//	    }
//	    
//	    
//	    
//	    if(paymentType.equals("Digital Wallet"))
//	    {
//	    	discount=5;
//	    }
//	    else if(paymentType.equals("UPI"))
//	    {
//	    	discount=2;
//	    }
//	    else  if(paymentType.equals("Card"))
//	    {
//	    	discount=3;
//	    }
//	    else if(paymentType.equals("Cash"))
//	    {
//	    	discount=0;
//	    }
//	    
//	    double discountedPrice=totalCost*(discount/100);
//	    totalCost=totalCost-discountedPrice;
//	    
//	    return totalCost;
	}


}
