package app;

public class GeneratedSelectFromTable_ReturnsNull_WhenSQLTermsArrayIsEmpty {

    @Test
    public void selectFromTable_ReturnsNull_WhenSQLTermsArrayIsEmpty() throws DBAppException {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        DBApp dbApp = new DBApp();
        Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertNull(result);
    }

}