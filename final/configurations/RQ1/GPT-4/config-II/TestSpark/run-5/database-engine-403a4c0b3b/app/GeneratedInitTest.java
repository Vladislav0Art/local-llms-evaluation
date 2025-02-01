package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CsvReader mockReader = Mockito.mock(CsvReader.class);
        when(mockReader.readAllTables()).thenReturn(new HashSet<>());

        DBApp app = new DBApp();
        app.setReader(mockReader);
        app.init();

        verify(mockReader, times(1)).readAllTables();
        assertTrue(app.getMyTables().isEmpty());
    }

}