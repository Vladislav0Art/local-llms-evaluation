package app;

public class GeneratedTestCreateTable {

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

}