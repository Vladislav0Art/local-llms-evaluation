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
public class GeneratedGetMyTablesTest_EmptyHashSet {

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void getMyTablesTest_EmptyHashSet() {
        HashSet<String> result = dbApp.getMyTables();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}