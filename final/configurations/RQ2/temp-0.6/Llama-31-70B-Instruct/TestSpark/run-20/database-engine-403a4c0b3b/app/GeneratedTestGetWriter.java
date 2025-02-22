package app;

import static org.junit.Assert.*;

import java.util.*;

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
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

}