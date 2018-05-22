package refactoring;

class NewReleasePrice {
	int getFrequentRenterPoints(int daysRented){
		return (daysRented > 1) ? 2: 1;
	}
}
