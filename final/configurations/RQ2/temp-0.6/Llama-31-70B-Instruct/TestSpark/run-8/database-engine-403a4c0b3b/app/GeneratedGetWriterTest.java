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

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        // Arrange
        DBApp dbApp = new DBApp();
        CsvWriter expectedResult = mock(CsvWriter.class);
        when(dbApp.getWriter()).thenReturn(expectedResult);

        // Act
        CsvWriter actualResult = dbApp.getWriter();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

}