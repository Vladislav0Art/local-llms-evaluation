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
public class GeneratedCreateTableTest {

    @InjectMocks
    private app.DBApp dbApp;

    @Mock
    private app.CsvReader csvReader;

    @Mock
    private app.CsvWriter csvWriter;

    @Test
    public void createTableTest() throws app.DBApp.DBAppException, IOException {
        String tableName = "testTable";
        String clusteringKeyColumn = "testClusteringKey";
        java.util.Hashtable<String, String> htblColNameType = new java.util.Hashtable<>();
        htblColNameType.put("testColumn", "testType");
        java.util.Hashtable<String, String> htblColNameMin = new java.util.Hashtable<>();
        htblColNameMin.put("testColumn", "testMin");
        java.util.Hashtable<String, String> htblColNameMax = new java.util.Hashtable<>();
        htblColNameMax.put("testColumn", "testMax");
        dbApp.createTable(tableName, clusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        assertTrue(dbApp.getMyTables().contains(tableName));
    }

}