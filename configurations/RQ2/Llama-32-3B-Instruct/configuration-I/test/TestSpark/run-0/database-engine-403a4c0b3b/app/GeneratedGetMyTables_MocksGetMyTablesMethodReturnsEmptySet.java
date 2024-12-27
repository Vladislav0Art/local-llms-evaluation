package app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Map;

import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

public class GeneratedGetMyTables_MocksGetMyTablesMethodReturnsEmptySet {

    @Test
    public void getMyTables_MocksGetMyTablesMethodReturnsEmptySet() {
        when(dbApp.getMyTables()).thenReturn(new HashSet<>());
        assertEquals(0, dbApp.getMyTables().size());
    }

}