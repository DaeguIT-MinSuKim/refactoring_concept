package refactoring_concept.price;

public abstract class Price {
	public abstract MoviePrice getPriceCode();
	public abstract double getCharge(int aDaysRented);
	public abstract int getFrequentRenterPoints(int aDaysRented);
}
