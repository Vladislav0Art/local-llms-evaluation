package app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedTestGetReader {

    private DBApp dbApp;

    @Before
    public void setup() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetReader() {
        CsvReader expected = new CsvReader();
        assertEquals(expected, dbApp.getReader());
    }

}