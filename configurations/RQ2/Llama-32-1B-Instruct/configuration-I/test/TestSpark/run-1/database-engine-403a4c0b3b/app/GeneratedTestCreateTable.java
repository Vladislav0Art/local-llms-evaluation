package app;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(MockitoJUnit4Class.class)
public class GeneratedTestCreateTable {

    @Mock
    private IDatabase mockDatabase;

    public Database App() {
        return new DBApp();
    }

    @InjectMocks
    private DBApp dbApp;

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

}