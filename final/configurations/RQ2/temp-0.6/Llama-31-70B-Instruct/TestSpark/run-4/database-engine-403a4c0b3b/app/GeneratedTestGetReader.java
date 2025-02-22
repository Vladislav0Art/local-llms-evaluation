package app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedTestGetReader {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
    }

    @Test
    public void testGetReader() {
        CsvReader expected = new CsvReader();
        app.reader = expected;

        CsvReader actual = app.getReader();

        assertEquals(expected, actual);
    }

}