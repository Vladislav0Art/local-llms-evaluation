package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUpdateTableTest {

    @Mock
    DBApp dbApp;

    @Test
    public void updateTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.updateTable("testTable", "clusteringKeyValue", htblColNameValue);
        verify(dbApp, times(1)).updateTable("testTable", "clusteringKeyValue", htblColNameValue);
    }

}