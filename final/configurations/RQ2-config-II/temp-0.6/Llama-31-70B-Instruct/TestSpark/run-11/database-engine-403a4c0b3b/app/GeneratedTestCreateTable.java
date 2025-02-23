package app;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

public class GeneratedTestCreateTable {

    @Before
    public void setup() {
        // Setup the test class here (if needed)
    }

    @Test
    public void testCreateTable() {
        // Setup
        DBApp app = new DBApp();
        String strTableName = "exampleTable";
        String strClusteringKeyColumn = "exampleColumn";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("exampleColumn", "exampleType");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("exampleColumn", "exampleMin");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("exampleColumn", "exampleMax");

        // Execute
        app.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);

        // Verify
        assertEquals(1, app.getMyTables().size());
        assertTrue(app.getMyTables().contains(strTableName));
    }

}