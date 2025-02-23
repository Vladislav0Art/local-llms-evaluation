package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class GeneratedTestGetMyTables {

    @Mock
    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = mock(DBApp.class);
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> expectedTables = new HashSet<>();
        expectedTables.add("Table1");
        expectedTables.add("Table2");
        expectedTables.add("Table3");

        when(dbApp.getMyTables()).thenReturn(expectedTables);

        HashSet<String> actualTables = dbApp.getMyTables();

        assertEquals(expectedTables, actualTables);
    }

}