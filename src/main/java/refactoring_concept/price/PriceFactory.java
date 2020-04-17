package refactoring_concept.price;

import refactoring_concept.MovieCode;

public class PriceFactory {
	
	public static Price createPrice(MovieCode priceCode) {
		switch (priceCode) {
		case CHILDRENS:
			return new ChildrenPrice();
		case NEW_RELEASE:
			return new NewReleasePrice();
		case REGULAR:
			return new RegularPrice();
		default:
			throw new IllegalArgumentException("가격 코드가 잘못 됐습니다");
		}
	}
}
