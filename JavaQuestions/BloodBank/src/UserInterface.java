import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PatientInfoUtil pu = new PatientInfoUtil();
		List<PatientInfo> patient = new ArrayList();
		
		System.out.println("Enter the number of patient details to be added");
        int totalPatient = sc.nextInt();
        
        System.out.println("Enter the patient details");
	
		//Fill the code here
        for(int i=0;i<totalPatient;i++)
        {
        	String[] arr=sc.next().split(":");
        	patient.add(new PatientInfo(arr[0],arr[1],arr[2],arr[3],Double.parseDouble(arr[4])));
        }
        
        System.out.println("Enter the blood type");
        String bloodType=sc.next();
        List<PatientInfo> filterByBloodType = pu.retrievePatientInfoByBloodType(patient.stream(), bloodType);
        if(filterByBloodType.isEmpty())
        {
        	System.out.println("No patient details found for the given bloodType "+bloodType);
        }
        else
        {
        	for(PatientInfo p : filterByBloodType)
        		System.out.println(p);
        }
        
        
        
        
        System.out.println("Enter the rhFactor");
        String rhFactor=sc.next();
        List<PatientInfo> filterByRHFactor = pu.retrievePatientInfoByRhFactor(patient.stream(), rhFactor);
        if(filterByRHFactor.isEmpty())
        {
        	System.out.println("No patient details found for the given rhFactor "+rhFactor);
        }
        else
        {
        	for(PatientInfo p : filterByRHFactor)
        		System.out.println(p);
        }
        
        
        
        
        System.out.println("Patient Details based on volume required in ascending order");
        List<PatientInfo> filterByVolumeRequired = pu.retrievePatientInfoByVolumeRequiredInAscendingOrder(patient.stream());
        for(PatientInfo p : filterByVolumeRequired)
        {
        	System.out.println(p);
        }
       }
        
        
	}

