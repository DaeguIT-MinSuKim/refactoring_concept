package refactoring_concept.statement;

import refactoring_concept.Customer;
import refactoring_concept.Rental;

public class XmlStatement extends Statement {

	@Override
    String eachRentalString(Rental aEach) {
        return String.format("<Charge>%s : %s</Charge>%n", aEach.getMovie().getTitle(),aEach.getCharge());
    }

	@Override
    String footerString(Customer aCustomer) {
        return String.format("<TotalCharge>누적 대여료 : %s</TotalCharge>%n<Point>적립 포인트 : %s</Point>", aCustomer.getTotalCharge(),aCustomer.getTotalFrequentRenterPoints());
    }
    
	@Override
    String headerString(Customer aCustomer) {
        return String.format("<Cusotmer>%s 고객님의 대여 기록 </Cusotmer>%n", aCustomer.getName());
    }

}
