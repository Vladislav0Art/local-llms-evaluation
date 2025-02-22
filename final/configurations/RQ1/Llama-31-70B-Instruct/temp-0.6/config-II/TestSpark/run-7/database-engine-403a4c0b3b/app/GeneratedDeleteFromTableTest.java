package app;

public class GeneratedDeleteFromTableTest {

    private DBApp dbApp;

    @BeforeEach
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void deleteFromTableTest() {
        // TODO: Provide the parameters for the method
        dbApp.deleteFromTable(null, null);
        assertNotNull(dbApp.getMyTables());
    }

}