package app;

import app.exceptions.DBAppException;
import app.IDatabase;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException_;
import exception.*;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetMyTables {

    private IDatabase dbApp;

    @Before
    public void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetMyTables() throws CSVReader, IOException, DbAppException_ {
        // Test case for getMyTables
        HashSet<String> myTables = dbApp.getMyTables();
        Assert.assertTrue(myTables.contains("table1"));
        Assert.assertTrue(myTables.contains("table2"));
    }

}