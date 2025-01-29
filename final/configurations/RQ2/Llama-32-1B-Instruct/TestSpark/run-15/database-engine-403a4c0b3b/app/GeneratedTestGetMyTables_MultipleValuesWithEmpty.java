package app;

public class GeneratedTestGetMyTables_MultipleValuesWithEmpty {

    @Test
    public void testGetMyTables_MultipleValuesWithEmpty() throws Exception {
        // Setup
        String[][] tableNames = {{"Table1", "Table2"}, {"Table3", "Table4"}};
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        // Arrange
        csvReader.setReader(new CSVReader(tableNames));

        // Act
        HashSet<String> result = dbApp.getMyTables();
        assertEquals(3, result.size());

        // Assert
        verify(csvReader).setReader(any(CSVReader.class));
    }

}