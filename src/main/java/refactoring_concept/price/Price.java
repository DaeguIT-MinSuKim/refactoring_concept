package refactoring_concept.price;

import refactoring_concept.MovieCode;

public abstract class Price {
	public abstract MovieCode getPriceCode();
	public abstract double getCharge(int aDaysRented);
	public abstract int getFrequentRenterPoints(int aDaysRented);
}
