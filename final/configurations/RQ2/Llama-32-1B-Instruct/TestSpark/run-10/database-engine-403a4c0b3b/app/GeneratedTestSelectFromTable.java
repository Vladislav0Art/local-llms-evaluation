package app;

import app.exceptions.DBAppException;
import app.IDatabase;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException_;
import exception.*;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestSelectFromTable {

    private IDatabase dbApp;

    @Before
    public void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testSelectFromTable() throws CSVReader, IOException, DBAppException_ {
        // Test case for selectFromTable
        SQLTerm[] sqlTerms = new SQLTerm[]{new SQLTerm("column1"), new SQLTerm(" operator ")};
        String[] strOperators = new String[]{"eq", "neq"};
        Iterator<CSVReader> iterator = null;
        Assert.assertTrue(dbApp.selectFromTable(sqlTerms, strOperators) == 0);
    }

}