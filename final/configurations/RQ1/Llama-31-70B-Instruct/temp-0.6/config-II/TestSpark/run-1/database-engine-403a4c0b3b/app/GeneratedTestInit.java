package app;

public class GeneratedTestInit {

    private DBApp dbApp;
    private Table table;

    @Before
    public void setUp() {
        dbApp = new DBApp();
        table = new Table();
    }

    @Test
    public void testInit() {
        dbApp.init();
        assertNotNull(dbApp.getMyTables());
    }

}