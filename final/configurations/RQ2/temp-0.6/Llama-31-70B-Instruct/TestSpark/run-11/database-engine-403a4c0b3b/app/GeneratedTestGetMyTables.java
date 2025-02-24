package app;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Test;
import app.DBApp;
import app.IDatabase;

public class GeneratedTestGetMyTables {

    @Test
    public void testGetMyTables() {
        DBApp dbApp = new DBApp();
        HashSet<String> actualTables = dbApp.getMyTables();
        assertNotNull(actualTables);
    }

}