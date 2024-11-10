import java.io.FileReader;
import java.util.*;
import java.util.List;
import java.io.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import java.util.stream.Stream;

public class CustomerUtility {

	public List<Customer> retrieveCustomerComplaintDetails_ByProductType(Stream<Customer> customerStream,String productType) {

		return customerStream.filter(u->u.getProductType().equals(productType)).toList();
		
//	    return customerStream.filter(c->c.getProductType().equals(productType)).collect(Collectors.toList());	
	}

	public Stream<Customer> retrieveCustomerComplaintDetails_ByAddress(Stream<Customer> customerStream,String address) {

		return customerStream.filter(g->g.getAddress().equals(address));
		
//		return customerStream.filter(c->c.getAddress().equals(address));
	}

	public Stream<Customer> checkForLuckyWinners(Stream<Customer> customerDetails, int range) {
		return customerDetails.limit(range);
		
		
//		return customerDetails.limit(range);
	}
}
