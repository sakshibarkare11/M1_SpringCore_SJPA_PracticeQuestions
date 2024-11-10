import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface1 {
	public static void main(String[] args) {
		//global custom cloud GCCA

		Scanner sc = new Scanner(System.in);

		BookUtility obj = new BookUtility();
		List<Book> books = new ArrayList<>();

		System.out.println("Enter the total number of books needed to add in the list");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the book details");
		for (int i = 1; i <= number; i++) {
			String details = sc.nextLine();
			String[] part = details.split(",");
			String title = part[0];
			String author = part[1];
			String genre = part[2];
			double price = Double.parseDouble(part[3]);
			int year = Integer.parseInt(part[4]);

			books.add(new Book(title, author, genre, price, year));

		}
		System.out.println("Enter the published year");
		int year1 = sc.nextInt();
		sc.nextLine();
		
		List<Book> year2 = obj.retrieveBookDetails_ByYearPublished(books.stream(), year1);
		System.out.println("-----------");
		

		if (year2.isEmpty() ) {
			System.out.println("No books found for the given year");
		} else {
			year2.forEach(System.out::println);
			// System.out.println(title+" " +author,genre,price,year);
		}

		System.out.println("Enter the genre");
		String genre = sc.nextLine();

		List<Book> g1 = obj.retrieveBookDetails_ByGenre(books.stream(), genre).toList();

//	       if(!g1.isEmpty()) {
//	    	   System.out.println("No books found for the given year");
//	       }
//	       else {
//	    	  // System.out.println("title+ " "+author+" "+");
//	       }
		if (!g1.isEmpty()) {

			System.out.println("Enter the maximum price");
			double max = sc.nextDouble();
			sc.nextLine();

			System.out.println("Enter the range to show the cheapest books");
			int range = sc.nextInt();
			sc.nextLine();

			System.out.println("The Book details");
			g1.forEach(System.out::println);

			return;
		} else {
			System.out.println("No books found for the given year");
		}
		
		/*System.out.println("The Book detailswhich are above 1950--->");
		
		List<Book> yearabove1950 = obj.getTheTitlesOfBooksWithYearAbove1950(books.stream(), 1950).toList();

		if(yearabove1950.isEmpty()) {
			System.out.println("empty");
		}else {
			System.out.println("Above 1950 are:");
		yearabove1950.forEach(System.out::println);
		
		}*/

		// obj.getTheTitlesOfCheapestBooks(g1, max, range);

	}
}
