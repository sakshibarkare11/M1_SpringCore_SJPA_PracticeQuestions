import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookUtility {
	
	
	public List<Book> retrieveBookDetails_ByYearPublished(Stream<Book> bookStream, int year)
	{
		return bookStream.filter(n->n.getYearPublished()== year).collect(Collectors.toList());
		//Done By Me!!
	    //Fill the code here
		
		/*return bookStream.filter(e -> e.getYearPublished() ==year)
		.collect(Collectors.toList());*/
	    
 }
	 public  Stream<Book> retrieveBookDetails_ByGenre(Stream<Book> bookStream, String genre) {
	     
		//Fill the code here
		 //done by me!
		 return bookStream.filter(n -> n.getGenre().equalsIgnoreCase(genre));
		 
		 //return bookStream.filter(e -> e.getGenre().equalsIgnoreCase(genre));
				// .collect(Collectors.toList());	
	 }
	        
	 
	 public Stream<Book> getTheTitlesOfCheapestBooks(Stream<Book> bookStream,double price, int range){
	     
		//Fill the code here
		 
		 return bookStream.filter(n->n.getPrice() <= price).limit(range);
		// return bookStream.filter(e->e.getTitle()).forEach(e->getprice());

//		return null;
		 
	 }
} 
/*public Stream<Book> getTheTitlesOfBooksWithYearAbove1950(Stream<Book> bookStream, int yearPublished){
return bookStream.filter(i->i.getYearPublished() > 1950);
}*/
