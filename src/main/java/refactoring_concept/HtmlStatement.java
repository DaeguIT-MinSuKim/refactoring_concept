package refactoring_concept;

import java.util.List;

public class HtmlStatement {

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

    private String eachRentalString(Rental aEach) {
        return String.format("%s : %s<br>%n", aEach.getMovie().getTitle(),aEach.getCharge());
    }

    private String footerString(Customer aCustomer) {
        return String.format("<p>누적 대여료 : <EM>%s</Em>%n<p>적립 포인트 : <EM> %s</Em><p>", aCustomer.getTotalCharge(),aCustomer.getTotalFrequentRenterPoints());
    }
    
    private String headerString(Customer aCustomer) {
        return String.format("<H1><EM>%s 고객님의 대여 기록 </EM></H1><P>%n", aCustomer.getName());
    }

}
