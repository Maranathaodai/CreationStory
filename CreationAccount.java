import java.util.Scanner;

public class CreationAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfCreation = {
            "Day 1: God created the heavens and the earth.",
            "Day 2: God separated the waters to form the sky and sea.",
            "Day 3: God separated the waters to form dry land and vegetation.",
            "Day 4: God created the sun, moon, and stars.",
            "Day 5: God created sea creatures and birds.",
            "Day 6: God created land animals and humans.",
            "Day 7: God rested from all His work."
        };

        System.out.println("Enter a day of creation (1-7): ");
        int dayNumber = scanner.nextInt();

        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println(daysOfCreation[dayNumber - 1]);
            System.out.println("Verse: Genesis 1:1-31");
        } else {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}