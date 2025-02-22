package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestInit {

    private DBApp dbApp;

    @Before
    public void setup() {
        dbApp = new DBApp();
    }

    @Test
    public void testInit() {
        try {
            dbApp.init();
            assertTrue(true);
        } catch (Exception e) {
            assertTrue(false);
        }
    }

}