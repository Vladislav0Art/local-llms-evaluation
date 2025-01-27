package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetMyTables_EmptySet_ReturnsEmptySet {

    @Test
    public void getMyTables_EmptySet_ReturnsEmptySet() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.isEmpty());
    }

}