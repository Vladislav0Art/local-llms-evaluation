package app;

import java.util.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetWriter {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
    }

    @Test
    public void testGetWriter() {
        CsvWriter writer = new CsvWriter();
        app.writer = writer;

        assertEquals(writer, app.getWriter());
    }

}