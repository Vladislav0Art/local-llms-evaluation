package app;

import java.util.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestInit {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
    }

    @Test
    public void testInit() {
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        expected.add("table2");

        app.myTables.addAll(expected);

        app.init();

        assertEquals(expected, app.getMyTables());
    }

}