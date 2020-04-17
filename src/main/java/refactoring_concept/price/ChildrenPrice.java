package refactoring_concept.price;

public class ChildrenPrice extends Price {

	@Override
	public MoviePrice getPriceCode() {
		return MoviePrice.CHILDRENS;
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
