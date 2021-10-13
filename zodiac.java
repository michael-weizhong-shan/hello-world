public class zodiac {
	public static String calZodiac (String userYear) {
		String[] zodiac = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
		String uYear = userYear;
		int zodiacNum = Integer.parseInt(uYear) % 12;
		return(zodiac[zodiacNum]);
	}
}	