package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUpdateTableTest {

    private DBApp dbApp;

    @Test
    public void updateTableTest() {
        dbApp = new DBApp();
        dbApp.updateTable("table", "column", new Hashtable<>());
        assertNotNull(dbApp);
    }

}