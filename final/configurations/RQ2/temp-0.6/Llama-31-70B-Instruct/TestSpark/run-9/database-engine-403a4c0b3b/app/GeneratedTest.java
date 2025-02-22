package app;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private DBApp dbApp;
    private CsvReader reader;
    private CsvWriter writer;

    @Before
    public void setup() {
        dbApp = new DBApp();
        reader = mock(CsvReader.class);
        writer = mock(CsvWriter.class);
        dbApp.getReader = reader;
        dbApp.getWriter = writer;
    }

    @Test
    public void testInit() throws DBAppException {
        HashSet<String> tables = new HashSet<>();
        when(reader.readAllTables()).thenReturn(tables);

        dbApp.init();

        assertEquals(tables, dbApp.getMyTables());
    }

}