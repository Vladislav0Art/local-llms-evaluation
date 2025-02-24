package app;

import app.DBApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetReaderTest {

    @Mock
    private DBApp dbApp;

    @Test
    public void getReaderTest() {
        CsvReader reader = new CsvReader();
        when(dbApp.getReader()).thenReturn(reader);
        assertEquals(reader, dbApp.getReader());
    }

}