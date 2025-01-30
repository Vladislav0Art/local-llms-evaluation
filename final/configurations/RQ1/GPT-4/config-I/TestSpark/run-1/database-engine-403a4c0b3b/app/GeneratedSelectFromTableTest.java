package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;
import util.search.*;

import java.util.Hashtable;
import java.util.Iterator;
import java.io.IOException;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        try {
            Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
            Assert.assertNotNull(result);
        } catch (DBAppException e) {
            Assert.fail("Should not have thrown any exception");
        }
    }

}