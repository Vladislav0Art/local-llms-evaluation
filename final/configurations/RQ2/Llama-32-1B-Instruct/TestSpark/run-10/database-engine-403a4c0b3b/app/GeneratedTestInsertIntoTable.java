package app;

import app.exceptions.DBAppException;
import app.IDatabase;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException_;
import exception.*;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestInsertIntoTable {

    private IDatabase dbApp;

    @Before
    public void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testInsertIntoTable() throws DbAppException {
        // Test case for insertIntoTable
        dbApp.insertIntoTable("table1", new Hashtable<>());
    }

}