package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedInsertIntoTableTest {

    private DBApp dbApp;

    @Test
    public void insertIntoTableTest() {
        dbApp = new DBApp();
        dbApp.insertIntoTable("table", new Hashtable<>());
        assertNotNull(dbApp);
    }

}