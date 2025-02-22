package app;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

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
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        expected.add("table2");
        dbApp.getMyTables().add("table1");
        dbApp.getMyTables().add("table2");
        assertEquals(expected, dbApp.getMyTables());
    }

    @Test
    public void testGetReader() {
        CsvReader expected = new CsvReader();
        assertEquals(expected, dbApp.getReader());
    }

    @Test
    public void testGetWriter() {
        CsvWriter expected = new CsvWriter();
        assertEquals(expected, dbApp.getWriter());
    }

    @Test
    public void testInit() {
        dbApp.init();
        assertEquals(new HashSet<String>(), dbApp.getMyTables());
    }

}