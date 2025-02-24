package app;

import app.DBApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetWriterTest {

    @Mock
    private DBApp dbApp;

    @Test
    public void getWriterTest() {
        CsvWriter writer = new CsvWriter();
        when(dbApp.getWriter()).thenReturn(writer);
        assertEquals(writer, dbApp.getWriter());
    }

}