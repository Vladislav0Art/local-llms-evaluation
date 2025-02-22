package app;

public class GeneratedTest {

    private DBApp dbApp;

    @Before
    void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testInit() {
        dbApp.init();
        assertNotNull(dbApp.getMyTables());
    }

}