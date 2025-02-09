package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() {
        DBApp dbApp = new DBApp();
        try {
            SQLTerm[] arrSQLTerms = new SQLTerm[2];
            dbApp.selectFromTable(arrSQLTerms, new String[]{"AND"});
        } catch (DBAppException e) {
            Assert.fail("selectFromTableTest has failed with exception " + e.getMessage());
        }
    }

}