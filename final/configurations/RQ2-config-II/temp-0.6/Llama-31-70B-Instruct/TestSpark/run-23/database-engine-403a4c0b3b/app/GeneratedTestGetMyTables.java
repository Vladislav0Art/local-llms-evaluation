package app;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestGetMyTables {

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

}