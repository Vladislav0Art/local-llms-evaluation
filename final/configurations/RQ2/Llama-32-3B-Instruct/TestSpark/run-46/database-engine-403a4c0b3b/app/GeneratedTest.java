package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void testGetMyTables_EmptySet() {
        assertTrue(dbApp.getMyTables().isEmpty());
    }

    @Test
    public void testGetReader_ReaderCreated() throws IOException {
        CsvReader csvReader = Mockito.mock(CsvReader.class);
        Mockito.when(serializer.createCsvReader()).thenReturn(csvReader);
        assertEquals(csvReader, dbApp.getReader());
    }

    @Test
    public void testCreateTable_ValidParameters() {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblClusteringKeyColumn = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        dbApp.createTable("table1", "column1", htblColNameType, htblClusteringKeyColumn, htblColNameMin);
    }

    @Test
    public void testCreateTable_InvalidParameters() {
        DBAppException exception = assertThrows(DBAppException.class, () -> dbApp.createTable("table1", "column1", null, null, null));
        assertTrue(exception.getMessage().contains("Missing parameters"));
    }

    @Test
    public void testInsertIntoTable_ValidValues() throws ParseException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("value1", 10);
        dbApp.insertIntoTable("table1", htblColNameValue);
    }

    @Test
    public void testInsertIntoTable_InvalidValue() {
        DBAppException exception = assertThrows(DBAppException.class, () -> dbApp.insertIntoTable("table1", null));
        assertTrue(exception.getMessage().contains("Invalid value"));
    }

    @Test
    public void testUpdateTable_ValidValues() throws ParseException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("value2", 20);
        dbApp.updateTable("table1", "column2", htblColNameValue);
    }

    @Test
    public void testUpdateTable_InvalidValue() {
        DBAppException exception = assertThrows(DBAppException.class, () -> dbApp.updateTable("table1", null, null));
        assertTrue(exception.getMessage().contains("Invalid value"));
    }

    @Test
    public void testDeleteFromTable_ValidValues() throws ParseException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("value3", 30);
        dbApp.deleteFromTable("table1", htblColNameValue);
    }

    @Test
    public void testDeleteFromTable_InvalidValue() {
        DBAppException exception = assertThrows(DBAppException.class, () -> dbApp.deleteFromTable("table1", null));
        assertTrue(exception.getMessage().contains("Invalid value"));
    }

    @Test
    public void testSelectFromTable_ValidSQLTerms() throws DBAppException {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testSelectFromTable_InvalidSQLTerms() {
        DBAppException exception = assertThrows(DBAppException.class, () -> dbApp.selectFromTable(new SQLTerm[0], new String[0]));
        assertTrue(exception.getMessage().contains("Invalid SQL terms"));
    }

}