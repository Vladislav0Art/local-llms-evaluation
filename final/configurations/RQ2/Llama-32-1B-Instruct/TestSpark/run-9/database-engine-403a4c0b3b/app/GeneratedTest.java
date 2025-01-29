package app;

public class GeneratedTest {

    @Test
    public void testGetMyTables() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertEquals(0, tables.size());
    }

    @Test
    public void testGetReader() {
        DBApp dbApp = new DBApp();
        CSVReader reader = dbApp.getReader();
        try (CSVReader csvReader = new CSVReader(reader)) {
            List<String[]> rows = csvReader.readNext();
            assertEquals(0, rows.size());
        } catch (IOException e) {
            fail("IO exception expected");
        }
    }

    @Test
    public void testGetWriter() {
        DBApp dbApp = new DBApp();
        CSVWriter writer = dbApp.getWriter();
        try (CSVWriter csvWriter = new CSVWriter(writer)) {
            String[] row = {"column1", "column2"};
            csvWriter.writeNext(row);
            assertEquals(0, csvWriter.close().getWritten());
        } catch (IOException e) {
            fail("IO exception expected");
        }
    }

    @Test
    public void testInit() {
        DBApp dbApp = new DBApp();
        // no assertions
    }

    @Test
    public void testCreateTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        createTable("my_table", "column1", new Hashtable<String, String>(), null, new Hashtable<String, String>());
        List<SQLTerm> terms = selectFromTable(new SQLTerm[]{"SELECT", "*", "FROM", "my_table"}, new String[]{"OR"});
        Iterator iterator = terms.iterator();
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.insertIntoTable("my_table", htblColNameValue);
        // no assertions
    }

    @Test
    public void testUpdateTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.updateTable("my_table", "column1", htblColNameValue);
        // no assertions
    }

    @Test
    public void testDeleteFromTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.deleteFromTable("my_table", htblColNameValue);
        // no assertions
    }

    @Test
    public void testSelectFromTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.insertIntoTable("my_table", htblColNameValue);
        SQLTerm[] terms = selectFromTable(new SQLTerm[]{"SELECT", "*", "FROM", "my_table"}, new String[]{"OR"});
        Iterator iterator = terms.iterator();
        assertTrue(iterator.hasNext());
    }

}