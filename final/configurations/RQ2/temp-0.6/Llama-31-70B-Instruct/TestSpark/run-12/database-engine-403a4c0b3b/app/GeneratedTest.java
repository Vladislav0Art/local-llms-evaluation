package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        Set<String> actual = dbApp.getMyTables();
        Set<String> expected = new HashSet<>();
        assertEquals(expected, actual);
    }

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        CsvReader actual = dbApp.getReader();
        CsvReader expected = new CsvReader();
        assertEquals(expected, actual);
    }

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        CsvWriter actual = dbApp.getWriter();
        CsvWriter expected = new CsvWriter();
        assertEquals(expected, actual);
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

}