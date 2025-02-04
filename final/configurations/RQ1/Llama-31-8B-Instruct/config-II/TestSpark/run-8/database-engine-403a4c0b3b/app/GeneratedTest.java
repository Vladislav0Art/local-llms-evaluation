package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private DBApp dbApp;

    @Mock
    private CsvReader csvReader;

    @Mock
    private CsvWriter csvWriter;

    @Test
    public void getMyTablesTest() {
        HashSet<String> expected = new HashSet<>();
        when(csvReader.readAllTables()).thenReturn(expected);
        assertEquals(expected, dbApp.getMyTables());
    }

    @Test
    public void getReaderTest() {
        assertNotNull(dbApp.getReader());
    }

    @Test
    public void getWriterTest() {
        assertNotNull(dbApp.getWriter());
    }

    @Test
    public void initTest() {
        HashSet<String> expected = new HashSet<>();
        when(csvReader.readAllTables()).thenReturn(expected);
        dbApp.init();
        assertEquals(expected, dbApp.getMyTables());
    }

    @Test
    public void createTableTest() throws DBAppException, IOException {
        String tableName = "testTable";
        String clusteringKeyColumn = "testClusteringKey";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("testColumn", "testType");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("testColumn", "testMin");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("testColumn", "testMax");
        dbApp.createTable(tableName, clusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        assertTrue(dbApp.getMyTables().contains(tableName));
    }

}