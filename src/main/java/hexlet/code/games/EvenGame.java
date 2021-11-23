package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    static final int MIN_RANDOM = 0;
    static final int MAX_RANDOM = 100;
    static final int MAX_ROUND_COUNT = 3;
    static final int ARRAY_QUESTIONS_LENGTH = 6;
    public static void questionsForEven() {
        String answerGame;
        String[] questionsEven = new String[ARRAY_QUESTIONS_LENGTH];
        int index = 0;
        for (int i = 1; i <= MAX_ROUND_COUNT; i++) {
            int random = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
            if (random % 2 == 0) {
                answerGame = "yes";
            } else {
                answerGame = "no";
            }
            questionsEven[index] = "Answer 'yes' if number even otherwise answer 'no'. \nQuestion: " + random;
            questionsEven[index + 1] = answerGame;
            index = index + 2;
        }
        Engine.engineGame(questionsEven);
    }
}
