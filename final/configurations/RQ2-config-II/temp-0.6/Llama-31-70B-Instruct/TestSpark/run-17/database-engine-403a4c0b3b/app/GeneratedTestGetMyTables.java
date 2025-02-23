package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Hashtable;

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