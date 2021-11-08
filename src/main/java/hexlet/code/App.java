package hexlet.code;

import java.util.Scanner;

public class App {
    static final int GAME_NUMBER1 = 1;
    static final int GAME_NUMBER2 = 2;
    static final int GAME_NUMBER3 = 3;
    static final int GAME_NUMBER4 = 4;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Your choice: " + number);
        if (number == GAME_NUMBER1) {
            Engine.greet();
        }
        if (number == GAME_NUMBER2) {
            Engine.even();
        }
        if (number == GAME_NUMBER3) {
            Engine.calc();
        }
        if (number == GAME_NUMBER4) {
            Engine.gCD();
        }
    }
}
