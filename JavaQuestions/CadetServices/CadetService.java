import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CadetService {
	
	public List<Cadet> retrieveDetailsByGroupName(Stream<Cadet> cadetStream, String groupName) {
		return cadetStream.filter(r->r.getGroupName().equalsIgnoreCase(groupName)).toList();
		
//		return cadetStream.filter(n->n.getGroupName().equalsIgnoreCase(groupName)).toList();
		
//	 return	cadetStream.filter(e->e.getGroupName().equals(groupName)).collect(Collectors.toList());
	}
	
	public Stream<Cadet> retrieveDetailsByAge(Stream<Cadet> cadetStream, int age) {
		return cadetStream.filter(t->t.getAge()==age);
		
//		return cadetStream.filter(o->o.getAge()== age);
		
//      return  cadetStream.filter(e->e.getAge()>=age);
          
	}
	
	public Stream<Cadet> retrieveCadetDetailsByAgeForGivenCount(Stream<Cadet> cadetStream, int count){
		return cadetStream.sorted(Comparator.comparing(Cadet::getAge).reversed()).limit(count);
		
//		return cadetStream.sorted(Comparator.comparing(Cadet::getAge).reversed()).limit(count);	
		
//	   return cadetStream.sorted(Comparator.comparing(Cadet::getAge).reversed()).limit(count);
        
    }

}
