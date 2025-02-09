package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTableTest {

    @Mock
    DBApp dbApp;

    @Test
    public void createTableTest() throws DBAppException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        dbApp.createTable("testTable", "clusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
        verify(dbApp, times(1))
                .createTable("testTable", "clusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
    }

}