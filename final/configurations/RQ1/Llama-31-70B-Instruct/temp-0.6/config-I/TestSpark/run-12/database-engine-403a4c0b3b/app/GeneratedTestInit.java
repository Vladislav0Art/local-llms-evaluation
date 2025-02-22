package app;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestInit {

    private DBApp dbApp;

    @Before
    public void setUp() throws IOException {
        dbApp = new DBApp();
    }

    @Test
    public void testInit() throws IOException {
        HashSet<String> expected = new HashSet<>();
        expected.add("test");
        when(dbApp.reader.readAllTables()).thenReturn(expected);

        dbApp.init();

        assertEquals(expected, dbApp.myTables);
    }

}