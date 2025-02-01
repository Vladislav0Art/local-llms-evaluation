package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        CsvReader reader = mock(CsvReader.class);
        HashSet<String> expectedTables = new HashSet<>();
        expectedTables.add("table1");
        expectedTables.add("table2");
        when(reader.readAllTables()).thenReturn(expectedTables);
        dbApp.setReader(reader);
        dbApp.init();
        assertTrue(dbApp.getMyTables().equals(expectedTables));
    }

}