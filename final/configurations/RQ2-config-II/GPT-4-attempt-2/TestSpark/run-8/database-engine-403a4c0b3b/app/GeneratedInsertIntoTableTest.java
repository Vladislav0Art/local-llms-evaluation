package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInsertIntoTableTest {

    @Mock
    DBApp dbApp;

    @Test
    public void insertIntoTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.insertIntoTable("testTable", htblColNameValue);
        verify(dbApp, times(1)).insertIntoTable("testTable", htblColNameValue);
    }

}