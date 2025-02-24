package app;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTest {

    // Test for getMyTables() method

    @Test
    public void getMyTablesTest() {
        // Arrange
        DBApp dbApp = new DBApp();
        HashSet<String> expected = new HashSet<>();
        expected.add("Table1");

        // Act
        HashSet<String> actual = dbApp.getMyTables();

        // Assert
        assertEquals(expected, actual);
    }

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