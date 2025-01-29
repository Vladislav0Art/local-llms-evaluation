package app;

public class GeneratedTest {

    private DBApp dbApp;
    private Validator validator;

    @Before
    public void setup() {
        dbApp = new DBApp();
        validator = new Validator();
    }

    @Test
    public void testGetMyTables() throws DBAppException, CsvValidationException {
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
        assertEquals(5, tables.size());
    }

    @Test
    public void testGetReader() throws IOException {
        CSVReader reader = new CSVReader();
        String[] rows = {"Row1", "Row2", "Row3"};
        reader.init(reader);
        List<Map<String, Object>> data = new ArrayList<>();
        for (String row : rows) {
            Map<String, Object> map = new HashMap<>();
            map.put("Name", row);
            data.add(map);
        }
        CSVReader csvReader = new CSVReader();
        dbApp.getReader().add(csvReader);
        assertNotNull(dbApp.getReader());
    }

    @Test
    public void testGetWriter() throws IOException {
        CSVWriter writer = new CSVWriter();
        String[] rows = {"Row1", "Row2", "Row3"};
        writer.init(writer);
        List<Map<String, Object>> data = new ArrayList<>();
        for (String row : rows) {
            Map<String, Object> map = new HashMap<>();
            map.put("Name", row);
            data.add(map);
        }
        CSVWriter csvWriter = new CSVWriter();
        dbApp.getWriter().add(csvWriter);
        assertNotNull(dbApp.getWriter());
    }

    @Test
    public void testInit() {
        dbApp.init();
        assertFalse(dbApp.isInitialized());
    }

    @Test
    public void testCreateTable() throws DBAppException, CsvValidationException {
        HashSet<String> tables = new HashSet<>();
        tables.add("Table1");
        tables.add("Table2");
        dbApp.createTable("Table1", "Column1", null, null, null);
        assertTrue(dbApp.getMyTables().containsAll(tables));
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        dbApp.insertIntoTable("Table1", new Hashtable<String, Object>() {{
            put("Name", "John");
            put("Age", 30);
        }});
        assertTrue(dbApp.getReader().selectFromTable(new String[]{"Name", "Age"}, new String[]{"=", ">"}) == null);
    }

    @Test
    public void testUpdateTable() throws DBAppException {
        dbApp.updateTable("Table1", "Column1", new Hashtable<String, Object>() {{
            put("Value", 31);
        }});
        assertTrue(dbApp.getReader().selectFromTable(new String[]{"Column1"}, new String[]{"="}) == null);
    }

    @Test
    public void testDeleteFromTable() throws DBAppException {
        dbApp.deleteFromTable("Table1", new Hashtable<String, Object>() {{
            put("Name", "John");
            put("Age", 30);
        }});
        assertTrue(dbApp.getReader().selectFromTable(new String[]{"Name", "Age"}, new String[]{"="}) == null);
    }

    @Test
    public void testSelectFromTable() {
        dbApp.init();
        SQLTerm[] sqlTerms = {new SQLTerm("SELECT * FROM Table1"), new SQLTerm("FROM Table2")};
        Iterator iterator = dbApp.selectFromTable(sqlTerms, new String[]{"=1", ">2"});
        assertTrue(iterator.hasNext());
    }

    @After
    public void tearDown() {
        dbApp.init();
    }

}