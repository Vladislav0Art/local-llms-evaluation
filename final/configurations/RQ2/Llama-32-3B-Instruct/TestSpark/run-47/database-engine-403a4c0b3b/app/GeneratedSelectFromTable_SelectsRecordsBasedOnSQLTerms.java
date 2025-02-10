package app;

public class GeneratedSelectFromTable_SelectsRecordsBasedOnSQLTerms {

    @Test
    public void selectFromTable_SelectsRecordsBasedOnSQLTerms() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[]{"AND"};
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}