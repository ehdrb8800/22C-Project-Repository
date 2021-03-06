
public class VideoGames {
	private String serialNumber;
	private String title;
	private int year;
	private String studioOrPublisher;
	private String rating;
	

	/**
	 * Constructor for the Movie class
	 *
	 * @param title    the Movie's title
	 * @param director the Movie's director
	 * @param year     the year the Movie was released
	 * @param gross    the amount grossed over the lifetime of the movie, given in
	 *                 Millions of dollars
	 */
	public VideoGames(String serialNumber, String title, int year, String studio, String rating) {
		this.serialNumber = serialNumber;
		this.title = title;
		this.year = year;
		this.studioOrPublisher = studio;
		this.rating = rating;
	}

	/**
	 * Accesses the title of the Movie
	 *
	 * @return the Movie's title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Accesses the director of the Movie
	 *
	 * @return the Movie's director
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Access the year the Movie was released in theaters
	 *
	 * @return the year the Movie was released
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Access the gross amount earned by the Movie in Millions of dollars
	 *
	 * @return the Movie's gross in Millions
	 */
	public String getStudioOrPublisher() {
		return studioOrPublisher;
	}
	
	public String getRating() {
		return rating;
	}

	/**
	 * Sets the title of the Movie
	 *
	 * @param title the Movie's title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Sets the director of the Movie
	 *
	 * @param director the Movie's director
	 */
	public void setisbn(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Sets the year the Movie was released
	 *
	 * @param year the year the Movie was released
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Sets the gross amount earned by the Movie in Millions of dolalrs
	 *
	 * @param gross the gross amount in Millions of dollars
	 */
	public void setStudioOrPublisher(String studio) {
		this.studioOrPublisher = studio;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * Creates a String of the Movie information the following format: Title:
	 * <title> Director: <director> Year: <year> Gross in Millions: $<grossMillions>
	 * Note that there should be no <> in the resulting String Also the
	 * grossMillions should be displayed as follows: XXX,XXX.XX
	 */
	@Override
	public String toString() {
		String result = "";
		result += "Serial Number: " + serialNumber + "\nTitle: " + title + "\nYear: " + year + "\nStudio or Publisher: "
				+ studioOrPublisher + "\nRating: " + rating + "\n\n";
		return result;
	}

	/**
	 * Determines whether two Movie objects are equal by comparing titles and
	 * directors
	 *
	 * @param otherMovie the second Movie object
	 * @return whether the Movies are equal
	 */
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		} else if (!(o instanceof VideoGames)) {
			return false;
		} else {
			VideoGames p = (VideoGames) o;
			return serialNumber.equals(p.serialNumber) && title.equals(p.title);
		}

	}

	/**
	 * Compares two Movie objects to determine ordering Returns 0 if the two items
	 * are equal Return -1 if this Movie's title comes alphabetically before the
	 * other Movie's title. Returns 1 if the other Movie's title comes
	 * alphabetically before this movie's title If the two movie's titles are the
	 * same, will differentiate by director's name (alphabetical comparison)
	 *
	 * @param the other Movie object to compare to this
	 * @return 0 (same movie), -1 (this movie ordered first) or 1 (the other movie
	 *         ordered first)
	 */
	//@Override
	public int compareTo(VideoGames otherMovie) {
		if (this.equals(otherMovie)) {
			return 0;
		} else if (serialNumber.compareTo(otherMovie.serialNumber) < 0) {
			return -1;
		} else if (serialNumber.compareTo(otherMovie.serialNumber) > 0) {
			return 1;
		}
		if (title.compareTo(otherMovie.title) < 0) {
			return -1;
		} else if (title.compareTo(otherMovie.title) > 0) {
			return 1;
		}
		return 0;
	}

	/**
	 * Returns a consistent hash code for each Movie by summing the Unicode values
	 * of each character in the key Key = title + director
	 *
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		String key = serialNumber + title;
		int sum = 0;
		for (int i = 0; i < key.length(); i++) {
			sum += (int) key.charAt(i);
		}
		return sum;
	}


}
