package app;

public class GeneratedTest {

    private DBApp dbApp;
    private Table table;

    @Before
    public void init() throws Exception {
        dbApp = new DBApp();
        table = new Table("table1", "col1", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        dbApp.getMyTables().add(table);
    }

    @Test
    public void testInit() throws DBAppException {
        dbApp.init();
        assertTrue(dbApp.getMyTables().contains(table));
    }

    @Test
    public void testCreateTable() throws DBAppException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("col2", "int");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("col2", "1");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("col2", "10");
        dbApp.createTable("table2", "col2", htblColNameType, htblColNameMin, htblColNameMax);
        assertTrue(dbApp.getMyTables().contains(new Table("table2", "col2", htblColNameType, htblColNameMin, htblColNameMax)));
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("col1", "value");
        dbApp.insertIntoTable("table1", htblColNameValue);
        assertTrue(table.getRecords().contains(htblColNameValue));
    }

}