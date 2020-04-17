package refactoring_concept.price;

public class NewReleasePrice extends Price {

	@Override
	public MoviePrice getPriceCode() {
		return MoviePrice.NEW_RELEASE;
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
