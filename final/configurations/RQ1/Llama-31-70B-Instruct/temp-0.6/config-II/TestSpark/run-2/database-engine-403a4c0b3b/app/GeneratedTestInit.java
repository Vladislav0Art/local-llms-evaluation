package app;

public class GeneratedTestInit {

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