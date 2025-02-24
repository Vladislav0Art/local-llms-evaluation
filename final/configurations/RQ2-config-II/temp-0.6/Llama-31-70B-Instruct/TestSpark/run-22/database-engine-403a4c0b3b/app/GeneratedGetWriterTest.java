package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWriterTest {

    private DBApp dbApp;

    @Test
    public void getWriterTest() {
        dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

}