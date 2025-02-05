package app;

import app.DBApp;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;

public class GeneratedSelectFromTableNormalUsageTest {

    // Test the initialization. Assumes the 'init' method has no return.

    @Test
    public void selectFromTableNormalUsageTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        String[] strarrOperators = new String[1];
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertNotNull(iterator);
    }

}