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
public class GeneratedGetMyTablesTest_NonEmptyTables_ReturnsNonEmptyHashSet {

    @InjectMocks
    private DBApp dbApp;

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

}