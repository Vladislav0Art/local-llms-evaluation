package app;

public class GeneratedTest {

    private DBApp dbApp;

    @BeforeEach
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void getMyTablesTest() {
        assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void getReaderTest() {
        assertNotNull(dbApp.getReader());
    }

    @Test
    public void getWriterTest() {
        assertNotNull(dbApp.getWriter());
    }

    @Test
    public void initTest() {
        dbApp.init();
        assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void createTableTest() {
        // TODO: Provide the parameters for the method
        dbApp.createTable(null, null, null, null, null, null);
        assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void insertIntoTableTest() {
        // TODO: Provide the parameters for the method
        dbApp.insertIntoTable(null, null);
        assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void updateTableTest() {
        // TODO: Provide the parameters for the method
        dbApp.updateTable(null, null, null);
        assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void deleteFromTableTest() {
        // TODO: Provide the parameters for the method
        dbApp.deleteFromTable(null, null);
        assertNotNull(dbApp.getMyTables());
    }

}