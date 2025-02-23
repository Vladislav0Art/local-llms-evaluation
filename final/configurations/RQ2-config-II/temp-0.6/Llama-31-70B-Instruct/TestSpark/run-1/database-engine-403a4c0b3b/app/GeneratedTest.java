package app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedTest {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testInit() {
        dbApp.init();
        assertEquals(new HashSet<>(), dbApp.getMyTables());
    }

    @Test
    public void testCreateTable() {
        String strTableName = "table1";
        String strClusteringKeyColumn = "column1";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        assertNotEquals(new HashSet<>(), dbApp.getMyTables());
    }

    @Test
    public void testInsertIntoTable() {
        String strTableName = "table1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.insertIntoTable(strTableName, htblColNameValue);
    }

    @Test
    public void testUpdateTable() {
        String strTableName = "table1";
        String strClusteringKeyValue = "value1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.updateTable(strTableName, strClusteringKeyValue, htblColNameValue);
    }

}