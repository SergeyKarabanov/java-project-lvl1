package hexlet.code.games;

import java.util.Scanner;

public class GameFive {
    static final int MIN_RANDOM = 0;
    static final int MAX_RANDOM = 60;
    static final int MIN_RANDOM1 = 1;
    static final int MAX_RANDOM1 = 25;
    static final int MIN_RANDOM2 = 1;
    static final int MAX_RANDOM2 = 10;
    static final int PROGRESSION_LENGTH = 10;

    public static int questionsForProgression() {
        int[] arithmeticProgression = new int[PROGRESSION_LENGTH];
        int length = arithmeticProgression.length;
        arithmeticProgression[0] = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
        int deviation = (int) (Math.random() * MAX_RANDOM1) + MIN_RANDOM1;
        int counter = 0;
        int i;
        for (i = 1; i < length; i++) {
            arithmeticProgression[i] = arithmeticProgression[0] + ((i + 1) - 1) * deviation;
        }
        int unknownMember = (int) (Math.random() * MAX_RANDOM2) + MIN_RANDOM2;
        System.out.println("What number is missing in the progression?");
        System.out.print("Question: ");
        for (i = 0; i < unknownMember; i++) {
            System.out.print(arithmeticProgression[i] + " ");
        }
        System.out.print(".. ");
        for (i = (unknownMember + 1); i < length; i++) {
            System.out.print(arithmeticProgression[i] + " ");
        }
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        System.out.println("Your answer:" + answer);
        if (answer == arithmeticProgression[unknownMember]) {
            System.out.println("Correct!");
            counter = 1;
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(.");
            System.out.println(";Correct answer was " + "'" + arithmeticProgression[unknownMember] + "'");
        }
        return counter;
    }
}
