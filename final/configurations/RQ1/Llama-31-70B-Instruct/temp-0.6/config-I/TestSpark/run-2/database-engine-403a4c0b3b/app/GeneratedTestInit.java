package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;

import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestInit {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() {
        app = null;
    }

    @Test
    public void testInit() throws IOException {
        app.init();
        assertNotNull(app.getMyTables());
    }

}