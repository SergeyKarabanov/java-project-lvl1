package hexlet.code.games;

import java.util.Scanner;

public class GameSix {
    static final int MIN_RANDOM = 2;
    static final int MAX_RANDOM = 100;

    public static int questionsForPrime() {
        int counter = 0;
        String result;
        int number = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            result = "yes";
        } else {
            result = "no";
        }
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        System.out.println("Question: " + number);
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        System.out.println("Your answer:" + answer);
        if (("yes".equals(answer) && "yes".equals(result)) || ("no".equals(answer) && "no".equals(result))) {
            System.out.println("Correct!");
            counter = 1;
        }
        if (("yes".equals(answer) && "no".equals(result)) || ("no".equals(answer) && "yes".equals(result))) {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'");
        }
        return counter;
    }

}
