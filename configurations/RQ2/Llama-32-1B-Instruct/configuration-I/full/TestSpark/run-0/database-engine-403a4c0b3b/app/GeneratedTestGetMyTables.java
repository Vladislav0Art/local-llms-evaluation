package app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestGetMyTables {

    private DBApp dbApp = new DBApp();

    @Test
    public void testGetMyTables() {
        assertTrue(dbApp.getMyTables().isEmpty());
        dbApp.init();
        HashSet<String> tables = dbApp.getMyTables();
        assertTrue(tables.contains("table1"));
        assertFalse(tables.contains("nonExistentTable"));
    }

}