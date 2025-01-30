package app;

import org.junit.Test;

import java.io.IOException;
import java.util.Hashtable;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

}