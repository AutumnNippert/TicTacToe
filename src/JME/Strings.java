package JME;

/**
 * Dealing everything with Strings.
 * @author Chris Nippert
 * @version 1.0
 */
public class Strings {

    /**
     * Reverses an input string.
     * @param str String to reverse
     * @return Reversed string
     */
    public static String revString(String str){
        String revStr = "";
        for (int i = str.length()-1; i >= 0; i--)
        {
            revStr += str.charAt(i);
        }
        return revStr;
    }

    /**
     * Adds color to a string.
     * @param s input string
     * @param c input color
     * @return String with color
     */
    public static String stringColor(String s, String c)
    {
        String colorStr = "";
        for (String str : s.split("\n")) {
            colorStr += c + str + Colors.RESET + "\n";
        }
        return colorStr.substring(0, colorStr.length()-1);
    }

    /**
     * Adds a foregroud and background color to a string.
     * @param s input string
     * @param cFore input color foreground
     * @param cBack input color background
     * @return String with color
     */
    public static String stringColor(String s, String cFore, String cBack)
    {
        String colorStr = "";
        for (String str : s.split("\n")) {
            colorStr += cBack + cFore + str + Colors.RESET + "\n";
        }
        return colorStr.substring(0, colorStr.length()-1);
    }

}