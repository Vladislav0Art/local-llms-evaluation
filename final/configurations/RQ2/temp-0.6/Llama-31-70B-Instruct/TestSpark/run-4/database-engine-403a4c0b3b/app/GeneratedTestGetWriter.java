package app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedTestGetWriter {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
    }

    @Test
    public void testGetWriter() {
        CsvWriter expected = new CsvWriter();
        app.writer = expected;

        CsvWriter actual = app.getWriter();

        assertEquals(expected, actual);
    }

}