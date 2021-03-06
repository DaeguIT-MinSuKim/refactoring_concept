package refactoring_concept;

import refactoring_concept.price.Price;
import refactoring_concept.price.PriceFactory;

public class Movie {

    private String title;
    private Price price;
    
    public Movie(String title, MovieCode priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public double getCharge(int aDaysRented) {
    	return price.getCharge(aDaysRented);
    }
	
	public int getFrequentRenterPoints(int aDaysRented) {
		return price.getFrequentRenterPoints(aDaysRented);
	}
	
    public MovieCode getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(MovieCode aPriceCode) {
    	price = PriceFactory.createPrice(aPriceCode);
    }

    public String getTitle() {
        return title;
    }

}
