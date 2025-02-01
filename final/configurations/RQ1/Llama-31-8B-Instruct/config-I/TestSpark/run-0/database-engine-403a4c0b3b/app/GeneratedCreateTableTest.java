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
    private DBApp dbApp;

    @Test
    public void createTableTest() throws DBAppException {
        String tableName = "testTable";
        String clusteringKeyColumn = "testClusteringKey";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("testColumn", "testType");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("testColumn", "testMin");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("testColumn", "testMax");
        dbApp.createTable(tableName, clusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        HashSet<String> tables = dbApp.getMyTables();
        assertTrue(tables.contains(tableName));
    }

}