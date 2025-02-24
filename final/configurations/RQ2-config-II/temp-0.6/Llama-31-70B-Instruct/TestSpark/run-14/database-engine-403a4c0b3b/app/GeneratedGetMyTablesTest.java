package app;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedGetMyTablesTest {

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

}