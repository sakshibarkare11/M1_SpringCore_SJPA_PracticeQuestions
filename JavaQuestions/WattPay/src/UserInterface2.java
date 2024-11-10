import java.util.Scanner;

public class UserInterface2 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        StationService s=new StationService();
        
        //Fill the code here
        System.out.println("Enter the vehicle details:");
        String[] details=sc.nextLine().split(":");
        String plateNumber = details[0];
        String vehicleType=details[1];
        Double batteryLevel=Double.parseDouble(details[2]);
        Double energyConsumed=Double.parseDouble(details[3]);
        String paymentType=details[4];
        
        try
        {
        	boolean isPlateValid=s.validateLicensePlate(plateNumber);
        	boolean isTypeValid = s.validateVehicleType(vehicleType);
        	boolean isBatteryValid=s.validateBatteryLevel(batteryLevel);
        	boolean isPaymentValid=s.validatePaymentType(paymentType);
        	
        	if(isPlateValid && isTypeValid && isBatteryValid && isPaymentValid)
        	{
        		double cost=s.calculateChargingCost(vehicleType, energyConsumed, paymentType);
        		System.out.printf("Charging cost: %.2f",cost);
        	}
        }
        catch(InvalidChargingDataException e)
        {
        	System.out.println(e.getMessage());
        }
        
        
        
    }
}
