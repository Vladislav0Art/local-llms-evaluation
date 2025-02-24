package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateTableTest {

    private DBApp dbApp;

    @Test
    public void createTableTest() {
        dbApp = new DBApp();
        dbApp.createTable("table", "column", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        assertNotNull(dbApp);
    }

}