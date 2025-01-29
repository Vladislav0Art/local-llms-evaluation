package app;

import app.exceptions.DBAppException;
import app.IDatabase;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException_;
import exception.*;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestSelectFromInvalidTable {

    private IDatabase dbApp;

    @Before
    public void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testSelectFromInvalidTable() throws CSVReader, IOException {
        // Test case for selectFromInvalidTable
        SQLTerm[] sqlTerms = new SQLTerm[]{new SQLTerm("column1"), new SQLTerm(" operator ")};
        Assert.assertFalse(dbApp.selectFromTable(sqlTerms, strOperators) == 0);
    }

}