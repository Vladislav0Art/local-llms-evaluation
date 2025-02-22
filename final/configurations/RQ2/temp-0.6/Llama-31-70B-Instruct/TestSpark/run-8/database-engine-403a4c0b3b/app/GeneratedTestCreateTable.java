package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestCreateTable {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testCreateTable() {
        dbApp.createTable("tableName", "clusteringKeyColumn", null, null, null);
        assertTrue(dbApp.getMyTables().contains("tableName"));
    }

}