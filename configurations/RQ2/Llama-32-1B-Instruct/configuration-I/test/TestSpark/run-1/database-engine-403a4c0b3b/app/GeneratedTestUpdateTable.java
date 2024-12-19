package app;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(MockitoJUnit4Class.class)
public class GeneratedTestUpdateTable {

    @Mock
    private IDatabase mockDatabase;

    public Database App() {
        return new DBApp();
    }

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void testUpdateTable() {
        String tableName = "testTable";
        String strClusteringKeyValue = "value1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        DBApp dbApp = new DBApp();
        dbApp.updateTable(tableName, strClusteringKeyValue, htblColNameValue);

        assertTrue(!tblColNameValue.isEmpty());
    }

}