package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

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
        Set<String> expected = new HashSet<String>();
        expected.add("table1");
        expected.add("table2");
        dbApp.myTables = expected;

        Set<String> actual = dbApp.getMyTables();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetReader() {
        CsvReader expected = new CsvReader();
        dbApp.reader = expected;

        CsvReader actual = dbApp.getReader();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetWriter() {
        CsvWriter expected = new CsvWriter();
        dbApp.writer = expected;

        CsvWriter actual = dbApp.getWriter();

        assertEquals(expected, actual);
    }

}