package app;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        CsvReader expectedResult = new CsvReader("test");
        when(dbApp.getReader()).thenReturn(expectedResult);
        assertEquals(expectedResult, dbApp.getReader());
    }

}