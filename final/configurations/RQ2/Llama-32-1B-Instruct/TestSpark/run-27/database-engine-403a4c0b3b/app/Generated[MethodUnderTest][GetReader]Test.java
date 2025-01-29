package app;

public class Generated[MethodUnderTest][GetReader]

Test {

    @Test
    public void [MethodUnderTest][GetReader]Test() {
        String[] sqlTerms = {"SELECT * FROM table1", "SELECT * FROM table2"};
        SQLTerm[] arrSQLTerms = new SQLTerm[sqlTerms.length];
        for (int i = 0; i < sqlTerms.length; i++) {
            arrSQLTerms[i] = new SQLTerm(sqlTerms[i]);
        }

        CsvReader csvReader = new CsvReader();
        try {
            csvReader.init();
            Iterator<CSVRow> rows = csvReader.getRows(arrSQLTerms);
            for (CSVRow row : rows) {
                assertNotNull(row);
            }
        } catch (DBAppException e) {
            fail("Expected DBAppException");
        }
    }

}