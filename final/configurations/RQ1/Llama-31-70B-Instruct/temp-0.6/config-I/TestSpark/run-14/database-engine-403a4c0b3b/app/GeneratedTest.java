package app;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Mock
    private CsvReader reader;

    @Mock
    private CsvWriter writer;

    @Mock
    private Table table;

    @Mock
    private Selector selector;

    private DBApp dbApp;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        dbApp = new DBApp();
    }

    @Test
    public void testInit() throws IOException {
        HashSet<String> tables = new HashSet<>(Arrays.asList("table1", "table2"));
        when(reader.readAllTables()).thenReturn(tables);

        dbApp.init();

        verify(reader).readAllTables();
        assertEquals(tables, dbApp.getMyTables());
    }

}