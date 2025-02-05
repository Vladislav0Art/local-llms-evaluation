package app;

import app.DBApp;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;

public class GeneratedGetMyTablesNormalUsageTest {

    // Test the initialization. Assumes the 'init' method has no return.

    @Test
    public void getMyTablesNormalUsageTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
    }

}