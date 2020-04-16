package refactoring_concept;

public class Rental {
    private Movie movie;
    private int daysRented;
    
    public Rental(Movie aMovie, int aDaysRented) {
        this.movie = aMovie;
        this.daysRented = aDaysRented;
    }

	public double getCharge() {
		return movie.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(daysRented);
	}
	
    public Movie getMovie() {
        return this.movie;
    }

    public int getDaysRented() {
        return this.daysRented;
    }

}
