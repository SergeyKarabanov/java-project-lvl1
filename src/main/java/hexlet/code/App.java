package hexlet.code;

import java.util.Scanner;

public class App {
    static final int GAME_NUMBER1 = 1;
    static final int GAME_NUMBER2 = 2;
    static final int GAME_NUMBER3 = 3;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Your choice: " + number);
        if (number == GAME_NUMBER1) {
            Games.greet();
        }
        if (number == GAME_NUMBER2) {
            Games.even();
        }
        if (number == GAME_NUMBER3) {
            Games.calc();
        }
    }
}
