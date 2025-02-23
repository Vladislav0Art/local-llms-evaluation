package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetReader {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetReader() {
        CsvReader expected = new CsvReader();
        dbApp.reader = expected;

        CsvReader actual = dbApp.getReader();

        assertEquals(expected, actual);
    }

}