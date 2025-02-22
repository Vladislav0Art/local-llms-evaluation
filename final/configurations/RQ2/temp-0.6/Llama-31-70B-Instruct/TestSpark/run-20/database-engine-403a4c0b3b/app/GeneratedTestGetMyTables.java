package app;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetMyTables {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> myTables = dbApp.getMyTables();
        assertNotNull(myTables);
        assertEquals(0, myTables.size());
    }

}