package refactoring_concept;

import java.util.ArrayList;
import java.util.List;

import refactoring_concept.statement.HtmlStatement;
import refactoring_concept.statement.TextStatement;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String aName) {
		this.name = aName;
	}

	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public String getName() {
		return this.name;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public String statement() {
		return new TextStatement().value(this);
	}// end of method statement

	public String htmlStatement() {
		return new HtmlStatement().value(this);
	}

	public int getTotalFrequentRenterPoints() {
		int result = 0;
		for (Rental each : rentals) {
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

	public int getTotalCharge() {
		int result = 0;
		for (Rental each : rentals) {
			result += each.getCharge();
		}
		return result;
	}

}
