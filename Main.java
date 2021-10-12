import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] zodiac = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};

        //Get a year from user
        Scanner readInput = new Scanner(System.in);
        System.out.println("Enter a year and I'll tell you its zodiac: ");
        String sourceYear = readInput.nextLine();

        //Calculate the zodiac for the year and then return it to user
        int zodiacNum = Integer.parseInt(sourceYear) % 12;
        System.out.println("The zodiac for the year of " + sourceYear + " is " + zodiac[zodiacNum] + ".");
    }
}
