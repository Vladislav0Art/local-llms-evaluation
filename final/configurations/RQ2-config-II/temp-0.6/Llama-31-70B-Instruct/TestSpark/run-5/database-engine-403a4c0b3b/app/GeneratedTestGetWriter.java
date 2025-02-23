package app;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetWriter {

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
    public void testGetWriter() {
        // given
        CsvWriter expected = writer;

        // when
        CsvWriter actual = dbApp.getWriter();

        // then
        assertEquals(expected, actual);
    }

}