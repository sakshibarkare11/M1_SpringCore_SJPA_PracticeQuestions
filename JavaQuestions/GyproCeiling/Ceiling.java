import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ceiling {

	private Set<String> ceilingSet=new HashSet<String>();
	
	public Set<String> getCeilingSet() {
		return ceilingSet;
	}

	public void setCeilingSet(Set<String> ceilingSet) {
		this.ceilingSet = ceilingSet;
	}
	
	public void addCeilingDetails(String ceilingDetails) {
		//Fill the code
		ceilingSet.add(ceilingDetails);
	}

	public int findCountOfOrderIdsBasedOnTheCeilingType(String ceilingType) {
		//Fill the code	
		int count=0;
		for(String s:ceilingSet)
		{
			//s=orderId:cellingType
			//s1=[orderId,ceilingType]
			String[] s1=s.split(":");
			if(s1[1].equals(ceilingType))
			{
				count++;
			}
		}
		return count;
		
		
		/*
		 * int count=0; for (String s : ceilingSet) { String[] s1= s.split(":");
		 * if(s1[1].equals(ceilingType)) { count++; } }
		 * 
		 * return count;
		 */
		
		/*
		 * int count=0; for(String s : ceilingSet) { String [] s1= s.split(":");
		 * if(s1[1].equals(ceilingType)) { count++; } } return count;
		 */	
	}
	



	public List<String> findOrderIdsBasedOnTheCeilingType(String ceilingType){
	        //Fill the code
			List<String> liss=new ArrayList<String>();
			for(String s:ceilingSet)
			{
				//s=orderId:cellingType
				//s1=[orderId,ceilingType]
				String[] s1=s.split(":");
				if(s1[1].equals(ceilingType))
				{
					liss.add(s1[0]);
				}
			}		
			return liss;
			
			
//			for (String s : liss) {
//			String[] s1= s.split(":");
//			if (s1[1].equals(ceilingType)) {
//				liss.add(s1[0]);
//			}
//		}
//		
//		return liss;
	
	}

}
