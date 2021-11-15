package hexlet.code.games;

import java.util.Scanner;

public class GameOne {

    public static String nameigrok() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

}
