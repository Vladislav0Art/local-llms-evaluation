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
    public void initTest_NoException_NoExceptionThrown() {
        dbApp.init();
        verifyNoMoreInteractions(dbApp);
    }

}