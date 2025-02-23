package app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedTestInsertIntoTable {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testInsertIntoTable() {
        String strTableName = "table1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.insertIntoTable(strTableName, htblColNameValue);
    }

}