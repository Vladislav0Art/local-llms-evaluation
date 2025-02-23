package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetWriter {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetWriter() {
        CsvWriter expected = new CsvWriter();
        dbApp.writer = expected;

        CsvWriter actual = dbApp.getWriter();

        assertEquals(expected, actual);
    }

}