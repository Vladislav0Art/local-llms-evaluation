package app;

import static org.junit.Assert.*;

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
        assertFalse(dbApp.getMyTables().isEmpty());
    }

}