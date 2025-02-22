package app;

public class GeneratedTestInsertIntoTable {

    private DBApp dbApp;
    private Table table;

    @Before
    public void init() throws Exception {
        dbApp = new DBApp();
        table = new Table("table1", "col1", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        dbApp.getMyTables().add(table);
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("col1", "value");
        dbApp.insertIntoTable("table1", htblColNameValue);
        assertTrue(table.getRecords().contains(htblColNameValue));
    }

}