package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    static final int MIN_RANDOM = 0;
    static final int MAX_RANDOM = 100;
    static final int INTERVAL1 = 33;
    static final int INTERVAL2 = 66;
    static final int MAX_ROUND_COUNT = 3;
    static final int ARRAY_QUESTIONS_LENGTH = 6;

    public static void questionForCalc() {
        int answerGame = 0;
        String[] questionsCalc = new String[ARRAY_QUESTIONS_LENGTH];
        int index = 0;
        for (int i = 1; i <= MAX_ROUND_COUNT; i++) {

            int random = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
            int random2 = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
            String action = " ";
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
            if ("+".equals(action)) {
                answerGame = random + random2;
            }
            if ("-".equals(action)) {
                answerGame = random - random2;
            }
            if ("*".equals(action)) {
                answerGame = random * random2;
            }
            questionsCalc[index] = "What is the result of the expression?. \nQuestion: " + question;
            questionsCalc[index + 1] = "" + answerGame;
            index = index + 2;
        }
        Engine.engineGame(questionsCalc);
    }
}
