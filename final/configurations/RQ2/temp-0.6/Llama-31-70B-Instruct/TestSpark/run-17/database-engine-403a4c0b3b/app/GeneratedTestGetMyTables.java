package app;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import app.DBApp;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetMyTables {

    private DBApp dbApp;

    @Test
    public void testGetMyTables() {
        Set<String> expectedTables = new HashSet<>();
        expectedTables.add("table1");
        expectedTables.add("table2");

        when(dbApp.getMyTables()).thenReturn(expectedTables);

        Set<String> actualTables = dbApp.getMyTables();

        assertEquals(expectedTables, actualTables);
    }

}