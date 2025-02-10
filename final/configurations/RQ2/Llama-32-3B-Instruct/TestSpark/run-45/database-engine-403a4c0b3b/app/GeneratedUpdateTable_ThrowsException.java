package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;

public class GeneratedUpdateTable_ThrowsException {

    private DBApp dbApp = new DBApp();
    private final Serializer serializer = new Serializer();
    private final TypeCaster typeCaster = new TypeCaster();

    public void setOut(ByteArrayOutputStream out) {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void updateTable_ThrowsException() {
        try {
            dbApp.updateTable("", "", new Hashtable<>());
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            // Expected
        }
    }

}