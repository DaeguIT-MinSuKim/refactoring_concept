package refactoring_concept.price;

public class RegularPrice extends Price {

	@Override
	public MoviePrice getPriceCode() {
		return MoviePrice.REGULAR;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 2;
		if (aDaysRented > 2)
			result += (aDaysRented - 2) * 1.5;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int aDaysRented) {
		return 1;
	}

}
