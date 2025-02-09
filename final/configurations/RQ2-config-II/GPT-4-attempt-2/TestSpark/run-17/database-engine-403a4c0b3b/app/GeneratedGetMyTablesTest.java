package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.HashSet;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        Assert.assertTrue(tables instanceof HashSet);
    }

}