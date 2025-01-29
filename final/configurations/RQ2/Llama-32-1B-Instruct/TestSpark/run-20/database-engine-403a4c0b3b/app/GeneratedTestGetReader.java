package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetReader {

    @Test
    public void testGetReader() throws Exception {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertTrue(reader instanceof CSVReader);
    }

}