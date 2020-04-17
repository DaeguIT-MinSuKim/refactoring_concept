package refactoring_concept.price;

import refactoring_concept.MovieCode;

public class RegularPrice extends Price {

	@Override
	public MovieCode getPriceCode() {
		return MovieCode.REGULAR;
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
