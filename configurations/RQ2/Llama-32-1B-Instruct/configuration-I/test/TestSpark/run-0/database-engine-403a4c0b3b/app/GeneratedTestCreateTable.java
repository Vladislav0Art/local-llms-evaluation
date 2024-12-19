package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCreateTable {

    @Test
    public void testCreateTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("my_table", "column1", null, null, null);
        assertNotNull(dbApp.getMyTables().size());
        assertEquals(1, dbApp.getMyTables().size());
        assertTrue(!dbApp.getMyTables().contains("my_table"));
    }

}