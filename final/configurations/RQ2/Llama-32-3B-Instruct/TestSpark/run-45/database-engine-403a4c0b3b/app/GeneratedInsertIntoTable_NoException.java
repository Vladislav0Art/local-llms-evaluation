package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;

public class GeneratedInsertIntoTable_NoException {

    private DBApp dbApp = new DBApp();
    private final Serializer serializer = new Serializer();
    private final TypeCaster typeCaster = new TypeCaster();

    public void setOut(ByteArrayOutputStream out) {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void insertIntoTable_NoException() {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("test", "test");

        dbApp.insertIntoTable("test", htblColNameValue);
    }

}