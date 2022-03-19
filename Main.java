import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Get a year from user
        Scanner readInput = new Scanner(System.in);
        System.out.println("Enter a year and I'll tell you its zodiac: ");
        String sourceYear = readInput.nextLine();

        //Calculate the zodiac for the year and then return it to user
        zodiac zodiacObj = new zodiac();
        System.out.println("The zodiac for the year of " + sourceYear + " is " + zodiacObj.calZodiac(sourceYear) + ".");
    }
}
