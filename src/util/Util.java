package util;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This class contains static methods to get some utilities for all classes.
 * @author Juan Alvarez
 */
public class Util {

    /**
     * This method is used to serialize an object into an XML file
     *
     * @param object the object to be serialized
     * @throws IOException
     */
    public static void save(Object object) throws IOException {
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("src/data/saved_scores"));
        encoder.writeObject(object);
        encoder.flush();
        encoder.close();
    }

    /**
     * This method is used to deserialize an XML file into an object
     *
     * @param object the object to have the information
     * @throws IOException
     */
    public static void load(Object object) throws IOException {
        XMLDecoder decoder = new XMLDecoder(new FileInputStream("src/data/saved_scores"));
        object = decoder.readObject();
        decoder.close();
    }
}
