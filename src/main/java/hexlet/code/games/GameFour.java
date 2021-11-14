package hexlet.code.games;

import java.util.Scanner;

public class GameFour {
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 100;

    public static int findingGCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int questionsForGCD() {
        int counter = 0;
        int number = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
        int number2 = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
        int result = 0;
        if (number > number2) {
            result = findingGCD(number, number2);
        }
        if (number < number2) {
            result = findingGCD(number2, number);
        }

        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.println("Question: " + number + " " + number2);
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        System.out.println("Your answer:" + answer);
        if (answer == result) {
            System.out.println("Correct!");
            counter = 1;
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'");
        }
        return counter;
    }
}
