package refactoring;

public class Movie {
	public static final int CHILDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String _title;
	//private Price _priceCode;

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode()priceCode);
	}

	public int getPriceCode() {
		return _price.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
			case Movie.REGULAR:
				_price = new RegularPrice();
				break;
			case Movie.CHILDREN:
				_price = new ChildrensPrice();
				break;
			case Movie.NEW_RELEASE:
				_price = new NewReleasePrice();
				break;
			default:
				throw new IllegalArgumentException(“Incorrect Price Code”);
}
		//_priceCode = arg;
	}

	public String getTitle() {
		return _title;
	}
	
	
	/*
	double getCharge(int daysRented) {
		double result = 0;
		switch (getPriceCode()) {
			case Movie.REGULAR:
			result += 2;
			if (daysRented > 2)
			 result += (daysRented -2) * 1.5;
			 break;
			case Movie.NEW_RELEASE:
			result += daysRented * 3;
			break;
			case Movie.CHILDREN:
			result += 1.5;
			if (daysRented > 3)
			 result += (daysRented -3) * 1.5;
			break;
		}
		return result;
}
*/

	double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
}
	
	int getFrequentRenterPoints(int daysRented){
			return _price.getFrequentRenterPoints(daysRented);
}
	
}
