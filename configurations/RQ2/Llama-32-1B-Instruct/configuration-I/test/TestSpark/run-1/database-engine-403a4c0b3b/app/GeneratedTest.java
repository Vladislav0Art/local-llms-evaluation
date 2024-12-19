package app;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(MockitoJUnit4Class.class)
public class GeneratedTest {

    @Mock
    private IDatabase mockDatabase;

    public Database App() {
        return new DBApp();
    }

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void testGetMyTables() {
        HashSet<String> myTables = new HashSet<>();
        myTables.add("table1");
        myTables.add("table2");
        when(mockDatabase.getMyTables()).thenReturn(myTables);
        assertEquals(2, dbApp.getMyTables().size());
    }

    @Test
    public void testGetReader() {
        CSVReader csvReader = new CSVReader();
        csvReader.setTableName("testTable");
        csvReader.setClusterKeyColumn("clusterKey");
        csvReader.setColNameType(Arrays.asList("string", "int"));
        csvReader.setColNameMin(Arrays.asList("null", null));
        csvReader.setColNameMax(Arrays.asList(null, 1000));
        when(mockDatabase.getReader()).thenReturn(csvReader);
        DBApp dbApp = new DBApp();
        assertEquals(csvReader, dbApp.getReader());
    }

    @Test
    public void testGetWriter() {
        CSVWriter csvWriter = new CSVWriter();
        csvWriter.setTableName("testTable");
        csvWriter.setClusterKeyColumn("clusterKey");
        csvWriter.setColNameType(Arrays.asList("string", "int"));
        csvWriter.setColNameMin(Arrays.asList("null", null));
        csvWriter.setColNameMax(Arrays.asList(null, 1000));
        when(mockDatabase.getWriter()).thenReturn(csvWriter);
        DBApp dbApp = new DBApp();
        assertEquals(csvWriter, dbApp.getWriter());
    }

    @Test
    public void testInit() {
        assertTrue(dbApp instanceof IDatabase);
    }

    @Test
    public void testCreateTable() {
        String tableName = "testTable";
        String strClusteringKeyColumn = "clusterKey";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("string", "name");
        htblColNameType.put("int", "age");

        DBApp dbApp = new DBApp();
        boolean success = dbApp.createTable(tableName, strClusteringKeyColumn, htblColNameType,
                htblColNameType.get("string"), htblColNameType.get("int"));
        assertTrue(success);
    }

    @Test
    public void testInsertIntoTable() {
        String tableName = "testTable";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable(tableName, htblColNameValue);

        assertTrue(!tblColNameValue.isEmpty());
    }

    @Test
    public void testUpdateTable() {
        String tableName = "testTable";
        String strClusteringKeyValue = "value1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        DBApp dbApp = new DBApp();
        dbApp.updateTable(tableName, strClusteringKeyValue, htblColNameValue);

        assertTrue(!tblColNameValue.isEmpty());
    }

    @Test
    public void testDeleteFromTable() {
        String tableName = "testTable";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable(tableName, htblColNameValue);

        assertTrue(!tblColNameValue.isEmpty());
    }

    @Test
    public void testSelectFromTable() {
        SQLTerm[] arrSQLTerms = {new SQLTerm("SELECT * FROM table"), new SQLTerm("WHERE column = 'value'")};
        String[] strarrOperators = {"AND", "OR"};

        DBApp dbApp = new DBApp();

        Iterator<String> iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertTrue(iterator.hasNext());
    }

}