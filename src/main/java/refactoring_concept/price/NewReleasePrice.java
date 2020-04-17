package refactoring_concept.price;

import refactoring_concept.MovieCode;

public class NewReleasePrice extends Price {

	@Override
	public MovieCode getPriceCode() {
		return MovieCode.NEW_RELEASE;
	}

	@Override
	public double getCharge(int aDaysRented) {
		return aDaysRented * 3;
	}

	@Override
	public int getFrequentRenterPoints(int aDaysRented) {
		return 2;
	}

}
