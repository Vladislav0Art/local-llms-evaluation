package app;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class GeneratedTest {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = Mockito.mock(DBApp.class);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getMyTablesTest() {
        HashSet<String> expectedTables = new HashSet<>();
        expectedTables.add("table1");
        expectedTables.add("table2");
        Mockito.when(dbApp.getMyTables()).thenReturn(expectedTables);
        HashSet<String> actualTables = dbApp.getMyTables();
        assertEquals(expectedTables, actualTables);
    }

    @Test
    public void getReaderTest() {
        CsvReader expectedReader = new CsvReader();
        Mockito.when(dbApp.getReader()).thenReturn(expectedReader);
        CsvReader actualReader = dbApp.getReader();
        assertEquals(expectedReader, actualReader);
    }

    @Test
    public void getWriterTest() {
        CsvWriter expectedWriter = new CsvWriter();
        Mockito.when(dbApp.getWriter()).thenReturn(expectedWriter);
        CsvWriter actualWriter = dbApp.getWriter();
        assertEquals(expectedWriter, actualWriter);
    }

    @Test
    public void initTest() {
        dbApp.init();
        verify(dbApp, times(1)).init();
    }

}