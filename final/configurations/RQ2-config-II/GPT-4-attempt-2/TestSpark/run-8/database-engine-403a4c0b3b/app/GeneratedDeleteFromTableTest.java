package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDeleteFromTableTest {

    @Mock
    DBApp dbApp;

    @Test
    public void deleteFromTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.deleteFromTable("testTable", htblColNameValue);
        verify(dbApp, times(1)).deleteFromTable("testTable", htblColNameValue);
    }

}