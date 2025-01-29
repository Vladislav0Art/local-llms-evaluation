package app;

public class GeneratedTestInsertIntoTable {

    private DBApp dbApp;

    @BeforeEach
    void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("value", "string_value");
        dbApp.init();
        dbApp.insertIntoTable("test_table", htblColNameValue);
    }

}