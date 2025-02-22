package app;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

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
        dbApp.init();
        assertEquals(new HashSet<String>(), dbApp.getMyTables());
    }

}