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
public class GeneratedGetReaderTest {

    @InjectMocks
    private app.DBApp dbApp;

    @Mock
    private app.CsvReader csvReader;

    @Mock
    private app.CsvWriter csvWriter;

    @Test
    public void getReaderTest() {
        assertNotNull(dbApp.getReader());
    }

}