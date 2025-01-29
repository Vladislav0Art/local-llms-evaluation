package app;

import app.exceptions.DBAppException;
import app.IDatabase;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException_;
import exception.*;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetReader {

    private IDatabase dbApp;

    @Before
    public void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetReader() throws DBAppException {
        // Test case for getReader
        CsvReader reader = dbApp.getReader();
        try (CSVReader csvReader = new CSVReader(new String[]{"column1", "column2"})) {
            assert false;
        }
    }

}