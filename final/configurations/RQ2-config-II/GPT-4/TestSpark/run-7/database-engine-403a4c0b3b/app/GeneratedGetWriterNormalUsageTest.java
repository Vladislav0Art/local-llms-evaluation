package app;

import app.DBApp;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;

public class GeneratedGetWriterNormalUsageTest {

    // Test the initialization. Assumes the 'init' method has no return.

    @Test
    public void getWriterNormalUsageTest() {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

}