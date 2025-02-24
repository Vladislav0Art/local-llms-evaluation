package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private DBApp dbApp;

    @Test
    public void initTest() {
        dbApp = new DBApp();
        dbApp.init();
        assertNotNull(dbApp);
    }

    @Test
    public void getMyTablesTest() {
        dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
    }

    @Test
    public void getReaderTest() {
        dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

    @Test
    public void getWriterTest() {
        dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

    @Test
    public void createTableTest() {
        dbApp = new DBApp();
        dbApp.createTable("table", "column", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        assertNotNull(dbApp);
    }

    @Test
    public void insertIntoTableTest() {
        dbApp = new DBApp();
        dbApp.insertIntoTable("table", new Hashtable<>());
        assertNotNull(dbApp);
    }

    @Test
    public void updateTableTest() {
        dbApp = new DBApp();
        dbApp.updateTable("table", "column", new Hashtable<>());
        assertNotNull(dbApp);
    }

}