package JME;

/**
 * @author Chris Nippert
 * @version 1.0
 */
public class KeyValuePair {
    public String key;
    public String value;

    /**
     * Constructor for a Key Value Pair.
     * @param key Name
     * @param value Value
     */
    public KeyValuePair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * To string
     * @return String representation of a Key Value Pair
     */
    @Override
    public String toString() {
        return "KeyValuePair{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
