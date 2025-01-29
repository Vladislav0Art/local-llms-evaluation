package app;

public class GeneratedTestCreateTable {

    private DBApp dbApp;
    private Validator validator;

    @Before
    public void setup() {
        dbApp = new DBApp();
        validator = new Validator();
    }

    @Test
    public void testCreateTable() throws DBAppException, CsvValidationException {
        HashSet<String> tables = new HashSet<>();
        tables.add("Table1");
        tables.add("Table2");
        dbApp.createTable("Table1", "Column1", null, null, null);
        assertTrue(dbApp.getMyTables().containsAll(tables));
    }

}