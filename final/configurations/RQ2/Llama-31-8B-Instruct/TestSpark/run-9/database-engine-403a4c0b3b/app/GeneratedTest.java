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
        Object result = dbApp.getReader();
        assertNotNull(result);
    }

    @Test
    public void getWriterTest_NoException_ReturnsCsvWriter() {
        Object result = dbApp.getWriter();
        assertNotNull(result);
    }

    @Test
    public void initTest_NoException_NoExceptionThrown() {
        try {
            dbApp.init();
            verifyNoMoreInteractions(dbApp);
        } catch (Exception e) {
            fail("Exception was thrown unexpectedly");
        }
    }

    @Test
    public void createTableTest_ValidInput_NoExceptionThrown() {
        String strTableName = "table_name";
        String strClusteringKeyColumn = "clustering_key_column";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        try {
            dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
            verifyNoMoreInteractions(dbApp);
        } catch (Exception e) {
            fail("Exception was thrown unexpectedly");
        }
    }

}