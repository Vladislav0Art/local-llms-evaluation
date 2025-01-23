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
public class GeneratedInitTest_InitiatesDBApp {

    @InjectMocks
    private DBApp dbApp;

    @Mock
    private CsvReader csvReader;

    @Mock
    private CsvWriter csvWriter;

    @Test
    public void initTest_InitiatesDBApp() {
        when(dbApp.getReader()).thenReturn(csvReader);
        when(dbApp.getWriter()).thenReturn(csvWriter);
        dbApp.init();
        verify(dbApp, times(1)).getReader();
        verify(dbApp, times(1)).getWriter();
    }

}