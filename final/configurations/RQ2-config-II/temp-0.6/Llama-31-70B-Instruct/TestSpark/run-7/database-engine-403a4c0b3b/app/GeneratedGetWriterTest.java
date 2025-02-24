package app;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        CsvWriter expectedResult = new CsvWriter("test");
        when(dbApp.getWriter()).thenReturn(expectedResult);
        assertEquals(expectedResult, dbApp.getWriter());
    }

}