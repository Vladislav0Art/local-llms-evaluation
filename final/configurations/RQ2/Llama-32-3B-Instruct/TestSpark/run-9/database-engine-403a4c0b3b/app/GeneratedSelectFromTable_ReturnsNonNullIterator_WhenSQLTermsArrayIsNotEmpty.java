package app;

public class GeneratedSelectFromTable_ReturnsNonNullIterator_WhenSQLTermsArrayIsNotEmpty {

    @Test
    public void selectFromTable_ReturnsNonNullIterator_WhenSQLTermsArrayIsNotEmpty() throws DBAppException {
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        String[] strarrOperators = new String[0];
        DBApp dbApp = new DBApp();
        Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertNotNull(result);
    }

}