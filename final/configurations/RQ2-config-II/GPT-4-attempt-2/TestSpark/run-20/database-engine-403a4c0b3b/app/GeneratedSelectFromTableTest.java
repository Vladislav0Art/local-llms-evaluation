package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);

        Assert.assertNotNull(result);
    }

}