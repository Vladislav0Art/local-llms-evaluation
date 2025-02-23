package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Hashtable;

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
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

}