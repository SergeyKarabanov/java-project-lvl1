
package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int MAX_ROUND_COUNT = 3;

    public static void engineGame(String[] massiveGame) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        int counter = 0;
        int index = 0;
        for (int i = 0; i <= MAX_ROUND_COUNT - 1; i++) {

            System.out.println(massiveGame[index]);
            Scanner scan2 = new Scanner(System.in);
            String answerPlayer = scan2.nextLine();
            System.out.println("Your answer: " + answerPlayer);

            if (massiveGame[index + 1].equals(answerPlayer)) {
                System.out.println("Correct!");
                counter++;
                index = index + 2;
            } else {
                System.out.print("'" + answerPlayer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + massiveGame[index + 1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (counter == MAX_ROUND_COUNT) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
