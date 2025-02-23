package app;

public class GeneratedTest {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
    }

    @Test
    public void testInit() {
        app.init();
        assertNotNull(app.getMyTables());
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

    @Test
    public void testCreateTable_InvalidName() throws DBAppException, IOException, ParseException {
        String strTableName = "";
        String strClusteringKeyColumn = "clusteringKey";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("column1", "type1");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("column1", "1");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("column1", "10");

        app.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
    }

}