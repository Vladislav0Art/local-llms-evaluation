package app;

public class GeneratedTestDeleteFromTable {

    @Test
    public void testDeleteFromTable() {
        // Arrange
        String tableName = "Table6";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        // Act and Assert
        DBApp dbApp = new DBApp();
        boolean result = dbApp.deleteFromTable(tableName, htblColNameValue);

        assertTrue(result);
    }

}