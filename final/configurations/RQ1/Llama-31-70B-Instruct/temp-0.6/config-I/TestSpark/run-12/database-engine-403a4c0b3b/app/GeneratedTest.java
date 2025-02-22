package app;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private DBApp dbApp;

    @Before
    public void setUp() throws IOException {
        dbApp = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> expected = new HashSet<>();
        expected.add("test");
        dbApp.myTables = expected;

        HashSet<String> actual = dbApp.getMyTables();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetReader() {
        CsvReader expected = mock(CsvReader.class);
        dbApp.reader = expected;

        CsvReader actual = dbApp.getReader();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetWriter() {
        CsvWriter expected = mock(CsvWriter.class);
        dbApp.writer = expected;

        CsvWriter actual = dbApp.getWriter();

        assertEquals(expected, actual);
    }

    @Test
    public void testInit() throws IOException {
        HashSet<String> expected = new HashSet<>();
        expected.add("test");
        when(dbApp.reader.readAllTables()).thenReturn(expected);

        dbApp.init();

        assertEquals(expected, dbApp.myTables);
    }

}