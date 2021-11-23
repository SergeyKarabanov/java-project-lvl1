package hexlet.code.games;

import hexlet.code.Engine;

public class GCDGame {
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 100;
    static final int MAX_ROUND_COUNT = 3;
    static final int ARRAY_QUESTIONS_LENGTH = 6;

    public static int findingGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void questionsForGCD() {
        int answerGame = 0;
        String[] questionsGCD = new String[ARRAY_QUESTIONS_LENGTH];
        int index = 0;
        for (int i = 1; i <= MAX_ROUND_COUNT; i++) {

            int number = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
            int number2 = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
            if (number > number2) {
                answerGame = findingGCD(number, number2);
            }
            if (number < number2) {
                answerGame = findingGCD(number2, number);
            }
            questionsGCD[index] = "Find the greatest common divisor of given numbers. \nQuestion: ";
            questionsGCD[index] = questionsGCD[index] + number + " " + number2;
            questionsGCD[index + 1] = "" + answerGame;
            index = index + 2;
        }
        Engine.engineGame(questionsGCD);
    }
}
