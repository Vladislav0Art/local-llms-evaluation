package app;

public class GeneratedTestCreateTable {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
    }

    @Test
    public void testCreateTable() throws DBAppException, IOException, ParseException {
        String strTableName = "test";
        String strClusteringKeyColumn = "clusteringKey";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("column1", "type1");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("column1", "1");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("column1", "10");

        app.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        assertTrue(app.getMyTables().contains(strTableName));
    }

}