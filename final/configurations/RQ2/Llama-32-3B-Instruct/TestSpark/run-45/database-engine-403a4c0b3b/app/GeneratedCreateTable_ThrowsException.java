package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;

public class GeneratedCreateTable_ThrowsException {

    private DBApp dbApp = new DBApp();
    private final Serializer serializer = new Serializer();
    private final TypeCaster typeCaster = new TypeCaster();

    public void setOut(ByteArrayOutputStream out) {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void createTable_ThrowsException() {
        try {
            dbApp.createTable("", "", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            // Expected
        }
    }

}