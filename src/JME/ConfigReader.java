package JME;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Config Reader.
 * A config file reader that parses config files into Key Value pairs.
 *
 * @author Chris Nippert
 * @version 1.0
 */
public class ConfigReader {
    /**
     * Config file to read from.
     */
    private File file;

    /**
     * List of Key Value Pairs.
     */
    public ArrayList<KeyValuePair> keyValuePairs;

    /**
     * Constructor for a config reader.
     * Reads current file and adds them to keyValuePairs
     * @param fileName Name of file to load
     */
    public ConfigReader(String fileName) {
        file = new File(fileName);
        keyValuePairs = new ArrayList<>();
        try {
            if (file.exists()) {
                Scanner scn = new Scanner(file);
                while (scn.hasNextLine()) {
                    String line = scn.nextLine();
                    line = line.trim(); //Getting rid of spaces
                    String[] kvp = line.split("=");
                    keyValuePairs.add(new KeyValuePair(kvp[0], kvp[1]));
                }
            } else {
                System.out.println(fileName + " Not Found.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads a file into the reader.
     * @param fileName Name of file to load
     */
    public void loadFile(String fileName) {
        file = new File(fileName);
        if (!file.exists()) {
            file = null;
            System.out.println("File does not exist.");
        }
    }

    /**
     * Saves all the current Key Value Pairs to current file.
     * @throws IOException File failed to write
     */
    public void save() throws IOException {
        FileWriter myWriter = new FileWriter(file.getName());
        for (KeyValuePair kvp : keyValuePairs) {
            myWriter.write(kvp.key + "=" + kvp.value);
        }
        myWriter.close();
    }

    /**
     * Saves all the current Key Value Pairs to a new file.
     * @param newFileName Name of new file to save to
     * @throws IOException File failed to write
     */
    public void saveToFile(String newFileName) throws IOException {
        File file = new File(newFileName);
        if (file.createNewFile()) {
            FileWriter myWriter = new FileWriter(newFileName);
            for (KeyValuePair kvp : keyValuePairs) {
                myWriter.write(kvp.key + "=" + kvp.value);
            }
            myWriter.close();
        }
    }

    /**
     * Gets a specific value from an input key.
     * It will return only the first occurence of the key.
     * @param key Name of key
     * @return Value from Key Value Pair
     */
    public String getValue(String key) {
        for (KeyValuePair kvp : keyValuePairs) {
            if (kvp.key.equals(key)) {
                return kvp.value;
            }
        }
        return null;
    }

    /**
     * Clears all the Key Value Pairs from the reader.
     */
    public void clear() {
        file = null;
        keyValuePairs.clear();
    }
}
