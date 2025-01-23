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
    public void getMyTablesTest_EmptyTables_ReturnsEmptyHashSet() {
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.isEmpty());
    }

    @Test
    public void getReaderTest_NoException_ReturnsCsvReader() {
        CsvReader result = mock(CsvReader.class);
        when(dbApp.getReader()).thenReturn(result);
        CsvReader actual = dbApp.getReader();
        assertEquals(result, actual);
    }

    @Test
    public void getWriterTest_NoException_ReturnsCsvWriter() {
        CsvWriter result = mock(CsvWriter.class);
        when(dbApp.getWriter()).thenReturn(result);
        CsvWriter actual = dbApp.getWriter();
        assertEquals(result, actual);
    }

    @Test
    public void initTest_NoException_NoExceptionThrown() {
        dbApp.init();
        verifyNoMoreInteractions(dbApp);
    }

    @Test
    public void createTableTest_ValidInput_NoExceptionThrown() {
        String strTableName = "table_name";
        String strClusteringKeyColumn = "clustering_key_column";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        verifyNoMoreInteractions(dbApp);
    }

}