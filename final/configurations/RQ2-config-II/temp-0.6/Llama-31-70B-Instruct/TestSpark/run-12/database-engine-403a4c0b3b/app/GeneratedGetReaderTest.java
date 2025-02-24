package app;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class GeneratedGetReaderTest {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = Mockito.mock(DBApp.class);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getReaderTest() {
        CsvReader expectedReader = new CsvReader();
        Mockito.when(dbApp.getReader()).thenReturn(expectedReader);
        CsvReader actualReader = dbApp.getReader();
        assertEquals(expectedReader, actualReader);
    }

}