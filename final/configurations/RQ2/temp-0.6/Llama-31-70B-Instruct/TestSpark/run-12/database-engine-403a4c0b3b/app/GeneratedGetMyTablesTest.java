package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        Set<String> actual = dbApp.getMyTables();
        Set<String> expected = new HashSet<>();
        assertEquals(expected, actual);
    }

}