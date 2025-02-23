package app;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

public class GeneratedTestInsertIntoTable {

    @Before
    public void setup() {
        // Setup the test class here (if needed)
    }

    @Test
    public void testInsertIntoTable() {
        // Setup
        DBApp app = new DBApp();
        String strTableName = "exampleTable";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("exampleColumn", "exampleValue");

        // Execute
        app.insertIntoTable(strTableName, htblColNameValue);

        // Verify
        assertEquals(1, app.getMyTables().size());
        assertTrue(app.getMyTables().contains(strTableName));
    }

}