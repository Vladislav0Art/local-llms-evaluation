package app;

import java.util.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        expected.add("table2");

        app.myTables.addAll(expected);

        assertEquals(expected, app.getMyTables());
    }

    @Test
    public void testGetReader() {
        CsvReader reader = new CsvReader();
        app.reader = reader;

        assertEquals(reader, app.getReader());
    }

    @Test
    public void testGetWriter() {
        CsvWriter writer = new CsvWriter();
        app.writer = writer;

        assertEquals(writer, app.getWriter());
    }

    @Test
    public void testInit() {
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        expected.add("table2");

        app.myTables.addAll(expected);

        app.init();

        assertEquals(expected, app.getMyTables());
    }

}