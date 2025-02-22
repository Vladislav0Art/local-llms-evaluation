package app;

public class GeneratedTestInit {

    private DBApp dbApp;
    private Table table;

    @Before
    public void init() throws Exception {
        dbApp = new DBApp();
        table = new Table("table1", "col1", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        dbApp.getMyTables().add(table);
    }

    @Test
    public void testInit() throws DBAppException {
        dbApp.init();
        assertTrue(dbApp.getMyTables().contains(table));
    }

}