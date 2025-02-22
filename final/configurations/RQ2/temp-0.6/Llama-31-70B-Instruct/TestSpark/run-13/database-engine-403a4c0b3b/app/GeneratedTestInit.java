package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestInit {

    private DBApp app;

    @Before
    public void setUp() throws Exception {
        app = new DBApp();
    }

    @Test
    public void testInit() {
        app.init();
        assertNotNull(app.getMyTables());
    }

}