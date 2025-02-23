package app;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestGetWriter {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetWriter() {
        CsvWriter writer = new CsvWriter();
        when(dbApp.getWriter()).thenReturn(writer);
        assertEquals(writer, dbApp.getWriter());
    }

}