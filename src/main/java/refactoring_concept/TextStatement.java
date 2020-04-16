package refactoring_concept;

import java.util.List;

import javax.swing.text.DefaultEditorKit.CutAction;

public class TextStatement {

	public String value(Customer customer) {
		List<Rental> rentals = customer.getRentals();
		StringBuilder result = new StringBuilder();
		result.append(headerString(customer));
		
		for (Rental each : rentals) {
			result.append(eachRentalString(each));
		}
		
		result.append(footerString(customer));
		return result.toString();
	}
	
    private Object footerString(Customer aCustomer) {
    	return String.format("누적 대여료 : %s%n적립 포인트 : %s", aCustomer.getTotalCharge(),aCustomer.getTotalFrequentRenterPoints());
	}

	private String eachRentalString(Rental aEach) {
    	return String.format("\t%s\t%s%n", aEach.getMovie().getTitle(),aEach.getCharge());
	}

	private String headerString(Customer aCustomer) {
        return String.format("%s 고객님의 대여 기록%n", aCustomer.getName());
    }

}
