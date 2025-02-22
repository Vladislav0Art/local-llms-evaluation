package app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedTestGetMyTables {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> expected = new HashSet<>(Arrays.asList("table1", "table2"));
        app.myTables = expected;

        HashSet<String> actual = app.getMyTables();

        assertEquals(expected, actual);
    }

}