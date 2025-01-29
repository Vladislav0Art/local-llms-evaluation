package app;

public class GeneratedTestInsertIntoTable {

    @Test
    public void testInsertIntoTable() {
        // Arrange
        String tableName = "Table4";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        // Act
        DBApp insertMethod = new DBApp();
        List<Row> result = insertMethod.insertIntoTable(tableName, htblColNameValue);

        // Assert
        assertEquals(1, result.size());
    }

}