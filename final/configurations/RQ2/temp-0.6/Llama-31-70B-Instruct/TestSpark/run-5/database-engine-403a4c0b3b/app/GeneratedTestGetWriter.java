package app;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

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
        assertEquals(expected, dbApp.getWriter());
    }

}