package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = {new SQLTerm()};
        String[] strarrOperators = {"And"};

        Object iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);

        Assert.assertNotNull(iterator);
    }

}