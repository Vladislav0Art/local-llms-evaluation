package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetReaderTest_NotNull_ReturnsNotNull {

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void getReaderTest_NotNull_ReturnsNotNull() {
        // Arrange
        CsvReader reader = mock(CsvReader.class);

        // Act
        when(dbApp.getReader()).thenReturn(reader);

        // Assert
        assertNotNull(dbApp.getReader());
    }

}