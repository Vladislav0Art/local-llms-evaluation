package app;

import app.DBApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private DBApp dbApp;

    @Test
    public void getMyTablesTest() {
        HashSet<String> tables = new HashSet<>();
        tables.add("table1");
        tables.add("table2");
        when(dbApp.getMyTables()).thenReturn(tables);
        assertEquals(tables, dbApp.getMyTables());
    }

    @Test
    public void getReaderTest() {
        CsvReader reader = new CsvReader();
        when(dbApp.getReader()).thenReturn(reader);
        assertEquals(reader, dbApp.getReader());
    }

    @Test
    public void getWriterTest() {
        CsvWriter writer = new CsvWriter();
        when(dbApp.getWriter()).thenReturn(writer);
        assertEquals(writer, dbApp.getWriter());
    }

    @Test
    public void initTest() {
        dbApp.init();
        verify(dbApp).init();
    }

}