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

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        // Arrange
        DBApp dbApp = new DBApp();
        CsvReader expectedResult = mock(CsvReader.class);
        when(dbApp.getReader()).thenReturn(expectedResult);

        // Act
        CsvReader actualResult = dbApp.getReader();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

}