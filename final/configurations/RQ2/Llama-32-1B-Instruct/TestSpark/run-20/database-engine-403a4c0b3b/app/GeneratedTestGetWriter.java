package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetWriter {

    @Test
    public void testGetWriter() throws Exception {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertTrue(writer instanceof CSVWriter);
    }

}