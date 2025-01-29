package app;

public class GeneratedTestDeleteFromTable {

    private DBApp dbApp;

    @BeforeEach
    void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testDeleteFromTable() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.init();
        dbApp.deleteFromTable("test_table", htblColNameValue);
    }

}