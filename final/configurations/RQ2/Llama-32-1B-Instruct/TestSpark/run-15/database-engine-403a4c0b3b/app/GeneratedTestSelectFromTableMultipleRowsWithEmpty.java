package app;

public class GeneratedTestSelectFromTableMultipleRowsWithEmpty {

    @Test
    public void testSelectFromTableMultipleRowsWithEmpty() throws Exception {
        DBApp dbApp = new DBApp();

        // Arrange
        List<SQLTerm> sqlTerms = Arrays.asList(new SQLTerm("SELECT", new String[]{"column1"}, "value1")));
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        for (String column : new String[]{"column1"}) {
            htblColNameValue.put(column, "");
        }

        csvReader.setReader(new CSVReader(sqlTerms));

        // Act
        Iterator iterator = dbApp.selectFromTable(SQLTerm[].class, new String[]{"Table1", "Table2"});
        assertEquals(3, iterator.size());

        // Assert
        verify(csvReader).setReader(any(CSVReader.class));
    }

}