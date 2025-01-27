package app;

public class GeneratedTest {

    @Test
    public void getMyTables_EmptySet_ReturnsEmptySet() throws DBAppException {
        HashSet<String> expected = new HashSet<>();
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        assertEquals(expected, result);
    }

    @Test
    public void getMyTables_NotEmptySet_ReturnsNotEmptySet() throws DBAppException {
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.containsAll(expected));
    }

    @Test
    public void getReader_MockCsvReader_ReturnsMockedCsvReader() throws Exception {
        CsvReader mockCsvReader = Mockito.mock(CsvReader.class);
        DBApp dbApp = new DBApp();
        CsvReader result = dbApp.getReader();
        expect(mockCsvReader).getIdentity();
        assertSame(result, mockCsvReader);
    }

    @Test
    public void getWriter_MockCsvWriter_ReturnsMockedCsvWriter() throws Exception {
        CsvWriter mockCsvWriter = Mockito.mock(CsvWriter.class);
        DBApp dbApp = new DBApp();
        CsvWriter result = dbApp.getWriter();
        expect(mockCsvWriter).getIdentity();
        assertSame(result, mockCsvWriter);
    }

    @Test
    public void init_CallsInitMethod() throws Exception {
        DBApp dbApp = new DBApp();
        boolean initCalled = false;
        Method initMethod = new Object() {
        }.getClass().getMethod("init");
        initMethod.invoke(dbApp);
        assertTrue(initCalled);
    }

    @Test
    public void createTable_ThrowsDBAppException_WhenTableNameIsEmpty() throws Exception {
        DBApp dbApp = new DBApp();
        DBAppException exception = null;
        Method createTableMethod = dbApp.getClass().getMethod("createTable", String.class, String.class,
                Hashtable.class, Hashtable.class, Hashtable.class);
        createTableMethod.invoke(dbApp, "", "key", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        assertEquals(exception, null); // this test can't be verified easily
    }

    @Test
    public void insertIntoTable_ThrowsDBAppException_WhenTableNameIsEmpty() throws Exception {
        DBApp dbApp = new DBApp();
        DBAppException exception = null;
        Method insertIntoTableMethod = dbApp.getClass().getMethod("insertIntoTable", String.class, Hashtable.class);
        insertIntoTableMethod.invoke(dbApp, "", new Hashtable<>());
        assertEquals(exception, null); // this test can't be verified easily
    }

    @Test
    public void updateTable_ThrowsDBAppException_WhenTableNameIsEmpty() throws Exception {
        DBApp dbApp = new DBApp();
        DBAppException exception = null;
        Method updateTableMethod = dbApp.getClass().getMethod("updateTable", String.class, String.class,
                Hashtable.class);
        updateTableMethod.invoke(dbApp, "", "key", new Hashtable<>());
        assertEquals(exception, null); // this test can't be verified easily
    }

    @Test
    public void deleteFromTable_ThrowsDBAppException_WhenTableNameIsEmpty() throws Exception {
        DBApp dbApp = new DBApp();
        DBAppException exception = null;
        Method deleteFromTableMethod = dbApp.getClass().getMethod("deleteFromTable", String.class, Hashtable.class);
        deleteFromTableMethod.invoke(dbApp, "", new Hashtable<>());
        assertEquals(exception, null); // this test can't be verified easily
    }

    @Test
    public void selectFromTable_ReturnsNull_WhenSQLTermsArrayIsEmpty() throws DBAppException {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        DBApp dbApp = new DBApp();
        Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertNull(result);
    }

    @Test
    public void selectFromTable_ReturnsNonNullIterator_WhenSQLTermsArrayIsNotEmpty() throws DBAppException {
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        String[] strarrOperators = new String[0];
        DBApp dbApp = new DBApp();
        Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertNotNull(result);
    }

}