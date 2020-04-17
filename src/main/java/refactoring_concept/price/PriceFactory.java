package refactoring_concept.price;

public class PriceFactory {
	
	public static Price createPrice(MoviePrice priceCode) {
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
