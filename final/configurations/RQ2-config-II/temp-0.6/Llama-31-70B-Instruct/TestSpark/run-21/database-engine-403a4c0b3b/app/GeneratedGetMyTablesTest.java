package app;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import app.DBApp;

public class GeneratedGetMyTablesTest {

    private DBApp dbApp;

    @Test
    public void getMyTablesTest() {
        dbApp = new DBApp();
        HashSet<String> myTables = dbApp.getMyTables();
        assertNotNull(myTables);
    }

}