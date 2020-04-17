package refactoring_concept.price;

import refactoring_concept.MovieCode;

public class ChildrenPrice extends Price {

	@Override
	public MovieCode getPriceCode() {
		return MovieCode.CHILDRENS;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 1.5;
		if (aDaysRented > 3)
			result += (aDaysRented - 3) * 1.5;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int aDaysRented) {
		return 1;
	}

}
