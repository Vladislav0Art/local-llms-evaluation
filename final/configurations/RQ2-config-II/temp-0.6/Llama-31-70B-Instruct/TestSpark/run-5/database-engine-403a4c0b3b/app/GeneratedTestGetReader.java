package app;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetReader {

    @Mock
    private CsvReader reader;
    @Mock
    private CsvWriter writer;

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetReader() {
        // given
        CsvReader expected = reader;

        // when
        CsvReader actual = dbApp.getReader();

        // then
        assertEquals(expected, actual);
    }

}