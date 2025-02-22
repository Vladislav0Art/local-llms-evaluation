package app;

public class GeneratedInsertIntoTableTest {

    private DBApp dbApp;

    @BeforeEach
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void insertIntoTableTest() {
        // TODO: Provide the parameters for the method
        dbApp.insertIntoTable(null, null);
        assertNotNull(dbApp.getMyTables());
    }

}