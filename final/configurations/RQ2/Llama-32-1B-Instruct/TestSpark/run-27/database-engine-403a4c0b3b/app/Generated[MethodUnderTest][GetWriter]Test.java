package app;

public class Generated[MethodUnderTest][GetWriter]

Test {

    @Test
    public void [MethodUnderTest][GetWriter]Test() {
        String[] sqlTerms = {"SELECT * FROM table1", "SELECT * FROM table2"};
        SQLTerm[] arrSQLTerms = new SQLTerm[sqlTerms.length];
        for (int i = 0; i < sqlTerms.length; i++) {
            arrSQLTerms[i] = new SQLTerm(sqlTerms[i]);
        }

        CsvWriter csvWriter = new CsvWriter();
        try {
            csvWriter.init();
            (csvWriter.getWriter().write(arrSQLTerms));
            // This should not throw an exception
        } catch (DBAppException e) {
            fail("Expected DBAppException");
        }
    }

}