package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedTestGetMyTables {

    @Test
    public void testGetMyTables() {
        DBApp dbApp = new DBApp();
        HashSet<String> myTables = dbApp.getMyTables();
        Assert.assertNotNull(myTables);
    }

}