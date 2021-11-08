
package hexlet.code;

import hexlet.code.games.GameFour;
import hexlet.code.games.GameOne;
import hexlet.code.games.GameThree;
import hexlet.code.games.GameTwo;

public class Engine {

    public static void greet() {
        GameOne.nameigrok();
    }

    public static void even() {
        String name = GameOne.nameigrok();
        int result = GameTwo.questionsForEven();
        if (result == 1) {
            int result2 = GameTwo.questionsForEven();
            if (result2 == 1) {
                int result3 = GameTwo.questionsForEven();
                if (result3 == 1) {
                    System.out.println("Congratulations," + name);
                }
            }
        }
        if (result == 0) {
            System.out.println("Let's try again," + name);
        }

    }

    public static void calc() {
        String name = GameOne.nameigrok();
        int result = GameThree.questionForCalc();
        if (result == 1) {
            int result2 = GameThree.questionForCalc();
            if (result2 == 1) {
                int result3 = GameThree.questionForCalc();
                if (result3 == 1) {
                    System.out.println("Congratulations," + name);
                }
            }
        }
        if (result == 0) {
            System.out.println("Let's try again," + name);
        }
    }

    public static void gCD() {
        String name = GameOne.nameigrok();
        int result = GameFour.questionsForGCD();
        if (result == 1) {
            int result2 = GameFour.questionsForGCD();
            if (result2 == 1) {
                int result3 = GameFour.questionsForGCD();
                if (result3 == 1) {
                    System.out.println("Congratulations," + name);
                }
            }
        }
        if (result == 0) {
            System.out.println("Let's try again," + name);
        }
    }

    public static void main(String[] args) {

    }
}
