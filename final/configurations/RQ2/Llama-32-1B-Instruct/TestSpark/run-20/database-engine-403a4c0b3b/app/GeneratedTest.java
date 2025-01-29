package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testGetMyTables() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertTrue(tables.contains("my_table"));
    }

    @Test
    public void testGetReader() throws Exception {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertTrue(reader instanceof CSVReader);
    }

    @Test
    public void testGetWriter() throws Exception {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertTrue(writer instanceof CSVWriter);
    }

    @Test
    public void testInit() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.init());
    }

    @Test
    public void testCreateTable() throws Exception {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = new HashSet<>();
        dbApp.init();
        HashMap<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("my_column", "my_value");
        dbApp.createTable("my_table", null, null, null, null);
        assertTrue(tables.contains("my_table"));
    }

    @Test
    public void testInsertIntoTable() throws Exception {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = new HashSet<>();
        dbApp.init();
        HashMap<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("my_column", "my_value");
        dbApp.insertIntoTable("my_table", null);
        assertTrue(tables.contains("my_table"));
    }

    @Test
    public void testUpdateTable() throws Exception {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = new HashSet<>();
        dbApp.init();
        HashMap<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("my_column", "my_value");
        HashMap<String, String> htblClusteringKeyValue = new HashMap<>();
        htblClusteringKeyValue.put("key1", "value1");
        dbApp.updateTable("my_table", null, htblColNameValue);
        assertTrue(tables.contains("my_table"));
    }

    @Test
    public void testDeleteFromTable() throws Exception {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = new HashSet<>();
        dbApp.init();
        HashMap<String, Object> htblColNameValue = new HashMap<>();
        HashMap<String, String> htblClusteringKeyValue = new HashMap<>();
        htblClusteringKeyValue.put("key1", "value1");
        dbApp.insertIntoTable("my_table", null);
        dbApp.deleteFromTable("my_table", null);
    }

    @Test
    public void testSelectFromTable() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = new HashSet<>();
        HashMap<String, Object> htblColNameValue = new HashMap<>();
        HashMap<String, String> htblClusteringKeyValue = new HashMap<>();
        dbApp.init();
        CSVReader reader = dbApp.getReader();
        // Add more rows to the CSV file
    }

}