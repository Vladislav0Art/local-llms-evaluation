package app;

public class GeneratedTestGetMyTables_InvalidTable {

    @Test
    public void testGetMyTables_InvalidTable() throws Exception {
        // Setup
        String[][] tableNames = {{"Table1", "Table2"}};
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        // Arrange
        csvReader.setReader(new CSVReader(tableNames));

        // Act
        try {
            dbApp.getMyTables();
            fail("Expected DBAppException");
        } catch (DBAppException e) {
        }

        // Assert
        verify(csvReader).setReader(any(CSVReader.class));
    }

}