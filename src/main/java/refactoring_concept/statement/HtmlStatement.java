package refactoring_concept.statement;

import refactoring_concept.Customer;
import refactoring_concept.Rental;

public class HtmlStatement extends Statement{

	@Override
    String eachRentalString(Rental aEach) {
        return String.format("%s : %s<br>%n", aEach.getMovie().getTitle(),aEach.getCharge());
    }

	@Override
    String footerString(Customer aCustomer) {
        return String.format("<p>누적 대여료 : <EM>%s</Em>%n<p>적립 포인트 : <EM> %s</Em><p>", aCustomer.getTotalCharge(),aCustomer.getTotalFrequentRenterPoints());
    }
    
	@Override
    String headerString(Customer aCustomer) {
        return String.format("<H1><EM>%s 고객님의 대여 기록 </EM></H1><P>%n", aCustomer.getName());
    }

}
