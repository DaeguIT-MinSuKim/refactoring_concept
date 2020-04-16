package refactoring_concept.statement;

import java.util.List;

import refactoring_concept.Customer;
import refactoring_concept.Rental;

public abstract class Statement {
	public String value(Customer aCustomer){
	      List<Rental> rentals = aCustomer.getRentals();
	      StringBuilder result = new StringBuilder();
	      
	      result.append(headerString(aCustomer));
	      
	      for(Rental each:rentals){
	         result.append(eachRentalString(each));
	      }
	      
	      result.append(footerString(aCustomer));
	      
	      return result.toString();
	   }
	   
	   abstract String headerString(Customer aCustomer);
	   abstract String eachRentalString(Rental aRental);
	   abstract String footerString(Customer aCustomer);

}
