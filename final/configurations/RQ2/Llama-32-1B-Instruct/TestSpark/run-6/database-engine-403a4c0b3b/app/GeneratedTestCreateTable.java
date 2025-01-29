package app;

public class GeneratedTestCreateTable {

    private DBApp dbApp;

    @BeforeEach
    void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testCreateTable() throws DBAppException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("column_name", "type");
        dbApp.init();
        dbApp.createTable("test_table", "column_name", htblColNameType, null, null);
    }

}