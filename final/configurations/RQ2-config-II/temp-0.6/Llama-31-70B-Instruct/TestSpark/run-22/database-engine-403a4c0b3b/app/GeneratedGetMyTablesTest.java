package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetMyTablesTest {

    private DBApp dbApp;

    @Test
    public void getMyTablesTest() {
        dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
    }

}