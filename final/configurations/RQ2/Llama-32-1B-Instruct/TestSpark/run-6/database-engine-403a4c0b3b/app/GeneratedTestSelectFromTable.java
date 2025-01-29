package app;

public class GeneratedTestSelectFromTable {

    private DBApp dbApp;

    @BeforeEach
    void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testSelectFromTable() throws DBAppException {
        SQLTerm[] sqlTerms = new SQLTerm[]{new SQLTerm("SELECT * FROM test_table"), new SQLTerm("WHERE column_name > '0'")};
        String[] operators = new String[]{"=", ">", "<", "like"};
        Iterator<SQLTerm> iterator = dbApp.selectFromTable(sqlTerms, operators);
        assertTrue(iterator.hasNext());
    }

}