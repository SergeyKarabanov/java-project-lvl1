package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greeting(String args) {
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello," + name + "!");
    }

    public static void main(String[] args) {

    }
}
