package hexlet.code;

import java.util.Scanner;

public class Games {
    static final int MIN_RANDOM = 0;
    static final int MAX_RANDOM = 100;
    static final int INTERVAL1 = 33;
    static final int INTERVAL2 = 66;

    public static void greet() {
        nameigrok();
    }

    public static int questionsForEven() {
        int result = 0;
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int random = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
        System.out.println("Question:" + random);
        Scanner scan2 = new Scanner(System.in);
        String answer = scan2.nextLine();
        System.out.println("Your answer:" + answer);
        if (("yes".equals(answer) && random % 2 == 0) || ("no".equals(answer) && random % 2 != 0)) {
            System.out.println("Correct!");
            result = 1;
        }
        if (("yes".equals(answer) && random % 2 != 0) || ("no".equals(answer) && random % 2 == 0)) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            result = 0;
        }
        return result;
    }

    public static void even() {
        String name = nameigrok();
        int result = questionsForEven();
        if (result == 1) {
            int result2 = questionsForEven();
            if (result2 == 1) {
                int result3 = questionsForEven();
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
        String name = nameigrok();
        int result = questionForCalc();
        if (result == 1) {
            int result2 = questionForCalc();
            if (result2 == 1) {
                int result3 = questionForCalc();
                if (result3 == 1) {
                    System.out.println("Congratulations," + name);
                }
            }
        }
        if (result == 0) {
            System.out.println("Let's try again," + name);
        }
    }

    public static String nameigrok() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello," + name + "!");
        return name;
    }

    public static int questionForCalc() {
        int counter = 0;
        int random = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
        int random2 = (int) (Math.random() * MAX_RANDOM) + MIN_RANDOM;
        String action = "";
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
        int result = 0;
        if ("+".equals(action)) {
            result = random + random2;
        }
        if ("-".equals(action)) {
            result = random - random2;
        }
        if ("*".equals(action)) {
            result = random * random2;
        }
        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + question);
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        System.out.println("Your answer:" + answer);
        if (result == answer) {
            System.out.println("Correct!");
            counter = 1;
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'");
        }
        return counter;
    }

    public static void main(String[] args) {

    }
}

