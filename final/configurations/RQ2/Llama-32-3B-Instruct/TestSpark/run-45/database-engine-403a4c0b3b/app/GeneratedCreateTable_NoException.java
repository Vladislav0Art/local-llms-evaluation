package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;

public class GeneratedCreateTable_NoException {

    private DBApp dbApp = new DBApp();
    private final Serializer serializer = new Serializer();
    private final TypeCaster typeCaster = new TypeCaster();

    public void setOut(ByteArrayOutputStream out) {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void createTable_NoException() {
        Hashtable<String, String> htblClusteringKeyColumn = new Hashtable<>();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        dbApp.createTable("test", "test", htblClusteringKeyColumn, htblColNameType, htblColNameMin);
    }

}