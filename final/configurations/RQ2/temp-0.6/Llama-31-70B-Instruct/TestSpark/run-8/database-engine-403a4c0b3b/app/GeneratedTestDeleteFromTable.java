package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDeleteFromTable {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testDeleteFromTable() {
        dbApp.deleteFromTable("tableName", null);
        assertTrue(dbApp.getMyTables().contains("tableName"));
    }

}