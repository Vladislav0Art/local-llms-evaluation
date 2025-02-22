package app;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetMyTables {

    private DBApp dbApp;

    @Before
    public void setUp() {
        // Initialize the DBApp object
        dbApp = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        // Set up
        HashSet<String> expectedMyTables = new HashSet<>();
        expectedMyTables.add("table1");
        expectedMyTables.add("table2");
        dbApp.myTables = expectedMyTables;

        // Execute
        HashSet<String> actualMyTables = dbApp.getMyTables();

        // Verify
        assertEquals(expectedMyTables, actualMyTables);
    }

}