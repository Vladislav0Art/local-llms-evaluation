package app;

public class GeneratedDeleteFromTable {

    @Test
    public void deleteFromTable() {
        DBApp dbApp = new DBApp();
        String[] testArrSQLTerms = {"SELECT * FROM Table1"};
        SQLTerm[] sqlTerms = Arrays.asList(testArrSQLTerms);
        when(this.getDBApp().deleteFromTable(testStr[0], testArrSQLTerms)).thenReturn(true);
        assertDeleteFromTable();
    }

}