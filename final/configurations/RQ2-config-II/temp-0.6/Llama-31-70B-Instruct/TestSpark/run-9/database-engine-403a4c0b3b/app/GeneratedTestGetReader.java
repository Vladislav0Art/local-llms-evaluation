package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class GeneratedTestGetReader {

    @Mock
    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = mock(DBApp.class);
    }

    @Test
    public void testGetReader() throws IOException {
        CsvReader expectedReader = new CsvReader();

        when(dbApp.getReader()).thenReturn(expectedReader);

        CsvReader actualReader = dbApp.getReader();

        assertEquals(expectedReader, actualReader);
    }

}