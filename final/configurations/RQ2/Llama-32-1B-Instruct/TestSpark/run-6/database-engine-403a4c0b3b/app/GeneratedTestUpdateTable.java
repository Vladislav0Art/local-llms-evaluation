package app;

public class GeneratedTestUpdateTable {

    private DBApp dbApp;

    @BeforeEach
    void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testUpdateTable() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("value", "string_value");
        dbApp.init();
        dbApp.updateTable("test_table", "column_name", htblColNameValue);
    }

}