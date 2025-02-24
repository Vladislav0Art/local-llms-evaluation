package app;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class GeneratedGetWriterTest {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = Mockito.mock(DBApp.class);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getWriterTest() {
        CsvWriter expectedWriter = new CsvWriter();
        Mockito.when(dbApp.getWriter()).thenReturn(expectedWriter);
        CsvWriter actualWriter = dbApp.getWriter();
        assertEquals(expectedWriter, actualWriter);
    }

}