package app;

public class GeneratedTestGetMyTables {

    private DBApp dbApp;

    @BeforeEach
    void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> tables = dbApp.getMyTables();
        assertEquals(3, tables.size());
    }

}