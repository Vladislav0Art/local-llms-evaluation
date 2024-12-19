package app;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(MockitoJUnit4Class.class)
public class GeneratedTestInsertIntoTable {

    @Mock
    private IDatabase mockDatabase;

    public Database App() {
        return new DBApp();
    }

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void testInsertIntoTable() {
        String tableName = "testTable";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable(tableName, htblColNameValue);

        assertTrue(!tblColNameValue.isEmpty());
    }

}