package app;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

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
        assertEquals(expected, dbApp.getReader());
    }

}