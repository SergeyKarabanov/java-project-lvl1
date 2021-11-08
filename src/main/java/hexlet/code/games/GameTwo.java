package hexlet.code.games;

import java.util.Scanner;

public class GameTwo {
    static final int MIN_RANDOM = 0;
    static final int MAX_RANDOM = 100;

    public static int questionsForEven() {
        int result = 0;
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int random = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
        System.out.println("Question:" + random);
        Scanner scan2 = new Scanner(System.in);
        String answer = scan2.nextLine();
        System.out.println("Your answer:" + answer);
        if (("yes".equals(answer) && random % 2 == 0) || ("no".equals(answer) && random % 2 != 0)) {
            System.out.println("Correct!");
            result = 1;
        }
        if (("yes".equals(answer) && random % 2 != 0) || ("no".equals(answer) && random % 2 == 0)) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            result = 0;
        }
        return result;
    }
}
