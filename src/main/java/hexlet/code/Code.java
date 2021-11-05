package hexlet.code;

import java.util.Scanner;

public class Code {
    static final int MIN_RANDOM = 0;
    static final int MAX_RANDOM = 100;

    public static void randomNumber() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int random = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
        System.out.println("Question:" + random);
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        System.out.println("Your answer:" + answer);
        if ("yes".equals(answer) && random % 2 == 0) {
            System.out.println("Correct!");
        }
        if ("yes".equals(answer) && random % 2 != 0) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            System.out.println("Let's try again,");
        }
        if ("no".equals(answer) && random % 2 == 0) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
            System.out.println("Let's try again,");
        }
        if ("no".equals(answer) && random % 2 != 0) {
            System.out.println("Correct!");
        }

    }

    public static void gameSelection() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Your choice: " + number);
        if (number == 1) {
            Cli.greeting();
            randomNumber();
        }
    }

    public static void main(String[] args) {
    }
}

