package JME;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author Chris Nippert
 * @version 1.0
 */
public class ConsoleFunctions {
    public static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Waits for milliseconds.
     * @param milliseconds amount of time to wait
     */
    public static void wait(int milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (Exception e) {
            System.out.println("wait failed");
        }
    }

    /**
     * Waits for the return key to be pressed.
     */
    public static void waitForInput() {
        Scanner scn = new Scanner(System.in);
        System.out.print( "Press 'Enter' to continue..." );
        scn.nextLine();
    }

    /**
     * Prints an input string with a specific color as well as adding a new line.
     * @param s input string
     * @param c input color
     */
    public static void printlnColor(String s, String c){
        System.out.println(c + s + Colors.RESET);
    }

    /**
     * Prints an input string with a specific color.
     * @param s input string
     * @param c input color
     */
    public static void printColor(String s, String c){
        System.out.print(c + s + Colors.RESET);
    }

    /**
     * Prints an input string with a specific color.
     * @param s input string
     * @param cFore input foreground color
     * @param cBack input background color
     */
    public static void printColorWithBackground(String s, String cFore, String cBack){
        System.out.print(cBack + cFore + s + Colors.RESET);
    }

    /**
     * Gets string input from user.
     * @param prompt string for prompt
     * @param scn scanner
     * @return input
     */
    public static String getStringInput(String prompt, Scanner scn) {
        System.out.print(prompt);
        return scn.nextLine();
    }

    /**
     * Gets int input from user.
     * @param prompt string for prompt
     * @param scn scanner
     * @return input
     */
    public static int getIntInput(String prompt, Scanner scn) {
        System.out.print(prompt);
        int input = scn.nextInt();
        scn.nextLine();
        return input;
    }

    /**
     * Gets double input from user.
     * @param prompt string for prompt
     * @param scn scanner
     * @return input
     */
    public static double getDoubleInput(String prompt, Scanner scn) {
        System.out.print(prompt);
        double input = scn.nextDouble();
        scn.nextLine();
        scn.hasNext();
        return input;
    }
}