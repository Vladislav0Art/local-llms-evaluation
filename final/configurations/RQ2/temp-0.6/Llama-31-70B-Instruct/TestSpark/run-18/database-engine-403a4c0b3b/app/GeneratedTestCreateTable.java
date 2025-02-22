package app;

public class GeneratedTestCreateTable {

    @Test
    public void testCreateTable() throws DBAppException {
        DBApp app = new DBApp();
        String strTableName = "table1";
        String strClusteringKeyColumn = "key";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("key", "int");
        htblColNameType.put("name", "string");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("key", "0");
        htblColNameMin.put("name", "John");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("key", "100");
        htblColNameMax.put("name", "Mary");

        app.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);

        assertTrue(app.myTables.contains(strTableName));
    }

}