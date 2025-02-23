package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Hashtable;

import exceptions.DBAppException;

public class GeneratedTestCreateTable {

    private DBApp dbApp;
    private HashSet<String> myTables;

    @BeforeEach
    void setUp() {
        myTables = new HashSet<>();
        dbApp = new DBApp();
    }

    @Test
    public void testCreateTable() {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("Col1", "String");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("Col1", "1");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("Col1", "10");

        try {
            dbApp.createTable("Table1", "Col1", htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException e) {
            fail("Exception thrown while creating table");
        }

        assertTrue(myTables.contains("Table1"), "Table1 not created");
    }

}