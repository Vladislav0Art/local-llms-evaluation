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
public class GeneratedGetReaderTest_NoException_ReturnsCsvReader {

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void getReaderTest_NoException_ReturnsCsvReader() {
        when(dbApp.getReader()).thenReturn(new Object() {
            public void read() {
            }

            public void close() {
            }
        });
        Object result = dbApp.getReader();
        assertNotNull(result);
        verify(dbApp).getReader();
    }

}