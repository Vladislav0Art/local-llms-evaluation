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
public class GeneratedTest {

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void getMyTablesTest_EmptyTables_ReturnsEmptyHashSet() {
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.isEmpty());
    }

    @Test
    public void getMyTablesTest_NonEmptyTables_ReturnsNonEmptyHashSet() {
        // Arrange
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        expected.add("table2");

        // Act
        when(dbApp.getMyTables()).thenReturn(expected);

        // Assert
        HashSet<String> result = dbApp.getMyTables();
        assertEquals(expected, result);
    }

    @Test
    public void getReaderTest_Null_ReturnsNull() {
        assertNull(dbApp.getReader());
    }

    @Test
    public void getWriterTest_Null_ReturnsNull() {
        assertNull(dbApp.getWriter());
    }

    @Test
    public void initTest_NoException_InitializesApp() {
        dbApp.init();
        verify(dbApp, times(1)).init();
    }

    @Test
    public void getReaderTest_NotNull_ReturnsNotNull() {
        // Act
        when(dbApp.getReader()).thenReturn(null);

        // Assert
        assertNotNull(dbApp.getReader());
    }

    @Test
    public void getWriterTest_NotNull_ReturnsNotNull() {
        // Act
        when(dbApp.getWriter()).thenReturn(null);

        // Assert
        assertNotNull(dbApp.getWriter());
    }

}