package app;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import app.DBApp;

public class GeneratedTest {

    private DBApp dbApp;

    @Test
    public void initTest() throws DBAppException {
        dbApp = new DBApp();
        dbApp.init();
        assertNotNull(dbApp);
    }

    @Test
    public void getMyTablesTest() {
        dbApp = new DBApp();
        HashSet<String> myTables = dbApp.getMyTables();
        assertNotNull(myTables);
    }

    @Test
    public void getReaderTest() {
        dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

    @Test
    public void getWriterTest() {
        dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

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