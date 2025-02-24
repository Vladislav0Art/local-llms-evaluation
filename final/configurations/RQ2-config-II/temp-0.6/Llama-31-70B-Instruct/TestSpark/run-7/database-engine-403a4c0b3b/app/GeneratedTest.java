package app;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> expectedResult = new HashSet<>();
        assertEquals(expectedResult, dbApp.getMyTables());
    }

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        CsvReader expectedResult = new CsvReader("test");
        when(dbApp.getReader()).thenReturn(expectedResult);
        assertEquals(expectedResult, dbApp.getReader());
    }

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        CsvWriter expectedResult = new CsvWriter("test");
        when(dbApp.getWriter()).thenReturn(expectedResult);
        assertEquals(expectedResult, dbApp.getWriter());
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

}