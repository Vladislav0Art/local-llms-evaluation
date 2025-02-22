package app;

public class GeneratedGetMyTablesTest {

    private DBApp dbApp;

    @BeforeEach
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void getMyTablesTest() {
        assertNotNull(dbApp.getMyTables());
    }

}