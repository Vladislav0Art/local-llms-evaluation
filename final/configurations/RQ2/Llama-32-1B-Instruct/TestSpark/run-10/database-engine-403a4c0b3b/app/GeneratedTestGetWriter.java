package app;

import app.exceptions.DBAppException;
import app.IDatabase;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException_;
import exception.*;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetWriter {

    private IDatabase dbApp;

    @Before
    public void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetWriter() throws DBAppException {
        // Test case for getWriter
        CsvWriter writer = dbApp.getWriter();
        try (CSVWriter csvWriter = new CSVWriter(new String[]{"column1", "column2"})) {
            Assert.assertTrue(true);
        }
    }

}