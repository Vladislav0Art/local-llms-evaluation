package app;

public class GeneratedTest {

    private DBApp dbApp;

    @BeforeEach
    void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> tables = dbApp.getMyTables();
        assertEquals(3, tables.size());
    }

    @Test
    public void testGetReader() {
        CsvReader csvReader = dbApp.getReader();
        assertTrue(csvReader instanceof DBAppCsvReader);
    }

    @Test
    public void testGetWriter() {
        CsvWriter csvWriter = dbApp.getWriter();
        assertTrue(csvWriter instanceof DBAppCsvWriter);
    }

    @Test
    public void testInit() {
        // No-op
    }

    @Test
    public void testCreateTable() throws DBAppException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("column_name", "type");
        dbApp.init();
        dbApp.createTable("test_table", "column_name", htblColNameType, null, null);
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("value", "string_value");
        dbApp.init();
        dbApp.insertIntoTable("test_table", htblColNameValue);
    }

    @Test
    public void testUpdateTable() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("value", "string_value");
        dbApp.init();
        dbApp.updateTable("test_table", "column_name", htblColNameValue);
    }

    @Test
    public void testDeleteFromTable() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.init();
        dbApp.deleteFromTable("test_table", htblColNameValue);
    }

    @Test
    public void testSelectFromTable() throws DBAppException {
        SQLTerm[] sqlTerms = new SQLTerm[]{new SQLTerm("SELECT * FROM test_table"), new SQLTerm("WHERE column_name > '0'")};
        String[] operators = new String[]{"=", ">", "<", "like"};
        Iterator<SQLTerm> iterator = dbApp.selectFromTable(sqlTerms, operators);
        assertTrue(iterator.hasNext());
    }

}