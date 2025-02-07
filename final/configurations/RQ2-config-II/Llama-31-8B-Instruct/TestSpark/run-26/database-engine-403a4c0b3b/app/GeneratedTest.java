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

    @Test
    public void getMyTablesTest_EmptyTables_ReturnsEmptySet() {
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.isEmpty());
    }

    @Test
    public void getMyTablesTest_NonEmptyTables_ReturnsNonEmptySet() {
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        expected.add("table2");
        when(dbApp.getReader()).thenReturn(new CsvReader());
        when(dbApp.getReader().getTables()).thenReturn(expected);
        HashSet<String> result = dbApp.getMyTables();
        assertEquals(expected, result);
    }

    @Test
    public void getReaderTest_NullReader_ThrowsNullPointerException() {
        try {
            dbApp.getReader();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void getWriterTest_NullWriter_ThrowsNullPointerException() {
        try {
            dbApp.getWriter();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void initTest_InitiatesDBApp() {
        dbApp.init();
        verify(dbApp, times(1)).getReader();
        verify(dbApp, times(1)).getWriter();
    }

    @Test
    public void createTableTest_ValidTableCreated() throws DBAppException {
        String tableName = "table1";
        String clusteringKeyColumn = "column1";
        Hashtable<String, String> colNameType = new Hashtable<>();
        colNameType.put("column1", "type1");
        Hashtable<String, String> colNameMin = new Hashtable<>();
        colNameMin.put("column1", "min1");
        Hashtable<String, String> colNameMax = new Hashtable<>();
        colNameMax.put("column1", "max1");
        dbApp.createTable(tableName, clusteringKeyColumn, colNameType, colNameMin, colNameMax);
        verify(dbApp, times(1)).getWriter();
    }

}