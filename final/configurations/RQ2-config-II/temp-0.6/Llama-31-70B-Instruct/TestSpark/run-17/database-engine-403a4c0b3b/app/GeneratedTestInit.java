package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestInit {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testInit() {
        HashSet<String> myTables = dbApp.getMyTables();
        assertEquals(0, myTables.size());
        dbApp.init();
        assertEquals(1, myTables.size());
    }

}