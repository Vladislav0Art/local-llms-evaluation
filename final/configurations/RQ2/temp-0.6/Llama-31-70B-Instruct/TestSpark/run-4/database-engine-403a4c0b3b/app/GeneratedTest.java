package app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedTest {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> expected = new HashSet<>(Arrays.asList("table1", "table2"));
        app.myTables = expected;

        HashSet<String> actual = app.getMyTables();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetReader() {
        CsvReader expected = new CsvReader();
        app.reader = expected;

        CsvReader actual = app.getReader();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetWriter() {
        CsvWriter expected = new CsvWriter();
        app.writer = expected;

        CsvWriter actual = app.getWriter();

        assertEquals(expected, actual);
    }

    @Test
    public void testInit() {
        HashSet<String> expected = new HashSet<>(Arrays.asList("table1", "table2"));
        app.myTables = expected;
        app.reader = Mockito.mock(CsvReader.class);
        Mockito.when(app.reader.readAllTables()).thenReturn(expected);

        app.init();

        assertEquals(expected, app.myTables);
    }

}