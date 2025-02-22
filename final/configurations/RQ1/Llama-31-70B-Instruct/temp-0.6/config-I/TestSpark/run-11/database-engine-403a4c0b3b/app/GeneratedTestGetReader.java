package app;

import java.util.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetReader {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
    }

    @Test
    public void testGetReader() {
        CsvReader reader = new CsvReader();
        app.reader = reader;

        assertEquals(reader, app.getReader());
    }

}