package app;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};
        DBApp dbApp = new DBApp();
        Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        Assert.assertNotNull(result);
    }

}