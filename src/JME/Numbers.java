package JME;

/**
 * @author Chris Nippert
 * @version 1.0
 */
public class Numbers{
    /**
     * Clamps a number between two input values
     * @param val input value
     * @param min min value
     * @param max max value
     * @return clamped value
     */
    public static double clamp(double val, double min, double max) {
        if(val < min) {
            val = min;
        } else if (val > max){
            val = max;
        }
        return val;
    }

        /**
     * Generates a random number between min and max (inclusive)
     * @param min min value of Random
     * @param max max value of random
     * @return random number
     */
    public static int randInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
