package app;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetWriter {

    private DBApp dbApp;

    @Before
    public void setUp() {
        // Initialize the DBApp object
        dbApp = new DBApp();
    }

    @Test
    public void testGetWriter() {
        // Set up
        CsvWriter expectedWriter = new CsvWriter();
        dbApp.writer = expectedWriter;

        // Execute
        CsvWriter actualWriter = dbApp.getWriter();

        // Verify
        assertEquals(expectedWriter, actualWriter);
    }

}