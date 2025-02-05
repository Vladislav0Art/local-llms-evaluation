package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        // Just an example. A real implementation requires to have some tables created
        // in order to get a non-empty set.
        HashSet<String> tables = dbApp.getMyTables();
        Assert.assertEquals(new HashSet<String>(), tables);
    }

}