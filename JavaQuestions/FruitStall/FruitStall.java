import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitStall {
	private Map<String,Double> fruitMap = new HashMap<String,Double>();
	
	public Map<String, Double> getFruitMap() {
		return fruitMap;
	}

	public void setFruitMap(Map<String, Double> fruitMap) {
		this.fruitMap = fruitMap;
	}
	
	public void addFruits(String fruitName, double quantity) {		
		fruitMap.put(fruitName,quantity);
	}

	public double findQuantity(String fruitName) {
		//madebyme
//		for(Map.Entry<String,Double> o : fruitMap.entrySet()) {
//			if(o.getKey().equals(fruitName)) {
//				return o.getValue();
//			}
//		}
//		
//		return -1;
		
		for(Map.Entry<String,Double> t: fruitMap.entrySet()) {
			if(t.getKey().equals(fruitName)) {
				return t.getValue();
			}
			
		}
		return -1;
		
		
		
		
		
		
		
		
		
		
		
//		for (Map.Entry<String, Double> entry : fruitMap.entrySet()) {
//			if(entry.getKey().equals(fruitName))
//			{
//				return entry.getValue();
//			}
//			
//		}	
//		return -1;
	}
	
	public List<String> findFruitsToBePurchased(int minQty){
		List<String> lis = new ArrayList<String>();
		for(Map.Entry<String, Double> w:fruitMap.entrySet()) {
			if(w.getValue()>minQty) {
				lis.add(w.getKey());
			}
		}
		return lis;
		
		
		
		
		
		
		
		
//		madebyme
//		for (Map.Entry<String, Double> k : fruitMap.entrySet()) {
//			if(k.getValue()>=minQty) {
//				list.add(k.getKey());
//			}
//		}
//		
//		return list;
		
		
//		for (Map.Entry<String, Double > entry : fruitMap.entrySet()) {
//			
//			if(entry.getValue()<=minQty)
//			{
//				list.add(entry.getKey());
//			}
//		}
//		return list;
	}

}
