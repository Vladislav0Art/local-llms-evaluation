package app;

public class GeneratedTestUpdateTable {

    private DBApp dbApp;
    private Validator validator;

    @Before
    public void setup() {
        dbApp = new DBApp();
        validator = new Validator();
    }

    @Test
    public void testUpdateTable() throws DBAppException {
        dbApp.updateTable("Table1", "Column1", new Hashtable<String, Object>() {{
            put("Value", 31);
        }});
        assertTrue(dbApp.getReader().selectFromTable(new String[]{"Column1"}, new String[]{"="}) == null);
    }

}