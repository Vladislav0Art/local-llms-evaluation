package app;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedGetReaderTest {

    // Test for getMyTables() method

    @Test
    public void getReaderTest() {
        // Arrange
        DBApp dbApp = new DBApp();
        CsvReader expected = new CsvReader();

        // Act
        CsvReader actual = dbApp.getReader();

        // Assert
        assertEquals(expected, actual);
    }

}