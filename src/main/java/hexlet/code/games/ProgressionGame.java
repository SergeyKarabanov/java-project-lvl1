package hexlet.code.games;

import hexlet.code.Engine;

public class ProgressionGame {
    static final int MIN_RANDOM = 0;
    static final int MAX_RANDOM = 60;
    static final int MIN_RANDOM1 = 1;
    static final int MAX_RANDOM1 = 25;
    static final int MIN_RANDOM2 = 1;
    static final int MAX_RANDOM2 = 9;
    static final int PROGRESSION_LENGTH = 10;
    static final int MAX_ROUND_COUNT = 3;
    static final int ARRAY_QUESTIONS_LENGTH = 6;

    public static void questionsForProgression() {
        String answerGame = "";
        String[] questionsProgression = new String[ARRAY_QUESTIONS_LENGTH];
        int index = 0;
        for (int i = 1; i <= MAX_ROUND_COUNT; i++) {
            String progression = "";
            int[] arithmeticProgression = new int[PROGRESSION_LENGTH];
            int length = arithmeticProgression.length;
            int randomFirstNumber = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
            int deviation = (int) (Math.random() * MAX_RANDOM1) + MIN_RANDOM1;

            for (int j = 0; j < length; j++) {
                arithmeticProgression[j] = randomFirstNumber + ((j + 1) - 1) * deviation;
            }
            int unknownMember = (int) (Math.random() * MAX_RANDOM2) + MIN_RANDOM2;
            for (int k = 0; k < length; k++) {
                if (k != unknownMember) {
                    progression = progression + arithmeticProgression[k] + " ";
                } else {
                    progression = progression + ".." + " ";
                }
            }
            answerGame = "" + arithmeticProgression[unknownMember];
            questionsProgression[index] = "WWhat number is missing in the progression? \nQuestion: " + progression;
            questionsProgression[index + 1] = "" + answerGame;
            index = index + 2;
        }
        Engine.engineGame(questionsProgression);
    }
}
