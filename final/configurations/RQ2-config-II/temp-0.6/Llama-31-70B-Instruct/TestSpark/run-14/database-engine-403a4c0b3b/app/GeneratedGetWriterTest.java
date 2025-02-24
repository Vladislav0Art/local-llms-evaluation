package app;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedGetWriterTest {

    // Test for getMyTables() method

    @Test
    public void getWriterTest() {
        // Arrange
        DBApp dbApp = new DBApp();
        CsvWriter expected = new CsvWriter();

        // Act
        CsvWriter actual = dbApp.getWriter();

        // Assert
        assertEquals(expected, actual);
    }

}