package app;

import app.DBApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetMyTablesTest {

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

}