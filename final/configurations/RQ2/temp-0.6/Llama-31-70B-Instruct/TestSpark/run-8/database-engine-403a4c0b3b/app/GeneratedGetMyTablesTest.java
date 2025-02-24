package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import app.DBApp;
import app.IDatabase;
import app.exceptions.DBAppException;

import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Test;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        // Arrange
        DBApp dbApp = new DBApp();
        HashSet<String> expectedResult = new HashSet<>();

        // Act
        HashSet<String> actualResult = dbApp.getMyTables();

        // Assert
        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult);
    }

}