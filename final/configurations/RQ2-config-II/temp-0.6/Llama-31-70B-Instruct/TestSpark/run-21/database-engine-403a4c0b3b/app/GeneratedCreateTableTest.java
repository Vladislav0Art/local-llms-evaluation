package app;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import app.DBApp;

public class GeneratedCreateTableTest {

    private DBApp dbApp;

    @Test
    public void createTableTest() throws DBAppException {
        dbApp = new DBApp();
        String strTableName = "test_table";
        String strClusteringKeyColumn = "test_column";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        assertNotNull(dbApp.getMyTables());
    }

}