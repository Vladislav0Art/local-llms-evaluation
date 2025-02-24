package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        expected.add("table2");
        HashSet<String> actual = dbApp.getMyTables();
        assertEquals(expected, actual);
    }

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        CsvReader expected = new CsvReader();
        CsvReader actual = dbApp.getReader();
        assertEquals(expected, actual);
    }

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        CsvWriter expected = new CsvWriter();
        CsvWriter actual = dbApp.getWriter();
        assertEquals(expected, actual);
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        // assert here
    }

}