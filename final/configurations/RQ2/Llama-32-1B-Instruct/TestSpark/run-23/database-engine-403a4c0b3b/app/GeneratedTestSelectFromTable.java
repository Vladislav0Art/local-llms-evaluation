package app;

public class GeneratedTestSelectFromTable {

    @Test
    public void testSelectFromTable() {
        // Arrange
        String tableName = "Table7";
        SQLTerm[] arrSQLTerms = new String[][]{{"SELECT", "Column1, Column2"}};
        String[] strarrOperators = {"=}", "{=}"};

        // Act and Assert
        DBApp dbApp = new DBApp();
        List<Row> result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);

        assertTrue(result.size() > 0);
    }

}