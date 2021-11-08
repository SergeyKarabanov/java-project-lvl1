package hexlet.code.games;

import java.util.Scanner;

public class GameThree {
    static final int MIN_RANDOM = 0;
    static final int MAX_RANDOM = 100;
    static final int INTERVAL1 = 33;
    static final int INTERVAL2 = 66;

    public static int questionForCalc() {
        int counter = 0;
        int random = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
        int random2 = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
        String action = "";
        if (random >= MIN_RANDOM && random <= INTERVAL1) {
            action = "+";
        }
        if (random > INTERVAL1 && random <= INTERVAL2) {
            action = "-";
        }
        if (random > INTERVAL2 && random <= MAX_RANDOM) {
            action = "*";
        }
        String question = random + " " + action + " " + random2;
        int result = 0;
        if ("+".equals(action)) {
            result = random + random2;
        }
        if ("-".equals(action)) {
            result = random - random2;
        }
        if ("*".equals(action)) {
            result = random * random2;
        }
        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + question);
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        System.out.println("Your answer:" + answer);
        if (result == answer) {
            System.out.println("Correct!");
            counter = 1;
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'");
        }
        return counter;
    }
}
