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
public class GeneratedGetMyTablesTest {

    @InjectMocks
    private DBApp dbApp;

    @Mock
    private CsvReader csvReader;

    @Mock
    private CsvWriter csvWriter;

    @Test
    public void getMyTablesTest() {
        HashSet<String> expected = new HashSet<>();
        when(csvReader.readAllTables()).thenReturn(expected);
        assertEquals(expected, dbApp.getMyTables());
    }

}