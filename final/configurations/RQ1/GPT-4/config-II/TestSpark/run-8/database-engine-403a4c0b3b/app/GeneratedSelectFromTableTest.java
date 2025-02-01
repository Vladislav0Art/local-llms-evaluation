package app;

import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        // Setup
        final SQLTerm[] arrSQLTerms = new SQLTerm[0];
        final String[] strarrOperators = new String[0];

        final DBApp dbApp = new DBApp();

        // Execute
        final Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);

        // Verify
        Assert.assertNotNull(result);
    }

}