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
public class GeneratedGetMyTablesTest_EmptyTables_ReturnsEmptySet {

    @InjectMocks
    private DBApp dbApp;

    @Mock
    private CsvReader csvReader;

    @Mock
    private CsvWriter csvWriter;

    @Test
    public void getMyTablesTest_EmptyTables_ReturnsEmptySet() {
        when(dbApp.getReader()).thenReturn(csvReader);
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.isEmpty());
    }

}