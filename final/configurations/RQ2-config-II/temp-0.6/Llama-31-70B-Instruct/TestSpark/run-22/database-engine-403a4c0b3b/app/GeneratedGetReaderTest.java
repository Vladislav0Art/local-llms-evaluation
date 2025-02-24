package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetReaderTest {

    private DBApp dbApp;

    @Test
    public void getReaderTest() {
        dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

}