package app;

import static org.junit.Assert.*;

import java.util.*;

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