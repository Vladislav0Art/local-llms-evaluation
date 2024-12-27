package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

import org.mockito.InjectMocks;

public class GeneratedGetMyTablesTest_EmptyTables_ReturnsEmptySet {

    private DBApp dbApp;

    @Test
    public void getMyTablesTest_EmptyTables_ReturnsEmptySet() {
        dbApp = new DBApp();
        Set<String> result = dbApp.getMyTables();
        assertNotNull(result);
        assertEquals(0, result.size());
    }

}