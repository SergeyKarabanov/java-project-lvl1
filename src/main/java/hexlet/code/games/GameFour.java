package hexlet.code.games;

import java.util.Scanner;

public class GameFour {
    static final int MIN_RANDOM = 0;
    static final int MAX_RANDOM = 100;

    public static int questionsForGCD() {
        int counter = 0;
        int number = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
        int number2 = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
        int gCD = 0;
        if (number > number2) {
            int remains = number % number2;
            if (remains > 0) {
                int remains2 = number2 % remains;
                if (remains2 > 0) {
                    int remains3 = remains % remains2;
                    if (remains3 > 0) {
                        int remains4 = remains2 % remains3;
                        if (remains4 > 0) {
                            int remains5 = remains3 % remains4;
                            if (remains5 > 0) {
                                int remains6 = remains4 % remains5;
                            } else {
                                gCD = remains4;
                            }
                        } else {
                            gCD = remains3;
                        }
                    } else {
                        gCD = remains2;
                    }
                } else {
                    gCD = remains;
                }
            } else {
                gCD = number2;
            }
        }
        if (number < number2) {
            int remains = number2 % number;
            if (remains > 0) {
                int remains2 = number % remains;
                if (remains2 > 0) {
                    int remains3 = remains % remains2;
                    if (remains3 > 0) {
                        int remains4 = remains2 % remains3;
                        if (remains4 > 0) {
                            int remains5 = remains3 % remains4;
                            if (remains5 > 0) {
                                int remains6 = remains4 % remains5;
                            } else {
                                gCD = remains4;
                            }
                        } else {
                            gCD = remains3;
                        }
                    } else {
                        gCD = remains2;
                    }
                } else {
                    gCD = remains;
                }
            } else {
                gCD = number;
            }
        }
        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.println("Question: " + number + " " + number2);
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        System.out.println("Your answer:" + answer);
        if (answer == gCD) {
            System.out.println("Correct!");
            counter = 1;
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + gCD + "'");
        }
        return counter;
    }
}

