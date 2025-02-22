package app;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> myTables = dbApp.getMyTables();
        assertNotNull(myTables);
        assertEquals(0, myTables.size());
    }

    @Test
    public void testGetReader() {
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

    @Test
    public void testGetWriter() {
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

    @Test
    public void testInit() {
        dbApp.init();
        assertEquals(0, dbApp.getMyTables().size());
    }

    @Test
    public void testCreateTable() throws DBAppException {
        String tableName = "testTable";
        String clusteringKeyColumn = "testColumn";
        Hashtable<String, String> columnNameType = new Hashtable<>();
        columnNameType.put("testColumn", "String");
        Hashtable<String, String> columnNameMin = new Hashtable<>();
        columnNameMin.put("testColumn", "0");
        Hashtable<String, String> columnNameMax = new Hashtable<>();
        columnNameMax.put("testColumn", "10");

        dbApp.createTable(tableName, clusteringKeyColumn, columnNameType, columnNameMin, columnNameMax);
        assertEquals(1, dbApp.getMyTables().size());
    }

}