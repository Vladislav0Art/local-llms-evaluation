package app;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class GeneratedGetMyTablesTest {

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

}