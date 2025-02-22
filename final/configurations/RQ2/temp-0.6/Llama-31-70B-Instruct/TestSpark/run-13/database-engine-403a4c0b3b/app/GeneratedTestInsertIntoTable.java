package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestInsertIntoTable {

    private DBApp app;

    @Before
    public void setUp() throws Exception {
        app = new DBApp();
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        String tableName = "Table1";
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        colNameValue.put("Col1", 1);
        colNameValue.put("Col2", "Value1");

        app.insertIntoTable(tableName, colNameValue);
    }

}