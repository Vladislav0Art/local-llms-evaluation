package app;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> tables = new HashSet<>();
        when(dbApp.getMyTables()).thenReturn(tables);
        assertEquals(tables, dbApp.getMyTables());
    }

    @Test
    public void testGetReader() {
        CsvReader reader = new CsvReader();
        when(dbApp.getReader()).thenReturn(reader);
        assertEquals(reader, dbApp.getReader());
    }

    @Test
    public void testGetWriter() {
        CsvWriter writer = new CsvWriter();
        when(dbApp.getWriter()).thenReturn(writer);
        assertEquals(writer, dbApp.getWriter());
    }

    @Test
    public void testInit() {
        dbApp.init();
        assertNotNull(dbApp.getMyTables());
    }

}