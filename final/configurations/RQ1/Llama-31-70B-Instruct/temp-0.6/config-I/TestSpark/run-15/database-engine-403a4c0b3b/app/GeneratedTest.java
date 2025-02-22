package app;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import com.opencsv.exceptions.CsvValidationException;

public class GeneratedTest {

    private DBApp dbApp;
    private CsvReader reader;
    private CsvWriter writer;

    @Before
    public void setup() {
        dbApp = new DBApp();
        reader = Mockito.mock(CsvReader.class);
        writer = Mockito.mock(CsvWriter.class);
    }

    @Test
    public void testInit() throws IOException, CsvValidationException {
        HashSet<String> tables = new HashSet<>(Arrays.asList("table1", "table2"));
        Mockito.when(reader.readAllTables()).thenReturn(tables);
        dbApp.init();
        assertEquals(tables, dbApp.getMyTables());
    }

}