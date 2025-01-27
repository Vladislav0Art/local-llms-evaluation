package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetMyTables_EmptySet_ReturnsEmptySet {

    @Test
    public void getMyTables_EmptySet_ReturnsEmptySet() {
        DBApp app = new DBApp();
        HashSet<String> result = app.getMyTables();
        assertTrue(result.isEmpty());
    }

}