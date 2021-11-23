package hexlet.code;
import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class App {
    static final int GAME_NUMBER1 = 1;
    static final int GAME_NUMBER2 = 2;
    static final int GAME_NUMBER3 = 3;
    static final int GAME_NUMBER4 = 4;
    static final int GAME_NUMBER5 = 5;
    static final int GAME_NUMBER6 = 6;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Your choice: " + number);
        switch (number) {
            case (GAME_NUMBER1):
                Cli.greeting();
                break;
            case (GAME_NUMBER2):
                EvenGame.questionsForEven();
                break;
            case (GAME_NUMBER3):
                CalcGame.questionForCalc();
                break;
            case (GAME_NUMBER4):
                GCDGame.questionsForGCD();
                break;
            case (GAME_NUMBER5):
                ProgressionGame.questionsForProgression();
                break;
            case (GAME_NUMBER6):
                PrimeGame.questionsForPrime();
                break;
            default:
                break;
        }
    }
}
