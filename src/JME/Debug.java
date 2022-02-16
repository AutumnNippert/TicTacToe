package JME;

import java.util.concurrent.TimeUnit;

/**
 * @author Chris Nippert
 * @version 1.0
 */
public class Debug{
    /**
     * Prints ONLY IF debug is true.
     * @param isDebug isDebug
     * @param str string
     */
    public static  void printDebug( boolean isDebug, String str ) {
        if ( isDebug ) System.out.println( str );
    }

        /*public static <T> void printDebug( boolean isDebug, T str ) {
            if ( isDebug ) System.out.println( str );
        }*/

        /**
         * Waits for millisecods if debug is true.
         * @param isDebug isDebug
         * @param milliseconds time to wait (ms)
         */
    public static void wait(boolean isDebug, int milliseconds) {
        if (isDebug) {
            try {
                TimeUnit.MILLISECONDS.sleep(milliseconds);
            } catch (Exception e) {
                System.out.println("debug wait failed");
            }
        }
    }
}