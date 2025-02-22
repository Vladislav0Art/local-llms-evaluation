package app;

public class GeneratedCreateTableTest {

    private DBApp dbApp;

    @BeforeEach
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void createTableTest() {
        // TODO: Provide the parameters for the method
        dbApp.createTable(null, null, null, null, null, null);
        assertNotNull(dbApp.getMyTables());
    }

}