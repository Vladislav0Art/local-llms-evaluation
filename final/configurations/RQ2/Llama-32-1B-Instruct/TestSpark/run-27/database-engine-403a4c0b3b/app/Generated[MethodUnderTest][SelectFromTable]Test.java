package app;

public class Generated[MethodUnderTest][SelectFromTable]

Test {

    @Test
    public void [MethodUnderTest][SelectFromTable]Test() {
        SQLTerm[] arrSQLTerms = {"SELECT * FROM table6"};

        Iterator<CSVRow> rows = db.selectFromTable(arrSQLTerms, new String[]{"column1", "column2"});

        for (CSVRow row : rows) {
            assertNotNull(row);
        }
    }

}