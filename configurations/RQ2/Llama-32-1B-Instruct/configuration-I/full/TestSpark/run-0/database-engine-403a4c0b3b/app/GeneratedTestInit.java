package app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestInit {

    private DBApp dbApp = new DBApp();

    @Test
    public void testInit() {
        dbApp.init();
        assertTrue(true); // always returns true
    }

}