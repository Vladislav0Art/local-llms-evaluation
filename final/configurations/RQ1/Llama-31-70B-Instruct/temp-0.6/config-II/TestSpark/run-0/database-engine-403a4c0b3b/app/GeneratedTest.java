package app;

public class GeneratedTest {

    @Test
    public void testInit() {
        DBApp app = new DBApp();
        app.init();
        assertNotNull(app.getMyTables());
        assertNotNull(app.getReader());
        assertNotNull(app.getWriter());
    }

    @Test
    public void testCreateTable() throws DBAppException, IOException, ParseException {
        DBApp app = new DBApp();
        String strTableName = "table1";
        String strClusteringKeyColumn = "key1";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        app.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        assertTrue(app.getMyTables().contains(strTableName));
    }

    @Test
    public void testInsertIntoTable() throws DBAppException, CsvValidationException, IOException, ClassNotFoundException, ParseException {
        DBApp app = new DBApp();
        String strTableName = "table1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        app.insertIntoTable(strTableName, htblColNameValue);
        assertTrue(app.getMyTables().contains(strTableName));
    }

}