package app;

public class GeneratedTest {

    @Test
    public void testGetMyTables() {
        // Arrange
        HashSet<String> expected = new HashSet<>();
        expected.add("Table1");
        expected.add("Table2");

        // Act
        HashSet<String> actual = DBApp.getMyTables();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testGetReader() {
        // Arrange
        CSVReader csvReaderMock = mock(CsvReader.class);
        when(csvReaderMock.read()).thenReturn(new ArrayList<>());

        // Act
        CSVReader reader = new DBApp().getReader();

        // Assert
        verify(csvReaderMock).read();
        assertNotSame(reader, csvReaderMock);
    }

    @Test
    public void testGetWriter() {
        // Arrange
        CSVWriter csvWriterMock = mock(CsvWriter.class);

        // Act
        CSVWriter writer = new DBApp().getWriter();

        // Assert
        verify(csvWriterMock).write();
        assertNotSame(writer, csvWriterMock);
    }

    @Test
    public void testInit() {
        // Arrange
        Set<SqlTerm> expected = new HashSet<>();
        expected.add(new SQLTerm("SELECT", new String[]{"Table1", "Table2"}, null));
        expected.add(new SQLTerm("INSERT INTO Table1 (Column1, Column2)", new Object[]{new HashMap<>()}, new HashMap<>()));
        // MockDBApp.getInit() with an empty set
        when(DBApp.getDbAppInstance().getInit()).thenReturn(expected);

        // Act and Assert
        Set<SqlTerm> actual = DBApp.getDbAppInstance().init();

        assertEquals(expected, actual);
    }

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

    @Test
    public void testUpdateTable() {
        // Arrange
        String tableName = "Table5";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        // Act and Assert
        DBApp dbApp = new DBApp();
        boolean result = dbApp.updateTable(tableName, null, htblColNameValue);

        assertTrue(result);
    }

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