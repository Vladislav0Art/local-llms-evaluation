package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestGetMyTables {

    private DBApp dbApp;

    @Before
    public void setup() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        Set<String> expectedTables = new HashSet<>();
        expectedTables.add("table1");
        expectedTables.add("table2");

        dbApp.myTables = expectedTables;

        Set<String> actualTables = dbApp.getMyTables();

        assertEquals(expectedTables, actualTables);
    }

}