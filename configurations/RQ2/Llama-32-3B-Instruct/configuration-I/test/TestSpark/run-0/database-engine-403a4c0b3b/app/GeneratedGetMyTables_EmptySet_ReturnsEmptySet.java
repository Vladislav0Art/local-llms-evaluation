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

public class GeneratedGetMyTables_EmptySet_ReturnsEmptySet {

    @Test
    public void getMyTables_EmptySet_ReturnsEmptySet() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.isEmpty());
    }

}