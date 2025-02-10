package app;

public class GeneratedTestSelect {

    private DB db;

    @Before
    public void setUp() {
        db = new DB();
    }

    @Test
    public void testSelect() {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = {"AND", "OR"};
        Iterator iterator = db.selectFromTable(arrSQLTerms, strarrOperators);
    }

}