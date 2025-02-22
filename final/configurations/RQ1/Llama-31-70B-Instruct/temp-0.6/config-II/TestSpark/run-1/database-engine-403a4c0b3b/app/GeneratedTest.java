package app;

public class GeneratedTest {

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

    @Test
    public void testCreateTable() {
        // TODO: You need to fill in the test case here.
    }

    @Test
    public void testInsertIntoTable() {
        // TODO: You need to fill in the test case here.
    }

    @Test
    public void testUpdateTable() {
        // TODO: You need to fill in the test case here.
    }

    @Test
    public void testDeleteFromTable() {
        // TODO: You need to fill in the test case here.
    }

    @Test
    public void testTakeAction() {
        // TODO: You need to fill in the test case here.
    }

    @Test
    public void testCastClusteringKeyType() {
        // TODO: You need to fill in the test case here.
    }

    @Test
    public void testSelectFromTable() {
        // TODO: You need to fill in the test case here.
    }

}