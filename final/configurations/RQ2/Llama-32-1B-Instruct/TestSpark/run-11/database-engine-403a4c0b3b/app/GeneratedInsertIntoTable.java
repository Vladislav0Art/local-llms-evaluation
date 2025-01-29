package app;

public class GeneratedInsertIntoTable {

    @Test
    public void insertIntoTable() {
        DBApp dbApp = new DBApp();
        String[] testArrSQLTerms = {"SELECT * FROM Table1"};
        SQLTerm[] sqlTerms = Arrays.asList(testArrSQLTerms);
        String strarrOperators = {"= ", ">", "<", ">=", "<="};
        when(this.getDBApp().insertIntoTable(testStr[0], testArrSQLTerms)).thenReturn(true);
        assertInsertIntoTable();
    }

}