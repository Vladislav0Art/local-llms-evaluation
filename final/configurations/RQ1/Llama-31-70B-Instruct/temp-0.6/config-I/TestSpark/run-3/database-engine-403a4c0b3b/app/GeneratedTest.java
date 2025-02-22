package app;

import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    private DBApp dbApp;
    private CsvReader reader;
    private CsvWriter writer;

    @Before
    public void setUp() {
        dbApp = new DBApp();
        reader = Mockito.mock(CsvReader.class);
        writer = Mockito.mock(CsvWriter.class);
    }

    @Test
    public void testInit() {
        Mockito.when(reader.readAllTables()).thenReturn(new HashSet<>());
        dbApp.init();
        assertTrue(dbApp.getMyTables().isEmpty());
    }

    @Test
    public void testCreateTable() throws DBAppException {
        String strTableName = "test";
        String strClusteringKeyColumn = "test";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        assertTrue(dbApp.getMyTables().contains(strTableName));
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        String strTableName = "test";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.insertIntoTable(strTableName, htblColNameValue);
        assertTrue(dbApp.getMyTables().contains(strTableName));
    }

}