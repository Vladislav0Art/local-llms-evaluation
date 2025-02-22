package app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedTestInit {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
    }

    @Test
    public void testInit() {
        HashSet<String> expected = new HashSet<>(Arrays.asList("table1", "table2"));
        app.myTables = expected;
        app.reader = Mockito.mock(CsvReader.class);
        Mockito.when(app.reader.readAllTables()).thenReturn(expected);

        app.init();

        assertEquals(expected, app.myTables);
    }

}