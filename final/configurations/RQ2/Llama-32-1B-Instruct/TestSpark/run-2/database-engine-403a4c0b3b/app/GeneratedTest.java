package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testGetMyTables() {
        HashSet<String> result = new HashSet<>();
        when(DBApp.getValidator().getDatabaseName()).thenReturn("myDatabase");
        when(DBApp gettingStorage().getDatabaseId()).thenReturn("myDatabaseId");

        DBApp dbApp = new DBApp();
        dbApp.setMyTables(new HashSet<>(Arrays.asList("table1", "table2")));

        verify(DBApp.getValidator()).getDatabaseName();
        verify(DBApp.getStorage()).getDatabaseId();

        assertEquals(2, result.size());

        verifyAll();

        when(DBApp gettingSerializer().getFilePath()).thenReturn("/path/to/file.txt");

        dbApp.init();
    }

    @Test
    public void testGetReader() {
        DBApp csvReader = new DBApp();
        DBApp csvWriter = new DBApp();

        CSVReader csvReader = new CSVReader("test.csv", "test.column");
        csvReader.openCSV(new File("test.csv"));

        when(csvReader.getTableName()).thenReturn("testTable");

        assertNotThrows(CsvValidationException);
        assertSame("testTable", csvReader.getTableName());

        csvReader.close();

        csvWriter = new DBApp();
        csvWriter.setStorage(gettingStorage());
        csvWriter.openCSV(new File("/path/to/file.csv"));
        csvWriter.setValidator(gettingValidator());

        when(csvWriter.getTableName()).thenReturn("testTable");

        assertNotThrows(CsvValidationException);
        assertSame("testTable", csvWriter.getTableName());

        csvWriter.close();
    }

    @Test
    public void testInit() {
        DBApp dbApp = new DBApp();

        verify(DBApp.getValidator()).init();
        verify(DBApp gettingSerializer()).init();
    }

    @Test
    public void testCreateTable() throws DBAppException {
        HashSet<String> result = new HashSet<>();
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", null, null, null, null);

        verify(DBApp.getValidator()).getDatabaseName();
        verify(DBApp gettingSerializer()).createTable("testTable", null, null, null, null);
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("testTable", null);

        verify(DBApp.getValidator()).getDatabaseName();
        verify(DBApp gettingStorage()).insertIntoTable("testTable", null);
    }

    @Test
    public void testUpdateTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.updateTable("testTable", null, null);

        verify(DBApp.getValidator()).getDatabaseName();
        verify(DBApp gettingStorage()).updateTable("testTable", null, null);
    }

    @Test
    public void testDeleteFromTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("testTable", null);

        verify(DBApp.getValidator()).getDatabaseName();
        verify(DBApp gettingStorage()).deleteFromTable("testTable", null);
    }

    @Test
    public void testSelectFromTable() throws DBAppException {
        String tableName = "testTable";
        HashSet<String> values = new HashSet<>();
        values.add("value1");
        values.add("value2");

        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = {"eq", "neq"};

        dbApp.selectFromTable(arrSQLTerms, strarrOperators);

        verify(DBApp.getValidator()).getDatabaseName();
        verify(DBApp gettingStorage()).selectFromTable(arrSQLTerms, strarrOperators);
    }

}