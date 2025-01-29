package app;

import app.exceptions.DBAppException;
import app.IDatabase;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException_;
import exception.*;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestCreateTable {

    private IDatabase dbApp;

    @Before
    public void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testCreateTable() throws DbAppException {
        // Test case for createTable
        dbApp.createTable("table1", "column1", new HashMap<>(), null, null);
    }

}