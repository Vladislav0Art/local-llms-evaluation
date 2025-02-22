package app;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetReader {

    private DBApp dbApp;

    @Before
    public void setUp() {
        // Initialize the DBApp object
        dbApp = new DBApp();
    }

    @Test
    public void testGetReader() {
        // Set up
        CsvReader expectedReader = new CsvReader();
        dbApp.reader = expectedReader;

        // Execute
        CsvReader actualReader = dbApp.getReader();

        // Verify
        assertEquals(expectedReader, actualReader);
    }

}