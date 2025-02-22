package app;

public class GeneratedUpdateTableTest {

    private DBApp dbApp;

    @BeforeEach
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void updateTableTest() {
        // TODO: Provide the parameters for the method
        dbApp.updateTable(null, null, null);
        assertNotNull(dbApp.getMyTables());
    }

}