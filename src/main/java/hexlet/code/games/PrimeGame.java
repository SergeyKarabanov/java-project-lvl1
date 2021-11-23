package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    static final int MIN_RANDOM = 2;
    static final int MAX_RANDOM = 100;
    static final int MAX_ROUND_COUNT = 3;
    static final int ARRAY_QUESTIONS_LENGTH = 6;

    public static void questionsForPrime() {
        String answerGame;
        String[] questionsPrime = new String[ARRAY_QUESTIONS_LENGTH];
        int index = 0;
        for (int i = 1; i <= MAX_ROUND_COUNT; i++) {
            int number = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
            boolean isPrime = true;
            for (int j = 2; j < number / 2; j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                answerGame = "yes";
            } else {
                answerGame = "no";
            }
            questionsPrime[index] = "Answer 'yes' if given number is prime. Otherwise answer 'no'. \nQuestion: ";
            questionsPrime[index] = questionsPrime[index] + number;
            questionsPrime[index + 1] = answerGame;
            index = index + 2;
        }
        Engine.engineGame(questionsPrime);
    }
}
