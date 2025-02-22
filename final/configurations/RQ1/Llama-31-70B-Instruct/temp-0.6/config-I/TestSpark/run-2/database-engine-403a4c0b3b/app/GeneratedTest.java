package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedTest {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
    }

    @After
    public void tearDown() {
        app = null;
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> expected = new HashSet<>();
        assertEquals(expected, app.getMyTables());
    }

    @Test
    public void testGetReader() {
        CsvReader expected = new CsvReader();
        assertEquals(expected, app.getReader());
    }

    @Test
    public void testGetWriter() {
        CsvWriter expected = new CsvWriter();
        assertEquals(expected, app.getWriter());
    }

}