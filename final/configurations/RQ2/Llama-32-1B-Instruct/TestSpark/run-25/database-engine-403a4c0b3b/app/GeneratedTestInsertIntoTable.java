package app;

public class GeneratedTestInsertIntoTable {

    private DBApp dbApp;
    private Validator validator;

    @Before
    public void setup() {
        dbApp = new DBApp();
        validator = new Validator();
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        dbApp.insertIntoTable("Table1", new Hashtable<String, Object>() {{
            put("Name", "John");
            put("Age", 30);
        }});
        assertTrue(dbApp.getReader().selectFromTable(new String[]{"Name", "Age"}, new String[]{"=", ">"}) == null);
    }

}