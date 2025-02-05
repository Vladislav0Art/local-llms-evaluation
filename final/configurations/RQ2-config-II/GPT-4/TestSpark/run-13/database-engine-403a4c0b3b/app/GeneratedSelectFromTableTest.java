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
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(new DBApp());
        SQLTerm[] sqlTerms = new SQLTerm[0];
        Assert.assertNotNull(dbApp.selectFromTable(sqlTerms, new String[0]));
    }

}