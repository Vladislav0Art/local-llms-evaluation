package app;

public class GeneratedTestCreateTable {

    @Test
    public void testCreateTable() {
        // Arrange
        String tableName = "Table3";
        HashSet<String> expectedColumns = new HashSet<>();
        expectedColumns.add("Column1");
        expectedColumns.add("Column2");

        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("Column1", "Value1");
        htblColNameValue.put("Column2", "Value2");

        String clusteringKeyColumn = "ClusteringKeyValue";
        HashSet<String> expectedClusterByColumns = new HashSet<>();
        expectedClusterByColumns.add(clusteringKeyColumn);

        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("Column1", "MIN(Col1)");
        htblColNameMin.put("Column2", "MIN(Col2)");

        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("Column1", "MAX(Col1)");
        htblColNameMax.put("Column2", "MAX(Col2)");

        when(DBApp.createTable(tableName, clusteringKeyColumn, expectedColumns, htblColNameMin, htblColNameMax))
                .thenReturn(true);

        // Act
        DBApp dbApp = new DBApp();
        boolean result = dbApp.init();

        // Assert
        assertTrue(result);
    }

}