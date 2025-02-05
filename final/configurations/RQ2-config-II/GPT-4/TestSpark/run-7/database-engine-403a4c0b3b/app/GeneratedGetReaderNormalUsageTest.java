package app;

import app.DBApp;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;

public class GeneratedGetReaderNormalUsageTest {

    // Test the initialization. Assumes the 'init' method has no return.

    @Test
    public void getReaderNormalUsageTest() {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

}