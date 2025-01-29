package app;

public class GeneratedTestGetMyTables {

    private DBApp dbApp;
    private Validator validator;

    @Before
    public void setup() {
        dbApp = new DBApp();
        validator = new Validator();
    }

    @Test
    public void testGetMyTables() throws DBAppException, CsvValidationException {
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
        assertEquals(5, tables.size());
    }

}