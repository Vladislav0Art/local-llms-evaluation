package app;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import app.DBApp;

public class GeneratedGetWriterTest {

    private DBApp dbApp;

    @Test
    public void getWriterTest() {
        dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

}