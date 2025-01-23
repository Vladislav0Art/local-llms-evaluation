package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetWriterTest_NoException_ReturnsCsvWriter {

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void getWriterTest_NoException_ReturnsCsvWriter() {
        when(dbApp.getWriter()).thenReturn(new Object() {
            public CsvWriter getWriter() {
                return new CsvWriter();
            }
        });
        Object obj = dbApp;
        CsvWriter result = ((Object) obj).getWriter();
        assertNotNull(result);
        verify(obj).getWriter();
    }

}