package app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedTest {

    private DBApp dbApp;

    @Before
    public void setup() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> expected = new HashSet<>();
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
        assertNotNull(dbApp.getMyTables());
    }

}