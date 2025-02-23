package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

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
        Set<String> expected = new HashSet<String>();
        expected.add("table1");
        expected.add("table2");
        dbApp.myTables = expected;

        Set<String> actual = dbApp.getMyTables();

        assertEquals(expected, actual);
    }

}