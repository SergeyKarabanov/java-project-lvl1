package hexlet.code;

import java.util.Scanner;

public class Code {
    public static void gameSelection() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Your choice: " + number);
        if (number == 1) {
            Cli.greeting();
        }
    }

    public static void main(String[] args) {

    }
}

