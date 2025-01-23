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
public class GeneratedGetMyTablesTest_FilledTables_ReturnsFilledSet {

    @InjectMocks
    private DBApp dbApp;

    @Mock
    private CsvReader csvReader;

    @Mock
    private CsvWriter csvWriter;

    @Test
    public void getMyTablesTest_FilledTables_ReturnsFilledSet() {
        when(dbApp.getReader()).thenReturn(csvReader);
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        expected.add("table2");
        when(csvReader.getTables()).thenReturn(expected);
        HashSet<String> result = dbApp.getMyTables();
        assertEquals(expected, result);
    }

}