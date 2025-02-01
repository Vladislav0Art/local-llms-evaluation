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
    public void getMyTablesTest() {
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
        assertTrue(tables.isEmpty());
    }

    @Test
    public void initTest() {
        dbApp.init();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
        assertTrue(tables.isEmpty());
    }

}