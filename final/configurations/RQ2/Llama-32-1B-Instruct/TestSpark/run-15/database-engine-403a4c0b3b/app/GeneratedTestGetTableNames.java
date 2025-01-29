package app;

public class GeneratedTestGetTableNames {

    @Test
    public void testGetTableNames() {
        DBApp dbApp = new DBApp();
        String[][] tableNames = {{"Table1", "Table2"}, {"Table3", "Table4"}};
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        for (String tableName : tableNames) {
            htblColNameValue.put(tableName[0], tableName);
        }

        // Act
        Iterator iterator = dbApp.selectFromTable(SQLTerm[].class, new String[]{"Table1", "Table2"});
        assertEquals(2, iterator.size());

        // Assert
        verify(csvReader).setReader(any(CSVReader.class));
    }

}