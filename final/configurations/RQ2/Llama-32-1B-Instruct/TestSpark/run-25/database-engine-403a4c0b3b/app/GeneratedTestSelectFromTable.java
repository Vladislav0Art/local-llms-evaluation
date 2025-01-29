package app;

public class GeneratedTestSelectFromTable {

    private DBApp dbApp;
    private Validator validator;

    @Before
    public void setup() {
        dbApp = new DBApp();
        validator = new Validator();
    }

    @Test
    public void testSelectFromTable() {
        dbApp.init();
        SQLTerm[] sqlTerms = {new SQLTerm("SELECT * FROM Table1"), new SQLTerm("FROM Table2")};
        Iterator iterator = dbApp.selectFromTable(sqlTerms, new String[]{"=1", ">2"});
        assertTrue(iterator.hasNext());
    }

    @After
    public void tearDown() {
        dbApp.init();
    }

}